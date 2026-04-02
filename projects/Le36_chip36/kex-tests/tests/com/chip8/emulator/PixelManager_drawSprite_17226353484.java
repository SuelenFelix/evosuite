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

public class PixelManager_drawSprite_17226353484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5652921;
     Object term5652983;
     Object term5652985;

    public PixelManager_drawSprite_17226353484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5652922 = new HashMap();
        term5652921 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5652927 = (Object[]) newArray("[[Z", 1);
        Object[] term5652928 = (Object[]) newArray("[Z", 3);
        boolean[] term5652929 = (boolean[]) newBooleanArray(9);
        boolean[] term5652939 = (boolean[]) newBooleanArray(0);
        boolean[] term5652940 = (boolean[]) newBooleanArray(4);
        Object[] term5652949 = (Object[]) newArray("[Z", 6);
        boolean[] term5652950 = (boolean[]) newBooleanArray(1);
        boolean[] term5652952 = (boolean[]) newBooleanArray(3);
        boolean[] term5652956 = (boolean[]) newBooleanArray(8);
        boolean[] term5652965 = (boolean[]) newBooleanArray(0);
        boolean[] term5652966 = (boolean[]) newBooleanArray(8);
        boolean[] term5652975 = (boolean[]) newBooleanArray(3);
        setField(term5652921, term5652921.getClass(), "fadeMap", term5652922);
        setBooleanElement(term5652929, 0, true);
        setBooleanElement(term5652929, 5, true);
        setElement(term5652928, 0, term5652929);
        setElement(term5652928, 1, term5652939);
        setBooleanElement(term5652940, 0, true);
        setBooleanElement(term5652940, 1, true);
        setBooleanElement(term5652940, 3, true);
        setElement(term5652928, 2, term5652940);
        setElement(term5652927, 0, term5652928);
        setField(term5652921, term5652921.getClass(), "display", term5652927);
        setIntField(term5652921, term5652921.getClass(), "x", -941356098);
        setIntField(term5652921, term5652921.getClass(), "y", -201517446);
        setBooleanField(term5652921, term5652921.getClass(), "fade", true);
        setDoubleField(term5652921, term5652921.getClass(), "fadeSpeed", 0.5404409545293147);
        setBooleanElement(term5652950, 0, true);
        setElement(term5652949, 0, term5652950);
        setBooleanElement(term5652952, 0, true);
        setBooleanElement(term5652952, 1, true);
        setElement(term5652949, 1, term5652952);
        setBooleanElement(term5652956, 2, true);
        setBooleanElement(term5652956, 4, true);
        setBooleanElement(term5652956, 7, true);
        setElement(term5652949, 2, term5652956);
        setElement(term5652949, 3, term5652965);
        setBooleanElement(term5652966, 1, true);
        setBooleanElement(term5652966, 2, true);
        setBooleanElement(term5652966, 3, true);
        setBooleanElement(term5652966, 4, true);
        setBooleanElement(term5652966, 6, true);
        setBooleanElement(term5652966, 7, true);
        setElement(term5652949, 4, term5652966);
        setBooleanElement(term5652975, 0, true);
        setElement(term5652949, 5, term5652975);
        setField(term5652921, term5652921.getClass(), "spriteViewer", term5652949);
        setIntField(term5652921, term5652921.getClass(), "spriteHeight", -97742366);
        setBooleanField(term5652921, term5652921.getClass(), "resolutionMode", true);
        setIntField(term5652921, term5652921.getClass(), "currentPlane", 1638851942);
        setBooleanField(term5652921, term5652921.getClass(), "xoMode", true);
        term5652983 = new Integer(1374790203);
        term5652985 = new Integer(1160010161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5652983;
        args[1] = term5652985;
        callMethod(klass, "drawSprite", argTypes, term5652921, args);
    }

};


