package global.scit.todoList.vo;

public class Personal {
	private String email;
	private String passwd;
	private String usrname;
	public Personal() {
		super();
	}
	public Personal(String email, String passwd, String usrname) {
		super();
		this.email = email;
		this.passwd = passwd;
		this.usrname = usrname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	@Override
	public String toString() {
		return "Personal [email=" + email + ", passwd=" + passwd + ", usrname=" + usrname + "]";
	}
}
