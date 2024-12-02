package dev.nemi.summer;

import dev.nemi.summer.mapper.CronalMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.Instant;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/summer.xml")
public class MapperTest {

  @Autowired(required = false)
  private CronalMapper cronalMapper;

  @Test
  public void testMapper() {
    Instant now = cronalMapper.getNow();
    Assertions.assertNotNull(now);
    log.info(now);
  }

}
