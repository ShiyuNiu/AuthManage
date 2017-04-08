package cn.antiy.weiqing.auth;

/**
 * Created by Shiyu on 2017/4/8.
 */
public enum Menu {
    INDEX("总览"),
    ROLE("角色"),
    RESOURCE("资源"),
    AUTHORIZATION("权限");

    private String name;

    Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
