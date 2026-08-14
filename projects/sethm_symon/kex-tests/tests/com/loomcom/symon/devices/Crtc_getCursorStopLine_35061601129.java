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

public class Crtc_getCursorStopLine_35061601129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9231;

    public Crtc_getCursorStopLine_35061601129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9231 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        setIntField(term9231, term9231.getClass(), "horizontalDisplayed", 0);
        setIntField(term9231, term9231.getClass(), "verticalDisplayed", 0);
        setIntField(term9231, term9231.getClass(), "scanLinesPerRow", 0);
        setIntField(term9231, term9231.getClass(), "cursorStartLine", 0);
        setBooleanField(term9231, term9231.getClass(), "cursorEnabled", false);
        setIntField(term9231, term9231.getClass(), "cursorBlinkRate", 0);
        setIntField(term9231, term9231.getClass(), "cursorStopLine", 0);
        setIntField(term9231, term9231.getClass(), "startAddress", 0);
        setIntField(term9231, term9231.getClass(), "cursorPosition", 0);
        setIntField(term9231, term9231.getClass(), "pageSize", 0);
        setIntField(term9231, term9231.getClass(), "currentRegister", 0);
        setBooleanField(term9231, term9231.getClass(), "rowColumnAddressing", false);
        setBooleanField(term9231, term9231.getClass(), "displayEnableSkew", false);
        setBooleanField(term9231, term9231.getClass(), "cursorSkew", false);
        setField(term9231, term9231.getClass(), "memory", null);
        setIntField(term9231, term9231.getClass(), "size", 0);
        setField(term9231, term9231.getClass(), "memoryRange", null);
        setField(term9231, term9231.getClass(), "name", null);
        setField(term9231, term9231.getClass(), "bus", null);
        setField(term9231, term9231.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorStopLine", argTypes, term9231, args);
    }

};


