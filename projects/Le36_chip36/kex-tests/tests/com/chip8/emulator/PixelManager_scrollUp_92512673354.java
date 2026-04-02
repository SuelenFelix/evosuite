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
import java.lang.Integer;

public class PixelManager_scrollUp_92512673354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662845;
     Object term5662854;

    public PixelManager_scrollUp_92512673354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5662845 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5662845, term5662845.getClass(), "fadeMap", null);
        setField(term5662845, term5662845.getClass(), "display", null);
        setIntField(term5662845, term5662845.getClass(), "x", 0);
        setIntField(term5662845, term5662845.getClass(), "y", 0);
        setBooleanField(term5662845, term5662845.getClass(), "fade", false);
        setDoubleField(term5662845, term5662845.getClass(), "fadeSpeed", 0.0);
        setField(term5662845, term5662845.getClass(), "spriteViewer", null);
        setIntField(term5662845, term5662845.getClass(), "spriteHeight", 0);
        setBooleanField(term5662845, term5662845.getClass(), "resolutionMode", false);
        setIntField(term5662845, term5662845.getClass(), "currentPlane", 0);
        setBooleanField(term5662845, term5662845.getClass(), "xoMode", false);
        term5662854 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5662854;
        callMethod(klass, "scrollUp", argTypes, term5662845, args);
    }

};


