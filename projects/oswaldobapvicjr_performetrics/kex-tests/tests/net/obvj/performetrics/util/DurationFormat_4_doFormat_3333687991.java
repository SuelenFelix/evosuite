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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class DurationFormat_4_doFormat_3333687991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum21;
     Object term5524;
     Object term5530;

    public DurationFormat_4_doFormat_3333687991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5533 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term5532 = ((Class) term5533).getDeclaredField((String) "ISO_8601");
        ((Field) term5532).setAccessible(true);
        enum21 = ((Field) term5532).get((Object) null);
        term5524 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term5525 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term5525, term5525.getClass(), "seconds", 244800L);
        setIntField(term5525, term5525.getClass(), "nanos", 0);
        setField(term5524, term5524.getClass(), "internalDuration", term5525);
        setLongField(term5524, term5524.getClass(), "effectiveTotalSeconds", 6617340557564669657L);
        setIntField(term5524, term5524.getClass(), "effectiveNanoseconds", 1962444399);
        term5530 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationFormat$4");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term5524;
        args[1] = term5530;
        callMethod(klass, "doFormat", argTypes, enum21, args);
    }

};


