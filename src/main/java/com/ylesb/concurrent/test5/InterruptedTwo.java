package com.ylesb.concurrent.test5;
/**
 * @title: InterruptedTwo
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/5/314:12
 */

import lombok.extern.slf4j.Slf4j;

/**
 * @className    : InterruptedTwo
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/5/3 14:12]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/5/3 14:12]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Slf4j
public class InterruptedTwo {
    public static void main(String[] args) throws InterruptedException {
    TwoPhaseTermination tpt = new TwoPhaseTermination();
    tpt.start();
    //tpt.start();
    //tpt.start();

        Thread.sleep(3500);
        log.debug("停止监控");
        tpt.stop();
}
}

@Slf4j(topic = "c.TwoPhaseTermination")
class TwoPhaseTermination {
    // 监控线程
    private Thread monitorThread;
    // 停止标记
    private volatile boolean stop = false;
    // 判断是否执行过 start 方法
    private boolean starting = false;

    // 启动监控线程
    public void start() {
        synchronized (this) {
            if (starting) { // false
                return;
            }
            starting = true;
        }
        monitorThread = new Thread(() -> {
            while (true) {
                Thread current = Thread.currentThread();
                // 是否被打断
                if (stop) {
                    log.debug("料理后事");
                    break;
                }
                try {
                    Thread.sleep(1000);
                    log.debug("执行监控记录");
                } catch (InterruptedException e) {
                }
            }
        }, "monitor");
        monitorThread.start();
    }

    // 停止监控线程
    public void stop() {
        stop = true;
        monitorThread.interrupt();
    }
}