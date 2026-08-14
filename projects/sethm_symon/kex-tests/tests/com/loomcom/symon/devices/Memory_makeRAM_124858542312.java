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

public class Memory_makeRAM_124858542312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25923;
     Object term25926;
     Object term25928;

    public Memory_makeRAM_124858542312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25923 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        setBooleanField(term25923, term25923.getClass(), "readOnly", false);
        setField(term25923, term25923.getClass(), "mem", null);
        setIntField(term25923, term25923.getClass(), "size", 0);
        setField(term25923, term25923.getClass(), "memoryRange", null);
        setField(term25923, term25923.getClass(), "name", null);
        setField(term25923, term25923.getClass(), "bus", null);
        setField(term25923, term25923.getClass(), "deviceChangeListeners", null);
        term25926 = new Integer(0);
        term25928 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term25926;
        args[1] = term25928;
        callMethod(klass, "makeRAM", argTypes, term25923, args);
    }

};


