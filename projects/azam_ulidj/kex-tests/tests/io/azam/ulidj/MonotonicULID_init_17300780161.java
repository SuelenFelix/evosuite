package io.azam.ulidj;

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
import static io.azam.ulidj.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MonotonicULID_init_17300780161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248;

    public MonotonicULID_init_17300780161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248 = newInstance(Class.forName("java.util.Random"));
        Object term249 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term249, term249.getClass(), "value", 265118787712980L);
        setField(term248, term248.getClass(), "seed", term249);
        setDoubleField(term248, term248.getClass(), "nextNextGaussian", 0.2641345529914265);
        setBooleanField(term248, term248.getClass(), "haveNextNextGaussian", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.MonotonicULID");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Random");
        Object[] args = new Object[1];
        args[0] = term248;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


