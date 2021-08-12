package vo;



public class MemberVO {

	String id;
	String password;
	
	public MemberVO() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "memberVO [id=" + id + ", password=" + password + "]";
	}
	
	public MemberVO(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	
	
}
