package com.ylesb.concurrent.test17;
/**
 * @title: TestObjectSize
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/5/718:24
 */

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;

/**
 * @className    : TestObjectSize
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/5/7 18:24]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/5/7 18:24]
 * @updateRemark : [描述说明本次修改内容] 
 */


public class TestObjectSize {

    public static void main(String[] args) {
        System.out.println("对象内部信息");
        System.out.println(ClassLayout.parseInstance(new String("ConstXiong")).toPrintable());
        System.out.println(ClassLayout.parseInstance(new char[]{'C', 'o', 'n', 's', 't', 'X', 'i', 'o', 'n', 'g'}).toPrintable());

        System.out.println("对象整体信息");
        System.out.println(GraphLayout.parseInstance(new String("ConstXiong")).toPrintable());
        System.out.println(GraphLayout.parseInstance(new char[]{'C', 'o', 'n', 's', 't', 'X', 'i', 'o', 'n', 'g'}).toPrintable());

        System.out.println("对象占用总空间");
        System.out.println(GraphLayout.parseInstance(new String("ConstXiong")).totalSize());
        System.out.println(GraphLayout.parseInstance(new char[]{'C', 'o', 'n', 's', 't', 'X', 'i', 'o', 'n', 'g'}).totalSize());
    }
}
