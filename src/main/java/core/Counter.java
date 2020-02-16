package core;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 线程安全计数器实现
 */
class Counter {
    private final AtomicLong counter = new AtomicLong();

    public void increase() {
        counter.incrementAndGet();
    }
}


