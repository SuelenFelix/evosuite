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

public class Cpu_xAddress_516103257171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206677;
     Object term206680;
     Object term206682;

    public Cpu_xAddress_516103257171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206677 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206677, term206677.getClass(), "clockPeriodInNs", 0L);
        setField(term206677, term206677.getClass(), "behavior", null);
        setField(term206677, term206677.getClass(), "bus", null);
        setField(term206677, term206677.getClass(), "state", null);
        setLongField(term206677, term206677.getClass(), "opBeginTime", 0L);
        term206680 = new Integer(0);
        term206682 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term206680;
        args[1] = term206682;
        callMethod(klass, "xAddress", argTypes, term206677, args);
    }

};


