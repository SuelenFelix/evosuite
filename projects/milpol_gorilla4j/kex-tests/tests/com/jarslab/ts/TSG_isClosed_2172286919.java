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

public class TSG_isClosed_2172286919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248;

    public TSG_isClosed_2172286919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term248, term248.getClass(), "startTime", 0L);
        setField(term248, term248.getClass(), "outBit", null);
        setLongField(term248, term248.getClass(), "time", 0L);
        setDoubleField(term248, term248.getClass(), "value", 0.0);
        setIntField(term248, term248.getClass(), "timeDelta", 0);
        setIntField(term248, term248.getClass(), "leading", 0);
        setIntField(term248, term248.getClass(), "trailing", 0);
        setBooleanField(term248, term248.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClosed", argTypes, term248, args);
    }

};


