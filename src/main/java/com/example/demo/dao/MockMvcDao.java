package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.MemberVO;

public interface MockMvcDao {

	
//	입력
//	전체출력
//	선택출력
//	수정 
//	삭제
	
	public int insert(String id, String password);
	
	public <memberVO>List list();
	
	public MemberVO select(String id);
	
	public int update(String field,String id,String changevalue);
	
	public int delete (String id);
	
	
	
}
