package com.example.demo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.MemberVO;




@Repository
public class MockMvcDaoImpl implements MockMvcDao{

	@Autowired
	DataSource datasource;
	

	
	public MockMvcDaoImpl() {
				
	}

	@Override
	public int insert(String id,String password) {
		PreparedStatement pstmt;
		String sql="insert into member values (?,?)";
		int result=0;
		System.out.println(datasource);
		try {
			pstmt=datasource.getConnection().prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);					
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List <MemberVO> list() {
		ResultSet rs;
		String sql="select * from memeber";		
		List <MemberVO> result = new ArrayList<MemberVO>();
		String id;
		String password;
		
		try {
			PreparedStatement pstmt = datasource.getConnection().prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				password = rs.getString("password");
				
				MemberVO membervo = new MemberVO(id,password);
				
				result.add(membervo);			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public MemberVO select(String id) {
		String sql="select * from member where id = ?";
		MemberVO mv;
		ResultSet rs;
		String password;
		try {
			PreparedStatement pstmt= datasource.getConnection().prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
				id = rs.getString("id");
				password = rs.getString("passowrd");
				mv= new MemberVO(id,password);
				return mv;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int update(String field,String id,String changevalue) {
		String sql="update member set id=? where id = ?";
		int result=0;
		try {			
			PreparedStatement pstmt = datasource.getConnection().prepareStatement(sql);
			pstmt.setString(1, changevalue);
			pstmt.setString(2, id);
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
