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

public class ULID_randomULID_89285985314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;

    public ULID_randomULID_89285985314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123 = newInstance(Class.forName("java.util.Random"));
        Object term124 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term124, term124.getClass(), "value", 200222418986881L);
        setField(term123, term123.getClass(), "seed", term124);
        setDoubleField(term123, term123.getClass(), "nextNextGaussian", 0.5523635872663106);
        setBooleanField(term123, term123.getClass(), "haveNextNextGaussian", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.ULID");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Random");
        Object[] args = new Object[1];
        args[0] = term123;
        callMethod(klass, "randomULID", argTypes, null, args);
    }

};


