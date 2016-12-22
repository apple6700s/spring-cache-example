package cache.spring;

import cache.Printer;
import cache.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by scott on 2016/12/22.
 */
@Service
public class UserService {
  @Cacheable(value = "userCache")
  public User getUserByNo(String userNo) {
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
