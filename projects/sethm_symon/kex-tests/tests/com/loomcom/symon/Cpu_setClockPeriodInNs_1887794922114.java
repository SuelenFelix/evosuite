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
import java.lang.Long;

public class Cpu_setClockPeriodInNs_1887794922114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206482;
     Object term206485;

    public Cpu_setClockPeriodInNs_1887794922114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206482 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206482, term206482.getClass(), "clockPeriodInNs", 0L);
        setField(term206482, term206482.getClass(), "behavior", null);
        setField(term206482, term206482.getClass(), "bus", null);
        setField(term206482, term206482.getClass(), "state", null);
        setLongField(term206482, term206482.getClass(), "opBeginTime", 0L);
        term206485 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term206485;
        callMethod(klass, "setClockPeriodInNs", argTypes, term206482, args);
    }

};


