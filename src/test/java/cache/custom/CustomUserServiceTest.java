package cache.custom;

import org.junit.Test;

/**
 * Created by scott on 2016/12/21.
 */
public class CustomUserServiceTest {

  @Test
  public void test() {
    CustomUserService service = new CustomUserService();
    service.getUserByNo("test");  //第一次查数据库
    service.getUserByNo("test");  //第二次查缓存

    service.clear();  //清空缓存

    service.getUserByNo("test");  //第一次查数据库
    service.getUserByNo("test");  //第二次查缓存
  }
}
