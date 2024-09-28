package com.ktdsuniversity.edu.spring_homework.dao;

import java.util.List;

import com.ktdsuniversity.edu.spring_homework.vo.BoardVO;
import com.ktdsuniversity.edu.spring_homework.vo.WriteBoardVO;

public interface BoardDao {
	public int selectBoardAllCount();
	
	public List<BoardVO> selectAllBoard();
	
	public int insertNewBoard(WriteBoardVO writeBoardVO);
	
	public BoardVO selectOneBoard(int id);
	
	public int updateViewCount(int id);
	
}
