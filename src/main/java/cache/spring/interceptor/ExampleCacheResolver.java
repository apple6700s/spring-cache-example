package cache.spring.interceptor;

import cache.Printer;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.interceptor.CacheOperationInvocationContext;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by scott on 2016/12/24.
 */
@Component
public class ExampleCacheResolver implements CacheResolver {
  public Collection<? extends Cache> resolveCaches(CacheOperationInvocationContext<?> cacheOperationInvocationContext) {
    Printer.console("example cache resolver called ...");
    return Arrays.asList(new ConcurrentMapCache("userCache"));  // FIXME
  }
}
