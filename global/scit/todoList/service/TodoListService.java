package global.scit.todoList.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import global.scit.todoList.dao.TodoListDAO;
import global.scit.todoList.vo.Personal;
import global.scit.todoList.vo.Todo;

public class TodoListService {
	TodoListDAO dao = new TodoListDAO();

	//### 아무것도 없었으나,새로public TodoListService(){	} 입력함. 이거 왜그래야 하는건가요?
	public TodoListService(){
	}
	
	// 회원 가입
	public int insertPerson(Personal person) {
		// ######왜 앞에 this.붙어야 함?
		int result = dao.insertPerson(person);
		return result;
	}
	
	// 회원 조회 (로그인시)
	public Personal findByEmail(Personal person) {

		Personal p = dao.findByEmail(person);
		return p;
	}

	// todo 등록
	public int insertTodo(Todo job) {
		//#######
		int result = dao.insertTodo(job);
		return result;
	}

	// todo 수정
	public int updateTodo(Todo job) {
		//#######
		int result = dao.updateTodo(job);
		return result;
	}

	// todo 삭제
	// 삭제를 위한 쿼리문에서 사용할 정보(seqno, email)을 Map 객체에 저장한 후 dao로 전달
	public int deleteTodo(int seqno, String email) {
		// Code Here
		Map <String, Object> map = new HashMap<>();
		map.put("seqno", seqno);
		map.put("email", email);
		int result = dao.deleteTodo(map);

		return result;
	}

	// todo List 조회
	// 조회를 위한 쿼리문에서 사용할 정보(email, categories)을 Map 객체에 저장한 후 dao로 전달
	public List<Todo> selectTodoList(String email, String categories) {
		Map <String, Object> map = new HashMap<>();
		//hashMap 둘다 변수값으로 대입해주어야 하는건지...?
		map.put("m", email);
		map.put("c", categories);
		
		List<Todo> list = dao.selectTodoList(map);
	
		return list;
	}
}
