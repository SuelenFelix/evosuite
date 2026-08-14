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
import java.lang.String;

public class Duration_toString_76218280516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term939;
     Object enum2;

    public Duration_toString_76218280516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term939 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term940 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term940, term940.getClass(), "seconds", 273600L);
        setIntField(term940, term940.getClass(), "nanos", 0);
        setField(term939, term939.getClass(), "internalDuration", term940);
        setLongField(term939, term939.getClass(), "effectiveTotalSeconds", -8885298608300233488L);
        setIntField(term939, term939.getClass(), "effectiveNanoseconds", -1339778481);
        Class<? extends Object> term958 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term957 = ((Class) term958).getDeclaredField((String) "ISO_8601");
        ((Field) term957).setAccessible(true);
        enum2 = ((Field) term957).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.DurationFormat");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "toString", argTypes, term939, args);
    }

};


