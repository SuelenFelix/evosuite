package com.chip8.emulator;

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
import static com.chip8.emulator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PixelManager_getDisplay_109316313159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662894;

    public PixelManager_getDisplay_109316313159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5662894 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5662894, term5662894.getClass(), "fadeMap", null);
        setField(term5662894, term5662894.getClass(), "display", null);
        setIntField(term5662894, term5662894.getClass(), "x", 0);
        setIntField(term5662894, term5662894.getClass(), "y", 0);
        setBooleanField(term5662894, term5662894.getClass(), "fade", false);
        setDoubleField(term5662894, term5662894.getClass(), "fadeSpeed", 0.0);
        setField(term5662894, term5662894.getClass(), "spriteViewer", null);
        setIntField(term5662894, term5662894.getClass(), "spriteHeight", 0);
        setBooleanField(term5662894, term5662894.getClass(), "resolutionMode", false);
        setIntField(term5662894, term5662894.getClass(), "currentPlane", 0);
        setBooleanField(term5662894, term5662894.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDisplay", argTypes, term5662894, args);
    }

};


