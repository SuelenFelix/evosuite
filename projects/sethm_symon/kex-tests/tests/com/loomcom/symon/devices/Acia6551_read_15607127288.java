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

public class Acia6551_read_15607127288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23523;
     Object term23540;
     Object term23542;

    public Acia6551_read_15607127288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23523 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        setIntField(term23523, term23523.getClass(), "commandRegister", 0);
        setIntField(term23523, term23523.getClass(), "controlRegister", 0);
        setField(term23523, term23523.getClass(), "name", null);
        setIntField(term23523, term23523.getClass(), "baseAddress", 0);
        setBooleanField(term23523, term23523.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term23523, term23523.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term23523, term23523.getClass(), "overrun", false);
        setBooleanField(term23523, term23523.getClass(), "interrupt", false);
        setLongField(term23523, term23523.getClass(), "lastTxWrite", 0L);
        setLongField(term23523, term23523.getClass(), "lastRxRead", 0L);
        setIntField(term23523, term23523.getClass(), "baudRate", 0);
        setLongField(term23523, term23523.getClass(), "baudRateDelay", 0L);
        setIntField(term23523, term23523.getClass(), "rxChar", 0);
        setIntField(term23523, term23523.getClass(), "txChar", 0);
        setBooleanField(term23523, term23523.getClass(), "rxFull", false);
        setBooleanField(term23523, term23523.getClass(), "txEmpty", false);
        setIntField(term23523, term23523.getClass(), "size", 0);
        setField(term23523, term23523.getClass(), "memoryRange", null);
        setField(term23523, term23523.getClass(), "bus", null);
        setField(term23523, term23523.getClass(), "deviceChangeListeners", null);
        term23540 = new Integer(0);
        term23542 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term23540;
        args[1] = term23542;
        callMethod(klass, "read", argTypes, term23523, args);
    }

};


