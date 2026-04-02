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

public class BackoffCasSpinLock_tryLock_4930500494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1140;
     Object term1143;
     Object enum4;

    public BackoffCasSpinLock_tryLock_4930500494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1140 = newInstance(Class.forName("io.puzpuzpuz.lock.BackoffCasSpinLock"));
        Object term1141 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        setIntField(term1141, term1141.getClass(), "value", 0);
        setField(term1140, term1140.getClass(), "lock", term1141);
        term1143 = new Long(5270370404989704783L);
        Class<? extends Object> term1163 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1162 = ((Class) term1163).getDeclaredField((String) "HOURS");
        ((Field) term1162).setAccessible(true);
        enum4 = ((Field) term1162).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.BackoffCasSpinLock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term1143;
        args[1] = enum4;
        callMethod(klass, "tryLock", argTypes, term1140, args);
    }

};


