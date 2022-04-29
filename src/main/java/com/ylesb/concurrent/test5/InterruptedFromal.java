package com.ylesb.concurrent.test5;
/**
 * @title: InterruptedFromal
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/2910:37
 */

import lombok.extern.slf4j.Slf4j;

/**
 * @className    : InterruptedFromal
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/29 10:37]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/29 10:37]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class InterruptedFromal {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while(true) {
                boolean interrupted = Thread.currentThread().isInterrupted();
                if(interrupted) {
                    log.debug("被打断了, 退出循环");
                    break;
                }
            }
        }, "t1");
        t1.start();

        Thread.sleep(1000);
        log.debug("interrupt");
        t1.interrupt();
    }
}

