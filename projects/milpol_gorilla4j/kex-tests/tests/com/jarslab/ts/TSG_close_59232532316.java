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

public class TSG_close_59232532316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220;

    public TSG_close_59232532316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term220, term220.getClass(), "startTime", 0L);
        setField(term220, term220.getClass(), "outBit", null);
        setLongField(term220, term220.getClass(), "time", 0L);
        setDoubleField(term220, term220.getClass(), "value", 0.0);
        setIntField(term220, term220.getClass(), "timeDelta", 0);
        setIntField(term220, term220.getClass(), "leading", 0);
        setIntField(term220, term220.getClass(), "trailing", 0);
        setBooleanField(term220, term220.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term220, args);
    }

};


