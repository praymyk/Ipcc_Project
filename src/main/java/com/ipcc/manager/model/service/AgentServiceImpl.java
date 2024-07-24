package com.ipcc.manager.model.service;

import com.ipcc.manager.mapper.AgentMapper;
import com.ipcc.manager.model.vo.agent.AgentAuthVO;
import com.ipcc.manager.model.vo.agent.AgentVO;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AgentServiceImpl implements AgentService {
    private AgentMapper agentMapper;

    // 상담원 목록 조회
    public ArrayList<AgentVO> getAgentList() {
        // 상담원 목록 조회 로직
        return null;
    }

    // 상담원 조회
    public AgentVO getAgent() {
        // 상담원 조회 로직
        return null;
    }

    // 상담원 등록
    public int addAgent(AgentAuthVO agentAuthVO) {
        // 상담원 등록 로직
        return agentMapper.add(agentAuthVO);
    }

    // 상담원 수정
    public int modifyAgent() {
        // 상담원 수정 로직
        return 0;
    }

    // 상담원 삭제
    public int deleteAgent() {
        // 상담원 삭제 로직
        return 0;
    }
}
