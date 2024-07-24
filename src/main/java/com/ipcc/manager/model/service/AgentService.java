package com.ipcc.manager.model.service;

import com.ipcc.manager.model.vo.agent.AgentAuthVO;
import com.ipcc.manager.model.vo.agent.AgentVO;

import java.util.ArrayList;

public interface AgentService {
    // 상담원 목록 조회
    public ArrayList<AgentVO> getAgentList();

    // 상담원 조회
    public AgentVO getAgent();

    // 상담원 등록
    public int addAgent(AgentAuthVO agentAuthVO);

    // 상담원 수정
    public int modifyAgent();

    // 상담원 삭제
    public int deleteAgent();
}
