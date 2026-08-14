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

public class DurationFormat_2_doFormat_3333687374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum15;
     Object term3976;

    public DurationFormat_2_doFormat_3333687374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3979 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term3978 = ((Class) term3979).getDeclaredField((String) "SHORT");
        ((Field) term3978).setAccessible(true);
        enum15 = ((Field) term3978).get((Object) null);
        term3976 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationFormat$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3976;
        callMethod(klass, "doFormat", argTypes, enum15, args);
    }

};


