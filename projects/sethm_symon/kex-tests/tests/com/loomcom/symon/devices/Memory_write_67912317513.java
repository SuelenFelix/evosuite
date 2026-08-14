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

public class Memory_write_67912317513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25930;
     Object term25933;
     Object term25935;

    public Memory_write_67912317513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25930 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        setBooleanField(term25930, term25930.getClass(), "readOnly", false);
        setField(term25930, term25930.getClass(), "mem", null);
        setIntField(term25930, term25930.getClass(), "size", 0);
        setField(term25930, term25930.getClass(), "memoryRange", null);
        setField(term25930, term25930.getClass(), "name", null);
        setField(term25930, term25930.getClass(), "bus", null);
        setField(term25930, term25930.getClass(), "deviceChangeListeners", null);
        term25933 = new Integer(0);
        term25935 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term25933;
        args[1] = term25935;
        callMethod(klass, "write", argTypes, term25930, args);
    }

};


