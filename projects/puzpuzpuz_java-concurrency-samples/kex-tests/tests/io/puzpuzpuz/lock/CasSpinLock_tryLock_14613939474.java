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

public class CasSpinLock_tryLock_14613939474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1572;
     Object term1575;
     Object enum6;

    public CasSpinLock_tryLock_14613939474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1572 = newInstance(Class.forName("io.puzpuzpuz.lock.CasSpinLock"));
        Object term1573 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        setIntField(term1573, term1573.getClass(), "value", 0);
        setField(term1572, term1572.getClass(), "lock", term1573);
        term1575 = new Long(4872422362414183754L);
        Class<? extends Object> term1602 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1601 = ((Class) term1602).getDeclaredField((String) "MICROSECONDS");
        ((Field) term1601).setAccessible(true);
        enum6 = ((Field) term1601).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.CasSpinLock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term1575;
        args[1] = enum6;
        callMethod(klass, "tryLock", argTypes, term1572, args);
    }

};


