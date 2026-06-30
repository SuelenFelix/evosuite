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

public class TSG_put_167788363318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;
     Object term244;
     Object term246;

    public TSG_put_167788363318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term236, term236.getClass(), "startTime", 0L);
        setField(term236, term236.getClass(), "outBit", null);
        setLongField(term236, term236.getClass(), "time", 0L);
        setDoubleField(term236, term236.getClass(), "value", 0.0);
        setIntField(term236, term236.getClass(), "timeDelta", 0);
        setIntField(term236, term236.getClass(), "leading", 0);
        setIntField(term236, term236.getClass(), "trailing", 0);
        setBooleanField(term236, term236.getClass(), "closed", false);
        term244 = new Long(0L);
        term246 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term244;
        args[1] = term246;
        callMethod(klass, "put", argTypes, term236, args);
    }

};


