package com.jarslab.ts;

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
import static com.jarslab.ts.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Double;

public class TSG_putInitialPoint_203779385310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;
     Object term184;
     Object term186;

    public TSG_putInitialPoint_203779385310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term176, term176.getClass(), "startTime", -4920224193275732920L);
        setField(term176, term176.getClass(), "outBit", null);
        setLongField(term176, term176.getClass(), "time", 8428634514691209827L);
        setDoubleField(term176, term176.getClass(), "value", 0.6076495596892013);
        setIntField(term176, term176.getClass(), "timeDelta", -226514366);
        setIntField(term176, term176.getClass(), "leading", 1193880199);
        setIntField(term176, term176.getClass(), "trailing", -1087774327);
        setBooleanField(term176, term176.getClass(), "closed", false);
        term184 = new Long(-2585684163342970173L);
        term186 = new Double(0.37773193782763337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term184;
        args[1] = term186;
        callMethod(klass, "putInitialPoint", argTypes, term176, args);
    }

};


