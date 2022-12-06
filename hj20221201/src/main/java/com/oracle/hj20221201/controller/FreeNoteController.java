package com.oracle.hj20221201.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.hj20221201.dto.Notice;
import com.oracle.hj20221201.dto.NoticeCateGory;
import com.oracle.hj20221201.service.FreeNoteService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class FreeNoteController {
	private final FreeNoteService fns;
	
	//자유게시판 등록 페이지
	@RequestMapping(value = "/freeNoteCreForm")
	private String freeNoteCreForm(Notice note , Model model) {
		System.out.println("FreeNoteController freeNoteCreForm Start..");
			List<NoticeCateGory> noteCate = fns.noteCateGory();
			model.addAttribute("noteCate",noteCate);
			System.out.println("FreeNoteController noteCate.size()"+noteCate.size());
		return "freeNoteCreForm";
	}
}
