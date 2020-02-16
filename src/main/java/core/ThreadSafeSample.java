package core;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程安全
 * synchronized(this)和synchronized(ThreadSafeSample.class)
 * 效果一样
 *
 * @Author zhangxuelong10
 * @create 2019/9/20 21:32
 */
public class ThreadSafeSample {
    public int sharedState;

    public void nonSafeAction() {
        while (sharedState < 100000) {
//            synchronized (this) {
            synchronized (ThreadSafeSample.class){
                int former = sharedState++;
                int latter = sharedState;
                if (former != latter - 1) {
                    System.out.printf("Observed data race, former is " +
                            former + ", " + "latter is " + latter);
                }
            }
//            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeSample sample = new ThreadSafeSample();
        Thread threadA = new Thread() {
            public void run() {
                sample.nonSafeAction();
            }
        };
        Thread threadB = new Thread() {
            public void run() {
                sample.nonSafeAction();
            }
        };
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
    }
}

