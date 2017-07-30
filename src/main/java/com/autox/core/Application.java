package com.autox.core;

import com.autox.core.base.CustomProperties;
import com.autox.core.util.FastJsonAutoTypeConfig;
import com.autox.core.util.LogAspectUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config/custom.properties")
@EnableConfigurationProperties({CustomProperties.class})
@ImportResource(locations = {"classpath:config/conf.xml"})
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  /**
   * 添加FastJson的autoType白名单,Redis缓存使用自定义的fastjson时使用
   *
   * @return ParserConfig
   * @see <a href="https://github.com/alibaba/fastjson/wiki/enable_autotype">添加autoType白名单</a>
   */
  @Bean
  public FastJsonAutoTypeConfig fastJsonAutoTypeConfig() {
    return new FastJsonAutoTypeConfig("com.autox.core");
  }

  /**
   * 日志切面
   * @return LogAspectUtil
   */
  @Bean
  public LogAspectUtil logAspectUtilConfig() {
    return new LogAspectUtil();
  }

}
