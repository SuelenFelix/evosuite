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

public class Bus_addCpu_176955904027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42005;

    public Bus_addCpu_176955904027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42005 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        setIntField(term42005, term42005.getClass(), "startAddress", 0);
        setIntField(term42005, term42005.getClass(), "endAddress", 0);
        setField(term42005, term42005.getClass(), "cpu", null);
        setField(term42005, term42005.getClass(), "deviceMap", null);
        setField(term42005, term42005.getClass(), "deviceAddressArray", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.Cpu");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCpu", argTypes, term42005, args);
    }

};


