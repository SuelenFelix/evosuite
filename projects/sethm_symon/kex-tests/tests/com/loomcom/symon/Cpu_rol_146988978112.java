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

public class Cpu_rol_146988978112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206472;
     Object term206475;

    public Cpu_rol_146988978112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206472 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206472, term206472.getClass(), "clockPeriodInNs", 0L);
        setField(term206472, term206472.getClass(), "behavior", null);
        setField(term206472, term206472.getClass(), "bus", null);
        setField(term206472, term206472.getClass(), "state", null);
        setLongField(term206472, term206472.getClass(), "opBeginTime", 0L);
        term206475 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term206475;
        callMethod(klass, "rol", argTypes, term206472, args);
    }

};


