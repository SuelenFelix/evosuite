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

public class TicketSpinLock_newCondition_15523886046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1104;

    public TicketSpinLock_newCondition_15523886046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1104 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock"));
        Object term1105 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock$PaddedAtomicLong"));
        Object term1114 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock$PaddedAtomicLong"));
        setLongField(term1105, term1105.getClass(), "l1", 0L);
        setLongField(term1105, term1105.getClass(), "l2", 0L);
        setLongField(term1105, term1105.getClass(), "l3", 0L);
        setLongField(term1105, term1105.getClass(), "l4", 0L);
        setLongField(term1105, term1105.getClass(), "l5", 0L);
        setLongField(term1105, term1105.getClass(), "l6", 0L);
        setLongField(term1105, term1105.getClass(), "l7", 0L);
        setLongField(term1105, term1105.getClass(), "value", 0L);
        setField(term1104, term1104.getClass(), "nextTicket", term1105);
        setLongField(term1114, term1114.getClass(), "l1", 0L);
        setLongField(term1114, term1114.getClass(), "l2", 0L);
        setLongField(term1114, term1114.getClass(), "l3", 0L);
        setLongField(term1114, term1114.getClass(), "l4", 0L);
        setLongField(term1114, term1114.getClass(), "l5", 0L);
        setLongField(term1114, term1114.getClass(), "l6", 0L);
        setLongField(term1114, term1114.getClass(), "l7", 0L);
        setLongField(term1114, term1114.getClass(), "value", 0L);
        setField(term1104, term1104.getClass(), "servedTicket", term1114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.TicketSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newCondition", argTypes, term1104, args);
    }

};


