package com.ylesb.concurrent.utils;
/**
 * @title: Sleeper
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/716:03
 */

import java.util.concurrent.TimeUnit;

/**
 * @className    : Sleeper
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/7 16:03]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/7 16:03]
 * @updateRemark : [描述说明本次修改内容] 
 */
public class Sleeper {
    public static void sleep(int i) {
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(double i) {
        try {
            TimeUnit.MILLISECONDS.sleep((int) (i * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
