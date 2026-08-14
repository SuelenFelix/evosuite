package com.loomcom.symon.devices;

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
import static com.loomcom.symon.devices.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Via6522_write_11233742054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12661;
     Object term12663;
     Object term12665;

    public Via6522_write_11233742054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12661 = newInstance(Class.forName("com.loomcom.symon.devices.Via6522"));
        setField(term12661, term12661.getClass(), "name", null);
        setIntField(term12661, term12661.getClass(), "size", 0);
        setField(term12661, term12661.getClass(), "memoryRange", null);
        setField(term12661, term12661.getClass(), "bus", null);
        setField(term12661, term12661.getClass(), "deviceChangeListeners", null);
        term12663 = new Integer(0);
        term12665 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Via6522");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term12663;
        args[1] = term12665;
        callMethod(klass, "write", argTypes, term12661, args);
    }

};


