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

public class TSG_put_20711983104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;

    public TSG_put_20711983104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term124, term124.getClass(), "startTime", 4872422362414183754L);
        setField(term124, term124.getClass(), "outBit", null);
        setLongField(term124, term124.getClass(), "time", 6811161968424632369L);
        setDoubleField(term124, term124.getClass(), "value", 0.3455959125047594);
        setIntField(term124, term124.getClass(), "timeDelta", 597278769);
        setIntField(term124, term124.getClass(), "leading", -1685132342);
        setIntField(term124, term124.getClass(), "trailing", -1456670397);
        setBooleanField(term124, term124.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.jarslab.ts.DataPoint");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "put", argTypes, term124, args);
    }

};


