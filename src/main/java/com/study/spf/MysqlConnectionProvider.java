package com.study.spf;

/**
 * Created by dufeng on 2017/5/13.
 */
public class MysqlConnectionProvider implements ConnectionProvider {
    //Mysql Provider 实现
    @Override
    public Connection getConnection() {
        return new MySqlConnection();
    }
    static {
        ConnectionManager.registerProviders("Mysql", new MysqlConnectionProvider());
    }
}
