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

public class Bus_addDevice_51158963424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41994;
     Object term41997;

    public Bus_addDevice_51158963424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41994 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        setIntField(term41994, term41994.getClass(), "startAddress", 0);
        setIntField(term41994, term41994.getClass(), "endAddress", 0);
        setField(term41994, term41994.getClass(), "cpu", null);
        setField(term41994, term41994.getClass(), "deviceMap", null);
        setField(term41994, term41994.getClass(), "deviceAddressArray", null);
        term41997 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.loomcom.symon.devices.Device");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41997;
        callMethod(klass, "addDevice", argTypes, term41994, args);
    }

};


