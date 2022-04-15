package com.ylesb.concurrent.test4;
/**
 * @title: test4
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/1517:11
 */

import com.ylesb.concurrent.Concurrent;
import com.ylesb.concurrent.utils.FileReader;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @className    : test4
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/15 17:11]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/15 17:11]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class test4 {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                log.info("我是一个新建的线程正在运行中");
                FileReader.read(Concurrent.MP4_FULL_PATH);
            }
        };
        thread.setName("新建线程");
        log.info(thread.getState().toString());
      //  thread.run();
        thread.start();
        log.info(thread.getState().toString());
    }

}