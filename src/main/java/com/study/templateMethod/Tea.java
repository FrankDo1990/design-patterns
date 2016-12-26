package com.study.templateMethod;

/**
 * Created by Frank on 2016/12/26.
 */
public class Tea extends BeveragePrepare {
    public UserService userService;

    public Tea() {
    }

    public Tea(UserService userService) {
        this.userService = userService;
    }

    @Override
    void brew() {
        System.out.println("get some tea!!");
    }

    @Override
    void addCondiment() {
        System.out.println("add some salt!");
    }

    @Override
    public boolean hook() {
        return userService.userNeedCondiment();
    }
}
