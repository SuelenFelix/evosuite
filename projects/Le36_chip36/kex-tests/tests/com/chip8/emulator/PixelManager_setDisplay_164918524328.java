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

public class PixelManager_setDisplay_164918524328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5658314;
     Object term5658359;

    public PixelManager_setDisplay_164918524328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5658315 = new HashMap();
        term5658314 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5658320 = (Object[]) newArray("[[Z", 1);
        Object[] term5658321 = (Object[]) newArray("[Z", 5);
        boolean[] term5658322 = (boolean[]) newBooleanArray(2);
        boolean[] term5658325 = (boolean[]) newBooleanArray(0);
        boolean[] term5658326 = (boolean[]) newBooleanArray(9);
        boolean[] term5658336 = (boolean[]) newBooleanArray(5);
        boolean[] term5658342 = (boolean[]) newBooleanArray(7);
        Object[] term5658354 = (Object[]) newArray("[Z", 0);
        setField(term5658314, term5658314.getClass(), "fadeMap", term5658315);
        setBooleanElement(term5658322, 1, true);
        setElement(term5658321, 0, term5658322);
        setElement(term5658321, 1, term5658325);
        setBooleanElement(term5658326, 0, true);
        setBooleanElement(term5658326, 1, true);
        setBooleanElement(term5658326, 3, true);
        setBooleanElement(term5658326, 4, true);
        setBooleanElement(term5658326, 5, true);
        setBooleanElement(term5658326, 7, true);
        setBooleanElement(term5658326, 8, true);
        setElement(term5658321, 2, term5658326);
        setBooleanElement(term5658336, 0, true);
        setBooleanElement(term5658336, 2, true);
        setBooleanElement(term5658336, 3, true);
        setElement(term5658321, 3, term5658336);
        setBooleanElement(term5658342, 1, true);
        setBooleanElement(term5658342, 2, true);
        setBooleanElement(term5658342, 3, true);
        setBooleanElement(term5658342, 4, true);
        setBooleanElement(term5658342, 5, true);
        setElement(term5658321, 4, term5658342);
        setElement(term5658320, 0, term5658321);
        setField(term5658314, term5658314.getClass(), "display", term5658320);
        setIntField(term5658314, term5658314.getClass(), "x", -995822131);
        setIntField(term5658314, term5658314.getClass(), "y", -687282231);
        setBooleanField(term5658314, term5658314.getClass(), "fade", true);
        setDoubleField(term5658314, term5658314.getClass(), "fadeSpeed", 0.6464654528667407);
        setField(term5658314, term5658314.getClass(), "spriteViewer", term5658354);
        setIntField(term5658314, term5658314.getClass(), "spriteHeight", 1200440315);
        setBooleanField(term5658314, term5658314.getClass(), "resolutionMode", true);
        setIntField(term5658314, term5658314.getClass(), "currentPlane", 40571662);
        setBooleanField(term5658314, term5658314.getClass(), "xoMode", true);
        term5658359 = (Object[]) newArray("[[Z", 6);
        Object[] term5658360 = (Object[]) newArray("[Z", 0);
        Object[] term5658361 = (Object[]) newArray("[Z", 1);
        boolean[] term5658362 = (boolean[]) newBooleanArray(7);
        Object[] term5658370 = (Object[]) newArray("[Z", 5);
        boolean[] term5658371 = (boolean[]) newBooleanArray(2);
        boolean[] term5658374 = (boolean[]) newBooleanArray(2);
        boolean[] term5658377 = (boolean[]) newBooleanArray(3);
        boolean[] term5658381 = (boolean[]) newBooleanArray(7);
        boolean[] term5658389 = (boolean[]) newBooleanArray(7);
        Object[] term5658397 = (Object[]) newArray("[Z", 3);
        boolean[] term5658398 = (boolean[]) newBooleanArray(9);
        boolean[] term5658408 = (boolean[]) newBooleanArray(7);
        boolean[] term5658416 = (boolean[]) newBooleanArray(0);
        Object[] term5658417 = (Object[]) newArray("[Z", 4);
        boolean[] term5658418 = (boolean[]) newBooleanArray(2);
        boolean[] term5658421 = (boolean[]) newBooleanArray(0);
        boolean[] term5658422 = (boolean[]) newBooleanArray(2);
        boolean[] term5658425 = (boolean[]) newBooleanArray(7);
        Object[] term5658433 = (Object[]) newArray("[Z", 5);
        boolean[] term5658434 = (boolean[]) newBooleanArray(3);
        boolean[] term5658438 = (boolean[]) newBooleanArray(8);
        boolean[] term5658447 = (boolean[]) newBooleanArray(3);
        boolean[] term5658451 = (boolean[]) newBooleanArray(8);
        boolean[] term5658460 = (boolean[]) newBooleanArray(0);
        setElement(term5658359, 0, term5658360);
        setBooleanElement(term5658362, 1, true);
        setBooleanElement(term5658362, 6, true);
        setElement(term5658361, 0, term5658362);
        setElement(term5658359, 1, term5658361);
        setBooleanElement(term5658371, 0, true);
        setElement(term5658370, 0, term5658371);
        setBooleanElement(term5658374, 1, true);
        setElement(term5658370, 1, term5658374);
        setBooleanElement(term5658377, 0, true);
        setBooleanElement(term5658377, 1, true);
        setBooleanElement(term5658377, 2, true);
        setElement(term5658370, 2, term5658377);
        setBooleanElement(term5658381, 0, true);
        setBooleanElement(term5658381, 1, true);
        setBooleanElement(term5658381, 4, true);
        setBooleanElement(term5658381, 5, true);
        setBooleanElement(term5658381, 6, true);
        setElement(term5658370, 3, term5658381);
        setBooleanElement(term5658389, 0, true);
        setBooleanElement(term5658389, 1, true);
        setBooleanElement(term5658389, 2, true);
        setBooleanElement(term5658389, 3, true);
        setBooleanElement(term5658389, 4, true);
        setBooleanElement(term5658389, 5, true);
        setBooleanElement(term5658389, 6, true);
        setElement(term5658370, 4, term5658389);
        setElement(term5658359, 2, term5658370);
        setBooleanElement(term5658398, 0, true);
        setBooleanElement(term5658398, 1, true);
        setBooleanElement(term5658398, 3, true);
        setElement(term5658397, 0, term5658398);
        setBooleanElement(term5658408, 1, true);
        setBooleanElement(term5658408, 2, true);
        setBooleanElement(term5658408, 4, true);
        setElement(term5658397, 1, term5658408);
        setElement(term5658397, 2, term5658416);
        setElement(term5658359, 3, term5658397);
        setBooleanElement(term5658418, 1, true);
        setElement(term5658417, 0, term5658418);
        setElement(term5658417, 1, term5658421);
        setBooleanElement(term5658422, 1, true);
        setElement(term5658417, 2, term5658422);
        setBooleanElement(term5658425, 1, true);
        setBooleanElement(term5658425, 2, true);
        setBooleanElement(term5658425, 6, true);
        setElement(term5658417, 3, term5658425);
        setElement(term5658359, 4, term5658417);
        setElement(term5658433, 0, term5658434);
        setBooleanElement(term5658438, 2, true);
        setBooleanElement(term5658438, 3, true);
        setBooleanElement(term5658438, 4, true);
        setBooleanElement(term5658438, 6, true);
        setElement(term5658433, 1, term5658438);
        setBooleanElement(term5658447, 0, true);
        setBooleanElement(term5658447, 2, true);
        setElement(term5658433, 2, term5658447);
        setBooleanElement(term5658451, 1, true);
        setBooleanElement(term5658451, 4, true);
        setElement(term5658433, 3, term5658451);
        setElement(term5658433, 4, term5658460);
        setElement(term5658359, 5, term5658433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Array.newInstance(boolean.class, 0).getClass(), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5658359;
        callMethod(klass, "setDisplay", argTypes, term5658314, args);
    }

};


