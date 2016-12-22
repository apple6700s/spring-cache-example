package cache.spring;

import cache.common.JUnitBase;
import org.junit.Test;

/**
 * Created by scott on 2016/12/22.
 */
public class UserServiceKeyconcatTest extends JUnitBase {

  @Test
  public void test() {
    UserServiceKeyconcat service = ctx.getBean(UserServiceKeyconcat.class);

    service.getUser("admin", "scott", null);
    service.getUser("hiker", "peter", null);
    service.getUser("admin", "scott", null);
    service.getUser("hiker", "peter", null);
  }
}
