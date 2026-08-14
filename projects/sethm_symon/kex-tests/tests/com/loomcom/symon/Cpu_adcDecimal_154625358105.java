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

public class Cpu_adcDecimal_154625358105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206429;
     Object term206432;
     Object term206434;

    public Cpu_adcDecimal_154625358105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206429 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206429, term206429.getClass(), "clockPeriodInNs", 0L);
        setField(term206429, term206429.getClass(), "behavior", null);
        setField(term206429, term206429.getClass(), "bus", null);
        setField(term206429, term206429.getClass(), "state", null);
        setLongField(term206429, term206429.getClass(), "opBeginTime", 0L);
        term206432 = new Integer(0);
        term206434 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term206432;
        args[1] = term206434;
        callMethod(klass, "adcDecimal", argTypes, term206429, args);
    }

};


