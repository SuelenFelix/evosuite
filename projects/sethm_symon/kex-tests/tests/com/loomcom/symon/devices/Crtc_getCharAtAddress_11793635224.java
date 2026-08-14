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

public class Crtc_getCharAtAddress_11793635224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9149;
     Object term9165;

    public Crtc_getCharAtAddress_11793635224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9149 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        setIntField(term9149, term9149.getClass(), "horizontalDisplayed", 0);
        setIntField(term9149, term9149.getClass(), "verticalDisplayed", 0);
        setIntField(term9149, term9149.getClass(), "scanLinesPerRow", 0);
        setIntField(term9149, term9149.getClass(), "cursorStartLine", 0);
        setBooleanField(term9149, term9149.getClass(), "cursorEnabled", false);
        setIntField(term9149, term9149.getClass(), "cursorBlinkRate", 0);
        setIntField(term9149, term9149.getClass(), "cursorStopLine", 0);
        setIntField(term9149, term9149.getClass(), "startAddress", 0);
        setIntField(term9149, term9149.getClass(), "cursorPosition", 0);
        setIntField(term9149, term9149.getClass(), "pageSize", 0);
        setIntField(term9149, term9149.getClass(), "currentRegister", 0);
        setBooleanField(term9149, term9149.getClass(), "rowColumnAddressing", false);
        setBooleanField(term9149, term9149.getClass(), "displayEnableSkew", false);
        setBooleanField(term9149, term9149.getClass(), "cursorSkew", false);
        setField(term9149, term9149.getClass(), "memory", null);
        setIntField(term9149, term9149.getClass(), "size", 0);
        setField(term9149, term9149.getClass(), "memoryRange", null);
        setField(term9149, term9149.getClass(), "name", null);
        setField(term9149, term9149.getClass(), "bus", null);
        setField(term9149, term9149.getClass(), "deviceChangeListeners", null);
        term9165 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9165;
        callMethod(klass, "getCharAtAddress", argTypes, term9149, args);
    }

};


