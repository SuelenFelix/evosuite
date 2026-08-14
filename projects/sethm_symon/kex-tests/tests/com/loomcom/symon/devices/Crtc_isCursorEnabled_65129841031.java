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

public class Crtc_isCursorEnabled_65129841031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9263;

    public Crtc_isCursorEnabled_65129841031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9263 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        setIntField(term9263, term9263.getClass(), "horizontalDisplayed", 0);
        setIntField(term9263, term9263.getClass(), "verticalDisplayed", 0);
        setIntField(term9263, term9263.getClass(), "scanLinesPerRow", 0);
        setIntField(term9263, term9263.getClass(), "cursorStartLine", 0);
        setBooleanField(term9263, term9263.getClass(), "cursorEnabled", false);
        setIntField(term9263, term9263.getClass(), "cursorBlinkRate", 0);
        setIntField(term9263, term9263.getClass(), "cursorStopLine", 0);
        setIntField(term9263, term9263.getClass(), "startAddress", 0);
        setIntField(term9263, term9263.getClass(), "cursorPosition", 0);
        setIntField(term9263, term9263.getClass(), "pageSize", 0);
        setIntField(term9263, term9263.getClass(), "currentRegister", 0);
        setBooleanField(term9263, term9263.getClass(), "rowColumnAddressing", false);
        setBooleanField(term9263, term9263.getClass(), "displayEnableSkew", false);
        setBooleanField(term9263, term9263.getClass(), "cursorSkew", false);
        setField(term9263, term9263.getClass(), "memory", null);
        setIntField(term9263, term9263.getClass(), "size", 0);
        setField(term9263, term9263.getClass(), "memoryRange", null);
        setField(term9263, term9263.getClass(), "name", null);
        setField(term9263, term9263.getClass(), "bus", null);
        setField(term9263, term9263.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCursorEnabled", argTypes, term9263, args);
    }

};


