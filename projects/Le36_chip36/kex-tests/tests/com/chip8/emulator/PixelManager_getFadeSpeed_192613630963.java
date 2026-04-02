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

public class PixelManager_getFadeSpeed_192613630963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662930;

    public PixelManager_getFadeSpeed_192613630963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5662930 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5662930, term5662930.getClass(), "fadeMap", null);
        setField(term5662930, term5662930.getClass(), "display", null);
        setIntField(term5662930, term5662930.getClass(), "x", 0);
        setIntField(term5662930, term5662930.getClass(), "y", 0);
        setBooleanField(term5662930, term5662930.getClass(), "fade", false);
        setDoubleField(term5662930, term5662930.getClass(), "fadeSpeed", 0.0);
        setField(term5662930, term5662930.getClass(), "spriteViewer", null);
        setIntField(term5662930, term5662930.getClass(), "spriteHeight", 0);
        setBooleanField(term5662930, term5662930.getClass(), "resolutionMode", false);
        setIntField(term5662930, term5662930.getClass(), "currentPlane", 0);
        setBooleanField(term5662930, term5662930.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFadeSpeed", argTypes, term5662930, args);
    }

};


