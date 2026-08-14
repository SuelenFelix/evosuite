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

public class Acia6551_write_9808976059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23544;
     Object term23561;
     Object term23563;

    public Acia6551_write_9808976059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23544 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        setIntField(term23544, term23544.getClass(), "commandRegister", 0);
        setIntField(term23544, term23544.getClass(), "controlRegister", 0);
        setField(term23544, term23544.getClass(), "name", null);
        setIntField(term23544, term23544.getClass(), "baseAddress", 0);
        setBooleanField(term23544, term23544.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term23544, term23544.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term23544, term23544.getClass(), "overrun", false);
        setBooleanField(term23544, term23544.getClass(), "interrupt", false);
        setLongField(term23544, term23544.getClass(), "lastTxWrite", 0L);
        setLongField(term23544, term23544.getClass(), "lastRxRead", 0L);
        setIntField(term23544, term23544.getClass(), "baudRate", 0);
        setLongField(term23544, term23544.getClass(), "baudRateDelay", 0L);
        setIntField(term23544, term23544.getClass(), "rxChar", 0);
        setIntField(term23544, term23544.getClass(), "txChar", 0);
        setBooleanField(term23544, term23544.getClass(), "rxFull", false);
        setBooleanField(term23544, term23544.getClass(), "txEmpty", false);
        setIntField(term23544, term23544.getClass(), "size", 0);
        setField(term23544, term23544.getClass(), "memoryRange", null);
        setField(term23544, term23544.getClass(), "bus", null);
        setField(term23544, term23544.getClass(), "deviceChangeListeners", null);
        term23561 = new Integer(0);
        term23563 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term23561;
        args[1] = term23563;
        callMethod(klass, "write", argTypes, term23544, args);
    }

};


