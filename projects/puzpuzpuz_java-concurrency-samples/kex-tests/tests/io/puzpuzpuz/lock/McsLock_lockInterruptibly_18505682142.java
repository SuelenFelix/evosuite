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

public class McsLock_lockInterruptibly_18505682142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;

    public McsLock_lockInterruptibly_18505682142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("io.puzpuzpuz.lock.McsLock"));
        Object term6 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term8 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term6, term6.getClass(), "supplier", null);
        setIntField(term6, term6.getClass(), "threadLocalHashCode", -1662113688);
        setField(term5, term5.getClass(), "tlNode", term6);
        setField(term8, term8.getClass(), "value", null);
        setField(term5, term5.getClass(), "tailRef", term8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lockInterruptibly", argTypes, term5, args);
    }

};


