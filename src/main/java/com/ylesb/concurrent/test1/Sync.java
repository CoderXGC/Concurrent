package com.ylesb.concurrent.test1;
/**
 * @title: Sync
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/716:04
 */

import com.ylesb.concurrent.Concurrent;
import com.ylesb.concurrent.utils.FileReader;
import lombok.extern.slf4j.Slf4j;

/**
 * @className    : Sync
 * @description  : [同步读取文件]
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/7 16:04]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/7 16:04]
 * @updateRemark : [描述说明本次修改内容] 
 */

@Slf4j(topic = "c.Sync")
public class Sync {

    public static void main(String[] args) {
        FileReader.read(Concurrent.MP4_FULL_PATH);
        log.debug("do other things ...");
    }

}
