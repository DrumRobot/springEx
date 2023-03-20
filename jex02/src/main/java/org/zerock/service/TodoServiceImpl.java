package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.TodoVO;
import org.zerock.mapper.TodoMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

	private TodoMapper mapper;

	@Override
	public List<TodoVO> getList() {
		return mapper.getList();
	}

	@Override
	public void register(TodoVO todo) {
		// TODO Auto-generated method stub
		
	}
}
