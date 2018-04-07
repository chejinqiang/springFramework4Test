package web.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author chejinqiang
 * @version V1.0
 * @Title:
 * @Description:
 *
 *jackson注解学习参考:
 * 属性重命名:@JsonProperty ,改变某个成员属性所使用的JSON名称
 * 忽略属性时使用的注解:@JsonIgnore,不希望输出的属性
 * 或者你可能忽略某些从JSON数据中得到的属性,如果这样可以使用:@JsonIgnoreProperties({"id"})
 * ignoreUnknown=true会忽略从json中获得的所有多余的属性
 *
 *
 * @date 17/3/31 下午3:13
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    @JsonProperty("renameId")
    private Long id;

    @JsonIgnore
    private String quote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
