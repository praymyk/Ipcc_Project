package com.ipcc.manager.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//관리자 계정 정보를 담는 VO 클래스
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Mng {

    private Long memberNo;

    private String ccode;
    private String mngId;
    private String mngPw;
    private String mngName;
    private Integer mngAuth;
    private Integer spyChan;
}
