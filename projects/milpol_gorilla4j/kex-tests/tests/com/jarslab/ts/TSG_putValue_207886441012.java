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
import java.lang.Double;

public class TSG_putValue_207886441012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;
     Object term206;

    public TSG_putValue_207886441012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term198, term198.getClass(), "startTime", 7009926388951271268L);
        setField(term198, term198.getClass(), "outBit", null);
        setLongField(term198, term198.getClass(), "time", -7672528020740371001L);
        setDoubleField(term198, term198.getClass(), "value", 0.5183269973490326);
        setIntField(term198, term198.getClass(), "timeDelta", 679763016);
        setIntField(term198, term198.getClass(), "leading", 1962444399);
        setIntField(term198, term198.getClass(), "trailing", 767834723);
        setBooleanField(term198, term198.getClass(), "closed", false);
        term206 = new Double(0.7655020693602768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term206;
        callMethod(klass, "putValue", argTypes, term198, args);
    }

};


