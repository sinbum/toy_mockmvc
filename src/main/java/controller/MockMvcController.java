package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.MockMvcService;

@Controller
public class MockMvcController {

	@Autowired
	MockMvcService mock;
	
	ModelAndView mv;
	
	public MockMvcController() {
		mv= new ModelAndView();
}
	
	
	@RequestMapping("/index")
	public ModelAndView index() {		
		mv.setViewName("WEB-INF/view/index.jsp");		
		return mv;		
		}
	
	@RequestMapping("/insertProc")
	public ModelAndView insert(String id,String password) {
		mv.addObject("insertresult",mock.insert(id,password));
		mv.setViewName("WEB-INF/view/input.jsp");
		
		return mv;
		
		}
	
	public ModelAndView list(){
		
		 mock.list();
		 return mv;		
		 }
	
	public ModelAndView select(String id) {
		mock.select(id);
		
		return mv; 
		}
	
	public ModelAndView update (String field,String id,String changevalue) {
		
		mock.update(field,id,changevalue);
		return mv; 
		}
	
	public ModelAndView delete (String id) {
		
		mock.delete(id);
		return mv; 
		}
	
	
}
