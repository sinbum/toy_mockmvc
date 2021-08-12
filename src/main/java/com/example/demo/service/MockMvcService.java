package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MockMvcDao;
import com.example.demo.vo.MemberVO;


@Service
public class MockMvcService {

	@Autowired
	MockMvcDao dao;
	
	public MockMvcService() {
	}
	
	public int insert(String id,String password) {
		return dao.insert(id,password);
		}
	
	public <memberVO>List list(){
		return dao.list();
		}
	
	public MemberVO select(String id) {
		return dao.select(id);
		}
	
	public int update (String field,String id,String changevalue) {
		return dao.update(field,id,changevalue);
		}
	
	public int delete (String id) {
		return dao.delete(id);
		}
	
	
	
}
