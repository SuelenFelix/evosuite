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
import java.util.LinkedHashMap;

public class PixelManager_setFadeMap_135068625127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5658094;
     Object term5658186;

    public PixelManager_setFadeMap_135068625127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5658095 = new HashMap();
        term5658094 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5658100 = (Object[]) newArray("[[Z", 3);
        Object[] term5658101 = (Object[]) newArray("[Z", 0);
        Object[] term5658102 = (Object[]) newArray("[Z", 9);
        boolean[] term5658103 = (boolean[]) newBooleanArray(4);
        boolean[] term5658108 = (boolean[]) newBooleanArray(0);
        boolean[] term5658109 = (boolean[]) newBooleanArray(4);
        boolean[] term5658114 = (boolean[]) newBooleanArray(3);
        boolean[] term5658118 = (boolean[]) newBooleanArray(5);
        boolean[] term5658124 = (boolean[]) newBooleanArray(3);
        boolean[] term5658128 = (boolean[]) newBooleanArray(9);
        boolean[] term5658138 = (boolean[]) newBooleanArray(0);
        boolean[] term5658139 = (boolean[]) newBooleanArray(0);
        Object[] term5658140 = (Object[]) newArray("[Z", 1);
        boolean[] term5658141 = (boolean[]) newBooleanArray(0);
        Object[] term5658146 = (Object[]) newArray("[Z", 8);
        boolean[] term5658147 = (boolean[]) newBooleanArray(0);
        boolean[] term5658148 = (boolean[]) newBooleanArray(0);
        boolean[] term5658149 = (boolean[]) newBooleanArray(8);
        boolean[] term5658158 = (boolean[]) newBooleanArray(3);
        boolean[] term5658162 = (boolean[]) newBooleanArray(6);
        boolean[] term5658169 = (boolean[]) newBooleanArray(1);
        boolean[] term5658171 = (boolean[]) newBooleanArray(0);
        boolean[] term5658172 = (boolean[]) newBooleanArray(9);
        setField(term5658094, term5658094.getClass(), "fadeMap", term5658095);
        setElement(term5658100, 0, term5658101);
        setElement(term5658102, 0, term5658103);
        setElement(term5658102, 1, term5658108);
        setBooleanElement(term5658109, 0, true);
        setBooleanElement(term5658109, 2, true);
        setBooleanElement(term5658109, 3, true);
        setElement(term5658102, 2, term5658109);
        setBooleanElement(term5658114, 0, true);
        setElement(term5658102, 3, term5658114);
        setBooleanElement(term5658118, 0, true);
        setElement(term5658102, 4, term5658118);
        setBooleanElement(term5658124, 1, true);
        setElement(term5658102, 5, term5658124);
        setBooleanElement(term5658128, 1, true);
        setBooleanElement(term5658128, 2, true);
        setBooleanElement(term5658128, 5, true);
        setElement(term5658102, 6, term5658128);
        setElement(term5658102, 7, term5658138);
        setElement(term5658102, 8, term5658139);
        setElement(term5658100, 1, term5658102);
        setElement(term5658140, 0, term5658141);
        setElement(term5658100, 2, term5658140);
        setField(term5658094, term5658094.getClass(), "display", term5658100);
        setIntField(term5658094, term5658094.getClass(), "x", -1428063820);
        setIntField(term5658094, term5658094.getClass(), "y", -1271375703);
        setBooleanField(term5658094, term5658094.getClass(), "fade", false);
        setDoubleField(term5658094, term5658094.getClass(), "fadeSpeed", 0.6782349539183316);
        setElement(term5658146, 0, term5658147);
        setElement(term5658146, 1, term5658148);
        setBooleanElement(term5658149, 0, true);
        setBooleanElement(term5658149, 1, true);
        setBooleanElement(term5658149, 3, true);
        setBooleanElement(term5658149, 7, true);
        setElement(term5658146, 2, term5658149);
        setBooleanElement(term5658158, 0, true);
        setBooleanElement(term5658158, 1, true);
        setElement(term5658146, 3, term5658158);
        setBooleanElement(term5658162, 0, true);
        setBooleanElement(term5658162, 2, true);
        setElement(term5658146, 4, term5658162);
        setElement(term5658146, 5, term5658169);
        setElement(term5658146, 6, term5658171);
        setBooleanElement(term5658172, 1, true);
        setBooleanElement(term5658172, 3, true);
        setBooleanElement(term5658172, 4, true);
        setBooleanElement(term5658172, 5, true);
        setBooleanElement(term5658172, 6, true);
        setBooleanElement(term5658172, 7, true);
        setBooleanElement(term5658172, 8, true);
        setElement(term5658146, 7, term5658172);
        setField(term5658094, term5658094.getClass(), "spriteViewer", term5658146);
        setIntField(term5658094, term5658094.getClass(), "spriteHeight", 1136208236);
        setBooleanField(term5658094, term5658094.getClass(), "resolutionMode", false);
        setIntField(term5658094, term5658094.getClass(), "currentPlane", -1220630391);
        setBooleanField(term5658094, term5658094.getClass(), "xoMode", true);
        term5658186 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.HashMap");
        Object[] args = new Object[1];
        args[0] = term5658186;
        callMethod(klass, "setFadeMap", argTypes, term5658094, args);
    }

};


