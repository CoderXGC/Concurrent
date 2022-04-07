package com.ylesb.concurrent.test1;
/**
 * @title: Astnc
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/715:55
 */

import com.ylesb.concurrent.Concurrent;
import com.ylesb.concurrent.utils.FileReader;
import lombok.extern.slf4j.Slf4j;


/**
 * @className    : Astnc
 * @description  : [异步读取文件]
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/7 15:55]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/7 15:55]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class Async {
    public static void main(String[] args) {
        new Thread(() -> FileReader.read(Concurrent.MP4_FULL_PATH)).start();
        log.debug("do other things ...");
    }
}
