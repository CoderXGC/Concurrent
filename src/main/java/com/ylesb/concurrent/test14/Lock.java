package com.ylesb.concurrent.test14;
/**
 * @title: Lock
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/5/414:29
 */

import lombok.extern.slf4j.Slf4j;

import static com.ylesb.concurrent.utils.Sleeper.sleep;

/**
 * @className    : Lock
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/5/4 14:29]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/5/4 14:29]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class Lock { public static void main(String[] args) {
    Number n1 = new Number();
   // Number n2 = new Number();
    new Thread(() -> {
        log.debug("begin");
        n1.a();
    }).start();
    new Thread(() -> {
        log.debug("begin");
        n1.b();
    }).start();
    new Thread(() -> {
        log.debug("begin");
        n1.c();
    }).start();
}
}
@Slf4j(topic = "c.Number")
class Number{
    public synchronized void a() {
        sleep(1);
        log.debug("1");
    }
    public synchronized void b() {
        log.debug("2");
    }
    public  void c() {
        log.debug("3");
    }
}
