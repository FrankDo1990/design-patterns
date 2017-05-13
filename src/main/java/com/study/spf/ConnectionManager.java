package com.study.spf;

import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.Map;

/**
 * Created by dufeng on 2017/5/13.
 */
public class ConnectionManager {
    private static final Map<String, ConnectionProvider> providers = Maps.newConcurrentMap();

    public static void registerProviders(String name, ConnectionProvider provider) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("invalid name :" + name);
        }
        if (provider == null) {
            throw new IllegalArgumentException("invalid provider : null");
        }
        providers.put(name, provider);
    }

    //默认获取的连接方式
    public static Connection getConnection() {
        for (String name : providers.keySet()) {
            return providers.get(name).getConnection();
        }
        throw new IllegalStateException("no providers");
    }

    public static Connection getConnection(String name) {
        ConnectionProvider provider = providers.get(name);
        if (provider != null){
            return provider.getConnection();
        }
        throw new IllegalArgumentException("no providers for：" + name);
    }
}
