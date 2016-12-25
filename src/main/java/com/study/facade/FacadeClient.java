package com.study.facade;

/**
 * Created by Frank on 2016/12/25.
 * facade 模式
 */
public class FacadeClient {
    public static void main(String...args){
        CardInterface card = CardImpl.createCardImpl();
        FileInterface file = FileImpl.createFileImpl();
        AbstractCardService cardService = new FacadeCardService(card, file);
        cardService.sendEmail();
    }
}
