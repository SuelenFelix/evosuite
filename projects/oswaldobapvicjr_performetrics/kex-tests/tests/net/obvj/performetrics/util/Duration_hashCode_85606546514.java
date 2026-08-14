package net.obvj.performetrics.util;

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
import static net.obvj.performetrics.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Duration_hashCode_85606546514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927;

    public Duration_hashCode_85606546514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term927 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term928 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term928, term928.getClass(), "seconds", 302400L);
        setIntField(term928, term928.getClass(), "nanos", 0);
        setField(term927, term927.getClass(), "internalDuration", term928);
        setLongField(term927, term927.getClass(), "effectiveTotalSeconds", 6967924379644551255L);
        setIntField(term927, term927.getClass(), "effectiveNanoseconds", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term927, args);
    }

};


