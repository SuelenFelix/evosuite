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

public class PixelManager_draw_46305586344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662723;
     Object term5662732;
     Object term5662734;
     Object term5662736;

    public PixelManager_draw_46305586344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5662723 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5662723, term5662723.getClass(), "fadeMap", null);
        setField(term5662723, term5662723.getClass(), "display", null);
        setIntField(term5662723, term5662723.getClass(), "x", 0);
        setIntField(term5662723, term5662723.getClass(), "y", 0);
        setBooleanField(term5662723, term5662723.getClass(), "fade", false);
        setDoubleField(term5662723, term5662723.getClass(), "fadeSpeed", 0.0);
        setField(term5662723, term5662723.getClass(), "spriteViewer", null);
        setIntField(term5662723, term5662723.getClass(), "spriteHeight", 0);
        setBooleanField(term5662723, term5662723.getClass(), "resolutionMode", false);
        setIntField(term5662723, term5662723.getClass(), "currentPlane", 0);
        setBooleanField(term5662723, term5662723.getClass(), "xoMode", false);
        term5662732 = new Integer(0);
        term5662734 = new Integer(0);
        term5662736 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5662732;
        args[1] = term5662734;
        args[2] = term5662736;
        callMethod(klass, "draw", argTypes, term5662723, args);
    }

};


