package com.ylesb.concurrent.test3;
/**
 * @title: test3
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/1116:59
 */

import lombok.extern.slf4j.Slf4j;

/**
 * @className    : test3
 * @description  : [线程交替执行不受控制]
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/11 16:59]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/11 16:59]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class test3 {
    public static void main(String[] args) {
        new Thread(()->{
            while (true) {
             log.info("running");
            }
        },"t1").start();
        new Thread(()->{
            while (true) {
                log.info("running");
            }
        },"t2").start();

    }
}
