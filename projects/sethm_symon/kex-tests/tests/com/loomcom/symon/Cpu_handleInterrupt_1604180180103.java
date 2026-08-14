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
import java.lang.Boolean;

public class Cpu_handleInterrupt_1604180180103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206411;
     Object term206414;
     Object term206416;
     Object term206418;
     Object term206420;

    public Cpu_handleInterrupt_1604180180103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206411 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206411, term206411.getClass(), "clockPeriodInNs", 0L);
        setField(term206411, term206411.getClass(), "behavior", null);
        setField(term206411, term206411.getClass(), "bus", null);
        setField(term206411, term206411.getClass(), "state", null);
        setLongField(term206411, term206411.getClass(), "opBeginTime", 0L);
        term206414 = new Integer(0);
        term206416 = new Integer(0);
        term206418 = new Integer(0);
        term206420 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term206414;
        args[1] = term206416;
        args[2] = term206418;
        args[3] = term206420;
        callMethod(klass, "handleInterrupt", argTypes, term206411, args);
    }

};


