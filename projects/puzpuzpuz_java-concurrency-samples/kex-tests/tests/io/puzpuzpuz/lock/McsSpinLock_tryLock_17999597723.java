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

public class McsSpinLock_tryLock_17999597723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617;

    public McsSpinLock_tryLock_17999597723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617 = newInstance(Class.forName("io.puzpuzpuz.lock.McsSpinLock"));
        Object term618 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term620 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term618, term618.getClass(), "supplier", null);
        setIntField(term618, term618.getClass(), "threadLocalHashCode", 1898315518);
        setField(term617, term617.getClass(), "tlNode", term618);
        setField(term620, term620.getClass(), "value", null);
        setField(term617, term617.getClass(), "tailRef", term620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryLock", argTypes, term617, args);
    }

};


