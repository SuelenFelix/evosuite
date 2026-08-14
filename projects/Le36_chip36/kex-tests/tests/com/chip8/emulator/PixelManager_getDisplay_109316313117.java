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

public class PixelManager_getDisplay_109316313117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5655386;

    public PixelManager_getDisplay_109316313117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5655387 = new HashMap();
        term5655386 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5655392 = (Object[]) newArray("[[Z", 1);
        Object[] term5655393 = (Object[]) newArray("[Z", 9);
        boolean[] term5655394 = (boolean[]) newBooleanArray(5);
        boolean[] term5655400 = (boolean[]) newBooleanArray(3);
        boolean[] term5655404 = (boolean[]) newBooleanArray(2);
        boolean[] term5655407 = (boolean[]) newBooleanArray(0);
        boolean[] term5655408 = (boolean[]) newBooleanArray(0);
        boolean[] term5655409 = (boolean[]) newBooleanArray(1);
        boolean[] term5655411 = (boolean[]) newBooleanArray(0);
        boolean[] term5655412 = (boolean[]) newBooleanArray(8);
        boolean[] term5655421 = (boolean[]) newBooleanArray(5);
        Object[] term5655431 = (Object[]) newArray("[Z", 5);
        boolean[] term5655432 = (boolean[]) newBooleanArray(5);
        boolean[] term5655438 = (boolean[]) newBooleanArray(4);
        boolean[] term5655443 = (boolean[]) newBooleanArray(1);
        boolean[] term5655445 = (boolean[]) newBooleanArray(7);
        boolean[] term5655453 = (boolean[]) newBooleanArray(3);
        setField(term5655386, term5655386.getClass(), "fadeMap", term5655387);
        setBooleanElement(term5655394, 0, true);
        setBooleanElement(term5655394, 2, true);
        setBooleanElement(term5655394, 3, true);
        setBooleanElement(term5655394, 4, true);
        setElement(term5655393, 0, term5655394);
        setBooleanElement(term5655400, 0, true);
        setBooleanElement(term5655400, 1, true);
        setBooleanElement(term5655400, 2, true);
        setElement(term5655393, 1, term5655400);
        setBooleanElement(term5655404, 0, true);
        setElement(term5655393, 2, term5655404);
        setElement(term5655393, 3, term5655407);
        setElement(term5655393, 4, term5655408);
        setBooleanElement(term5655409, 0, true);
        setElement(term5655393, 5, term5655409);
        setElement(term5655393, 6, term5655411);
        setBooleanElement(term5655412, 0, true);
        setBooleanElement(term5655412, 1, true);
        setBooleanElement(term5655412, 2, true);
        setBooleanElement(term5655412, 3, true);
        setBooleanElement(term5655412, 5, true);
        setBooleanElement(term5655412, 6, true);
        setBooleanElement(term5655412, 7, true);
        setElement(term5655393, 7, term5655412);
        setBooleanElement(term5655421, 0, true);
        setBooleanElement(term5655421, 1, true);
        setBooleanElement(term5655421, 2, true);
        setBooleanElement(term5655421, 4, true);
        setElement(term5655393, 8, term5655421);
        setElement(term5655392, 0, term5655393);
        setField(term5655386, term5655386.getClass(), "display", term5655392);
        setIntField(term5655386, term5655386.getClass(), "x", -516303035);
        setIntField(term5655386, term5655386.getClass(), "y", -2143043890);
        setBooleanField(term5655386, term5655386.getClass(), "fade", false);
        setDoubleField(term5655386, term5655386.getClass(), "fadeSpeed", 0.5820770579753712);
        setBooleanElement(term5655432, 0, true);
        setBooleanElement(term5655432, 1, true);
        setBooleanElement(term5655432, 2, true);
        setBooleanElement(term5655432, 3, true);
        setElement(term5655431, 0, term5655432);
        setBooleanElement(term5655438, 3, true);
        setElement(term5655431, 1, term5655438);
        setElement(term5655431, 2, term5655443);
        setBooleanElement(term5655445, 1, true);
        setBooleanElement(term5655445, 2, true);
        setBooleanElement(term5655445, 3, true);
        setBooleanElement(term5655445, 6, true);
        setElement(term5655431, 3, term5655445);
        setBooleanElement(term5655453, 0, true);
        setElement(term5655431, 4, term5655453);
        setField(term5655386, term5655386.getClass(), "spriteViewer", term5655431);
        setIntField(term5655386, term5655386.getClass(), "spriteHeight", -2138825831);
        setBooleanField(term5655386, term5655386.getClass(), "resolutionMode", false);
        setIntField(term5655386, term5655386.getClass(), "currentPlane", 1454781562);
        setBooleanField(term5655386, term5655386.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDisplay", argTypes, term5655386, args);
    }

};


