package com.ylesb.concurrent.test11;
/**
 * @title: Test11
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/5/413:04
 */

import lombok.extern.slf4j.Slf4j;

/**
 * @className    : Test11
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/5/4 13:04]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/5/4 13:04]
 * @updateRemark : [默认情况下，Java进程需要等待所有线程都运行结束，才会结束。有一种特殊的线程叫做守护线程，只要其它非守护线程运行结束了，即使守护线程的代码没有执行完，也会强制结束。]
 */
@Slf4j
public class Test11 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
            }
            log.debug("结束");
        }, "t1");
        t1.setDaemon(true);//设置为守护线程
        t1.start();

        Thread.sleep(1000);
        log.debug("结束");
    }
}
