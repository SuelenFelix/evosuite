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

public class SdController_readData_55007658217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21086;

    public SdController_readData_55007658217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21086 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        setIntField(term21086, term21086.getClass(), "SECTOR_SIZE", 0);
        setField(term21086, term21086.getClass(), "sdImageFile", null);
        setIntField(term21086, term21086.getClass(), "lba0", 0);
        setIntField(term21086, term21086.getClass(), "lba1", 0);
        setIntField(term21086, term21086.getClass(), "lba2", 0);
        setIntField(term21086, term21086.getClass(), "position", 0);
        setField(term21086, term21086.getClass(), "status", null);
        setField(term21086, term21086.getClass(), "readBuffer", null);
        setField(term21086, term21086.getClass(), "writeBuffer", null);
        setIntField(term21086, term21086.getClass(), "readPosition", 0);
        setIntField(term21086, term21086.getClass(), "writePosition", 0);
        setIntField(term21086, term21086.getClass(), "size", 0);
        setField(term21086, term21086.getClass(), "memoryRange", null);
        setField(term21086, term21086.getClass(), "name", null);
        setField(term21086, term21086.getClass(), "bus", null);
        setField(term21086, term21086.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readData", argTypes, term21086, args);
    }

};


