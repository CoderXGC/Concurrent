package com.ylesb.concurrent.test2;
/**
 * @title: test2
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/716:11
 */

import lombok.extern.slf4j.Slf4j;

/**
 * @className    : test2
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/7 16:11]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/7 16:11]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class test2 {
    //第一种创建线程的方式
    //public static void main(String[] args) {
    //    log.info("开始执行");
    //    Thread t1 = new Thread(new Runnable() {
    //        @Override
    //        public void run() {
    //            log.info("t1 run");
    //        }
    //    });
    //    t1.setName("t1");
    //    t1.start();
    //    log.info("结束执行");
    //}
    //第二种创建线程的方式
    public static void main(String[] args) {
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            log.debug("线程任务");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    // 可以使用lambda表达式呀
    // Runnable runnable = ()->{ log.debug("这里完成线程的任务");};

       Thread t1= new Thread(runnable,"t1");
        t1.start();
        log.debug("主线程");
    }
}


