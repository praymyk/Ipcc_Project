package com.ipcc.common.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.ipcc.manager.mapper"}) // 매퍼 인터페이스 패키지 스캔
public
//https://velog.io/@yu-jin-song/Spring-Boot-MyBatis-MySQL-%EC%97%B0%EB%8F%99class MyBatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        // MyBatis 설정 파일 위치 지정
        sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        // 매퍼 XML 파일 위치 지정
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        // 타입 별칭 패키지 지정
        sessionFactory.setTypeAliasesPackage("com.ipcc.manager.model.vo, com.ipcc.crm.model.vo");
        return sessionFactory.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}