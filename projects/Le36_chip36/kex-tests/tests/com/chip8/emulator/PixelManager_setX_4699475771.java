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

public class PixelManager_setX_4699475771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5663002;
     Object term5663011;

    public PixelManager_setX_4699475771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5663002 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5663002, term5663002.getClass(), "fadeMap", null);
        setField(term5663002, term5663002.getClass(), "display", null);
        setIntField(term5663002, term5663002.getClass(), "x", 0);
        setIntField(term5663002, term5663002.getClass(), "y", 0);
        setBooleanField(term5663002, term5663002.getClass(), "fade", false);
        setDoubleField(term5663002, term5663002.getClass(), "fadeSpeed", 0.0);
        setField(term5663002, term5663002.getClass(), "spriteViewer", null);
        setIntField(term5663002, term5663002.getClass(), "spriteHeight", 0);
        setBooleanField(term5663002, term5663002.getClass(), "resolutionMode", false);
        setIntField(term5663002, term5663002.getClass(), "currentPlane", 0);
        setBooleanField(term5663002, term5663002.getClass(), "xoMode", false);
        term5663011 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5663011;
        callMethod(klass, "setX", argTypes, term5663002, args);
    }

};


