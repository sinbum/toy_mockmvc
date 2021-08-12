package vo;



public class memberVO {

	String id;
	String password;
	
	public memberVO() {
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
	
	public memberVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	
	
}
