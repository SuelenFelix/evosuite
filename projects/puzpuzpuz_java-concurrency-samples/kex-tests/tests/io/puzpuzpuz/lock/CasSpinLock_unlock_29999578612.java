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

public class CasSpinLock_unlock_29999578612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1801;

    public CasSpinLock_unlock_29999578612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1801 = newInstance(Class.forName("io.puzpuzpuz.lock.CasSpinLock"));
        setField(term1801, term1801.getClass(), "lock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.CasSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unlock", argTypes, term1801, args);
    }

};


