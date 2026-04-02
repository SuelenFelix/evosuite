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
import java.lang.Boolean;

public class PixelManager_setFade_105806505973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5663024;
     Object term5663033;

    public PixelManager_setFade_105806505973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5663024 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5663024, term5663024.getClass(), "fadeMap", null);
        setField(term5663024, term5663024.getClass(), "display", null);
        setIntField(term5663024, term5663024.getClass(), "x", 0);
        setIntField(term5663024, term5663024.getClass(), "y", 0);
        setBooleanField(term5663024, term5663024.getClass(), "fade", false);
        setDoubleField(term5663024, term5663024.getClass(), "fadeSpeed", 0.0);
        setField(term5663024, term5663024.getClass(), "spriteViewer", null);
        setIntField(term5663024, term5663024.getClass(), "spriteHeight", 0);
        setBooleanField(term5663024, term5663024.getClass(), "resolutionMode", false);
        setIntField(term5663024, term5663024.getClass(), "currentPlane", 0);
        setBooleanField(term5663024, term5663024.getClass(), "xoMode", false);
        term5663033 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5663033;
        callMethod(klass, "setFade", argTypes, term5663024, args);
    }

};


