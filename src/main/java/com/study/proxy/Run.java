package com.study.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Frank on 2017/1/8.
 */
public class Run {
    static TargetObject targetObject;
    static InvocationHandler invocationHandler;
    static {
        targetObject = new TargetObject();
        invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(targetObject, args);
            }
        };
    }

    public static void main(String...args) throws Exception {
        runProxyMethod();
        anotherProxy();
    }

    public static void runProxyMethod(){
        Operation proxyOperation = (Operation)Proxy.newProxyInstance(Operation.class.getClassLoader(), new Class[]{Operation.class}, invocationHandler);
        proxyOperation.sign();
    }

    public static void anotherProxy() throws Exception{
        Class proxyClazz = Proxy.getProxyClass(Operation.class.getClassLoader(), Operation.class);
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        Operation op = (Operation) constructor.newInstance(invocationHandler);
        op.sign();
    }

}
