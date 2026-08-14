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

public class Breakpoints_removeBreakpointAtIndex_3095847656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252041;
     Object term252042;

    public Breakpoints_removeBreakpointAtIndex_3095847656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252041 = newInstance(Class.forName("com.loomcom.symon.Breakpoints"));
        setField(term252041, term252041.getClass(), "breakpoints", null);
        setField(term252041, term252041.getClass(), "simulator", null);
        setField(term252041, term252041.getClass(), "listenerList", null);
        term252042 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Breakpoints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term252042;
        callMethod(klass, "removeBreakpointAtIndex", argTypes, term252041, args);
    }

};


