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

public class Crtc_write_14742492421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9093;
     Object term9109;
     Object term9111;

    public Crtc_write_14742492421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9093 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        setIntField(term9093, term9093.getClass(), "horizontalDisplayed", 0);
        setIntField(term9093, term9093.getClass(), "verticalDisplayed", 0);
        setIntField(term9093, term9093.getClass(), "scanLinesPerRow", 0);
        setIntField(term9093, term9093.getClass(), "cursorStartLine", 0);
        setBooleanField(term9093, term9093.getClass(), "cursorEnabled", false);
        setIntField(term9093, term9093.getClass(), "cursorBlinkRate", 0);
        setIntField(term9093, term9093.getClass(), "cursorStopLine", 0);
        setIntField(term9093, term9093.getClass(), "startAddress", 0);
        setIntField(term9093, term9093.getClass(), "cursorPosition", 0);
        setIntField(term9093, term9093.getClass(), "pageSize", 0);
        setIntField(term9093, term9093.getClass(), "currentRegister", 0);
        setBooleanField(term9093, term9093.getClass(), "rowColumnAddressing", false);
        setBooleanField(term9093, term9093.getClass(), "displayEnableSkew", false);
        setBooleanField(term9093, term9093.getClass(), "cursorSkew", false);
        setField(term9093, term9093.getClass(), "memory", null);
        setIntField(term9093, term9093.getClass(), "size", 0);
        setField(term9093, term9093.getClass(), "memoryRange", null);
        setField(term9093, term9093.getClass(), "name", null);
        setField(term9093, term9093.getClass(), "bus", null);
        setField(term9093, term9093.getClass(), "deviceChangeListeners", null);
        term9109 = new Integer(0);
        term9111 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9109;
        args[1] = term9111;
        callMethod(klass, "write", argTypes, term9093, args);
    }

};


