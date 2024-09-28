package com.ktdsuniversity.edu.spring_homework.vo;

import java.util.List;

public class BoardListVO {
	private int BoardCnt;
	private List<BoardVO> BoardList;
	public int getBoardCnt() {
		return BoardCnt;
	}
	public void setBoardCnt(int boardCnt) {
		BoardCnt = boardCnt;
	}
	public List<BoardVO> getBoardList() {
		return BoardList;
	}
	public void setBoardList(List<BoardVO> boardList) {
		BoardList = boardList;
	}
}
