package com.ezen.ezenhr.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.ezenhr.domain.ElectronicApprovalsVo;
import com.ezen.ezenhr.persistance.ElectronicApprovalsService_Mapper;

@Service
public class ElectronicApprovalsServiceImpl implements ElectronicApprovalsService{

	
	private ElectronicApprovalsService_Mapper easm;
	
	@Autowired
	public ElectronicApprovalsServiceImpl(SqlSession sqlSession) {
		this.easm=sqlSession.getMapper(ElectronicApprovalsService_Mapper.class);
	}
	
	
	@Override
	public int insertElectronicApproval(ElectronicApprovalsVo eav) {
		int value = easm.insertElectronicApproval(eav);
		return value;
	}


	@Override
	public List<Map<String, Object>> getEAListByApproverUidxWithAdate(int uidx) {
		// TODO Auto-generated method stub
		return easm.getEAListByApproverUidxWithAdate(uidx) ;
	}






}
