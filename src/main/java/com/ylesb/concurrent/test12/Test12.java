package com.ylesb.concurrent.test12;
/**
 * @title: Test12
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/5/413:21
 */

import com.ylesb.concurrent.Concurrent;
import com.ylesb.concurrent.utils.FileReader;

/**
 * @className    : Test12
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/5/4 13:21]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/5/4 13:21]
 * @updateRemark : [描述说明本次修改内容] 
 */

public class Test12 {
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            FileReader.read(Concurrent.MP4_FULL_PATH);
            FileReader.read(Concurrent.MP4_FULL_PATH);
            FileReader.read(Concurrent.MP4_FULL_PATH);
        }, "t1").start();

        Thread.sleep(1000);
        System.out.println("ok");
    }
}
