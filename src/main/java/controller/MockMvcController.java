package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.mockMvcService;
import vo.memberVO;

@Controller
public class MockMvcController {

	@Autowired
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
