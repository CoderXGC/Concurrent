package com.ylesb.concurrent.test5;
/**
 * @title: test5
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/2016:31
 */

import lombok.extern.slf4j.Slf4j;

/**
 * @className    : test5
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/20 16:31]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/20 16:31]
 * @updateRemark : [线程打断]
 */
@Slf4j
public class test5 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                log.info("线程任务执行");
                try {
                    Thread.sleep(2000); // wait, join
                } catch (InterruptedException e) {
                     log.info("被打断");
                    e.printStackTrace();

                }
            }
        };
        t1.start();
        log.info("t1 status: {}", t1.getState());//RUNNABLE
        Thread.sleep(1000);
        log.info("t1 status: {}", t1.getState());//TIMED_WAITING
        t1.interrupt();//打断

    }
}
