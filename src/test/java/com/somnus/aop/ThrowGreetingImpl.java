package com.somnus.aop;

/** 
 * @Title: ThrowGreetingImpl.java 
 * @Package com.somnus.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午12:39:06 
 * @version V1.0 
 */
public class ThrowGreetingImpl implements Greeting {
    
    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
        throw new RuntimeException("故意抛出一个异常，看看异常信息能否被拦截到"); // 故意抛出一个异常，看看异常信息能否被拦截到
    }
}
