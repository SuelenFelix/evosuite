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

public class Acia6551_statusReg_152944644212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23603;
     Object term23620;

    public Acia6551_statusReg_152944644212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23603 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        setIntField(term23603, term23603.getClass(), "commandRegister", 0);
        setIntField(term23603, term23603.getClass(), "controlRegister", 0);
        setField(term23603, term23603.getClass(), "name", null);
        setIntField(term23603, term23603.getClass(), "baseAddress", 0);
        setBooleanField(term23603, term23603.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term23603, term23603.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term23603, term23603.getClass(), "overrun", false);
        setBooleanField(term23603, term23603.getClass(), "interrupt", false);
        setLongField(term23603, term23603.getClass(), "lastTxWrite", 0L);
        setLongField(term23603, term23603.getClass(), "lastRxRead", 0L);
        setIntField(term23603, term23603.getClass(), "baudRate", 0);
        setLongField(term23603, term23603.getClass(), "baudRateDelay", 0L);
        setIntField(term23603, term23603.getClass(), "rxChar", 0);
        setIntField(term23603, term23603.getClass(), "txChar", 0);
        setBooleanField(term23603, term23603.getClass(), "rxFull", false);
        setBooleanField(term23603, term23603.getClass(), "txEmpty", false);
        setIntField(term23603, term23603.getClass(), "size", 0);
        setField(term23603, term23603.getClass(), "memoryRange", null);
        setField(term23603, term23603.getClass(), "bus", null);
        setField(term23603, term23603.getClass(), "deviceChangeListeners", null);
        term23620 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term23620;
        callMethod(klass, "statusReg", argTypes, term23603, args);
    }

};


