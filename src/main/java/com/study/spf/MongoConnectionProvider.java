package com.study.spf;

/**
 * Created by dufeng on 2017/5/13.
 */
public class MongoConnectionProvider implements ConnectionProvider{

    static {
        ConnectionManager.registerProviders("mongo", new MongoConnectionProvider());
    }

    @Override
    public Connection getConnection() {
        return new MongoConnection();
    }
}
