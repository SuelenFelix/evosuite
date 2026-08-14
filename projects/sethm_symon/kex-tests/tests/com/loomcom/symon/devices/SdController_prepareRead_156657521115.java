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

public class SdController_prepareRead_156657521115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21068;

    public SdController_prepareRead_156657521115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21068 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        setIntField(term21068, term21068.getClass(), "SECTOR_SIZE", 0);
        setField(term21068, term21068.getClass(), "sdImageFile", null);
        setIntField(term21068, term21068.getClass(), "lba0", 0);
        setIntField(term21068, term21068.getClass(), "lba1", 0);
        setIntField(term21068, term21068.getClass(), "lba2", 0);
        setIntField(term21068, term21068.getClass(), "position", 0);
        setField(term21068, term21068.getClass(), "status", null);
        setField(term21068, term21068.getClass(), "readBuffer", null);
        setField(term21068, term21068.getClass(), "writeBuffer", null);
        setIntField(term21068, term21068.getClass(), "readPosition", 0);
        setIntField(term21068, term21068.getClass(), "writePosition", 0);
        setIntField(term21068, term21068.getClass(), "size", 0);
        setField(term21068, term21068.getClass(), "memoryRange", null);
        setField(term21068, term21068.getClass(), "name", null);
        setField(term21068, term21068.getClass(), "bus", null);
        setField(term21068, term21068.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prepareRead", argTypes, term21068, args);
    }

};


