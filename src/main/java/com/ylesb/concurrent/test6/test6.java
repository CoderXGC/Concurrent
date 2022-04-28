package com.ylesb.concurrent.test6;
/**
 * @title: test6
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/2816:09
 */

import lombok.extern.slf4j.Slf4j;

/**
 * @className    : test6
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/28 16:09]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/28 16:09]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class test6 {
    public static void main(String[] args) {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        log.debug("t1 state: {}", t1.getState());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.debug("t1 state: {}", t1.getState());
    }
}
