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

public class DurationFormat_format_20618363562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum33;
     Object term8751;
     Object term8757;

    public DurationFormat_format_20618363562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8760 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term8759 = ((Class) term8760).getDeclaredField((String) "FULL");
        ((Field) term8759).setAccessible(true);
        enum33 = ((Field) term8759).get((Object) null);
        term8751 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term8752 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term8752, term8752.getClass(), "seconds", 349200L);
        setIntField(term8752, term8752.getClass(), "nanos", 0);
        setField(term8751, term8751.getClass(), "internalDuration", term8752);
        setLongField(term8751, term8751.getClass(), "effectiveTotalSeconds", 5907001541142728739L);
        setIntField(term8751, term8751.getClass(), "effectiveNanoseconds", -505439934);
        term8757 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term8751;
        args[1] = term8757;
        callMethod(klass, "format", argTypes, enum33, args);
    }

};


