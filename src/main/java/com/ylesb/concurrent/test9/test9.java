package com.ylesb.concurrent.test9;
/**
 * @title: test9
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/2910:10
 */

import lombok.extern.slf4j.Slf4j;

import static com.ylesb.concurrent.utils.Sleeper.sleep;

/**
 * @className    : test9
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/29 10:10]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/29 10:10]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class test9 {
    static int r = 0;
    public static void main(String[] args) throws InterruptedException {
        test1();
    }
    private static void test1() throws InterruptedException {
        log.debug("开始");
        Thread t1 = new Thread(() -> {
            log.debug("开始");
            sleep(1);
            log.debug("结束");
            r = 10;
        },"t1");
        t1.start();
      //  t1.join();
        log.debug("结果为:{}", r);
        log.debug("结束");
    }
}
