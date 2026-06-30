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

public class TSGIterator_next_18193623662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319;

    public TSGIterator_next_18193623662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319 = newInstance(Class.forName("com.jarslab.ts.TSGIterator"));
        setField(term319, term319.getClass(), "inBit", null);
        setLongField(term319, term319.getClass(), "time", 1967728129628047933L);
        setDoubleField(term319, term319.getClass(), "value", 0.7031006357544823);
        setIntField(term319, term319.getClass(), "leading", -817164822);
        setIntField(term319, term319.getClass(), "trailing", -1016503459);
        setIntField(term319, term319.getClass(), "timeDelta", -1968847291);
        setBooleanField(term319, term319.getClass(), "finished", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSGIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term319, args);
    }

};


