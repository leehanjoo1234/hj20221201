package com.oracle.hj20221201.controller;

import java.util.List;

import org.springframework.lang.Nullable;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.hj20221201.dto.Notice;
import com.oracle.hj20221201.service.MainService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {
	
	private final MainService ms;
	
	
	//-------메인페이지 jsp로 연결 -----------------------------------
	@GetMapping("/")
	public String root(@Nullable Authentication authentication) {
		return "index";
	}	
	@GetMapping("/index")
	public String index(@Nullable Authentication authentication) {
		return "index";
	}
	
	//------- 상단 네비 페이지 연결------------------------------------
	
	
	@GetMapping(value = "/farmInfo")
	public String farmInfo() {
		System.out.println("MainController farmInfo Start...");
		return "farmInfo";
	}
	
	@GetMapping(value = "/shoppingView")
	public String shopping() {
		System.out.println("MainController shoppingView Start...");
		return "shoppingView";
	}
	
	@GetMapping(value = "/basketView")
	public String basket() {
		System.out.println("MainController basketView Start...");
		return "basketView";
	}
	
	@GetMapping(value = "/freeNoticeView")
	public String freeNoice(Notice note,Model model ) {
		System.out.println("MainController freeNoticeView Start...");
		List<Notice> noteList = ms.noticeList(note);
		System.out.println("MainController noteList.size()-->"+noteList.size());
		model.addAttribute("noteList",noteList);
		
		return "freeNoticeView";
	}
	
	@GetMapping(value = "/myPageView")
	public String myPageView() {
		System.out.println("MainController myPageView Start...");
		return "myPageView";
	}
	
	
	
	
	
	
	

}
