package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import vo.memberVO;

public class mockmvcdaoimpl implements mockmvcdao{

	
	@Autowired
	DataSource datasource;

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <memberVO> List list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public memberVO select(String id) {
		
		
		return null;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
