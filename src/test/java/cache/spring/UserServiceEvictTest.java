package cache.spring;

import cache.Printer;
import cache.common.JUnitBase;
import org.junit.Test;

/**
 * Created by scott on 2016/12/22.
 */
public class UserServiceEvictTest extends JUnitBase {

  @Test
  public void test() {
    UserServiceEvict service = ctx.getBean(UserServiceEvict.class);

    Printer.console("第一次查询..");
    service.getUserByNo("test");  //第一次查数据库
    Printer.console("第二次查询..");
    service.getUserByNo("test");  //第二次查缓存

    service.clear("test");  //清楚"test"缓存
    Printer.console("再次查询..");
    service.getUserByNo("test");  //再次查数据库
    Printer.console("再次查询..");
    service.getUserByNo("test");  //再次查缓存

  }
}
