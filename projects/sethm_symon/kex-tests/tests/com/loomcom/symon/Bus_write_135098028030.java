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

public class Bus_write_135098028030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42018;
     Object term42021;
     Object term42023;

    public Bus_write_135098028030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42018 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        setIntField(term42018, term42018.getClass(), "startAddress", 0);
        setIntField(term42018, term42018.getClass(), "endAddress", 0);
        setField(term42018, term42018.getClass(), "cpu", null);
        setField(term42018, term42018.getClass(), "deviceMap", null);
        setField(term42018, term42018.getClass(), "deviceAddressArray", null);
        term42021 = new Integer(0);
        term42023 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term42021;
        args[1] = term42023;
        callMethod(klass, "write", argTypes, term42018, args);
    }

};


