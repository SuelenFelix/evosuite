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

public class PixelManager_getSpriteHeight_187750638523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5656912;

    public PixelManager_getSpriteHeight_187750638523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5656913 = new HashMap();
        term5656912 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5656918 = (Object[]) newArray("[[Z", 4);
        Object[] term5656919 = (Object[]) newArray("[Z", 0);
        Object[] term5656920 = (Object[]) newArray("[Z", 5);
        boolean[] term5656921 = (boolean[]) newBooleanArray(0);
        boolean[] term5656922 = (boolean[]) newBooleanArray(6);
        boolean[] term5656929 = (boolean[]) newBooleanArray(8);
        boolean[] term5656938 = (boolean[]) newBooleanArray(7);
        boolean[] term5656946 = (boolean[]) newBooleanArray(7);
        Object[] term5656954 = (Object[]) newArray("[Z", 8);
        boolean[] term5656955 = (boolean[]) newBooleanArray(3);
        boolean[] term5656959 = (boolean[]) newBooleanArray(6);
        boolean[] term5656966 = (boolean[]) newBooleanArray(8);
        boolean[] term5656975 = (boolean[]) newBooleanArray(0);
        boolean[] term5656976 = (boolean[]) newBooleanArray(0);
        boolean[] term5656977 = (boolean[]) newBooleanArray(0);
        boolean[] term5656978 = (boolean[]) newBooleanArray(7);
        boolean[] term5656986 = (boolean[]) newBooleanArray(2);
        Object[] term5656989 = (Object[]) newArray("[Z", 7);
        boolean[] term5656990 = (boolean[]) newBooleanArray(4);
        boolean[] term5656995 = (boolean[]) newBooleanArray(9);
        boolean[] term5657005 = (boolean[]) newBooleanArray(4);
        boolean[] term5657010 = (boolean[]) newBooleanArray(1);
        boolean[] term5657012 = (boolean[]) newBooleanArray(5);
        boolean[] term5657018 = (boolean[]) newBooleanArray(1);
        boolean[] term5657020 = (boolean[]) newBooleanArray(0);
        Object[] term5657025 = (Object[]) newArray("[Z", 0);
        setField(term5656912, term5656912.getClass(), "fadeMap", term5656913);
        setElement(term5656918, 0, term5656919);
        setElement(term5656920, 0, term5656921);
        setBooleanElement(term5656922, 2, true);
        setBooleanElement(term5656922, 3, true);
        setBooleanElement(term5656922, 4, true);
        setElement(term5656920, 1, term5656922);
        setBooleanElement(term5656929, 0, true);
        setBooleanElement(term5656929, 4, true);
        setBooleanElement(term5656929, 5, true);
        setBooleanElement(term5656929, 6, true);
        setBooleanElement(term5656929, 7, true);
        setElement(term5656920, 2, term5656929);
        setBooleanElement(term5656938, 2, true);
        setBooleanElement(term5656938, 3, true);
        setBooleanElement(term5656938, 4, true);
        setElement(term5656920, 3, term5656938);
        setBooleanElement(term5656946, 0, true);
        setElement(term5656920, 4, term5656946);
        setElement(term5656918, 1, term5656920);
        setBooleanElement(term5656955, 1, true);
        setBooleanElement(term5656955, 2, true);
        setElement(term5656954, 0, term5656955);
        setBooleanElement(term5656959, 0, true);
        setBooleanElement(term5656959, 1, true);
        setBooleanElement(term5656959, 2, true);
        setElement(term5656954, 1, term5656959);
        setBooleanElement(term5656966, 1, true);
        setBooleanElement(term5656966, 2, true);
        setBooleanElement(term5656966, 5, true);
        setBooleanElement(term5656966, 7, true);
        setElement(term5656954, 2, term5656966);
        setElement(term5656954, 3, term5656975);
        setElement(term5656954, 4, term5656976);
        setElement(term5656954, 5, term5656977);
        setBooleanElement(term5656978, 0, true);
        setBooleanElement(term5656978, 6, true);
        setElement(term5656954, 6, term5656978);
        setBooleanElement(term5656986, 0, true);
        setElement(term5656954, 7, term5656986);
        setElement(term5656918, 2, term5656954);
        setBooleanElement(term5656990, 0, true);
        setBooleanElement(term5656990, 3, true);
        setElement(term5656989, 0, term5656990);
        setBooleanElement(term5656995, 1, true);
        setBooleanElement(term5656995, 5, true);
        setBooleanElement(term5656995, 6, true);
        setBooleanElement(term5656995, 8, true);
        setElement(term5656989, 1, term5656995);
        setBooleanElement(term5657005, 0, true);
        setBooleanElement(term5657005, 1, true);
        setBooleanElement(term5657005, 2, true);
        setBooleanElement(term5657005, 3, true);
        setElement(term5656989, 2, term5657005);
        setElement(term5656989, 3, term5657010);
        setBooleanElement(term5657012, 0, true);
        setBooleanElement(term5657012, 1, true);
        setBooleanElement(term5657012, 3, true);
        setBooleanElement(term5657012, 4, true);
        setElement(term5656989, 4, term5657012);
        setElement(term5656989, 5, term5657018);
        setElement(term5656989, 6, term5657020);
        setElement(term5656918, 3, term5656989);
        setField(term5656912, term5656912.getClass(), "display", term5656918);
        setIntField(term5656912, term5656912.getClass(), "x", 1713573821);
        setIntField(term5656912, term5656912.getClass(), "y", 1956590498);
        setBooleanField(term5656912, term5656912.getClass(), "fade", false);
        setDoubleField(term5656912, term5656912.getClass(), "fadeSpeed", 0.8355624480198577);
        setField(term5656912, term5656912.getClass(), "spriteViewer", term5657025);
        setIntField(term5656912, term5656912.getClass(), "spriteHeight", 1467356494);
        setBooleanField(term5656912, term5656912.getClass(), "resolutionMode", false);
        setIntField(term5656912, term5656912.getClass(), "currentPlane", -26316536);
        setBooleanField(term5656912, term5656912.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpriteHeight", argTypes, term5656912, args);
    }

};


