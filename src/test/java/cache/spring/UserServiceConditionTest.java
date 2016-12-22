package cache.spring;

import cache.Printer;
import cache.common.JUnitBase;
import org.junit.Test;

/**
 * Created by scott on 2016/12/22.
 */
public class UserServiceConditionTest extends JUnitBase {

  @Test
  public void test() {
    UserServiceCondition service = ctx.getBean(UserServiceCondition.class);

    service.getUserByNo("admin");
    service.getUserByNo("testAdmin");
    service.getUserByNo("admin");
    service.getUserByNo("testAdmin");
  }
}
