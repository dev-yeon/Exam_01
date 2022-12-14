package global.scit.todoList.dao;

import java.util.List;
import java.util.Map;

import global.scit.todoList.vo.Personal;
import global.scit.todoList.vo.Todo;

public interface TodoListMapper {
	public Personal findByEmail(Personal person);
	public int insertPerson(Personal person);
	
	public int insertTodo(Todo job);
	public List<Todo> selectTodoList(Map<String, Object> map);
	public int deleteTodo(Map<String, Object> map);
	public int updateTodo(Todo job);
}
