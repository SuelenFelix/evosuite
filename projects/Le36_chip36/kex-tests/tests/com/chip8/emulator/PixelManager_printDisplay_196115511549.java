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

public class PixelManager_printDisplay_196115511549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662784;

    public PixelManager_printDisplay_196115511549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5662784 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5662784, term5662784.getClass(), "fadeMap", null);
        setField(term5662784, term5662784.getClass(), "display", null);
        setIntField(term5662784, term5662784.getClass(), "x", 0);
        setIntField(term5662784, term5662784.getClass(), "y", 0);
        setBooleanField(term5662784, term5662784.getClass(), "fade", false);
        setDoubleField(term5662784, term5662784.getClass(), "fadeSpeed", 0.0);
        setField(term5662784, term5662784.getClass(), "spriteViewer", null);
        setIntField(term5662784, term5662784.getClass(), "spriteHeight", 0);
        setBooleanField(term5662784, term5662784.getClass(), "resolutionMode", false);
        setIntField(term5662784, term5662784.getClass(), "currentPlane", 0);
        setBooleanField(term5662784, term5662784.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "printDisplay", argTypes, term5662784, args);
    }

};


