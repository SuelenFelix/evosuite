package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Breakpoints_getValueAt_84027721216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265125;
     Object term265126;
     Object term265128;

    public Breakpoints_getValueAt_84027721216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265125 = newInstance(Class.forName("com.loomcom.symon.Breakpoints"));
        setField(term265125, term265125.getClass(), "breakpoints", null);
        setField(term265125, term265125.getClass(), "simulator", null);
        setField(term265125, term265125.getClass(), "listenerList", null);
        term265126 = new Integer(0);
        term265128 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Breakpoints");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term265126;
        args[1] = term265128;
        callMethod(klass, "getValueAt", argTypes, term265125, args);
    }

};


