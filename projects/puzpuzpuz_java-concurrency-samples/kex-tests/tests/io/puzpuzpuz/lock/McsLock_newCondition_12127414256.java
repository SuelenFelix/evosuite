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

public class McsLock_newCondition_12127414256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;

    public McsLock_newCondition_12127414256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377 = newInstance(Class.forName("io.puzpuzpuz.lock.McsLock"));
        Object term378 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term380 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term378, term378.getClass(), "supplier", null);
        setIntField(term378, term378.getClass(), "threadLocalHashCode", 252688936);
        setField(term377, term377.getClass(), "tlNode", term378);
        setField(term380, term380.getClass(), "value", null);
        setField(term377, term377.getClass(), "tailRef", term380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newCondition", argTypes, term377, args);
    }

};


