package com.ylesb.concurrent.test8;
/**
 * @title: test8
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/2816:11
 */

/**
 * @className    : test8
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/28 16:11]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/28 16:11]
 * @updateRemark : [线程优先级]
 */

public class test8 {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            int count = 0;
            for (;;) {
                System.out.println("---->1 " + count++);
            }
        };
        Runnable task2 = () -> {
            int count = 0;
            for (;;) {
//                Thread.yield();
                System.out.println("              ---->2 " + count++);
            }
        };
        Thread t1 = new Thread(task1, "t1");
        Thread t2 = new Thread(task2, "t2");
      //  t1.setPriority(Thread.MIN_PRIORITY);
        //t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }

}
