package com.autox.core.util;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.lang.reflect.Method;

/**
 * Redis缓存配置类
 */
@Configuration
@EnableCaching
public class RedisCacheConfig extends CachingConfigurerSupport {
  /**
   * 自定义Key生成器
   * <p>此方法将会根据 [类名 + 方法名 + 所有参数的值] 生成唯一的一个key，
   * 即使@Cacheable(value="xxxx",keyGenerator="redisKeyGenerator")中的value属性一样，key也会不一样。</p>
   * @return 自定义的key
   */
  @Bean
  public KeyGenerator redisKeyGenerator() {
    return new KeyGenerator() {
      @Override
      public Object generate(Object target, Method method, Object... params) {
        StringBuilder sb = new StringBuilder();
        sb.append(target.getClass().getName());
        sb.append(method.getName());
        for (Object obj : params) {
          sb.append(obj.toString());
        }
        return sb.toString();
      }
    };
  }

  /**
   * 缓存管理器
   * @param redisTemplate redis模板
   * @return CacheManager
   */
  @Bean
  public CacheManager cacheManager(RedisTemplate<?, ?> redisTemplate) {
    RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
    //设置key-value超时时间，单位秒
    cacheManager.setDefaultExpiration(300);
    return cacheManager;
  }

  /**
   * redis模板操作类
   * @param redisConnectionFactory Springboot自动配置
   * @return StringRedisTemplate
   */
  @Bean(name = "stringRedisTemplate")
  public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
    StringRedisTemplate template = new StringRedisTemplate(redisConnectionFactory);
    //设置序列化工具，这样ReportBean不需要实现Serializable接口
    template.setValueSerializer(new FastJson2JsonRedisSerializer<>(Object.class));
    //key的序列化使用StringRedisSerializer，字符串编码数据以String存储
    template.setKeySerializer(new StringRedisSerializer());
    template.afterPropertiesSet();
    return template;
  }
}
