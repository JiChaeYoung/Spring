package com.ktdsuniversity.edu.spring_homework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.spring_homework.dao.BoardDao;
import com.ktdsuniversity.edu.spring_homework.service.BoardService;
import com.ktdsuniversity.edu.spring_homework.vo.BoardListVO;
import com.ktdsuniversity.edu.spring_homework.vo.BoardVO;
import com.ktdsuniversity.edu.spring_homework.vo.WriteBoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public BoardListVO getAllBoard() {
		BoardListVO boardListVo = new BoardListVO();
		boardListVo.setBoardCnt(this.boardDao.selectBoardAllCount());
		boardListVo.setBoardList(this.boardDao.selectAllBoard());
		return boardListVo;
	}

	@Override
	public boolean createNewBoard(WriteBoardVO writeBoardVO) {
		int rows = this.boardDao.insertNewBoard(writeBoardVO);
		return rows>0;
	}

	@Override
	public BoardVO getOneBoard(int id) {
		int rows = this.boardDao.updateViewCount(id);
		if(rows > 0) {
			BoardVO boardVo = this.boardDao.selectOneBoard(id);
			return boardVo;
		}
		return null;
	}
	 
}
