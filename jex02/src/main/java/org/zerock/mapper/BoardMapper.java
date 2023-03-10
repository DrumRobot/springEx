package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {

//	@Select("SELECT * FROM tbl_board WHERE bno > 0")
	public List<BoardVO> getList();

	public void insert(BoardVO board);

	public Integer insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);

	public int delete(Long bno);

	public int update(BoardVO board);
}
