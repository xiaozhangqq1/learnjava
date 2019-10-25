package first;

/**
 * Created by zhangxuelong on 2017/12/11
 * 结果count=816
 * volatile修饰的变量，并发自增没有得到1000，因为count++这一行代码本身并不是原子性操作。
 */
public class VolatileTest {
    public volatile static int count = 0;

    public static void main(String[] args) {
        //开启10个线程
        for (int i = 0; i < 10; i++) {
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            //每个线程当中让count值自增100次
                            for (int j = 0; j < 100; j++) {
                                count++;
                            }
                        }
                    }
            ).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count=" + count);
    }
}
