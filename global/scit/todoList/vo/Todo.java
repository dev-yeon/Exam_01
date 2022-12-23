package global.scit.todoList.vo;

public class Todo {
	private int seqno;
	private String email;
	private String regdate;
	private String todo;
	private String importance;
	private String categories;
	public Todo() {
		super();
	}
	public Todo(int seqno, String email, String regdate, String todo, String importance, String categories) {
		super();
		this.seqno = seqno;
		this.email = email;
		this.regdate = regdate;
		this.todo = todo;
		this.importance = importance;
		this.categories = categories;
	}
	
	public int getSeqno() {
		return seqno;
	}
	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public String getImportance() {
		return importance;
	}
	public void setImportance(String importance) {
		this.importance = importance;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		String format = String.format("%d : %s / %s / %s / %s", seqno, regdate, todo, importance, categories);
		
		return format;
	}
}
