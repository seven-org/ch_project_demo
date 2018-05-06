package code.seven.ch_project_demo.utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class HttpUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);
	
	/**
	 * 得到http服务器返回字符串参数
	 * @param url
	 * @return
	 */
	public static String getUrl(String url) {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		
		return result;
	}
	
	/**
	 * 发送post请求返回字符串
	 * @param url post-URL:
	 * @param postData post的数据
	 * @return 返回post请求响应的数据
	 */
	public static String postUrl(String url, String postData){
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());        
        HttpEntity<String> formEntity = new HttpEntity<String>(postData, headers);

        return restTemplate.postForObject(url, formEntity, String.class);
		
	}
	
}
