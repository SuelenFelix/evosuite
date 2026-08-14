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
import java.lang.Boolean;

public class Bus_read_119063005329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42011;
     Object term42014;
     Object term42016;

    public Bus_read_119063005329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42011 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        setIntField(term42011, term42011.getClass(), "startAddress", 0);
        setIntField(term42011, term42011.getClass(), "endAddress", 0);
        setField(term42011, term42011.getClass(), "cpu", null);
        setField(term42011, term42011.getClass(), "deviceMap", null);
        setField(term42011, term42011.getClass(), "deviceAddressArray", null);
        term42014 = new Integer(0);
        term42016 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term42014;
        args[1] = term42016;
        callMethod(klass, "read", argTypes, term42011, args);
    }

};


