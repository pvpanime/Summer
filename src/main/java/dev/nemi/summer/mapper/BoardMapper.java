package dev.nemi.summer.mapper;

import dev.nemi.summer.board.BoardVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoardMapper {
  BoardVO getBoard(long id);
  List<BoardVO> getBoardListAt(@Param("start") long start, @Param("count") int count);
  int insert(BoardVO board);
  int update(BoardVO board);
  long getMaxPages(long countPerPage);
  int remove(long id);
}
