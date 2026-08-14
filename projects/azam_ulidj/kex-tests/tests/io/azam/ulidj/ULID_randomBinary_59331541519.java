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

public class ULID_randomBinary_59331541519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;

    public ULID_randomBinary_59331541519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133 = newInstance(Class.forName("java.util.Random"));
        Object term134 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term134, term134.getClass(), "value", 40807688519540L);
        setField(term133, term133.getClass(), "seed", term134);
        setDoubleField(term133, term133.getClass(), "nextNextGaussian", 0.28570734989730284);
        setBooleanField(term133, term133.getClass(), "haveNextNextGaussian", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.ULID");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.Clock");
        argTypes[1] = Class.forName("java.util.Random");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term133;
        callMethod(klass, "randomBinary", argTypes, null, args);
    }

};


