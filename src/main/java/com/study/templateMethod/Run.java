package com.study.templateMethod;

import com.study.decorate.Beverage;

/**
 * Created by Frank on 2016/12/26.
 */
public class Run {

    public static void main(String...args){
        UserService userService = new UserServiceImpl();
        BeveragePrepare coffee = new Coffee(userService);
        coffee.prepareBeverage();

        BeveragePrepare tea = new Tea(userService);
        tea.prepareBeverage();
    }
}
