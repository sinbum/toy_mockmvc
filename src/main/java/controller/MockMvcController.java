package controller;

import java.util.List;

import service.mockMvcService;
import vo.memberVO;

public class MockMvcController {

	
	mockMvcService mock;
	
	public MockMvcController() {
		// TODO Auto-generated constructor stub
	}
	
	public int insert(String id,String password) {
		return mock.insert(id,password);
		}
	
	public <memberVO>List list(){
		return mock.list();
		}
	
	public memberVO select(String id) {
		return mock.select(id);
		}
	
	public int update (String field,String changevalue) {
		return mock.update(field,changevalue);
		}
	
	public int delete (String id) {
		return mock.delete(id);
		}
	
	
}
