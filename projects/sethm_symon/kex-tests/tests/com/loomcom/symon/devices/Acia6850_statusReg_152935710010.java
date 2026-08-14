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
import java.lang.Boolean;

public class Acia6850_statusReg_152935710010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11872;
     Object term11887;

    public Acia6850_statusReg_152935710010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11872 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6850"));
        setField(term11872, term11872.getClass(), "name", null);
        setIntField(term11872, term11872.getClass(), "baseAddress", 0);
        setBooleanField(term11872, term11872.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term11872, term11872.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term11872, term11872.getClass(), "overrun", false);
        setBooleanField(term11872, term11872.getClass(), "interrupt", false);
        setLongField(term11872, term11872.getClass(), "lastTxWrite", 0L);
        setLongField(term11872, term11872.getClass(), "lastRxRead", 0L);
        setIntField(term11872, term11872.getClass(), "baudRate", 0);
        setLongField(term11872, term11872.getClass(), "baudRateDelay", 0L);
        setIntField(term11872, term11872.getClass(), "rxChar", 0);
        setIntField(term11872, term11872.getClass(), "txChar", 0);
        setBooleanField(term11872, term11872.getClass(), "rxFull", false);
        setBooleanField(term11872, term11872.getClass(), "txEmpty", false);
        setIntField(term11872, term11872.getClass(), "size", 0);
        setField(term11872, term11872.getClass(), "memoryRange", null);
        setField(term11872, term11872.getClass(), "bus", null);
        setField(term11872, term11872.getClass(), "deviceChangeListeners", null);
        term11887 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6850");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11887;
        callMethod(klass, "statusReg", argTypes, term11872, args);
    }

};


