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
import java.lang.Boolean;

public class Cpu_setCarryFlag_1285476216122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206510;
     Object term206513;

    public Cpu_setCarryFlag_1285476216122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206510 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206510, term206510.getClass(), "clockPeriodInNs", 0L);
        setField(term206510, term206510.getClass(), "behavior", null);
        setField(term206510, term206510.getClass(), "bus", null);
        setField(term206510, term206510.getClass(), "state", null);
        setLongField(term206510, term206510.getClass(), "opBeginTime", 0L);
        term206513 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term206513;
        callMethod(klass, "setCarryFlag", argTypes, term206510, args);
    }

};


