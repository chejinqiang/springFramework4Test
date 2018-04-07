package resttemplate;

import org.springframework.web.client.RestTemplate;

/**
 * @author chejinqiang
 * @version V1.0
 * @Title:
 * @Description:
 * @date 17/4/12 上午10:32
 */
public class DemoRestClient {

    public final static String url = "http://localhost:8080";

    public static void main(String[] args){

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url+"/demo/show",String.class,new String[]{});
        System.out.println(result);

        String result2 = restTemplate.getForObject(url+"get/{id}.do",String.class,"1");

        restTemplate.postForObject(url+"add.do?user={user}",null,String.class,"aaaa");

        restTemplate.put(url+"edit.do?user={user}",null,"aaaa");

        restTemplate.delete(url+"/remove/{id}.do","5");


    }
}
