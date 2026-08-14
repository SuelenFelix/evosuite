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

public class Duration_toTimeUnit_199253740618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1443;
     Object enum4;

    public Duration_toTimeUnit_199253740618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1443 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term1444 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term1444, term1444.getClass(), "seconds", 252000L);
        setIntField(term1444, term1444.getClass(), "nanos", 0);
        setField(term1443, term1443.getClass(), "internalDuration", term1444);
        setLongField(term1443, term1443.getClass(), "effectiveTotalSeconds", 2535595959091595249L);
        setIntField(term1443, term1443.getClass(), "effectiveNanoseconds", -522618178);
        Class<? extends Object> term1469 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1468 = ((Class) term1469).getDeclaredField((String) "MINUTES");
        ((Field) term1468).setAccessible(true);
        enum4 = ((Field) term1468).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[1];
        args[0] = enum4;
        callMethod(klass, "toTimeUnit", argTypes, term1443, args);
    }

};


