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

public class DurationFormat_1_doFormat_3333687061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum29;
     Object term7753;
     Object term7759;

    public DurationFormat_1_doFormat_3333687061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7762 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term7761 = ((Class) term7762).getDeclaredField((String) "FULL");
        ((Field) term7761).setAccessible(true);
        enum29 = ((Field) term7761).get((Object) null);
        term7753 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term7754 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term7754, term7754.getClass(), "seconds", 226800L);
        setIntField(term7754, term7754.getClass(), "nanos", 0);
        setField(term7753, term7753.getClass(), "internalDuration", term7754);
        setLongField(term7753, term7753.getClass(), "effectiveTotalSeconds", -8708192233349544946L);
        setIntField(term7753, term7753.getClass(), "effectiveNanoseconds", -1772434990);
        term7759 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationFormat$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term7753;
        args[1] = term7759;
        callMethod(klass, "doFormat", argTypes, enum29, args);
    }

};


