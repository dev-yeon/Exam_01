package global.scit.todoList.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import global.scit.todoList.vo.Personal;
import global.scit.todoList.vo.Todo;

public class TodoListDAO {
	// DB ������ ���Ͽ� SessionFactory ��ü�� ���´�. (5��
	SqlSessionFactory factory = MybatisConfig.getSessionFactory();//���� �߰�����.

	// ȸ�� ����
	public int insertPerson(Personal person) {
		SqlSession session = null;
		session = factory.openSession();
		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		
		int result = mapper.insertPerson(person);
		
		session.commit();
		session.close();
		
		return result;
	}
	
	// ȸ�� ��ȸ (�α��ν�)
	public Personal findByEmail(Personal person) {
		SqlSession session = null;
		session = factory.openSession();
		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		
		Personal p = mapper.findByEmail(person);
		
		session.close();
		return p;
	}

	// todo ���
	public int insertTodo(Todo job) {
		SqlSession session = null;
		session = factory.openSession();
		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		
		int result = mapper.insertTodo(job);
		session.commit();
		session.close();
		
		return result;
	}


	// todo ����
	public int updateTodo(Todo job) {
		SqlSession session = null;
		session = factory.openSession();
		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		
		int result = mapper.updateTodo(job);
		
		session.commit();
		session.close();
		
		return result;
	}
	
	// todo ����
	public int deleteTodo(Map<String, Object> map) {
		SqlSession session = null;
		session = factory.openSession();
		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		
		int result = mapper.deleteTodo(map);
		
		session.commit();
		session.close();
		
		return result;
	}
	
	// todo ��ȸ : 2������ ��ȸ ��� �����ؾ� �Ѵ�.
	public List<Todo> selectTodoList(Map<String, Object> map) {
		SqlSession session = null;
		session = factory.openSession();
		TodoListMapper mapper = session.getMapper(TodoListMapper.class);
		
		List<Todo> list = mapper.selectTodoList(map);
		
		session.close();
		
		return list;
	}

}
