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

public class Crtc_read_190078188722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9113;
     Object term9129;
     Object term9131;

    public Crtc_read_190078188722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9113 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        setIntField(term9113, term9113.getClass(), "horizontalDisplayed", 0);
        setIntField(term9113, term9113.getClass(), "verticalDisplayed", 0);
        setIntField(term9113, term9113.getClass(), "scanLinesPerRow", 0);
        setIntField(term9113, term9113.getClass(), "cursorStartLine", 0);
        setBooleanField(term9113, term9113.getClass(), "cursorEnabled", false);
        setIntField(term9113, term9113.getClass(), "cursorBlinkRate", 0);
        setIntField(term9113, term9113.getClass(), "cursorStopLine", 0);
        setIntField(term9113, term9113.getClass(), "startAddress", 0);
        setIntField(term9113, term9113.getClass(), "cursorPosition", 0);
        setIntField(term9113, term9113.getClass(), "pageSize", 0);
        setIntField(term9113, term9113.getClass(), "currentRegister", 0);
        setBooleanField(term9113, term9113.getClass(), "rowColumnAddressing", false);
        setBooleanField(term9113, term9113.getClass(), "displayEnableSkew", false);
        setBooleanField(term9113, term9113.getClass(), "cursorSkew", false);
        setField(term9113, term9113.getClass(), "memory", null);
        setIntField(term9113, term9113.getClass(), "size", 0);
        setField(term9113, term9113.getClass(), "memoryRange", null);
        setField(term9113, term9113.getClass(), "name", null);
        setField(term9113, term9113.getClass(), "bus", null);
        setField(term9113, term9113.getClass(), "deviceChangeListeners", null);
        term9129 = new Integer(0);
        term9131 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term9129;
        args[1] = term9131;
        callMethod(klass, "read", argTypes, term9113, args);
    }

};


