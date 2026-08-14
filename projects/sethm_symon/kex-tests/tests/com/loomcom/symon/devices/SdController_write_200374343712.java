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

public class SdController_write_200374343712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21033;
     Object term21042;
     Object term21044;

    public SdController_write_200374343712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21033 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        setIntField(term21033, term21033.getClass(), "SECTOR_SIZE", 0);
        setField(term21033, term21033.getClass(), "sdImageFile", null);
        setIntField(term21033, term21033.getClass(), "lba0", 0);
        setIntField(term21033, term21033.getClass(), "lba1", 0);
        setIntField(term21033, term21033.getClass(), "lba2", 0);
        setIntField(term21033, term21033.getClass(), "position", 0);
        setField(term21033, term21033.getClass(), "status", null);
        setField(term21033, term21033.getClass(), "readBuffer", null);
        setField(term21033, term21033.getClass(), "writeBuffer", null);
        setIntField(term21033, term21033.getClass(), "readPosition", 0);
        setIntField(term21033, term21033.getClass(), "writePosition", 0);
        setIntField(term21033, term21033.getClass(), "size", 0);
        setField(term21033, term21033.getClass(), "memoryRange", null);
        setField(term21033, term21033.getClass(), "name", null);
        setField(term21033, term21033.getClass(), "bus", null);
        setField(term21033, term21033.getClass(), "deviceChangeListeners", null);
        term21042 = new Integer(0);
        term21044 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term21042;
        args[1] = term21044;
        callMethod(klass, "write", argTypes, term21033, args);
    }

};


