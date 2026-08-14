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

public class Cpu_sbcDecimal_1777049722107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206443;
     Object term206446;
     Object term206448;

    public Cpu_sbcDecimal_1777049722107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206443 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206443, term206443.getClass(), "clockPeriodInNs", 0L);
        setField(term206443, term206443.getClass(), "behavior", null);
        setField(term206443, term206443.getClass(), "bus", null);
        setField(term206443, term206443.getClass(), "state", null);
        setLongField(term206443, term206443.getClass(), "opBeginTime", 0L);
        term206446 = new Integer(0);
        term206448 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term206446;
        args[1] = term206448;
        callMethod(klass, "sbcDecimal", argTypes, term206443, args);
    }

};


