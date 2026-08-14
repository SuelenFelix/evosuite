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

public class Cpu_disassembleOp_1724952573177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206711;
     Object term206714;

    public Cpu_disassembleOp_1724952573177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206711 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206711, term206711.getClass(), "clockPeriodInNs", 0L);
        setField(term206711, term206711.getClass(), "behavior", null);
        setField(term206711, term206711.getClass(), "bus", null);
        setField(term206711, term206711.getClass(), "state", null);
        setLongField(term206711, term206711.getClass(), "opBeginTime", 0L);
        term206714 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term206714;
        args[1] = null;
        callMethod(klass, "disassembleOp", argTypes, term206711, args);
    }

};


