package dao;

import java.util.List;

import vo.memberVO;

public interface mockmvcdao {

	
//	입력
//	전체출력
//	선택출력
//	수정 
//	삭제
	
	public int insert();
	
	public <memberVO>List list();
	
	public memberVO select(String id);
	
	public int update ();
	
	public int delete ();
	
	
	
}
