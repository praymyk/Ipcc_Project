package com.ipcc.manager.controller.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class LoginController {

        // 로그인 페이지로 리다이렉트
        @PostMapping("/mlogin")
        public String redirectToLogin() {
                log.info("잘드어오나?");

                // 로그인 처리 작성


                return "redirect:/manager/main";
        }
}
