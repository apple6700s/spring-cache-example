package cache.spring;

import cache.Printer;
import cache.model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 按照条件操作缓存
 *
 * Created by scott on 2016/12/22.
 */
@Service
public class UserServiceCondition {

  /**
   * userNo长度大于5时缓存, 小于等于5的不缓存
   * @param userNo
   * @return
   */
  @Cacheable(value = "userCache", condition = "#userNo.length() > 5")
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

  @CacheEvict(value = "userCache", key = "#userNo")
  public void clear(String userNo) {
    Printer.console("clear cache...");
  }
}
