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

public class TSGIterator_nextAdvance_9412091727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347;

    public TSGIterator_nextAdvance_9412091727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347 = newInstance(Class.forName("com.jarslab.ts.TSGIterator"));
        setField(term347, term347.getClass(), "inBit", null);
        setLongField(term347, term347.getClass(), "time", 0L);
        setDoubleField(term347, term347.getClass(), "value", 0.0);
        setIntField(term347, term347.getClass(), "leading", 0);
        setIntField(term347, term347.getClass(), "trailing", 0);
        setIntField(term347, term347.getClass(), "timeDelta", 0);
        setBooleanField(term347, term347.getClass(), "finished", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSGIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextAdvance", argTypes, term347, args);
    }

};


