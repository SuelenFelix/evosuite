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

public class TSG_getDataBytes_204388590221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264;

    public TSG_getDataBytes_204388590221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term264, term264.getClass(), "startTime", 0L);
        setField(term264, term264.getClass(), "outBit", null);
        setLongField(term264, term264.getClass(), "time", 0L);
        setDoubleField(term264, term264.getClass(), "value", 0.0);
        setIntField(term264, term264.getClass(), "timeDelta", 0);
        setIntField(term264, term264.getClass(), "leading", 0);
        setIntField(term264, term264.getClass(), "trailing", 0);
        setBooleanField(term264, term264.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataBytes", argTypes, term264, args);
    }

};


