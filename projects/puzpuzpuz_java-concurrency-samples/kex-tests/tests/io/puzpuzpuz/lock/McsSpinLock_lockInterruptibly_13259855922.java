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

public class McsSpinLock_lockInterruptibly_13259855922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;

    public McsSpinLock_lockInterruptibly_13259855922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term613 = newInstance(Class.forName("io.puzpuzpuz.lock.McsSpinLock"));
        Object term614 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term616 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term614, term614.getClass(), "supplier", null);
        setIntField(term614, term614.getClass(), "threadLocalHashCode", 1419614862);
        setField(term613, term613.getClass(), "tlNode", term614);
        setField(term616, term616.getClass(), "value", null);
        setField(term613, term613.getClass(), "tailRef", term616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lockInterruptibly", argTypes, term613, args);
    }

};


