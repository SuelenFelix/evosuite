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

public class BackoffTtasSpinLock_unlock_28467055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1549;

    public BackoffTtasSpinLock_unlock_28467055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1549 = newInstance(Class.forName("io.puzpuzpuz.lock.BackoffTtasSpinLock"));
        Object term1550 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        setIntField(term1550, term1550.getClass(), "value", 0);
        setField(term1549, term1549.getClass(), "lock", term1550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.BackoffTtasSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unlock", argTypes, term1549, args);
    }

};


