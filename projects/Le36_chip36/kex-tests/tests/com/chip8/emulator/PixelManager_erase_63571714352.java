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

public class PixelManager_erase_63571714352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662821;
     Object term5662830;
     Object term5662832;

    public PixelManager_erase_63571714352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5662821 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5662821, term5662821.getClass(), "fadeMap", null);
        setField(term5662821, term5662821.getClass(), "display", null);
        setIntField(term5662821, term5662821.getClass(), "x", 0);
        setIntField(term5662821, term5662821.getClass(), "y", 0);
        setBooleanField(term5662821, term5662821.getClass(), "fade", false);
        setDoubleField(term5662821, term5662821.getClass(), "fadeSpeed", 0.0);
        setField(term5662821, term5662821.getClass(), "spriteViewer", null);
        setIntField(term5662821, term5662821.getClass(), "spriteHeight", 0);
        setBooleanField(term5662821, term5662821.getClass(), "resolutionMode", false);
        setIntField(term5662821, term5662821.getClass(), "currentPlane", 0);
        setBooleanField(term5662821, term5662821.getClass(), "xoMode", false);
        term5662830 = new Integer(0);
        term5662832 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5662830;
        args[1] = term5662832;
        callMethod(klass, "erase", argTypes, term5662821, args);
    }

};


