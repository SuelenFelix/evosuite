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

public class McsLock_lock_2808099751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public McsLock_lock_2808099751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.puzpuzpuz.lock.McsLock"));
        Object term2 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term4 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term2, term2.getClass(), "supplier", null);
        setIntField(term2, term2.getClass(), "threadLocalHashCode", -2140814344);
        setField(term1, term1.getClass(), "tlNode", term2);
        setField(term4, term4.getClass(), "value", null);
        setField(term1, term1.getClass(), "tailRef", term4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lock", argTypes, term1, args);
    }

};


