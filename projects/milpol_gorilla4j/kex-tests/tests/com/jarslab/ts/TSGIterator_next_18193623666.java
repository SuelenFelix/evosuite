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

public class TSGIterator_next_18193623666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340;

    public TSGIterator_next_18193623666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340 = newInstance(Class.forName("com.jarslab.ts.TSGIterator"));
        setField(term340, term340.getClass(), "inBit", null);
        setLongField(term340, term340.getClass(), "time", 0L);
        setDoubleField(term340, term340.getClass(), "value", 0.0);
        setIntField(term340, term340.getClass(), "leading", 0);
        setIntField(term340, term340.getClass(), "trailing", 0);
        setIntField(term340, term340.getClass(), "timeDelta", 0);
        setBooleanField(term340, term340.getClass(), "finished", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSGIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term340, args);
    }

};


