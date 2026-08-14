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

public class McsSpinLock_tryLock_8416815814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;
     Object term625;
     Object enum2;

    public McsSpinLock_tryLock_8416815814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621 = newInstance(Class.forName("io.puzpuzpuz.lock.McsSpinLock"));
        Object term622 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term624 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term622, term622.getClass(), "supplier", null);
        setIntField(term622, term622.getClass(), "threadLocalHashCode", -1917951122);
        setField(term621, term621.getClass(), "tlNode", term622);
        setField(term624, term624.getClass(), "value", null);
        setField(term621, term621.getClass(), "tailRef", term624);
        term625 = new Long(-8257434502486459194L);
        Class<? extends Object> term644 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term643 = ((Class) term644).getDeclaredField((String) "DAYS");
        ((Field) term643).setAccessible(true);
        enum2 = ((Field) term643).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsSpinLock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term625;
        args[1] = enum2;
        callMethod(klass, "tryLock", argTypes, term621, args);
    }

};


