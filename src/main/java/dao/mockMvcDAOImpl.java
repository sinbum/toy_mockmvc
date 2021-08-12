package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.memberVO;


@Repository
public class mockMvcDAOImpl implements mockMvcDAO{

	
	@Autowired
	DataSource datasource;

	@Override
	public int insert(String id,String password) {
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
	public int update(String field,String changevalue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
