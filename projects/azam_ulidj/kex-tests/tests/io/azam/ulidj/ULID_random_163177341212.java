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

public class ULID_random_163177341212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;

    public ULID_random_163177341212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("java.util.Random"));
        Object term114 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term114, term114.getClass(), "value", 212194699873295L);
        setField(term113, term113.getClass(), "seed", term114);
        setDoubleField(term113, term113.getClass(), "nextNextGaussian", 0.13238746331190498);
        setBooleanField(term113, term113.getClass(), "haveNextNextGaussian", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.ULID");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Random");
        Object[] args = new Object[1];
        args[0] = term113;
        callMethod(klass, "random", argTypes, null, args);
    }

};


