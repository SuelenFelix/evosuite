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

public class Acia6850_read_15606233867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11817;
     Object term11832;
     Object term11834;

    public Acia6850_read_15606233867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11817 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6850"));
        setField(term11817, term11817.getClass(), "name", null);
        setIntField(term11817, term11817.getClass(), "baseAddress", 0);
        setBooleanField(term11817, term11817.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term11817, term11817.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term11817, term11817.getClass(), "overrun", false);
        setBooleanField(term11817, term11817.getClass(), "interrupt", false);
        setLongField(term11817, term11817.getClass(), "lastTxWrite", 0L);
        setLongField(term11817, term11817.getClass(), "lastRxRead", 0L);
        setIntField(term11817, term11817.getClass(), "baudRate", 0);
        setLongField(term11817, term11817.getClass(), "baudRateDelay", 0L);
        setIntField(term11817, term11817.getClass(), "rxChar", 0);
        setIntField(term11817, term11817.getClass(), "txChar", 0);
        setBooleanField(term11817, term11817.getClass(), "rxFull", false);
        setBooleanField(term11817, term11817.getClass(), "txEmpty", false);
        setIntField(term11817, term11817.getClass(), "size", 0);
        setField(term11817, term11817.getClass(), "memoryRange", null);
        setField(term11817, term11817.getClass(), "bus", null);
        setField(term11817, term11817.getClass(), "deviceChangeListeners", null);
        term11832 = new Integer(0);
        term11834 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6850");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term11832;
        args[1] = term11834;
        callMethod(klass, "read", argTypes, term11817, args);
    }

};


