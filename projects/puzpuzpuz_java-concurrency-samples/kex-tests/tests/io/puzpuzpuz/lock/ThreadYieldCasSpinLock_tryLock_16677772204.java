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
import java.lang.Long;
import java.lang.String;

public class ThreadYieldCasSpinLock_tryLock_16677772204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398;
     Object term401;
     Object enum1;

    public ThreadYieldCasSpinLock_tryLock_16677772204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398 = newInstance(Class.forName("io.puzpuzpuz.lock.ThreadYieldCasSpinLock"));
        Object term399 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        setIntField(term399, term399.getClass(), "value", 0);
        setField(term398, term398.getClass(), "lock", term399);
        term401 = new Long(6375119433582206027L);
        Class<? extends Object> term423 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term422 = ((Class) term423).getDeclaredField((String) "MINUTES");
        ((Field) term422).setAccessible(true);
        enum1 = ((Field) term422).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.ThreadYieldCasSpinLock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term401;
        args[1] = enum1;
        callMethod(klass, "tryLock", argTypes, term398, args);
    }

};


