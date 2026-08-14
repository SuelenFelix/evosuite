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

public class ULID_random_2223096318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128;

    public ULID_random_2223096318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128 = newInstance(Class.forName("java.util.Random"));
        Object term129 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term129, term129.getClass(), "value", 128896332660232L);
        setField(term128, term128.getClass(), "seed", term129);
        setDoubleField(term128, term128.getClass(), "nextNextGaussian", 0.544608645520025);
        setBooleanField(term128, term128.getClass(), "haveNextNextGaussian", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.ULID");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.Clock");
        argTypes[1] = Class.forName("java.util.Random");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term128;
        callMethod(klass, "random", argTypes, null, args);
    }

};


