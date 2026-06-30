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

public class TSG_toBytes_158562612120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;

    public TSG_toBytes_158562612120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term256, term256.getClass(), "startTime", 0L);
        setField(term256, term256.getClass(), "outBit", null);
        setLongField(term256, term256.getClass(), "time", 0L);
        setDoubleField(term256, term256.getClass(), "value", 0.0);
        setIntField(term256, term256.getClass(), "timeDelta", 0);
        setIntField(term256, term256.getClass(), "leading", 0);
        setIntField(term256, term256.getClass(), "trailing", 0);
        setBooleanField(term256, term256.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBytes", argTypes, term256, args);
    }

};


