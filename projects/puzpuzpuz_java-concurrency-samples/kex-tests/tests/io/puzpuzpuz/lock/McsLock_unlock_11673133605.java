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

public class McsLock_unlock_11673133605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;

    public McsLock_unlock_11673133605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373 = newInstance(Class.forName("io.puzpuzpuz.lock.McsLock"));
        Object term374 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        Object term376 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        setField(term374, term374.getClass(), "supplier", null);
        setIntField(term374, term374.getClass(), "threadLocalHashCode", -226011720);
        setField(term373, term373.getClass(), "tlNode", term374);
        setField(term376, term376.getClass(), "value", null);
        setField(term373, term373.getClass(), "tailRef", term376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.McsLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unlock", argTypes, term373, args);
    }

};


