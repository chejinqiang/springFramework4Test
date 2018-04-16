package web.service;

/**
 * Created by chejinqiang on 2018/4/14.
 */
public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService(){}
    public static ClientService createInstance(){
        return clientService;
    }
    public Object getServiceLocator(){
        return null;
    }
}
