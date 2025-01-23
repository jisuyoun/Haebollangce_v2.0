package com.sist.haebollangce.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/* 
 * 2025-01-23 최초 생성
 * 
 * MainController
*/
@Controller
@RequestMapping("/main")
public class MainController {
    
    // 메인 페이지로 이동
	@GetMapping("/mainPage")
	public String mainPage() {
		return "main/mainPage";
	}
}
