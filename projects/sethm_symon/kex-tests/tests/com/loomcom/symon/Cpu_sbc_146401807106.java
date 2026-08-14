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

public class Cpu_sbc_146401807106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206436;
     Object term206439;
     Object term206441;

    public Cpu_sbc_146401807106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206436 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206436, term206436.getClass(), "clockPeriodInNs", 0L);
        setField(term206436, term206436.getClass(), "behavior", null);
        setField(term206436, term206436.getClass(), "bus", null);
        setField(term206436, term206436.getClass(), "state", null);
        setLongField(term206436, term206436.getClass(), "opBeginTime", 0L);
        term206439 = new Integer(0);
        term206441 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term206439;
        args[1] = term206441;
        callMethod(klass, "sbc", argTypes, term206436, args);
    }

};


