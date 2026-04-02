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

public class McsSpinLock_lock_8053925971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609;

    public McsSpinLock_lock_8053925971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term609 = newInstance(Class.forName("io.puzpuzpuz.lock.McsSpinLock"));
        Object term610 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term612 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term610, term610.getClass(), "supplier", null);
        setIntField(term610, term610.getClass(), "threadLocalHashCode", 940914206);
        setField(term609, term609.getClass(), "tlNode", term610);
        setField(term612, term612.getClass(), "value", null);
        setField(term609, term609.getClass(), "tailRef", term612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lock", argTypes, term609, args);
    }

};


