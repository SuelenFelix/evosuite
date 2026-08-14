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

public class Cpu_setBus_88104952792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206372;

    public Cpu_setBus_88104952792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206372 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206372, term206372.getClass(), "clockPeriodInNs", 0L);
        setField(term206372, term206372.getClass(), "behavior", null);
        setField(term206372, term206372.getClass(), "bus", null);
        setField(term206372, term206372.getClass(), "state", null);
        setLongField(term206372, term206372.getClass(), "opBeginTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.Bus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBus", argTypes, term206372, args);
    }

};


