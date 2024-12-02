# Summer

Spring 다음에 오는거

# Spring Legacy 설정 서순

뭔가 많아보이지만 이렇게 하면 됩니다

1. Gradle에 spring 의존성 추가하기
2. Context XML 만들기 : `src/main/webapp/WEB-INF/summer.xml` (이름은 상관없음)
    ````xml
    <!--지정 패키지 아래의 모든 컴포넌트를 Spring으로 가져온다-->
    <context:component-scan base-package="dev.nemi.summer" />
    ````

3. Test 클래스에서, 어노테이션 추가하기
    ````java
    @ExtendWith(SpringExtension.class)
    @ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/summer.xml")
    public class MapperTest {
      @Test
      public void doTest() {
        /* ... */
      }
    }
    ````

4. `src/main/webapp/WEB-INF/web.xml`에서 Context 연결

