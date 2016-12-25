package com.study.facade;

/**
 * Created by Frank on 2016/12/25.
 */
public class FacadeCardService extends AbstractCardService  {
    public FacadeCardService() {
        super();
    }

    public FacadeCardService(CardInterface cardInterface, FileInterface fileInterface) {
        super(cardInterface, fileInterface);
    }
}
