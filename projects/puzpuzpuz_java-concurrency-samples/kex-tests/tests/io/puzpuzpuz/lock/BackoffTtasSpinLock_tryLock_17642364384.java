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

public class BackoffTtasSpinLock_tryLock_17642364384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1352;
     Object term1355;
     Object enum5;

    public BackoffTtasSpinLock_tryLock_17642364384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1352 = newInstance(Class.forName("io.puzpuzpuz.lock.BackoffTtasSpinLock"));
        Object term1353 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        setIntField(term1353, term1353.getClass(), "value", 0);
        setField(term1352, term1352.getClass(), "lock", term1353);
        term1355 = new Long(7411271909051562686L);
        Class<? extends Object> term1377 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1376 = ((Class) term1377).getDeclaredField((String) "SECONDS");
        ((Field) term1376).setAccessible(true);
        enum5 = ((Field) term1376).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.BackoffTtasSpinLock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term1355;
        args[1] = enum5;
        callMethod(klass, "tryLock", argTypes, term1352, args);
    }

};


