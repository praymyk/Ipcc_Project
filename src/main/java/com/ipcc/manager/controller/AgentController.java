package com.ipcc.manager.controller;

import com.ipcc.manager.model.service.AgentService;
import com.ipcc.manager.model.vo.agent.AgentAuthVO;
import com.ipcc.manager.model.vo.agent.AgentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 상담원 관리 컨트롤러
@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    private AgentService agentService;

    // 상담원 목록 조회
    public void getAgentList() {
        // 상담원 목록 조회 로직
    }

    // 상담원 등록
    @PostMapping("/add")
    public void addAgent() {
        // 상담원 등록 로직
        AgentAuthVO agentAuthVO = new AgentAuthVO("auth1001", "userpass", "1001password", "1001");
        agentService.addAgent(agentAuthVO);
        System.out.println("잘들어왔나?");
    }

    // 상담원 수정
    public void modifyAgent() {
        // 상담원 수정 로직
    }

    // 상담원 삭제
    public void deleteAgent() {
        // 상담원 삭제 로직
    }
}
