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

public class Acia6850_write_9809869478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11836;
     Object term11851;
     Object term11853;

    public Acia6850_write_9809869478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11836 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6850"));
        setField(term11836, term11836.getClass(), "name", null);
        setIntField(term11836, term11836.getClass(), "baseAddress", 0);
        setBooleanField(term11836, term11836.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term11836, term11836.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term11836, term11836.getClass(), "overrun", false);
        setBooleanField(term11836, term11836.getClass(), "interrupt", false);
        setLongField(term11836, term11836.getClass(), "lastTxWrite", 0L);
        setLongField(term11836, term11836.getClass(), "lastRxRead", 0L);
        setIntField(term11836, term11836.getClass(), "baudRate", 0);
        setLongField(term11836, term11836.getClass(), "baudRateDelay", 0L);
        setIntField(term11836, term11836.getClass(), "rxChar", 0);
        setIntField(term11836, term11836.getClass(), "txChar", 0);
        setBooleanField(term11836, term11836.getClass(), "rxFull", false);
        setBooleanField(term11836, term11836.getClass(), "txEmpty", false);
        setIntField(term11836, term11836.getClass(), "size", 0);
        setField(term11836, term11836.getClass(), "memoryRange", null);
        setField(term11836, term11836.getClass(), "bus", null);
        setField(term11836, term11836.getClass(), "deviceChangeListeners", null);
        term11851 = new Integer(0);
        term11853 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6850");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term11851;
        args[1] = term11853;
        callMethod(klass, "write", argTypes, term11836, args);
    }

};


