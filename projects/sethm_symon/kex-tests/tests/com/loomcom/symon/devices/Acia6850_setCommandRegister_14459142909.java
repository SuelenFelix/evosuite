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

public class Acia6850_setCommandRegister_14459142909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11855;
     Object term11870;

    public Acia6850_setCommandRegister_14459142909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11855 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6850"));
        setField(term11855, term11855.getClass(), "name", null);
        setIntField(term11855, term11855.getClass(), "baseAddress", 0);
        setBooleanField(term11855, term11855.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term11855, term11855.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term11855, term11855.getClass(), "overrun", false);
        setBooleanField(term11855, term11855.getClass(), "interrupt", false);
        setLongField(term11855, term11855.getClass(), "lastTxWrite", 0L);
        setLongField(term11855, term11855.getClass(), "lastRxRead", 0L);
        setIntField(term11855, term11855.getClass(), "baudRate", 0);
        setLongField(term11855, term11855.getClass(), "baudRateDelay", 0L);
        setIntField(term11855, term11855.getClass(), "rxChar", 0);
        setIntField(term11855, term11855.getClass(), "txChar", 0);
        setBooleanField(term11855, term11855.getClass(), "rxFull", false);
        setBooleanField(term11855, term11855.getClass(), "txEmpty", false);
        setIntField(term11855, term11855.getClass(), "size", 0);
        setField(term11855, term11855.getClass(), "memoryRange", null);
        setField(term11855, term11855.getClass(), "bus", null);
        setField(term11855, term11855.getClass(), "deviceChangeListeners", null);
        term11870 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6850");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11870;
        callMethod(klass, "setCommandRegister", argTypes, term11855, args);
    }

};


