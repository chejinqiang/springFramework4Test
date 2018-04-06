package web.model;

/**
 * Created by chejinqiang on 2018/4/6.
 */
public class User {

    private String user;
    private String name;

    public User(){}

    public User(String user,String name){
        this.user = user;
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
