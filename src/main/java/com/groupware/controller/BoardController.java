package com.groupware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.groupware.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class BoardController {

	private BoardService service;
	
	@RequestMapping("/hi")
	public String boardmain() {
		
		
		return "board/boardMain";
	}

	//데이터베이스를 긁어오려면 Service를 이용해서 가져오기
	
	@GetMapping("/boardList")
	public String list(Model model) {
		
		log.info("-----list-----");
		
		model.addAttribute("list", service.getList());
		
		return "board/boardMain";
	}

}
