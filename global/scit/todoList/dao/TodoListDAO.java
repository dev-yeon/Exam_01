package global.scit.todoList.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import global.scit.todoList.vo.Personal;
import global.scit.todoList.vo.Todo;

public class TodoListDAO {
	// DB 접속을 위하여 SessionFactory 객체를 얻어온다. (5점

	SqlSessionFactory factory = MybatisConfig.getSessionFactory();

	//###public TodoListDAO(){} 새로 입력.
	public TodoListDAO(){
	}

	// 회원 가입
	public int insertPerson(Personal person) {
		SqlSession session = null;
		session = factory.openSession();
		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		
		int result = mapper.insertPerson(person);
		
		session.commit();
		session.close();
		
		return result;
	}
	
	// 회원 조회 (로그인시)
	public Personal findByEmail(Personal person) {
		SqlSession session = null;
		//##session = factory.openSession();이었는데, 왜 this.factory.openSession();  되어야 하는가?
		session = factory.openSession();
		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		//여기도 왜 session.getMapper(TodoListMapper.class);이어야 하는가? 왜 뒤에 .class가 붙어야 하는가?
		Personal p = mapper.findByEmail(person);
		
		session.close();
		return p;
	}

	// todo 등록
	public int insertTodo(Todo job) {
		SqlSession session = null;
		//##session = factory.openSession(); 이었는데,
		// 왜 this.factory.openSession(); 되어야 하는가?
		session = factory.openSession();
		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		int result = mapper.insertTodo(job);
		
		session.commit();
		session.close();
		
		return result;
	}


	// todo 수정
	public int updateTodo(Todo job) {
		SqlSession session = null;
		session = factory.openSession();
		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		
		int result = mapper.updateTodo(job);
		
		session.commit();
		session.close();
		
		return result;
	}
	
	// todo 삭제
	public int deleteTodo(Map<String, Object> map) {
		SqlSession session = null;

		session = factory.openSession();

		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		
		int result = mapper.deleteTodo(map);
		
		session.commit();
		session.close();
		
		return result;
	}
	
	// todo 조회 : 2종류의 조회 모두 가능해야 한다.
	public List<Todo> selectTodoList(Map<String, Object> map) {
		SqlSession session = null;

		session = this.factory.openSession();

		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		
		List<Todo> list = mapper.selectTodoList(map);
		
		session.close();
		
		return list;
	}

}
