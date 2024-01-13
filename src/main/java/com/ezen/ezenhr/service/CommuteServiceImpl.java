package com.ezen.ezenhr.service;

import java.time.LocalDateTime;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.ezenhr.domain.CommuteInfoVo;
import com.ezen.ezenhr.domain.CommuteVo;
import com.ezen.ezenhr.persistance.CommuteService_Mapper;

@Service
public class CommuteServiceImpl implements CommuteService {
	
	private CommuteService_Mapper csm;
	
	@Autowired
	public CommuteServiceImpl(SqlSession sqlSession) {
		this.csm = sqlSession.getMapper(CommuteService_Mapper.class);
	}
	
	@Override
	public int saveSignInTime(CommuteVo cv) {
		int value = csm.saveSignInTime(cv);
		
		return value;
		
	}

	@Override
	public int saveCommuteInfo(CommuteInfoVo civ) {
		int value2 = csm.saveCommuteInfo(civ);
		
		return value2;
	}

}
