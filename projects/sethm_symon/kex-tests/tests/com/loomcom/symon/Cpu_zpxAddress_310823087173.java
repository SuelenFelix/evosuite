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

public class Cpu_zpxAddress_310823087173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206691;
     Object term206694;

    public Cpu_zpxAddress_310823087173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206691 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206691, term206691.getClass(), "clockPeriodInNs", 0L);
        setField(term206691, term206691.getClass(), "behavior", null);
        setField(term206691, term206691.getClass(), "bus", null);
        setField(term206691, term206691.getClass(), "state", null);
        setLongField(term206691, term206691.getClass(), "opBeginTime", 0L);
        term206694 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term206694;
        callMethod(klass, "zpxAddress", argTypes, term206691, args);
    }

};


