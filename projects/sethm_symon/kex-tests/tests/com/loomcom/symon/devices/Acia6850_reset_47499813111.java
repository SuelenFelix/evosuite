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

public class Acia6850_reset_47499813111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11889;

    public Acia6850_reset_47499813111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11889 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6850"));
        setField(term11889, term11889.getClass(), "name", null);
        setIntField(term11889, term11889.getClass(), "baseAddress", 0);
        setBooleanField(term11889, term11889.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term11889, term11889.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term11889, term11889.getClass(), "overrun", false);
        setBooleanField(term11889, term11889.getClass(), "interrupt", false);
        setLongField(term11889, term11889.getClass(), "lastTxWrite", 0L);
        setLongField(term11889, term11889.getClass(), "lastRxRead", 0L);
        setIntField(term11889, term11889.getClass(), "baudRate", 0);
        setLongField(term11889, term11889.getClass(), "baudRateDelay", 0L);
        setIntField(term11889, term11889.getClass(), "rxChar", 0);
        setIntField(term11889, term11889.getClass(), "txChar", 0);
        setBooleanField(term11889, term11889.getClass(), "rxFull", false);
        setBooleanField(term11889, term11889.getClass(), "txEmpty", false);
        setIntField(term11889, term11889.getClass(), "size", 0);
        setField(term11889, term11889.getClass(), "memoryRange", null);
        setField(term11889, term11889.getClass(), "bus", null);
        setField(term11889, term11889.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6850");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term11889, args);
    }

};


