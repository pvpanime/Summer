package dev.nemi.summer.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class ViewDeliverController {

  @GetMapping("/board")
  public String board() {
    return "board/index";
  }

  @GetMapping("/sus")
  public void sus() {
    log.info("sus...");
  }

  @GetMapping("/what")
  public String what() {
    return "why";
  }


}
