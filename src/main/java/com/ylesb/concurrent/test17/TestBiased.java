package com.ylesb.concurrent.test17;
/**
 * @title: TestBiased
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/5/716:43
 */

import lombok.extern.slf4j.Slf4j;
import org.openjdk.jol.info.ClassLayout;


/**
 * @className    : TestBiased
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/5/7 16:43]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/5/7 16:43]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class TestBiased {
    public static void main(String[] args) throws InterruptedException {
    Dog dog = new Dog();

        Object o = new Object();
       System.out.println(ClassLayout.parseInstance(o).toPrintable());
       Thread.sleep(4000);
        System.out.println(ClassLayout.parseInstance(new Dog()).toPrintable());
    log.info("1");
    }
}
class Dog{

}
