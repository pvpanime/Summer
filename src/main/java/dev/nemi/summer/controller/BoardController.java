package dev.nemi.summer.controller;

import dev.nemi.summer.board.BoardVO;
import dev.nemi.summer.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/board")
public class BoardController {

  private final BoardMapper mapper;
//  private final BoardService boardService;

  @GetMapping(value = "/get")
  public ResponseEntity<String> get() {
    List<BoardVO> boardList = mapper.getBoardListAt(1, 10);
//    List<BoardViewDTO> boardList = boardService.getBoardListAt(1L, 10);
    ResponseEntity<String> response = ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(
      new JSONObject().put("success", true).put("data", new JSONArray(boardList)).toString()
    );
    log.info(response);
    return response;
  }

  @GetMapping("/get/{id}")
  public ResponseEntity<String> get(@PathVariable("id") int id) {
    BoardVO board = mapper.getBoard(id);
//    BoardViewDTO board = boardService.getBoard(id);
    ResponseEntity<String> response = ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(
      new JSONObject().put("success", true).put("data", new JSONObject(board)).toString()
    );
    log.info(response);
    return response;
  }

}
