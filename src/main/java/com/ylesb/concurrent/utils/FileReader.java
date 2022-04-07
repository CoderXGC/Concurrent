package com.ylesb.concurrent.utils;
/**
 * @title: FileReader
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/716:02
 */

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @className    : FileReader
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/7 16:02]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/7 16:02]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j(topic = "c.FileReader")
public class FileReader {
    public static void read(String filename) {
        int idx = filename.lastIndexOf(File.separator);
        String shortName = filename.substring(idx + 1);
        try (FileInputStream in = new FileInputStream(filename)) {
            long start = System.currentTimeMillis();
            log.debug("read [{}] start ...", shortName);
            byte[] buf = new byte[1024];
            int n = -1;
            do {
                n = in.read(buf);
            } while (n != -1);
            long end = System.currentTimeMillis();
            log.debug("read [{}] end ... cost: {} ms", shortName, end - start);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}