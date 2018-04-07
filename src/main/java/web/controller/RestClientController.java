package web.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import resttemplate.RestClient;
import web.view.RequestView;
import web.view.ResponseView;

import java.util.concurrent.atomic.AtomicLong;

/**
 * a "hello world"RESTful web service
 * 请求:http://localhost:8080/consume
 * 响应(json):{"id":1,"content":"hello,world"}
 * 请求:http://localhost:8080/greeting?name=user
 * 响应:{"id":1,"content":"hello,user"}
 *
 *	Spring uses the Jackson JSON library,自动将实例转成JSON
 *	Spring’s MappingJackson2HttpMessageConverter is automatically chosen to convert the Greeting instance to JSON
 *
 *  @RestController: 构建RESTful web services
 *
 *  传统的MVC控制器和基于rest的web服务控制器的一个关键区别是:创建HTTP response body的方式
 *	RESTful web service controller仅仅返回一个对象,然后直接作为json写入到HTTP responses中。
 *	而不需要依赖 视图技术执行服务端的渲染到html中
 * */

@RestController
public class RestClientController {

	private static final String template = "hello,%s!";
	private final AtomicLong counter = new AtomicLong();

	/**
	 * @RequestMapping 默认匹配所有的HTTP操作(GET,PUT,POST), 无需指定。
	 * 如果需要指定则: @RequestMapping(method=GET)
	 *
	 * @RequestParam :绑定查询字符串name到形参name上,这个查询字符串可以标识为是否可选(默认是:required=true)
	 * 如果请求中没有,defaultValue会被使用。
	 *
	 *
	 * */

	@RequestMapping("/greeting")
	public ResponseView greeting(@RequestParam(value="name",defaultValue="World") String name){
		return new ResponseView(String.valueOf(counter.incrementAndGet()),String.format(template, name));
	}


	@RequestMapping(value = "/consume", method = RequestMethod.GET)
	public ResponseView consume() {
		RequestView request = new RequestView();
		request.setKey1("foo");
		request.setKey2("bar");
		return RestClient.post(request, "http://localhost:8080/post", ResponseView.class);
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public ResponseView post(@RequestBody RequestView request) {
		ResponseView response = new ResponseView();
		response.setStatus("success");
		response.setMessage(request.getKey1()+" "+request.getKey2());
		return response;
	}


	/**
	 * @RestController 注解会将该类标识,该类的每一个方法返回一个domain object而不是view。相当于:@Controller + @ResponseBody
	 *
	 * */





}
