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

public class Duration_getMinutes_1002197338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890;

    public Duration_getMinutes_1002197338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term891 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term891, term891.getClass(), "seconds", 100800L);
        setIntField(term891, term891.getClass(), "nanos", 0);
        setField(term890, term890.getClass(), "internalDuration", term891);
        setLongField(term890, term890.getClass(), "effectiveTotalSeconds", -8400487765614892086L);
        setIntField(term890, term890.getClass(), "effectiveNanoseconds", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinutes", argTypes, term890, args);
    }

};


