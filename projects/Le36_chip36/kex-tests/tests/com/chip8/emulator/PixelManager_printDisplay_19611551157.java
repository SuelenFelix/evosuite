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

public class PixelManager_printDisplay_19611551157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653497;

    public PixelManager_printDisplay_19611551157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5653498 = new HashMap();
        term5653497 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5653503 = (Object[]) newArray("[[Z", 2);
        Object[] term5653504 = (Object[]) newArray("[Z", 3);
        boolean[] term5653505 = (boolean[]) newBooleanArray(7);
        boolean[] term5653513 = (boolean[]) newBooleanArray(3);
        boolean[] term5653517 = (boolean[]) newBooleanArray(4);
        Object[] term5653522 = (Object[]) newArray("[Z", 3);
        boolean[] term5653523 = (boolean[]) newBooleanArray(4);
        boolean[] term5653528 = (boolean[]) newBooleanArray(0);
        boolean[] term5653529 = (boolean[]) newBooleanArray(1);
        Object[] term5653535 = (Object[]) newArray("[Z", 0);
        setField(term5653497, term5653497.getClass(), "fadeMap", term5653498);
        setBooleanElement(term5653505, 2, true);
        setBooleanElement(term5653505, 3, true);
        setBooleanElement(term5653505, 5, true);
        setElement(term5653504, 0, term5653505);
        setBooleanElement(term5653513, 1, true);
        setElement(term5653504, 1, term5653513);
        setBooleanElement(term5653517, 2, true);
        setElement(term5653504, 2, term5653517);
        setElement(term5653503, 0, term5653504);
        setBooleanElement(term5653523, 0, true);
        setBooleanElement(term5653523, 1, true);
        setBooleanElement(term5653523, 2, true);
        setBooleanElement(term5653523, 3, true);
        setElement(term5653522, 0, term5653523);
        setElement(term5653522, 1, term5653528);
        setElement(term5653522, 2, term5653529);
        setElement(term5653503, 1, term5653522);
        setField(term5653497, term5653497.getClass(), "display", term5653503);
        setIntField(term5653497, term5653497.getClass(), "x", -645429025);
        setIntField(term5653497, term5653497.getClass(), "y", -688213483);
        setBooleanField(term5653497, term5653497.getClass(), "fade", false);
        setDoubleField(term5653497, term5653497.getClass(), "fadeSpeed", 0.6704848280926606);
        setField(term5653497, term5653497.getClass(), "spriteViewer", term5653535);
        setIntField(term5653497, term5653497.getClass(), "spriteHeight", 644154104);
        setBooleanField(term5653497, term5653497.getClass(), "resolutionMode", false);
        setIntField(term5653497, term5653497.getClass(), "currentPlane", 76650923);
        setBooleanField(term5653497, term5653497.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pAIBwhAbDu";
        callMethod(klass, "printDisplay", argTypes, term5653497, args);
    }

};


