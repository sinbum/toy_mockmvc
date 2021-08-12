package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.MemberVO;



@Repository
public class MockMvcDAOImpl implements MockMvcDAO{

	
	@Autowired
	DataSource datasource;
	
	PreparedStatement pstmt;
	Connection conn;
	String sql;
	int result;
	ResultSet rs;
	
	String id;
	String password;
	
	
	public MockMvcDAOImpl() {
	 try {
		conn = datasource.getConnection();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public int insert(String id,String password) {
		sql="insert into member values (?,?)";
		
		try {
			pstmt.setString(1, id);
			pstmt.setString(2, password);			
			pstmt = conn.prepareStatement(sql);			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return result;
		
	}

	@Override
	public List <MemberVO> list() {
		sql="select * from memeber";		
		List <MemberVO> result = new ArrayList<MemberVO>();
		
		try {
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
		sql="select * from member where id = ?";
		MemberVO mv;
		try {
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
		sql="update member set id=? where id = ?";
		
		try {
			
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
