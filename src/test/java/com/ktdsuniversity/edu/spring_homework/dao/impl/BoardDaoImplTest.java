package com.ktdsuniversity.edu.spring_homework.dao.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.context.annotation.Import;

import com.ktdsuniversity.edu.spring_homework.dao.BoardDao;
import com.ktdsuniversity.edu.spring_homework.vo.BoardVO;
import com.ktdsuniversity.edu.spring_homework.vo.WriteBoardVO;

@MybatisTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Import(BoardDaoImpl.class)
public class BoardDaoImplTest {
	
	@Autowired
	private BoardDao boardDao;
	
//	@Test
//	public void selectBoardAllCount() {
//		int cnt = boardDao.selectBoardAllCount();
//		System.out.println("BoardCnt = "+cnt);
//	}
//	@Override
//	public List<BoardVO> selectAllBoard() {
//		return this.getSqlSession()
//				.selectList("com.ktdsuniversity.edu.spring_homework.dao.BoardDao.selectAllBoard");
//	}
//	@Test
//	public void testSelectAllBoard() {
//		List<BoardVO> boardList = this.boardDao.selectAllBoard();
//		assertEquals(1, boardList.size());
//	}
//
//	@Override
//	public int insertNewBoard(WriteBoardVO writeBoardVo) {
//		return this.getSqlSession()
//				.insert("com.ktdsuniversity.edu.spring_homework.dao.BoardDao.insertNewBoard", writeBoardVo);
//	}
//	@Test
//	public void testInsertNewBoard() {
//		WriteBoardVO writeBoardVo = new WriteBoardVO();
//		writeBoardVo.setSubject("이만기");
//		writeBoardVo.setEmail("test@test.com");
//		writeBoardVo.setContent("test Content");
//		int cnt = this.boardDao.insertNewBoard(writeBoardVo);
//		
//		assertEquals(1, cnt); 
//		
//		
//	}
//
//	@Override
//	public BoardVO selectOneBoard(int id) {
//		return this.getSqlSession().selectOne("com.ktdsuniversity.edu.spring_homework.dao.BoardDao.selectOneBoard", id);
//	}
//	@Test
//	public void testSelectOneBoard() {
//		BoardVO boardVo = this.boardDao.selectOneBoard(100);
//		assertNotNull(boardVo);
//	}
//	@Override
//	public int updateViewCount(int id) {
//		return this.getSqlSession().update("com.ktdsuniversity.edu.spring_homework.dao.BoardDao.updateViewCount", id);
//	}
	@Test
	public void testUpdateViewCount() {
		int rows = this.boardDao.updateViewCount(100);
		System.out.println("board rows:"+rows);
		assertEquals(1, rows);
	}
}
