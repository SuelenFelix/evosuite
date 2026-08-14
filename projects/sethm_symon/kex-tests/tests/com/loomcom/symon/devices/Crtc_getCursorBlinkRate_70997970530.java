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

public class Crtc_getCursorBlinkRate_70997970530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9247;

    public Crtc_getCursorBlinkRate_70997970530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9247 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        setIntField(term9247, term9247.getClass(), "horizontalDisplayed", 0);
        setIntField(term9247, term9247.getClass(), "verticalDisplayed", 0);
        setIntField(term9247, term9247.getClass(), "scanLinesPerRow", 0);
        setIntField(term9247, term9247.getClass(), "cursorStartLine", 0);
        setBooleanField(term9247, term9247.getClass(), "cursorEnabled", false);
        setIntField(term9247, term9247.getClass(), "cursorBlinkRate", 0);
        setIntField(term9247, term9247.getClass(), "cursorStopLine", 0);
        setIntField(term9247, term9247.getClass(), "startAddress", 0);
        setIntField(term9247, term9247.getClass(), "cursorPosition", 0);
        setIntField(term9247, term9247.getClass(), "pageSize", 0);
        setIntField(term9247, term9247.getClass(), "currentRegister", 0);
        setBooleanField(term9247, term9247.getClass(), "rowColumnAddressing", false);
        setBooleanField(term9247, term9247.getClass(), "displayEnableSkew", false);
        setBooleanField(term9247, term9247.getClass(), "cursorSkew", false);
        setField(term9247, term9247.getClass(), "memory", null);
        setIntField(term9247, term9247.getClass(), "size", 0);
        setField(term9247, term9247.getClass(), "memoryRange", null);
        setField(term9247, term9247.getClass(), "name", null);
        setField(term9247, term9247.getClass(), "bus", null);
        setField(term9247, term9247.getClass(), "deviceChangeListeners", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorBlinkRate", argTypes, term9247, args);
    }

};


