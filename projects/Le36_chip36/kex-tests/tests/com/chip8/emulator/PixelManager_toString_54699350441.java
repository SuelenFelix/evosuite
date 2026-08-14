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

public class PixelManager_toString_54699350441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662579;

    public PixelManager_toString_54699350441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5662580 = new HashMap();
        term5662579 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5662585 = (Object[]) newArray("[[Z", 3);
        Object[] term5662586 = (Object[]) newArray("[Z", 0);
        Object[] term5662587 = (Object[]) newArray("[Z", 3);
        boolean[] term5662588 = (boolean[]) newBooleanArray(1);
        boolean[] term5662590 = (boolean[]) newBooleanArray(7);
        boolean[] term5662598 = (boolean[]) newBooleanArray(8);
        Object[] term5662607 = (Object[]) newArray("[Z", 4);
        boolean[] term5662608 = (boolean[]) newBooleanArray(8);
        boolean[] term5662617 = (boolean[]) newBooleanArray(9);
        boolean[] term5662627 = (boolean[]) newBooleanArray(3);
        boolean[] term5662631 = (boolean[]) newBooleanArray(9);
        Object[] term5662645 = (Object[]) newArray("[Z", 1);
        boolean[] term5662646 = (boolean[]) newBooleanArray(7);
        setField(term5662579, term5662579.getClass(), "fadeMap", term5662580);
        setElement(term5662585, 0, term5662586);
        setBooleanElement(term5662588, 0, true);
        setElement(term5662587, 0, term5662588);
        setBooleanElement(term5662590, 1, true);
        setBooleanElement(term5662590, 3, true);
        setBooleanElement(term5662590, 5, true);
        setBooleanElement(term5662590, 6, true);
        setElement(term5662587, 1, term5662590);
        setBooleanElement(term5662598, 3, true);
        setBooleanElement(term5662598, 4, true);
        setElement(term5662587, 2, term5662598);
        setElement(term5662585, 1, term5662587);
        setBooleanElement(term5662608, 0, true);
        setBooleanElement(term5662608, 1, true);
        setBooleanElement(term5662608, 2, true);
        setBooleanElement(term5662608, 3, true);
        setBooleanElement(term5662608, 4, true);
        setElement(term5662607, 0, term5662608);
        setBooleanElement(term5662617, 0, true);
        setBooleanElement(term5662617, 2, true);
        setBooleanElement(term5662617, 3, true);
        setBooleanElement(term5662617, 6, true);
        setBooleanElement(term5662617, 7, true);
        setElement(term5662607, 1, term5662617);
        setBooleanElement(term5662627, 0, true);
        setElement(term5662607, 2, term5662627);
        setBooleanElement(term5662631, 0, true);
        setBooleanElement(term5662631, 1, true);
        setBooleanElement(term5662631, 2, true);
        setBooleanElement(term5662631, 3, true);
        setBooleanElement(term5662631, 4, true);
        setBooleanElement(term5662631, 7, true);
        setElement(term5662607, 3, term5662631);
        setElement(term5662585, 2, term5662607);
        setField(term5662579, term5662579.getClass(), "display", term5662585);
        setIntField(term5662579, term5662579.getClass(), "x", 1787325291);
        setIntField(term5662579, term5662579.getClass(), "y", 1470349147);
        setBooleanField(term5662579, term5662579.getClass(), "fade", true);
        setDoubleField(term5662579, term5662579.getClass(), "fadeSpeed", 0.025396748287270232);
        setBooleanElement(term5662646, 0, true);
        setBooleanElement(term5662646, 2, true);
        setBooleanElement(term5662646, 4, true);
        setBooleanElement(term5662646, 5, true);
        setElement(term5662645, 0, term5662646);
        setField(term5662579, term5662579.getClass(), "spriteViewer", term5662645);
        setIntField(term5662579, term5662579.getClass(), "spriteHeight", -255317272);
        setBooleanField(term5662579, term5662579.getClass(), "resolutionMode", true);
        setIntField(term5662579, term5662579.getClass(), "currentPlane", -706253892);
        setBooleanField(term5662579, term5662579.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5662579, args);
    }

};


