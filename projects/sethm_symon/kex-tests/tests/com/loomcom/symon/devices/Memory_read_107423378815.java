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
import java.lang.Boolean;

public class Memory_read_107423378815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25940;
     Object term25943;
     Object term25945;

    public Memory_read_107423378815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25940 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        setBooleanField(term25940, term25940.getClass(), "readOnly", false);
        setField(term25940, term25940.getClass(), "mem", null);
        setIntField(term25940, term25940.getClass(), "size", 0);
        setField(term25940, term25940.getClass(), "memoryRange", null);
        setField(term25940, term25940.getClass(), "name", null);
        setField(term25940, term25940.getClass(), "bus", null);
        setField(term25940, term25940.getClass(), "deviceChangeListeners", null);
        term25943 = new Integer(0);
        term25945 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term25943;
        args[1] = term25945;
        callMethod(klass, "read", argTypes, term25940, args);
    }

};


