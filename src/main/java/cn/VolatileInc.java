package cn;

/**
 * Created by zhangxuelong on 2018/9/28
 * t1,t2,main三个线程同时对一个int进行累加时会发现最终值都会小于30000
 */
public class VolatileInc implements Runnable {
    private static volatile int count = 0;// 使用volatile修饰基本数据内存不能保证原子性

    // private static AtomicInteger count = new AtomicInteger();
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            count++;
            // count.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileInc volatileInc = new VolatileInc();
        Thread t1 = new Thread(volatileInc, "t1");
        Thread t2 = new Thread(volatileInc, "t2");
        t1.start();
//        t1.join();
        t2.start();
//        t2.join();
        for (int i = 0; i < 10000; i++) {
            count++;
            // count.incrementAndGet();
        }
        System.out.println("最终Count = " + count);
    }
}
