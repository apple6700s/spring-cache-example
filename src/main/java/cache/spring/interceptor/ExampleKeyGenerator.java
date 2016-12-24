package cache.spring.interceptor;

import cache.Printer;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by scott on 2016/12/24.
 */
@Component
public class ExampleKeyGenerator implements KeyGenerator {
  public ExampleKeyGenerator() {}

  public Object generate(Object o, Method method, Object... objects) {
    Printer.console("example key generator is called ...");
    return "test";  //custom impl
  }
}
