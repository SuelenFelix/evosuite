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

public class Crtc_setCurrentRegister_159591687138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9375;
     Object term9391;

    public Crtc_setCurrentRegister_159591687138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9375 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        setIntField(term9375, term9375.getClass(), "horizontalDisplayed", 0);
        setIntField(term9375, term9375.getClass(), "verticalDisplayed", 0);
        setIntField(term9375, term9375.getClass(), "scanLinesPerRow", 0);
        setIntField(term9375, term9375.getClass(), "cursorStartLine", 0);
        setBooleanField(term9375, term9375.getClass(), "cursorEnabled", false);
        setIntField(term9375, term9375.getClass(), "cursorBlinkRate", 0);
        setIntField(term9375, term9375.getClass(), "cursorStopLine", 0);
        setIntField(term9375, term9375.getClass(), "startAddress", 0);
        setIntField(term9375, term9375.getClass(), "cursorPosition", 0);
        setIntField(term9375, term9375.getClass(), "pageSize", 0);
        setIntField(term9375, term9375.getClass(), "currentRegister", 0);
        setBooleanField(term9375, term9375.getClass(), "rowColumnAddressing", false);
        setBooleanField(term9375, term9375.getClass(), "displayEnableSkew", false);
        setBooleanField(term9375, term9375.getClass(), "cursorSkew", false);
        setField(term9375, term9375.getClass(), "memory", null);
        setIntField(term9375, term9375.getClass(), "size", 0);
        setField(term9375, term9375.getClass(), "memoryRange", null);
        setField(term9375, term9375.getClass(), "name", null);
        setField(term9375, term9375.getClass(), "bus", null);
        setField(term9375, term9375.getClass(), "deviceChangeListeners", null);
        term9391 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9391;
        callMethod(klass, "setCurrentRegister", argTypes, term9375, args);
    }

};


