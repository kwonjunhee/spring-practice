package com.poscoict.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @RequestMapping : 메소드 단독 매핑
 */

@Controller
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/board/write")
	public String write() {
		return "BoardController.write()";
		
	}
	
	@ResponseBody
	@RequestMapping("/board/view/{no}") // {no} 여러개 가능 
	public String view(@PathVariable("no") Long boardNo) { // 기본타입으로 바꾸면 에러 남 그래서 Long을 쓰는거
		return "BoardController.view("+boardNo+")";
	}
}
