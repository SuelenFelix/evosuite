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

public class SdController_read_53786689613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21046;
     Object term21055;
     Object term21057;

    public SdController_read_53786689613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21046 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        setIntField(term21046, term21046.getClass(), "SECTOR_SIZE", 0);
        setField(term21046, term21046.getClass(), "sdImageFile", null);
        setIntField(term21046, term21046.getClass(), "lba0", 0);
        setIntField(term21046, term21046.getClass(), "lba1", 0);
        setIntField(term21046, term21046.getClass(), "lba2", 0);
        setIntField(term21046, term21046.getClass(), "position", 0);
        setField(term21046, term21046.getClass(), "status", null);
        setField(term21046, term21046.getClass(), "readBuffer", null);
        setField(term21046, term21046.getClass(), "writeBuffer", null);
        setIntField(term21046, term21046.getClass(), "readPosition", 0);
        setIntField(term21046, term21046.getClass(), "writePosition", 0);
        setIntField(term21046, term21046.getClass(), "size", 0);
        setField(term21046, term21046.getClass(), "memoryRange", null);
        setField(term21046, term21046.getClass(), "name", null);
        setField(term21046, term21046.getClass(), "bus", null);
        setField(term21046, term21046.getClass(), "deviceChangeListeners", null);
        term21055 = new Integer(0);
        term21057 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term21055;
        args[1] = term21057;
        callMethod(klass, "read", argTypes, term21046, args);
    }

};


