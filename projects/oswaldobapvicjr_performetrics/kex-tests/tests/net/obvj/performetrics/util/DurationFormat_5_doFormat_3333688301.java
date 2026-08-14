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

public class DurationFormat_5_doFormat_3333688301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum25;
     Object term6672;
     Object term6678;

    public DurationFormat_5_doFormat_3333688301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6681 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term6680 = ((Class) term6681).getDeclaredField((String) "LINUX");
        ((Field) term6680).setAccessible(true);
        enum25 = ((Field) term6680).get((Object) null);
        term6672 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term6673 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term6673, term6673.getClass(), "seconds", 100800L);
        setIntField(term6673, term6673.getClass(), "nanos", 0);
        setField(term6672, term6672.getClass(), "internalDuration", term6673);
        setLongField(term6672, term6672.getClass(), "effectiveTotalSeconds", 1439298019805881866L);
        setIntField(term6672, term6672.getClass(), "effectiveNanoseconds", 1540719661);
        term6678 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationFormat$5");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term6672;
        args[1] = term6678;
        callMethod(klass, "doFormat", argTypes, enum25, args);
    }

};


