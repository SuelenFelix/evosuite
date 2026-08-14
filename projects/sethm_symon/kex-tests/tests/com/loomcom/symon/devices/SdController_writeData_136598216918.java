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

public class SdController_writeData_136598216918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21095;
     Object term21104;

    public SdController_writeData_136598216918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21095 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        setIntField(term21095, term21095.getClass(), "SECTOR_SIZE", 0);
        setField(term21095, term21095.getClass(), "sdImageFile", null);
        setIntField(term21095, term21095.getClass(), "lba0", 0);
        setIntField(term21095, term21095.getClass(), "lba1", 0);
        setIntField(term21095, term21095.getClass(), "lba2", 0);
        setIntField(term21095, term21095.getClass(), "position", 0);
        setField(term21095, term21095.getClass(), "status", null);
        setField(term21095, term21095.getClass(), "readBuffer", null);
        setField(term21095, term21095.getClass(), "writeBuffer", null);
        setIntField(term21095, term21095.getClass(), "readPosition", 0);
        setIntField(term21095, term21095.getClass(), "writePosition", 0);
        setIntField(term21095, term21095.getClass(), "size", 0);
        setField(term21095, term21095.getClass(), "memoryRange", null);
        setField(term21095, term21095.getClass(), "name", null);
        setField(term21095, term21095.getClass(), "bus", null);
        setField(term21095, term21095.getClass(), "deviceChangeListeners", null);
        term21104 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21104;
        callMethod(klass, "writeData", argTypes, term21095, args);
    }

};


