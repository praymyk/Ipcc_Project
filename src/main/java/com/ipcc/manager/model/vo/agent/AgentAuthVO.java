package com.ipcc.manager.model.vo.agent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
// 상담원 인증 정보를 담는 VO 클래스
public class AgentAuthVO {
    private String agentId;
    private String authType;
    private String agentPw;
    private String agentName;
}
