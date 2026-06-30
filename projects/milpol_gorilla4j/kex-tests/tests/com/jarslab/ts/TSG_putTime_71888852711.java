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
import java.lang.Long;

public class TSG_putTime_71888852711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;
     Object term196;

    public TSG_putTime_71888852711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term188, term188.getClass(), "startTime", 8059786003080744426L);
        setField(term188, term188.getClass(), "outBit", null);
        setLongField(term188, term188.getClass(), "time", -4365849114644724155L);
        setDoubleField(term188, term188.getClass(), "value", 0.8474802076607362);
        setIntField(term188, term188.getClass(), "timeDelta", -1530420153);
        setIntField(term188, term188.getClass(), "leading", -469968304);
        setIntField(term188, term188.getClass(), "trailing", -1145578966);
        setBooleanField(term188, term188.getClass(), "closed", true);
        term196 = new Long(2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term196;
        callMethod(klass, "putTime", argTypes, term188, args);
    }

};


