package com.study.facade;

/**
 * Created by Frank on 2016/12/25.
 */
public  abstract class AbstractCardService {
    private CardInterface cardInterface;
    private FileInterface fileInterface;

    public AbstractCardService() {
    }

    public AbstractCardService(CardInterface cardInterface, FileInterface fileInterface) {
        this.cardInterface = cardInterface;
        this.fileInterface = fileInterface;
    }

    public void sendEmail(){
        fileInterface.openFile();
        fileInterface.write();
        fileInterface.close();
        cardInterface.packageCard();
        cardInterface.packageCard();
    }

    public CardInterface getCardInterface() {
        return cardInterface;
    }

    public void setCardInterface(CardInterface cardInterface) {
        this.cardInterface = cardInterface;
    }

    public FileInterface getFileInterface() {
        return fileInterface;
    }

    public void setFileInterface(FileInterface fileInterface) {
        this.fileInterface = fileInterface;
    }
}
