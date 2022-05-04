package com.ylesb.concurrent.test10;
/**
 * @title: Test10
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/5/411:25
 */

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.LockSupport;

import static com.ylesb.concurrent.utils.Sleeper.sleep;

/**
 * @className    : Test10
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/5/4 11:25]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/5/4 11:25]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class Test10 {
    private static void test4() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                log.debug("park...");
                LockSupport.park();
                log.debug("打断状态：{}", Thread.interrupted());
            }
        });
        t1.start();


        //sleep(1);
        //t1.interrupt();
    }

    private static void test3() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            log.debug("park...");
            LockSupport.park();
            log.debug("unpark...");
            log.debug("打断状态：{}", Thread.currentThread().isInterrupted());//Thread.currentThread().Interrupted()清除打断标记 可以继续执行LockSupport.park();
        }, "t1");
        t1.start();

        sleep(1);
        t1.interrupt();

    }

    public static void main(String[] args) throws InterruptedException {
        test3();
    }
}
