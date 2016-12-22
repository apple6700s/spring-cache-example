package cache.custom;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by scott on 2016/12/21.
 */
public class CustomCacheManager<T> {
  private Map<String, T> cache =
      new ConcurrentHashMap<String, T>();

  public T getValue(String key) {
    return cache.get(key);
  }

  public void addOrUpdate(String key, T value) {
    cache.put(key, value);
  }

  public void delete(String key) {
    if(cache.containsKey(key))
      cache.remove(key);
  }

  public void clear() {
    cache.clear();
  }
}
