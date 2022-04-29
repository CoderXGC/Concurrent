package com.ylesb.concurrent.test5;
/**
 * @title: Interrupted
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/2910:31
 */

import lombok.extern.slf4j.Slf4j;

/**
 * @className    : Interrupted
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/29 10:31]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/29 10:31]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class Interrupted {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            log.debug("sleep...");
            try {
                Thread.sleep(5000); // wait, join 会将异常标记打断为假
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1");

        t1.start();
        Thread.sleep(1000);
        log.debug("interrupt");
        t1.interrupt();
        log.debug("打断标记:{}", t1.isInterrupted());
    }
}
