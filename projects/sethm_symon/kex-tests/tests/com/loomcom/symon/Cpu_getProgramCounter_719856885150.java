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

public class Cpu_getProgramCounter_719856885150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206606;

    public Cpu_getProgramCounter_719856885150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206606 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206606, term206606.getClass(), "clockPeriodInNs", 0L);
        setField(term206606, term206606.getClass(), "behavior", null);
        setField(term206606, term206606.getClass(), "bus", null);
        setField(term206606, term206606.getClass(), "state", null);
        setLongField(term206606, term206606.getClass(), "opBeginTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProgramCounter", argTypes, term206606, args);
    }

};


