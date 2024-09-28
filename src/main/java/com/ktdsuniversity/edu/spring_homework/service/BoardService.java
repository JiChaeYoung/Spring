package com.ktdsuniversity.edu.spring_homework.service;

import com.ktdsuniversity.edu.spring_homework.vo.BoardListVO;
import com.ktdsuniversity.edu.spring_homework.vo.BoardVO;
import com.ktdsuniversity.edu.spring_homework.vo.WriteBoardVO;

public interface BoardService {
	public BoardListVO getAllBoard();
	public boolean createNewBoard(WriteBoardVO writeBoardVO);
	public BoardVO getOneBoard(int id);
}
