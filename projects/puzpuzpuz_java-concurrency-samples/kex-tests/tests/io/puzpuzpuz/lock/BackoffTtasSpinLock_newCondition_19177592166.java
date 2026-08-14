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

public class BackoffTtasSpinLock_newCondition_19177592166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1552;

    public BackoffTtasSpinLock_newCondition_19177592166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1552 = newInstance(Class.forName("io.puzpuzpuz.lock.BackoffTtasSpinLock"));
        Object term1553 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        setIntField(term1553, term1553.getClass(), "value", 0);
        setField(term1552, term1552.getClass(), "lock", term1553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.BackoffTtasSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newCondition", argTypes, term1552, args);
    }

};


