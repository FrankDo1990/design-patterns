package com.study.templateMethod;

/**
 * Created by Frank on 2016/12/26.
 */
public class Coffee extends BeveragePrepare{

    private UserService userService;

    public Coffee() {
    }

    public Coffee(UserService userService) {
        this.userService = userService;
    }

    @Override
    void brew() {
        System.out.println("add coffee 2 cup");
    }

    @Override
    void addCondiment() {
        System.out.println("add some moc");
    }

    @Override
    public boolean hook() {
        return userService.userNeedCondiment();
    }

}
