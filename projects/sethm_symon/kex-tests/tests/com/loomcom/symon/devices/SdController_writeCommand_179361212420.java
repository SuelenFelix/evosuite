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

public class SdController_writeCommand_179361212420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21115;
     Object term21124;

    public SdController_writeCommand_179361212420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21115 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        setIntField(term21115, term21115.getClass(), "SECTOR_SIZE", 0);
        setField(term21115, term21115.getClass(), "sdImageFile", null);
        setIntField(term21115, term21115.getClass(), "lba0", 0);
        setIntField(term21115, term21115.getClass(), "lba1", 0);
        setIntField(term21115, term21115.getClass(), "lba2", 0);
        setIntField(term21115, term21115.getClass(), "position", 0);
        setField(term21115, term21115.getClass(), "status", null);
        setField(term21115, term21115.getClass(), "readBuffer", null);
        setField(term21115, term21115.getClass(), "writeBuffer", null);
        setIntField(term21115, term21115.getClass(), "readPosition", 0);
        setIntField(term21115, term21115.getClass(), "writePosition", 0);
        setIntField(term21115, term21115.getClass(), "size", 0);
        setField(term21115, term21115.getClass(), "memoryRange", null);
        setField(term21115, term21115.getClass(), "name", null);
        setField(term21115, term21115.getClass(), "bus", null);
        setField(term21115, term21115.getClass(), "deviceChangeListeners", null);
        term21124 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21124;
        callMethod(klass, "writeCommand", argTypes, term21115, args);
    }

};


