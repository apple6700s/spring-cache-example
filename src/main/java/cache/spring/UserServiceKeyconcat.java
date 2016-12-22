package cache.spring;

import cache.Printer;
import cache.model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 组合条件设计缓存key
 *
 * Created by scott on 2016/12/22.
 */
@Service
public class UserServiceKeyconcat {

  /**
   * userNo连接userName组合key
   * @param userNo
   * @return
   */
  @Cacheable(value = "userCache", key = "#userNo.concat(#userName)")
  public User getUser(String userNo, String userName, Long userId) {
    //region 先查缓存, 再查数据库
    User u = search(userNo);
    return u;
    //endregion
  }

  private User search(String userNo) {
    // TODO
    Printer.console("query from db...");
    return new User();
  }
}
