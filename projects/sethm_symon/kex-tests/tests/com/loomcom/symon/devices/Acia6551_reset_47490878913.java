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

public class Acia6551_reset_47490878913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23622;

    public Acia6551_reset_47490878913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23622 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        setIntField(term23622, term23622.getClass(), "commandRegister", 0);
        setIntField(term23622, term23622.getClass(), "controlRegister", 0);
        setField(term23622, term23622.getClass(), "name", null);
        setIntField(term23622, term23622.getClass(), "baseAddress", 0);
        setBooleanField(term23622, term23622.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term23622, term23622.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term23622, term23622.getClass(), "overrun", false);
        setBooleanField(term23622, term23622.getClass(), "interrupt", false);
        setLongField(term23622, term23622.getClass(), "lastTxWrite", 0L);
        setLongField(term23622, term23622.getClass(), "lastRxRead", 0L);
        setIntField(term23622, term23622.getClass(), "baudRate", 0);
        setLongField(term23622, term23622.getClass(), "baudRateDelay", 0L);
        setIntField(term23622, term23622.getClass(), "rxChar", 0);
        setIntField(term23622, term23622.getClass(), "txChar", 0);
        setBooleanField(term23622, term23622.getClass(), "rxFull", false);
        setBooleanField(term23622, term23622.getClass(), "txEmpty", false);
        setIntField(term23622, term23622.getClass(), "size", 0);
        setField(term23622, term23622.getClass(), "memoryRange", null);
        setField(term23622, term23622.getClass(), "bus", null);
        setField(term23622, term23622.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term23622, args);
    }

};


