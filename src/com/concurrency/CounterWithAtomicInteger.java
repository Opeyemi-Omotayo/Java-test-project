package com.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterWithAtomicInteger {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();

    static void main() {

    }

    //thread safe
    synchronized public void incrementI() {
        i.incrementAndGet();
    }

    public int getI() {
        return i.get();
    }

    synchronized public void incrementJ() {
        j.incrementAndGet();
    }

    public int getJ() {
        return j.get();
    }
}
