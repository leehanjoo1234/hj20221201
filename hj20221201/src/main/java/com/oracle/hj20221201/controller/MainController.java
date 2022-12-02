package com.oracle.hj20221201.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.hj20221201.service.MainService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {
	
	private final MainService ms;
	
	@GetMapping(value = "/farmInfo")
	public String farmInfo() {
		System.out.println("MainController farmInfo Start...");
		return "farmInfo";
	}
}
