package com.peramdy;

import org.apache.commons.lang.exception.ExceptionUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Peramdy on 2016/12/22.
 */
public class ThreadPoolTest {



    ExecutorService singleThread= Executors.newSingleThreadExecutor();

    /**
     * @Descroption 线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
     */
    public  static void testCachedThread(){
        ExecutorService cachedThread= Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            final int index = i;
            try {
                Thread.sleep(i*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThread.execute(new Runnable() {
                public void run() {
                    System.out.println(index);
                }
            });
        }
    }

    /**
     * @Description 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。示例代码如下
     * 因为线程池大小为3，每个任务输出index后sleep 2秒，所以每两秒打印3个数字。
     * 定长线程池的大小最好根据系统资源进行设置
     */
    public static void testFixThread(){
        ExecutorService fixThread= Executors.newFixedThreadPool(10);
        for(int i=0;i<50;i++){
            final int index=i;
            fixThread.execute(new Runnable() {
                public void run() {
                    System.out.println(index);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static void scheduledThreadTest(){
        ExecutorService scheduledThread= Executors.newScheduledThreadPool(5);

//            scheduledThread


    }



}
