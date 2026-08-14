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

public class Cpu_getNegativeFlag_1225094292116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206490;

    public Cpu_getNegativeFlag_1225094292116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206490 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206490, term206490.getClass(), "clockPeriodInNs", 0L);
        setField(term206490, term206490.getClass(), "behavior", null);
        setField(term206490, term206490.getClass(), "bus", null);
        setField(term206490, term206490.getClass(), "state", null);
        setLongField(term206490, term206490.getClass(), "opBeginTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNegativeFlag", argTypes, term206490, args);
    }

};


