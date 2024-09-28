package com.ktdsuniversity.edu.spring_homework.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ktdsuniversity.edu.spring_homework.service.BoardService;
import com.ktdsuniversity.edu.spring_homework.vo.BoardListVO;
import com.ktdsuniversity.edu.spring_homework.vo.BoardVO;
import com.ktdsuniversity.edu.spring_homework.vo.WriteBoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardSerivce;
	
	@GetMapping("/board/list")
	public String viewBoardList(Model model) {
		BoardListVO boardListVo = this.boardSerivce.getAllBoard();
		model.addAttribute("boardListVO",boardListVo);
		return "board/boardlist";
	}
	
	@GetMapping("/board/write")
	public String viewBoardWritePage() {
		return "board/boardwrite";
	}
	@PostMapping("/board/write")
	public String writeBoard(WriteBoardVO writeBoardVo) {
		this.boardSerivce.createNewBoard(writeBoardVo);
		return "redirect:/board/list";
	}
	@GetMapping("/board/view")
	public String viewOneBoard(@RequestParam int id,Model model) {
		BoardVO boardVo = this.boardSerivce.getOneBoard(id);
		model.addAttribute("boardVo",boardVo);
		return "board/boardview";
	}
}
