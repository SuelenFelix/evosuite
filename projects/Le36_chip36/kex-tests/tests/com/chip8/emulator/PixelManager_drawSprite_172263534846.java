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

public class PixelManager_drawSprite_172263534846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662747;
     Object term5662756;
     Object term5662758;

    public PixelManager_drawSprite_172263534846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5662747 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5662747, term5662747.getClass(), "fadeMap", null);
        setField(term5662747, term5662747.getClass(), "display", null);
        setIntField(term5662747, term5662747.getClass(), "x", 0);
        setIntField(term5662747, term5662747.getClass(), "y", 0);
        setBooleanField(term5662747, term5662747.getClass(), "fade", false);
        setDoubleField(term5662747, term5662747.getClass(), "fadeSpeed", 0.0);
        setField(term5662747, term5662747.getClass(), "spriteViewer", null);
        setIntField(term5662747, term5662747.getClass(), "spriteHeight", 0);
        setBooleanField(term5662747, term5662747.getClass(), "resolutionMode", false);
        setIntField(term5662747, term5662747.getClass(), "currentPlane", 0);
        setBooleanField(term5662747, term5662747.getClass(), "xoMode", false);
        term5662756 = new Integer(0);
        term5662758 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5662756;
        args[1] = term5662758;
        callMethod(klass, "drawSprite", argTypes, term5662747, args);
    }

};


