package io.puzpuzpuz.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class TicketSpinLock implements Lock {

    private final PaddedAtomicLong nextTicket = new PaddedAtomicLong();
    private final PaddedAtomicLong servedTicket = new PaddedAtomicLong();

    @Override
    public void lock() {
        final long ticket = nextTicket.incrementAndGet();
        for (;;) {
            final long served = servedTicket.get();
            final long queueSize = ticket - served - 1;
            if (queueSize == 0) {
                return;
            }
        }
    }

    @Override
    public void lockInterruptibly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean tryLock() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unlock() {
        final long served = servedTicket.get();
        servedTicket.set(served + 1);
    }

    @Override
    public Condition newCondition() {
        throw new UnsupportedOperationException();
    }

    private static class PaddedAtomicLong extends AtomicLong {
        @SuppressWarnings("unused")
        private long l1, l2, l3, l4, l5, l6, l7;
    }
}
