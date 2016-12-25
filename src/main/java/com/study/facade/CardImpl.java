package com.study.facade;

/**
 * Created by Frank on 2016/12/25.
 */
public class CardImpl implements CardInterface {

    public static CardImpl createCardImpl(){
        return new CardImpl();
    }
    @Override
    public void sendCard() {
    }

    @Override
    public void packageCard() {

    }
}
