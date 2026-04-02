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

public class PixelManager_drawScrolling_24531808250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662793;
     Object term5662802;
     Object term5662804;
     Object term5662806;

    public PixelManager_drawScrolling_24531808250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5662793 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5662793, term5662793.getClass(), "fadeMap", null);
        setField(term5662793, term5662793.getClass(), "display", null);
        setIntField(term5662793, term5662793.getClass(), "x", 0);
        setIntField(term5662793, term5662793.getClass(), "y", 0);
        setBooleanField(term5662793, term5662793.getClass(), "fade", false);
        setDoubleField(term5662793, term5662793.getClass(), "fadeSpeed", 0.0);
        setField(term5662793, term5662793.getClass(), "spriteViewer", null);
        setIntField(term5662793, term5662793.getClass(), "spriteHeight", 0);
        setBooleanField(term5662793, term5662793.getClass(), "resolutionMode", false);
        setIntField(term5662793, term5662793.getClass(), "currentPlane", 0);
        setBooleanField(term5662793, term5662793.getClass(), "xoMode", false);
        term5662802 = new Integer(0);
        term5662804 = new Integer(0);
        term5662806 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.chip8.emulator.Scroll");
        Object[] args = new Object[4];
        args[0] = term5662802;
        args[1] = term5662804;
        args[2] = term5662806;
        args[3] = null;
        callMethod(klass, "drawScrolling", argTypes, term5662793, args);
    }

};


