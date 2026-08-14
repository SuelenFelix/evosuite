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

public class Acia6551_setControlRegister_165492359011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23584;
     Object term23601;

    public Acia6551_setControlRegister_165492359011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23584 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        setIntField(term23584, term23584.getClass(), "commandRegister", 0);
        setIntField(term23584, term23584.getClass(), "controlRegister", 0);
        setField(term23584, term23584.getClass(), "name", null);
        setIntField(term23584, term23584.getClass(), "baseAddress", 0);
        setBooleanField(term23584, term23584.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term23584, term23584.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term23584, term23584.getClass(), "overrun", false);
        setBooleanField(term23584, term23584.getClass(), "interrupt", false);
        setLongField(term23584, term23584.getClass(), "lastTxWrite", 0L);
        setLongField(term23584, term23584.getClass(), "lastRxRead", 0L);
        setIntField(term23584, term23584.getClass(), "baudRate", 0);
        setLongField(term23584, term23584.getClass(), "baudRateDelay", 0L);
        setIntField(term23584, term23584.getClass(), "rxChar", 0);
        setIntField(term23584, term23584.getClass(), "txChar", 0);
        setBooleanField(term23584, term23584.getClass(), "rxFull", false);
        setBooleanField(term23584, term23584.getClass(), "txEmpty", false);
        setIntField(term23584, term23584.getClass(), "size", 0);
        setField(term23584, term23584.getClass(), "memoryRange", null);
        setField(term23584, term23584.getClass(), "bus", null);
        setField(term23584, term23584.getClass(), "deviceChangeListeners", null);
        term23601 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23601;
        callMethod(klass, "setControlRegister", argTypes, term23584, args);
    }

};


