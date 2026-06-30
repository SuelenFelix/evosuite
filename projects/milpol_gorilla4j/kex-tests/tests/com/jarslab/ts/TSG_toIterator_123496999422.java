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

public class TSG_toIterator_123496999422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272;

    public TSG_toIterator_123496999422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term272, term272.getClass(), "startTime", 0L);
        setField(term272, term272.getClass(), "outBit", null);
        setLongField(term272, term272.getClass(), "time", 0L);
        setDoubleField(term272, term272.getClass(), "value", 0.0);
        setIntField(term272, term272.getClass(), "timeDelta", 0);
        setIntField(term272, term272.getClass(), "leading", 0);
        setIntField(term272, term272.getClass(), "trailing", 0);
        setBooleanField(term272, term272.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toIterator", argTypes, term272, args);
    }

};


