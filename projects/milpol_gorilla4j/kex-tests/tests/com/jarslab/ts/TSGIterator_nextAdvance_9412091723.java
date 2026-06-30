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

public class TSGIterator_nextAdvance_9412091723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;

    public TSGIterator_nextAdvance_9412091723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("com.jarslab.ts.TSGIterator"));
        setField(term326, term326.getClass(), "inBit", null);
        setLongField(term326, term326.getClass(), "time", 2120084523938730454L);
        setDoubleField(term326, term326.getClass(), "value", 0.9527281779865117);
        setIntField(term326, term326.getClass(), "leading", 579005622);
        setIntField(term326, term326.getClass(), "trailing", -14890619);
        setIntField(term326, term326.getClass(), "timeDelta", 1632125673);
        setBooleanField(term326, term326.getClass(), "finished", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSGIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextAdvance", argTypes, term326, args);
    }

};


