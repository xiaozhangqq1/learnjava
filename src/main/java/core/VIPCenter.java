package core;

import java.util.Map;

/**
 * 开关原则：设计对扩展开放，对修改关闭
 *
 * @Author zhangxuelong10
 * @create 2019/9/20 17:48
 */
public class VIPCenter {
    private Map</*User.TYPE*/String, ServiceProvider> providers;

    void serviceVIP(/*T extend*/ User user) {
        providers.get(user.getType()).service(user);
    }
}

interface ServiceProvider {
    void service(/*T extend*/ User user);
}

class SlumDogVIPServiceProvider implements ServiceProvider {
    public void service(/*T extend*/ User user) {
        // do somthing
    }
}

class RealVIPServiceProvider implements ServiceProvider {
    public void service(/*T extend*/ User user) {
        // do something
    }
}

enum User {
    TYPE("SlumDogVIP"), HELL("RealVIP");

    private String type;

    User(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}


