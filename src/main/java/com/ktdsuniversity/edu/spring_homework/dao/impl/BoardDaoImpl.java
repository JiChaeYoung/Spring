package com.ktdsuniversity.edu.spring_homework.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.spring_homework.dao.BoardDao;
import com.ktdsuniversity.edu.spring_homework.vo.BoardVO;
import com.ktdsuniversity.edu.spring_homework.vo.WriteBoardVO;

@Repository
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao{

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		System.out.println("Autowirng sqlSessionTemplate"+sqlSessionTemplate);
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	@Override
	public int selectBoardAllCount() {
		return this.getSqlSession()
				.selectOne("com.ktdsuniversity.edu.spring_homework.dao.BoardDao.selectBoardAllCount");
		
	}

	@Override
	public List<BoardVO> selectAllBoard() {
		return this.getSqlSession()
				.selectList("com.ktdsuniversity.edu.spring_homework.dao.BoardDao.selectAllBoard");
	}

	@Override
	public int insertNewBoard(WriteBoardVO writeBoardVo) {
		return this.getSqlSession()
				.insert("com.ktdsuniversity.edu.spring_homework.dao.BoardDao.insertNewBoard", writeBoardVo);
	}

	@Override
	public BoardVO selectOneBoard(int id) {
		return this.getSqlSession()
				.selectOne("com.ktdsuniversity.edu.spring_homework.dao.BoardDao.selectOneBoard", id);
	}

	@Override
	public int updateViewCount(int id) {
		return this.getSqlSession()
				.update("com.ktdsuniversity.edu.spring_homework.dao.BoardDao.updateViewCount", id);
	}

}
