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

public class TicketSpinLock_tryLock_2544601173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861;

    public TicketSpinLock_tryLock_2544601173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term861 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock"));
        Object term862 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock$PaddedAtomicLong"));
        Object term871 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock$PaddedAtomicLong"));
        setLongField(term862, term862.getClass(), "l1", 0L);
        setLongField(term862, term862.getClass(), "l2", 0L);
        setLongField(term862, term862.getClass(), "l3", 0L);
        setLongField(term862, term862.getClass(), "l4", 0L);
        setLongField(term862, term862.getClass(), "l5", 0L);
        setLongField(term862, term862.getClass(), "l6", 0L);
        setLongField(term862, term862.getClass(), "l7", 0L);
        setLongField(term862, term862.getClass(), "value", 0L);
        setField(term861, term861.getClass(), "nextTicket", term862);
        setLongField(term871, term871.getClass(), "l1", 0L);
        setLongField(term871, term871.getClass(), "l2", 0L);
        setLongField(term871, term871.getClass(), "l3", 0L);
        setLongField(term871, term871.getClass(), "l4", 0L);
        setLongField(term871, term871.getClass(), "l5", 0L);
        setLongField(term871, term871.getClass(), "l6", 0L);
        setLongField(term871, term871.getClass(), "l7", 0L);
        setLongField(term871, term871.getClass(), "value", 0L);
        setField(term861, term861.getClass(), "servedTicket", term871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.TicketSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryLock", argTypes, term861, args);
    }

};


