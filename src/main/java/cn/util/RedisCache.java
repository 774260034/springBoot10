package cn.util;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Configuration
@EnableCaching  //开启缓存
public class RedisCache extends CachingConfigurerSupport {
    @Bean
    public KeyGenerator keyGenerator(){
        return new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... params) {
                StringBuilder builder=new StringBuilder();
                builder.append(o.getClass().getName());
                builder.append(method.getName());
                for (Object param:params) {
                    builder.append(param.toString());

                }

                return builder.toString();
            }
        };
    }


}

