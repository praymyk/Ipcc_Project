package com.ipcc.manager.mapper;

import com.ipcc.manager.model.vo.agent.AgentAuthVO;
import org.springframework.data.repository.query.Param;

public interface AgentMapper {
    int add(@Param("agentAuth") AgentAuthVO agentAuthVO);
}
