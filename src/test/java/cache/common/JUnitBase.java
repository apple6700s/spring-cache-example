package cache.common;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Base class for JUnit Test. Loading config files
 *
 * Created by scott on 2016/12/8.
 */
public class JUnitBase {

  public ClassPathXmlApplicationContext ctx;

  @Before
  public void init() {
    ctx = new ClassPathXmlApplicationContext("classpath:application-context.xml");
  }

  @After
  public void destroy() {
    if(ctx != null) {
      ctx.destroy();
    }
  }
}
