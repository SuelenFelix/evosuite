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

public class McsSpinLock_newCondition_6881588036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811;

    public McsSpinLock_newCondition_6881588036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term811 = newInstance(Class.forName("io.puzpuzpuz.lock.McsSpinLock"));
        Object term812 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term814 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term812, term812.getClass(), "supplier", null);
        setIntField(term812, term812.getClass(), "threadLocalHashCode", -960549810);
        setField(term811, term811.getClass(), "tlNode", term812);
        setField(term814, term814.getClass(), "value", null);
        setField(term811, term811.getClass(), "tailRef", term814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newCondition", argTypes, term811, args);
    }

};


