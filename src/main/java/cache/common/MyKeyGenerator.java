package cache.common;

import org.springframework.cache.interceptor.KeyGenerator;

import java.lang.reflect.Method;

/***
 * Spring框架中提供了一种支持第三方缓存插件的缓存管理机制。
 * Spring只提供了缓存抽象,并没有提供缓存具体实现,我们可以选择第三方的缓存实现。
 * Spring的缓存主要是为方法做cache,第一次调用方法时,将方法返回的结果缓存起来,当再次调用该方法时,则先访问缓存,
 * 当缓存中存在有相同的方法调用的相应数据时,则直接返回缓存中的数据。
 *
 *Spring并不直接使用org.springframework.cache.Cache,而是通过org.springframework.cache.CacheManager
 * 接口管理。不同的Cache实现有一个相应的CacheManager实现。
 *
 * 缓存大多数是一个key-value的存储系统,在对方法进行Cache的系统中,key通常根据方法参数来组成生产。
 * Spring提供了org.springframework.cache.KeyGenerator来实现这种需求。
 *
 * spring cache位于spring-context包中
 */
public class MyKeyGenerator implements KeyGenerator {

	@Override
	public Object generate(Object target, Method method, Object... params) {
		if (params.length == 0) {
			return target.getClass().getName() + "." +method.getName();
		}
		if (params.length == 1) {
			Object param = params[0];
			if (param != null && !param.getClass().isArray()) {
				return target.getClass().getName() + "." + method.getName() + param;
			}
		}
		return target.getClass().getName() + "." + method.getName();
	}

}
