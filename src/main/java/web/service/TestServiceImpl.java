package web.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Spring缓存注解是在方法上声明注解的,它提供了两个注解:
 * @Cacheable:负责将方法的返回值加入到缓存中
 * @CacheEvict:负责清除缓存
 *
 *@Cacheable 支持如下几个参数：

value：缓存名称，不能为空。对EHCache即ehcache.xml中cache的name

key：缓存的key，默认为空，表示使用方法的参数类型及参数值作为key，支持SpEL

condition：触发条件，只有满足条件的情况才会加入缓存，默认为空，既表示全部都加入缓存，支持SpEL

 @CacheEvict 支持如下几个参数：

 value：缓存位置名称，不能为空

 key：缓存的key，默认为空

 condition：触发条件，只有满足条件的情况才会清除缓存，默认为空，支持SpEL

 allEntries：true表示清除value中的全部缓存，默认为false


 @Cacheable(value=”accountCache”)，这个注释的意思是，当调用这个方法的时候，
 会从一个名叫 accountCache 的缓存中查询，如果没有，则执行实际的方法（即查询数据库），并将执行的结果存入缓存中，否则返回缓存中的对象。
 这里的缓存中的 key 就是参数 userName，value 就是 Account 对象。
 * */
@Service
public class TestServiceImpl{

	@Cacheable(value="default")
	public String defaultCache(String name) {
		System.err.println("db start break defaultCache");
		return "defaultCache";
	}
	
	@Cacheable(value="guavaCache60seconds")
	public String guavaCache60seconds(String name) {
		System.err.println("db start break guavaCache60seconds");
		return "guavaCache60seconds";
	}


	@Cacheable(value="guavaCache10minutes")
	public String guavaCache10minutes(String name) {
		System.err.println("db start break guavaCache10minutes");
		return "guavaCache10minutes";
	}

	@Cacheable(value="guavaCache1hour")
	public String guavaCache1hour(String name) {
		System.err.println("db start break guavaCache1hour");
		return "guavaCache1hour";
	}

	@Cacheable(value="redisCache60seconds")
	public String redisCache60seconds(String name) {
		System.err.println("db start break redisCache60seconds");
		return "redisCache60seconds";
	}

	@Cacheable(value="redisCache10minutes")
	public String redisCache10minutes(String name) {
		System.err.println("db start break redisCache10minutes");
		return "redisCache10minutes";
	}

	@Cacheable(value="redisCache1hour")
	public String redisCache1hour(String name) {
		System.err.println("db start break redisCache1hour");
		return "redisCache1hour";
	}

	@Cacheable(value="accountCache",key="#userName.concat(#password)")
	public String getAccount(String userName,String password,boolean sendLog) {
		// 方法内部实现不考虑缓存逻辑，直接实现业务
		return "";
	}

	}
