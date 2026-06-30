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

public class TSG_putTime_71888852724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292;
     Object term300;

    public TSG_putTime_71888852724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term292, term292.getClass(), "startTime", 0L);
        setField(term292, term292.getClass(), "outBit", null);
        setLongField(term292, term292.getClass(), "time", 0L);
        setDoubleField(term292, term292.getClass(), "value", 0.0);
        setIntField(term292, term292.getClass(), "timeDelta", 0);
        setIntField(term292, term292.getClass(), "leading", 0);
        setIntField(term292, term292.getClass(), "trailing", 0);
        setBooleanField(term292, term292.getClass(), "closed", false);
        term300 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term300;
        callMethod(klass, "putTime", argTypes, term292, args);
    }

};


