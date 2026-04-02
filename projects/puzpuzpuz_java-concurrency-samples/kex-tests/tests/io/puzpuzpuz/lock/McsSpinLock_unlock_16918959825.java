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

public class McsSpinLock_unlock_16918959825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term807;

    public McsSpinLock_unlock_16918959825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term807 = newInstance(Class.forName("io.puzpuzpuz.lock.McsSpinLock"));
        Object term808 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term810 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term808, term808.getClass(), "supplier", null);
        setIntField(term808, term808.getClass(), "threadLocalHashCode", -1439250466);
        setField(term807, term807.getClass(), "tlNode", term808);
        setField(term810, term810.getClass(), "value", null);
        setField(term807, term807.getClass(), "tailRef", term810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unlock", argTypes, term807, args);
    }

};


