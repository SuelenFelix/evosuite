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

public class McsLock_tryLock_13662642034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term17;
     Object enum0;

    public McsLock_tryLock_13662642034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("io.puzpuzpuz.lock.McsLock"));
        Object term14 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term16 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term14, term14.getClass(), "supplier", null);
        setIntField(term14, term14.getClass(), "threadLocalHashCode", -704712376);
        setField(term13, term13.getClass(), "tlNode", term14);
        setField(term16, term16.getClass(), "value", null);
        setField(term13, term13.getClass(), "tailRef", term16);
        term17 = new Long(2442117782898005296L);
        Class<? extends Object> term186 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term185 = ((Class) term186).getDeclaredField((String) "MILLISECONDS");
        ((Field) term185).setAccessible(true);
        enum0 = ((Field) term185).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsLock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term17;
        args[1] = enum0;
        callMethod(klass, "tryLock", argTypes, term13, args);
    }

};


