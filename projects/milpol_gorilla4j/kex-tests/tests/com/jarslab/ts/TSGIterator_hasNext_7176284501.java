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

public class TSGIterator_hasNext_7176284501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;

    public TSGIterator_hasNext_7176284501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312 = newInstance(Class.forName("com.jarslab.ts.TSGIterator"));
        setField(term312, term312.getClass(), "inBit", null);
        setLongField(term312, term312.getClass(), "time", -4502405999831680926L);
        setDoubleField(term312, term312.getClass(), "value", 0.1374549299694151);
        setIntField(term312, term312.getClass(), "leading", -602026508);
        setIntField(term312, term312.getClass(), "trailing", -157887805);
        setIntField(term312, term312.getClass(), "timeDelta", 1876565163);
        setBooleanField(term312, term312.getClass(), "finished", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSGIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term312, args);
    }

};


