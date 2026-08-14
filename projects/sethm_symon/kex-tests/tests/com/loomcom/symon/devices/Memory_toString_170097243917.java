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

public class Memory_toString_170097243917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25952;

    public Memory_toString_170097243917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25952 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        setBooleanField(term25952, term25952.getClass(), "readOnly", false);
        setField(term25952, term25952.getClass(), "mem", null);
        setIntField(term25952, term25952.getClass(), "size", 0);
        setField(term25952, term25952.getClass(), "memoryRange", null);
        setField(term25952, term25952.getClass(), "name", null);
        setField(term25952, term25952.getClass(), "bus", null);
        setField(term25952, term25952.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25952, args);
    }

};


