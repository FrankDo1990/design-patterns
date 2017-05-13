package com.study.spf;

/**
 * Created by dufeng on 2017/5/13.
 */
public class Client {
    public static void main(String...args){
        try {
            //加载类信息
            Class.forName("com.study.spf.MongoConnectionProvider");
            Connection connection = ConnectionManager.getConnection();
            connection.connect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
