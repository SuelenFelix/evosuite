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

public class McsLock_tryLock_12753771503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;

    public McsLock_tryLock_12753771503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("io.puzpuzpuz.lock.McsLock"));
        Object term10 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term12 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term10, term10.getClass(), "supplier", null);
        setIntField(term10, term10.getClass(), "threadLocalHashCode", -1183413032);
        setField(term9, term9.getClass(), "tlNode", term10);
        setField(term12, term12.getClass(), "value", null);
        setField(term9, term9.getClass(), "tailRef", term12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryLock", argTypes, term9, args);
    }

};


