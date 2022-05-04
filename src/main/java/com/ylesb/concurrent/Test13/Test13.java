package com.ylesb.concurrent.Test13;
/**
 * @title: Test13
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/5/413:38
 */

import lombok.extern.slf4j.Slf4j;

import static com.ylesb.concurrent.utils.Sleeper.sleep;

/**
 * @className    : Test13
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/5/4 13:38]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/5/4 13:38]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class Test13 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            log.debug("洗水壶");
            sleep(1);
            log.debug("烧开水");
            sleep(5);
        },"老王");

        Thread t2 = new Thread(() -> {
            log.debug("洗茶壶");
            sleep(1);
            log.debug("洗茶杯");
            sleep(2);
            log.debug("拿茶叶");
            sleep(1);
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("泡茶");
        },"小王");

        t1.start();
        t2.start();
    }
}
