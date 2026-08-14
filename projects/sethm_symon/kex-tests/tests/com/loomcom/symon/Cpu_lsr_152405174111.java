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

public class Cpu_lsr_152405174111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206467;
     Object term206470;

    public Cpu_lsr_152405174111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206467 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206467, term206467.getClass(), "clockPeriodInNs", 0L);
        setField(term206467, term206467.getClass(), "behavior", null);
        setField(term206467, term206467.getClass(), "bus", null);
        setField(term206467, term206467.getClass(), "state", null);
        setLongField(term206467, term206467.getClass(), "opBeginTime", 0L);
        term206470 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term206470;
        callMethod(klass, "lsr", argTypes, term206467, args);
    }

};


