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

public class PixelManager_getPixel_13351390736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653189;
     Object term5653364;
     Object term5653366;
     Object term5653368;

    public PixelManager_getPixel_13351390736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5653190 = new HashMap();
        term5653189 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5653195 = (Object[]) newArray("[[Z", 5);
        Object[] term5653196 = (Object[]) newArray("[Z", 5);
        boolean[] term5653197 = (boolean[]) newBooleanArray(2);
        boolean[] term5653200 = (boolean[]) newBooleanArray(1);
        boolean[] term5653202 = (boolean[]) newBooleanArray(0);
        boolean[] term5653203 = (boolean[]) newBooleanArray(4);
        boolean[] term5653208 = (boolean[]) newBooleanArray(2);
        Object[] term5653211 = (Object[]) newArray("[Z", 7);
        boolean[] term5653212 = (boolean[]) newBooleanArray(1);
        boolean[] term5653214 = (boolean[]) newBooleanArray(6);
        boolean[] term5653221 = (boolean[]) newBooleanArray(7);
        boolean[] term5653229 = (boolean[]) newBooleanArray(8);
        boolean[] term5653238 = (boolean[]) newBooleanArray(9);
        boolean[] term5653248 = (boolean[]) newBooleanArray(0);
        boolean[] term5653249 = (boolean[]) newBooleanArray(3);
        Object[] term5653253 = (Object[]) newArray("[Z", 1);
        boolean[] term5653254 = (boolean[]) newBooleanArray(6);
        Object[] term5653261 = (Object[]) newArray("[Z", 6);
        boolean[] term5653262 = (boolean[]) newBooleanArray(7);
        boolean[] term5653270 = (boolean[]) newBooleanArray(7);
        boolean[] term5653278 = (boolean[]) newBooleanArray(9);
        boolean[] term5653288 = (boolean[]) newBooleanArray(4);
        boolean[] term5653293 = (boolean[]) newBooleanArray(1);
        boolean[] term5653295 = (boolean[]) newBooleanArray(2);
        Object[] term5653298 = (Object[]) newArray("[Z", 2);
        boolean[] term5653299 = (boolean[]) newBooleanArray(8);
        boolean[] term5653308 = (boolean[]) newBooleanArray(2);
        Object[] term5653315 = (Object[]) newArray("[Z", 6);
        boolean[] term5653316 = (boolean[]) newBooleanArray(6);
        boolean[] term5653323 = (boolean[]) newBooleanArray(8);
        boolean[] term5653332 = (boolean[]) newBooleanArray(9);
        boolean[] term5653342 = (boolean[]) newBooleanArray(4);
        boolean[] term5653347 = (boolean[]) newBooleanArray(3);
        boolean[] term5653351 = (boolean[]) newBooleanArray(8);
        setField(term5653189, term5653189.getClass(), "fadeMap", term5653190);
        setBooleanElement(term5653197, 1, true);
        setElement(term5653196, 0, term5653197);
        setBooleanElement(term5653200, 0, true);
        setElement(term5653196, 1, term5653200);
        setElement(term5653196, 2, term5653202);
        setBooleanElement(term5653203, 0, true);
        setBooleanElement(term5653203, 2, true);
        setElement(term5653196, 3, term5653203);
        setBooleanElement(term5653208, 0, true);
        setBooleanElement(term5653208, 1, true);
        setElement(term5653196, 4, term5653208);
        setElement(term5653195, 0, term5653196);
        setBooleanElement(term5653212, 0, true);
        setElement(term5653211, 0, term5653212);
        setBooleanElement(term5653214, 1, true);
        setBooleanElement(term5653214, 2, true);
        setBooleanElement(term5653214, 3, true);
        setBooleanElement(term5653214, 5, true);
        setElement(term5653211, 1, term5653214);
        setBooleanElement(term5653221, 2, true);
        setBooleanElement(term5653221, 3, true);
        setBooleanElement(term5653221, 4, true);
        setBooleanElement(term5653221, 6, true);
        setElement(term5653211, 2, term5653221);
        setBooleanElement(term5653229, 0, true);
        setBooleanElement(term5653229, 1, true);
        setBooleanElement(term5653229, 3, true);
        setBooleanElement(term5653229, 6, true);
        setElement(term5653211, 3, term5653229);
        setBooleanElement(term5653238, 0, true);
        setBooleanElement(term5653238, 1, true);
        setBooleanElement(term5653238, 3, true);
        setBooleanElement(term5653238, 4, true);
        setBooleanElement(term5653238, 5, true);
        setBooleanElement(term5653238, 8, true);
        setElement(term5653211, 4, term5653238);
        setElement(term5653211, 5, term5653248);
        setBooleanElement(term5653249, 0, true);
        setElement(term5653211, 6, term5653249);
        setElement(term5653195, 1, term5653211);
        setBooleanElement(term5653254, 2, true);
        setBooleanElement(term5653254, 3, true);
        setElement(term5653253, 0, term5653254);
        setElement(term5653195, 2, term5653253);
        setBooleanElement(term5653262, 3, true);
        setBooleanElement(term5653262, 5, true);
        setBooleanElement(term5653262, 6, true);
        setElement(term5653261, 0, term5653262);
        setBooleanElement(term5653270, 0, true);
        setBooleanElement(term5653270, 2, true);
        setBooleanElement(term5653270, 5, true);
        setBooleanElement(term5653270, 6, true);
        setElement(term5653261, 1, term5653270);
        setBooleanElement(term5653278, 0, true);
        setBooleanElement(term5653278, 2, true);
        setBooleanElement(term5653278, 3, true);
        setBooleanElement(term5653278, 4, true);
        setBooleanElement(term5653278, 5, true);
        setBooleanElement(term5653278, 6, true);
        setBooleanElement(term5653278, 7, true);
        setBooleanElement(term5653278, 8, true);
        setElement(term5653261, 2, term5653278);
        setBooleanElement(term5653288, 0, true);
        setBooleanElement(term5653288, 1, true);
        setBooleanElement(term5653288, 2, true);
        setBooleanElement(term5653288, 3, true);
        setElement(term5653261, 3, term5653288);
        setBooleanElement(term5653293, 0, true);
        setElement(term5653261, 4, term5653293);
        setBooleanElement(term5653295, 0, true);
        setElement(term5653261, 5, term5653295);
        setElement(term5653195, 3, term5653261);
        setBooleanElement(term5653299, 0, true);
        setElement(term5653298, 0, term5653299);
        setElement(term5653298, 1, term5653308);
        setElement(term5653195, 4, term5653298);
        setField(term5653189, term5653189.getClass(), "display", term5653195);
        setIntField(term5653189, term5653189.getClass(), "x", -370828664);
        setIntField(term5653189, term5653189.getClass(), "y", 1168633950);
        setBooleanField(term5653189, term5653189.getClass(), "fade", false);
        setDoubleField(term5653189, term5653189.getClass(), "fadeSpeed", 0.3804251745476508);
        setBooleanElement(term5653316, 0, true);
        setBooleanElement(term5653316, 4, true);
        setElement(term5653315, 0, term5653316);
        setBooleanElement(term5653323, 0, true);
        setBooleanElement(term5653323, 1, true);
        setBooleanElement(term5653323, 5, true);
        setBooleanElement(term5653323, 7, true);
        setElement(term5653315, 1, term5653323);
        setBooleanElement(term5653332, 0, true);
        setBooleanElement(term5653332, 1, true);
        setBooleanElement(term5653332, 2, true);
        setBooleanElement(term5653332, 5, true);
        setBooleanElement(term5653332, 8, true);
        setElement(term5653315, 2, term5653332);
        setBooleanElement(term5653342, 0, true);
        setBooleanElement(term5653342, 2, true);
        setBooleanElement(term5653342, 3, true);
        setElement(term5653315, 3, term5653342);
        setBooleanElement(term5653347, 0, true);
        setElement(term5653315, 4, term5653347);
        setBooleanElement(term5653351, 4, true);
        setBooleanElement(term5653351, 6, true);
        setElement(term5653315, 5, term5653351);
        setField(term5653189, term5653189.getClass(), "spriteViewer", term5653315);
        setIntField(term5653189, term5653189.getClass(), "spriteHeight", 1607082164);
        setBooleanField(term5653189, term5653189.getClass(), "resolutionMode", false);
        setIntField(term5653189, term5653189.getClass(), "currentPlane", 1890399366);
        setBooleanField(term5653189, term5653189.getClass(), "xoMode", false);
        term5653364 = new Integer(-1867239125);
        term5653366 = new Integer(952869601);
        term5653368 = new Integer(91958879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5653364;
        args[1] = term5653366;
        args[2] = term5653368;
        callMethod(klass, "getPixel", argTypes, term5653189, args);
    }

};


