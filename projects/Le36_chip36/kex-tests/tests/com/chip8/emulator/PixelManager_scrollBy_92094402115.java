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

public class PixelManager_scrollBy_92094402115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5655285;
     Object term5655337;

    public PixelManager_scrollBy_92094402115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5655286 = new HashMap();
        term5655285 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5655291 = (Object[]) newArray("[[Z", 2);
        Object[] term5655292 = (Object[]) newArray("[Z", 4);
        boolean[] term5655293 = (boolean[]) newBooleanArray(3);
        boolean[] term5655297 = (boolean[]) newBooleanArray(4);
        boolean[] term5655302 = (boolean[]) newBooleanArray(1);
        boolean[] term5655304 = (boolean[]) newBooleanArray(3);
        Object[] term5655308 = (Object[]) newArray("[Z", 1);
        boolean[] term5655309 = (boolean[]) newBooleanArray(2);
        Object[] term5655316 = (Object[]) newArray("[Z", 4);
        boolean[] term5655317 = (boolean[]) newBooleanArray(3);
        boolean[] term5655321 = (boolean[]) newBooleanArray(0);
        boolean[] term5655322 = (boolean[]) newBooleanArray(3);
        boolean[] term5655326 = (boolean[]) newBooleanArray(6);
        setField(term5655285, term5655285.getClass(), "fadeMap", term5655286);
        setBooleanElement(term5655293, 2, true);
        setElement(term5655292, 0, term5655293);
        setBooleanElement(term5655297, 2, true);
        setBooleanElement(term5655297, 3, true);
        setElement(term5655292, 1, term5655297);
        setBooleanElement(term5655302, 0, true);
        setElement(term5655292, 2, term5655302);
        setBooleanElement(term5655304, 1, true);
        setBooleanElement(term5655304, 2, true);
        setElement(term5655292, 3, term5655304);
        setElement(term5655291, 0, term5655292);
        setElement(term5655308, 0, term5655309);
        setElement(term5655291, 1, term5655308);
        setField(term5655285, term5655285.getClass(), "display", term5655291);
        setIntField(term5655285, term5655285.getClass(), "x", 1351900243);
        setIntField(term5655285, term5655285.getClass(), "y", -330897705);
        setBooleanField(term5655285, term5655285.getClass(), "fade", true);
        setDoubleField(term5655285, term5655285.getClass(), "fadeSpeed", 0.4335752168808029);
        setBooleanElement(term5655317, 0, true);
        setBooleanElement(term5655317, 1, true);
        setBooleanElement(term5655317, 2, true);
        setElement(term5655316, 0, term5655317);
        setElement(term5655316, 1, term5655321);
        setBooleanElement(term5655322, 2, true);
        setElement(term5655316, 2, term5655322);
        setBooleanElement(term5655326, 1, true);
        setBooleanElement(term5655326, 2, true);
        setBooleanElement(term5655326, 5, true);
        setElement(term5655316, 3, term5655326);
        setField(term5655285, term5655285.getClass(), "spriteViewer", term5655316);
        setIntField(term5655285, term5655285.getClass(), "spriteHeight", 1065595802);
        setBooleanField(term5655285, term5655285.getClass(), "resolutionMode", false);
        setIntField(term5655285, term5655285.getClass(), "currentPlane", 21031843);
        setBooleanField(term5655285, term5655285.getClass(), "xoMode", true);
        term5655337 = new Integer(-380787857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5655337;
        callMethod(klass, "scrollBy", argTypes, term5655285, args);
    }

};


