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

public class PixelManager_setY_4699379630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5658923;
     Object term5658990;

    public PixelManager_setY_4699379630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5658924 = new HashMap();
        term5658923 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5658929 = (Object[]) newArray("[[Z", 2);
        Object[] term5658930 = (Object[]) newArray("[Z", 2);
        boolean[] term5658931 = (boolean[]) newBooleanArray(0);
        boolean[] term5658932 = (boolean[]) newBooleanArray(8);
        Object[] term5658941 = (Object[]) newArray("[Z", 5);
        boolean[] term5658942 = (boolean[]) newBooleanArray(7);
        boolean[] term5658950 = (boolean[]) newBooleanArray(0);
        boolean[] term5658951 = (boolean[]) newBooleanArray(9);
        boolean[] term5658961 = (boolean[]) newBooleanArray(4);
        boolean[] term5658966 = (boolean[]) newBooleanArray(7);
        Object[] term5658978 = (Object[]) newArray("[Z", 2);
        boolean[] term5658979 = (boolean[]) newBooleanArray(0);
        boolean[] term5658980 = (boolean[]) newBooleanArray(5);
        setField(term5658923, term5658923.getClass(), "fadeMap", term5658924);
        setElement(term5658930, 0, term5658931);
        setBooleanElement(term5658932, 1, true);
        setBooleanElement(term5658932, 6, true);
        setElement(term5658930, 1, term5658932);
        setElement(term5658929, 0, term5658930);
        setBooleanElement(term5658942, 0, true);
        setBooleanElement(term5658942, 1, true);
        setBooleanElement(term5658942, 2, true);
        setBooleanElement(term5658942, 6, true);
        setElement(term5658941, 0, term5658942);
        setElement(term5658941, 1, term5658950);
        setBooleanElement(term5658951, 1, true);
        setBooleanElement(term5658951, 2, true);
        setBooleanElement(term5658951, 3, true);
        setBooleanElement(term5658951, 5, true);
        setBooleanElement(term5658951, 7, true);
        setBooleanElement(term5658951, 8, true);
        setElement(term5658941, 2, term5658951);
        setBooleanElement(term5658961, 0, true);
        setBooleanElement(term5658961, 1, true);
        setBooleanElement(term5658961, 2, true);
        setBooleanElement(term5658961, 3, true);
        setElement(term5658941, 3, term5658961);
        setBooleanElement(term5658966, 2, true);
        setBooleanElement(term5658966, 6, true);
        setElement(term5658941, 4, term5658966);
        setElement(term5658929, 1, term5658941);
        setField(term5658923, term5658923.getClass(), "display", term5658929);
        setIntField(term5658923, term5658923.getClass(), "x", 797203987);
        setIntField(term5658923, term5658923.getClass(), "y", 1973060703);
        setBooleanField(term5658923, term5658923.getClass(), "fade", false);
        setDoubleField(term5658923, term5658923.getClass(), "fadeSpeed", 0.604465128384297);
        setElement(term5658978, 0, term5658979);
        setBooleanElement(term5658980, 1, true);
        setBooleanElement(term5658980, 4, true);
        setElement(term5658978, 1, term5658980);
        setField(term5658923, term5658923.getClass(), "spriteViewer", term5658978);
        setIntField(term5658923, term5658923.getClass(), "spriteHeight", -138239905);
        setBooleanField(term5658923, term5658923.getClass(), "resolutionMode", true);
        setIntField(term5658923, term5658923.getClass(), "currentPlane", 1709474063);
        setBooleanField(term5658923, term5658923.getClass(), "xoMode", false);
        term5658990 = new Integer(1406617209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5658990;
        callMethod(klass, "setY", argTypes, term5658923, args);
    }

};


