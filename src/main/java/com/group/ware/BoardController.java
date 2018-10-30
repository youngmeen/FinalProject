package com.group.ware;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/board/*")
public class BoardController {
	
	@GetMapping("/list")
	public void list(Model model) {
		
	}

	@RequestMapping("/hi")
	public String boardmain() {
		
		//데이터베이스를 긁어오려면 Service를 이용해서 가져오기
		
		return "board/boardMain";
	}
}
