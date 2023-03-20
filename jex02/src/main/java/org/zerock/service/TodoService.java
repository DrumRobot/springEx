package org.zerock.service;

import java.util.List;

import org.zerock.domain.TodoVO;

public interface TodoService {
  public List<TodoVO> getList();
  
  public void register(TodoVO todo);
}
