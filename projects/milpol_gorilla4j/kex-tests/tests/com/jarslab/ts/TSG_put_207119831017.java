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

public class TSG_put_207119831017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228;

    public TSG_put_207119831017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term228, term228.getClass(), "startTime", 0L);
        setField(term228, term228.getClass(), "outBit", null);
        setLongField(term228, term228.getClass(), "time", 0L);
        setDoubleField(term228, term228.getClass(), "value", 0.0);
        setIntField(term228, term228.getClass(), "timeDelta", 0);
        setIntField(term228, term228.getClass(), "leading", 0);
        setIntField(term228, term228.getClass(), "trailing", 0);
        setBooleanField(term228, term228.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.jarslab.ts.DataPoint");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "put", argTypes, term228, args);
    }

};


