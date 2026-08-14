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

public class PixelManager_setSpriteHeight_94098081976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5663055;
     Object term5663064;

    public PixelManager_setSpriteHeight_94098081976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5663055 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        setField(term5663055, term5663055.getClass(), "fadeMap", null);
        setField(term5663055, term5663055.getClass(), "display", null);
        setIntField(term5663055, term5663055.getClass(), "x", 0);
        setIntField(term5663055, term5663055.getClass(), "y", 0);
        setBooleanField(term5663055, term5663055.getClass(), "fade", false);
        setDoubleField(term5663055, term5663055.getClass(), "fadeSpeed", 0.0);
        setField(term5663055, term5663055.getClass(), "spriteViewer", null);
        setIntField(term5663055, term5663055.getClass(), "spriteHeight", 0);
        setBooleanField(term5663055, term5663055.getClass(), "resolutionMode", false);
        setIntField(term5663055, term5663055.getClass(), "currentPlane", 0);
        setBooleanField(term5663055, term5663055.getClass(), "xoMode", false);
        term5663064 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5663064;
        callMethod(klass, "setSpriteHeight", argTypes, term5663055, args);
    }

};


