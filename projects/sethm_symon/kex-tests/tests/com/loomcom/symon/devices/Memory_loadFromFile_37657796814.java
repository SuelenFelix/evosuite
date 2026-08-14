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

public class Memory_loadFromFile_37657796814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25937;

    public Memory_loadFromFile_37657796814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25937 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        setBooleanField(term25937, term25937.getClass(), "readOnly", false);
        setField(term25937, term25937.getClass(), "mem", null);
        setIntField(term25937, term25937.getClass(), "size", 0);
        setField(term25937, term25937.getClass(), "memoryRange", null);
        setField(term25937, term25937.getClass(), "name", null);
        setField(term25937, term25937.getClass(), "bus", null);
        setField(term25937, term25937.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "loadFromFile", argTypes, term25937, args);
    }

};


