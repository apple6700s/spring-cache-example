package cache.spring;

import cache.Printer;
import cache.common.JUnitBase;
import cache.model.User;
import org.junit.Test;

/**
 * Created by scott on 2016/12/22.
 */
public class UserServicePutTest extends JUnitBase {

  @Test
  public void test() {
    UserServicePut service = ctx.getBean(UserServicePut.class);
    User user = new User("admin", "初始化"); //用户
    service.updateUser(user); //初始化更新用户
    User oldUser = service.getUser(user.getUserNo()); //取用户信息
    Printer.console(String.format("初始化备注: %s", oldUser.getRemark()));
    user.setRemark(user.getRemark().concat(" - 更新用户"));
    service.updateUser(user); //再次更新
    User newUser = service.getUser(user.getUserNo()); //取用户信息
    Printer.console(String.format("更新后备注: %s", newUser.getRemark())); //验证用户信息是否更新
  }
}
