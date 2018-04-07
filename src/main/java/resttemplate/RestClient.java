package resttemplate;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class RestClient {
	
	/**
	 * HTTP post method
	 * @param <T> The request object type
	 * @param <V> The response object type
	 * @param payload the request details
	 * @param url the url to be hit
	 * @return the V type response
	 */
	public static <T, V> V post(final T payload,final String url, final Class<V> responseType) {
		return new RestTemplate().postForObject(url, payload, responseType);
	}

	//第二个设置超时的方法
	public static <T, V> V post2(final T payload,final String url, final Class<V> responseType) {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setConnectTimeout(1000);
		requestFactory.setReadTimeout(1000);
		return new RestTemplate(requestFactory).postForObject(url, payload, responseType);
	}

	/***
	 * String result = restTemplate.getForObject("http://example.com/hotels/{hotel}/bookings/{booking}", String.class,"42", "21");
	 *
	 * Map<String, String> vars = Collections.singletonMap("hotel", "42");
	 String result = restTemplate.getForObject("http://example.com/hotels/{hotel}/rooms/{hotel}", String.class, vars);

	 java String message = restTemplate.getForObject("http://localhost:8080/yongbarservice/appstore/appgoods/restTemplate?name=zhaoshijie&id=80", String.class )


	 *post我一般常用的方法为：
	 MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<String, String>();
	 bodyMap.setAll(urlVariables);
	 ResponseClass responseClass = restTemplate.postForObject(CAR_CES_URL, bodyMap, ResponseClass.class);
	 以及：
	 HttpHeaders headers = new HttpHeaders();
	 headers.add("X-Auth-Token", "e348bc22-5efa-4299-9142-529f07a18ac9");

	 MultiValueMap<String, String> postParameters = new LinkedMultiValueMap<String, String>();
	 postParameters.add("owner", "11");
	 postParameters.add("subdomain", "aoa");
	 postParameters.add("comment", "");

	 HttpEntity<MultiValueMap<String, String>> requestEntity  = new HttpEntity<MultiValueMap<String, String>>(postParameters, headers);

	 ParseResultVo exchange = null;
	 try {
	 exchange = restTemplate.postForObject("http://l-dnsutil1.ops.beta.cn6.qunar.com:10085/v1/cnames/tts.piao",  requestEntity, ParseResultVo.class);
	 logger.info(exchange.toString());
	 } catch (RestClientException e) {
	 logger.info("。。。。");
	 }
	 以及：
	 DomainParam domainParam = new DomainParam();
	 domainParam.setCustomerId(1);
	 //...

	 logger.info("....");
	 restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
	 restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
	 String responseResult = restTemplate.postForObject(url, domainParam, String.class);
	 * */

}
