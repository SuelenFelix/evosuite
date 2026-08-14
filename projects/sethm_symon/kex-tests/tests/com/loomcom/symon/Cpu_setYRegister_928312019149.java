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

public class Cpu_setYRegister_928312019149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206601;
     Object term206604;

    public Cpu_setYRegister_928312019149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206601 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206601, term206601.getClass(), "clockPeriodInNs", 0L);
        setField(term206601, term206601.getClass(), "behavior", null);
        setField(term206601, term206601.getClass(), "bus", null);
        setField(term206601, term206601.getClass(), "state", null);
        setLongField(term206601, term206601.getClass(), "opBeginTime", 0L);
        term206604 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term206604;
        callMethod(klass, "setYRegister", argTypes, term206601, args);
    }

};


