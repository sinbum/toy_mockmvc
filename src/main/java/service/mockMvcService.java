package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dao.mockMvcDAOImpl;
import vo.memberVO;

@Service
public class mockMvcService {

	@Autowired
	mockMvcDAOImpl mockdao;
	
	
	public mockMvcService() {
		// TODO Auto-generated constructor stub
	}
	
	public int insert(String id,String password) {
		return mockdao.insert(id,password);
		}
	
	public <memberVO>List list(){
		return mockdao.list();
		}
	
	public memberVO select(String id) {
		return mockdao.select(id);
		}
	
	public int update (String field,String changevalue) {
		return mockdao.update(field,changevalue);
		}
	
	public int delete (String id) {
		return mockdao.delete(id);
		}
	
	
	
}
