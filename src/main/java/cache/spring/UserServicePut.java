package cache.spring;

import cache.Printer;
import cache.model.User;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 确保方法一定被执行，同时更新缓存
 *
 * Created by scott on 2016/12/22.
 */
@Service
public class UserServicePut {

  @Cacheable(value = "userCache", key = "#userNo")
  public User getUser(String userNo) {
    //region 先查缓存, 再查数据库
    User u = search(userNo);
    return u;
    //endregion
  }

  /**
   * 更新用户信息，并缓存
   * @param user
   * @return
   */
  @CachePut(value = "userCache", key = "#user.getUserNo()")
  public User updateUser(User user) {
    Printer.console("update user info ...");
    return update(user);
  }

  private User search(String userNo) {
    // TODO
    Printer.console("query from db...");
    return new User();
  }

  private User update(User user) {
    // TODO
    Printer.console("update db...");
    return user;
  }
}
