package ru.boldyrev.ma.storeexample.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class InterceptorLogger {
    @AroundInvoke
    public Object printLog(InvocationContext ctx) throws Exception {
        System.out.println("Вызван метод " + ctx.getMethod().getName());
        return ctx.proceed();
    }
}
