package com.ylesb.concurrent.test7;
/**
 * @title: test7
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/2816:10
 */

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @className    : test7
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/28 16:10]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/28 16:10]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class test7 {

    public static void main(String[] args) throws InterruptedException {
        log.debug("enter");
        TimeUnit.SECONDS.sleep(1);
        log.debug("end");
//        Thread.sleep(1000);
    }
}
