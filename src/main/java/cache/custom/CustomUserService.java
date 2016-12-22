package cache.custom;

import cache.Printer;
import cache.model.User;

/**
 * Created by scott on 2016/12/21.
 */
public class CustomUserService {
  private CustomCacheManager<User> cacheManager;

  public CustomUserService() {
    cacheManager = new CustomCacheManager<User>();
  }

  public User getUserByNo(String userNo) {
    //region 先查缓存, 再查数据库
    User u = cacheManager.getValue(userNo);
    if(u != null) {
      Printer.console("query from cache...");
      return u;
    }

    u = search(userNo);
    if(u != null) {
      cacheManager.addOrUpdate(userNo, u);
    }
    return u;
    //endregion
  }

  public void clear() {
    cacheManager.clear();
  }

  private User search(String userNo) {
    // TODO
    Printer.console("query from db...");
    return new User();
  }
}
