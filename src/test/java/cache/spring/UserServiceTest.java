package cache.spring;

import cache.Printer;
import cache.common.JUnitBase;
import org.junit.Test;

/**
 * Created by scott on 2016/12/22.
 */
public class UserServiceTest extends JUnitBase {

  @Test
  public void test() {
    UserService service = ctx.getBean(UserService.class);

    Printer.console("第一次查询..");
    service.getUserByNo("test");  //第一次查数据库
    Printer.console("第二次查询..");
    service.getUserByNo("test");  //第二次查缓存

  }
}
