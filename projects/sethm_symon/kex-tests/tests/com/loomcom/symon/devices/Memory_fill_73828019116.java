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

public class Memory_fill_73828019116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25947;
     Object term25950;

    public Memory_fill_73828019116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25947 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        setBooleanField(term25947, term25947.getClass(), "readOnly", false);
        setField(term25947, term25947.getClass(), "mem", null);
        setIntField(term25947, term25947.getClass(), "size", 0);
        setField(term25947, term25947.getClass(), "memoryRange", null);
        setField(term25947, term25947.getClass(), "name", null);
        setField(term25947, term25947.getClass(), "bus", null);
        setField(term25947, term25947.getClass(), "deviceChangeListeners", null);
        term25950 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25950;
        callMethod(klass, "fill", argTypes, term25947, args);
    }

};


