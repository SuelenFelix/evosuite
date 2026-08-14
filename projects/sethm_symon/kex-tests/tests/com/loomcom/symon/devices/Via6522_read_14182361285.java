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

public class Via6522_read_14182361285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12667;
     Object term12669;
     Object term12671;

    public Via6522_read_14182361285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12667 = newInstance(Class.forName("com.loomcom.symon.devices.Via6522"));
        setField(term12667, term12667.getClass(), "name", null);
        setIntField(term12667, term12667.getClass(), "size", 0);
        setField(term12667, term12667.getClass(), "memoryRange", null);
        setField(term12667, term12667.getClass(), "bus", null);
        setField(term12667, term12667.getClass(), "deviceChangeListeners", null);
        term12669 = new Integer(0);
        term12671 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Via6522");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term12669;
        args[1] = term12671;
        callMethod(klass, "read", argTypes, term12667, args);
    }

};


