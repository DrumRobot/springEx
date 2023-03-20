package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.TodoVO;

public interface TodoMapper {

	public List<TodoVO> getList();

	public void insert(TodoVO todo);

	public TodoVO read(Long tno);

	public int delete(Long tno);

	public int update(TodoVO todo);
}
