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

public class Bus_buildDeviceAddressArray_189866102223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41991;

    public Bus_buildDeviceAddressArray_189866102223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41991 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        setIntField(term41991, term41991.getClass(), "startAddress", 0);
        setIntField(term41991, term41991.getClass(), "endAddress", 0);
        setField(term41991, term41991.getClass(), "cpu", null);
        setField(term41991, term41991.getClass(), "deviceMap", null);
        setField(term41991, term41991.getClass(), "deviceAddressArray", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildDeviceAddressArray", argTypes, term41991, args);
    }

};


