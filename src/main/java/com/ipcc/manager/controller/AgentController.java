package com.ipcc.manager.controller;

import com.ipcc.manager.model.vo.agent.AgentAuthVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 상담원 관리 컨트롤러
@Slf4j
@RestController
@RequestMapping("/manager/agent")
public class AgentController {

    // 상담원 목록 조회
    public void getAgentList() {
        // 상담원 목록 조회 로직
    }

    // 상담원 등록
    @PostMapping("/save")
    public String addAgent() {
        // 상담원 등록 로직
        AgentAuthVO agentAuthVO = new AgentAuthVO("auth1001", "userpass", "1001password", "1001");
        log.info("agentAuthVO: " + agentAuthVO);

        return "redirect:/";
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
