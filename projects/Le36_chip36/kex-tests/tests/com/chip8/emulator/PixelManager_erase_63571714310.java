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
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;

public class PixelManager_erase_63571714310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5654165;
     Object term5654182;
     Object term5654184;

    public PixelManager_erase_63571714310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5654166 = new HashMap();
        term5654165 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5654171 = (Object[]) newArray("[[Z", 1);
        Object[] term5654172 = (Object[]) newArray("[Z", 0);
        Object[] term5654177 = (Object[]) newArray("[Z", 0);
        setField(term5654165, term5654165.getClass(), "fadeMap", term5654166);
        setElement(term5654171, 0, term5654172);
        setField(term5654165, term5654165.getClass(), "display", term5654171);
        setIntField(term5654165, term5654165.getClass(), "x", -1133405894);
        setIntField(term5654165, term5654165.getClass(), "y", 1289741214);
        setBooleanField(term5654165, term5654165.getClass(), "fade", false);
        setDoubleField(term5654165, term5654165.getClass(), "fadeSpeed", 6.134294677928587E-4);
        setField(term5654165, term5654165.getClass(), "spriteViewer", term5654177);
        setIntField(term5654165, term5654165.getClass(), "spriteHeight", 243280944);
        setBooleanField(term5654165, term5654165.getClass(), "resolutionMode", true);
        setIntField(term5654165, term5654165.getClass(), "currentPlane", -726681073);
        setBooleanField(term5654165, term5654165.getClass(), "xoMode", false);
        term5654182 = new Integer(-1724487863);
        term5654184 = new Integer(-128490829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5654182;
        args[1] = term5654184;
        callMethod(klass, "erase", argTypes, term5654165, args);
    }

};


