package io.puzpuzpuz.lock;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static io.puzpuzpuz.lock.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TicketSpinLock_lockInterruptibly_9145618152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term842;

    public TicketSpinLock_lockInterruptibly_9145618152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term842 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock"));
        Object term843 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock$PaddedAtomicLong"));
        Object term852 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock$PaddedAtomicLong"));
        setLongField(term843, term843.getClass(), "l1", 0L);
        setLongField(term843, term843.getClass(), "l2", 0L);
        setLongField(term843, term843.getClass(), "l3", 0L);
        setLongField(term843, term843.getClass(), "l4", 0L);
        setLongField(term843, term843.getClass(), "l5", 0L);
        setLongField(term843, term843.getClass(), "l6", 0L);
        setLongField(term843, term843.getClass(), "l7", 0L);
        setLongField(term843, term843.getClass(), "value", 0L);
        setField(term842, term842.getClass(), "nextTicket", term843);
        setLongField(term852, term852.getClass(), "l1", 0L);
        setLongField(term852, term852.getClass(), "l2", 0L);
        setLongField(term852, term852.getClass(), "l3", 0L);
        setLongField(term852, term852.getClass(), "l4", 0L);
        setLongField(term852, term852.getClass(), "l5", 0L);
        setLongField(term852, term852.getClass(), "l6", 0L);
        setLongField(term852, term852.getClass(), "l7", 0L);
        setLongField(term852, term852.getClass(), "value", 0L);
        setField(term842, term842.getClass(), "servedTicket", term852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.TicketSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lockInterruptibly", argTypes, term842, args);
    }

};


