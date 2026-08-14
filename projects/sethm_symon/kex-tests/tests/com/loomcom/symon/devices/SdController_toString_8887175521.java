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

public class SdController_toString_8887175521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21126;

    public SdController_toString_8887175521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21126 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        setIntField(term21126, term21126.getClass(), "SECTOR_SIZE", 0);
        setField(term21126, term21126.getClass(), "sdImageFile", null);
        setIntField(term21126, term21126.getClass(), "lba0", 0);
        setIntField(term21126, term21126.getClass(), "lba1", 0);
        setIntField(term21126, term21126.getClass(), "lba2", 0);
        setIntField(term21126, term21126.getClass(), "position", 0);
        setField(term21126, term21126.getClass(), "status", null);
        setField(term21126, term21126.getClass(), "readBuffer", null);
        setField(term21126, term21126.getClass(), "writeBuffer", null);
        setIntField(term21126, term21126.getClass(), "readPosition", 0);
        setIntField(term21126, term21126.getClass(), "writePosition", 0);
        setIntField(term21126, term21126.getClass(), "size", 0);
        setField(term21126, term21126.getClass(), "memoryRange", null);
        setField(term21126, term21126.getClass(), "name", null);
        setField(term21126, term21126.getClass(), "bus", null);
        setField(term21126, term21126.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term21126, args);
    }

};


