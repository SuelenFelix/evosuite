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

public class Crtc_getStartAddress_123110644732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9279;

    public Crtc_getStartAddress_123110644732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9279 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        setIntField(term9279, term9279.getClass(), "horizontalDisplayed", 0);
        setIntField(term9279, term9279.getClass(), "verticalDisplayed", 0);
        setIntField(term9279, term9279.getClass(), "scanLinesPerRow", 0);
        setIntField(term9279, term9279.getClass(), "cursorStartLine", 0);
        setBooleanField(term9279, term9279.getClass(), "cursorEnabled", false);
        setIntField(term9279, term9279.getClass(), "cursorBlinkRate", 0);
        setIntField(term9279, term9279.getClass(), "cursorStopLine", 0);
        setIntField(term9279, term9279.getClass(), "startAddress", 0);
        setIntField(term9279, term9279.getClass(), "cursorPosition", 0);
        setIntField(term9279, term9279.getClass(), "pageSize", 0);
        setIntField(term9279, term9279.getClass(), "currentRegister", 0);
        setBooleanField(term9279, term9279.getClass(), "rowColumnAddressing", false);
        setBooleanField(term9279, term9279.getClass(), "displayEnableSkew", false);
        setBooleanField(term9279, term9279.getClass(), "cursorSkew", false);
        setField(term9279, term9279.getClass(), "memory", null);
        setIntField(term9279, term9279.getClass(), "size", 0);
        setField(term9279, term9279.getClass(), "memoryRange", null);
        setField(term9279, term9279.getClass(), "name", null);
        setField(term9279, term9279.getClass(), "bus", null);
        setField(term9279, term9279.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartAddress", argTypes, term9279, args);
    }

};


