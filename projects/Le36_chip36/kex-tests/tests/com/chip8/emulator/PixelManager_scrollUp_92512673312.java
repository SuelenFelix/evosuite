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

public class PixelManager_scrollUp_92512673312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5654547;
     Object term5654625;

    public PixelManager_scrollUp_92512673312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5654548 = new HashMap();
        term5654547 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5654553 = (Object[]) newArray("[[Z", 4);
        Object[] term5654554 = (Object[]) newArray("[Z", 3);
        boolean[] term5654555 = (boolean[]) newBooleanArray(0);
        boolean[] term5654556 = (boolean[]) newBooleanArray(0);
        boolean[] term5654557 = (boolean[]) newBooleanArray(1);
        Object[] term5654559 = (Object[]) newArray("[Z", 1);
        boolean[] term5654560 = (boolean[]) newBooleanArray(4);
        Object[] term5654565 = (Object[]) newArray("[Z", 0);
        Object[] term5654566 = (Object[]) newArray("[Z", 1);
        boolean[] term5654567 = (boolean[]) newBooleanArray(6);
        Object[] term5654578 = (Object[]) newArray("[Z", 6);
        boolean[] term5654579 = (boolean[]) newBooleanArray(8);
        boolean[] term5654588 = (boolean[]) newBooleanArray(3);
        boolean[] term5654592 = (boolean[]) newBooleanArray(6);
        boolean[] term5654599 = (boolean[]) newBooleanArray(5);
        boolean[] term5654605 = (boolean[]) newBooleanArray(8);
        boolean[] term5654614 = (boolean[]) newBooleanArray(6);
        setField(term5654547, term5654547.getClass(), "fadeMap", term5654548);
        setElement(term5654554, 0, term5654555);
        setElement(term5654554, 1, term5654556);
        setBooleanElement(term5654557, 0, true);
        setElement(term5654554, 2, term5654557);
        setElement(term5654553, 0, term5654554);
        setBooleanElement(term5654560, 0, true);
        setBooleanElement(term5654560, 1, true);
        setBooleanElement(term5654560, 2, true);
        setBooleanElement(term5654560, 3, true);
        setElement(term5654559, 0, term5654560);
        setElement(term5654553, 1, term5654559);
        setElement(term5654553, 2, term5654565);
        setBooleanElement(term5654567, 0, true);
        setBooleanElement(term5654567, 4, true);
        setBooleanElement(term5654567, 5, true);
        setElement(term5654566, 0, term5654567);
        setElement(term5654553, 3, term5654566);
        setField(term5654547, term5654547.getClass(), "display", term5654553);
        setIntField(term5654547, term5654547.getClass(), "x", -1549607466);
        setIntField(term5654547, term5654547.getClass(), "y", 853609788);
        setBooleanField(term5654547, term5654547.getClass(), "fade", false);
        setDoubleField(term5654547, term5654547.getClass(), "fadeSpeed", 0.07298304401683597);
        setBooleanElement(term5654579, 0, true);
        setBooleanElement(term5654579, 1, true);
        setBooleanElement(term5654579, 7, true);
        setElement(term5654578, 0, term5654579);
        setBooleanElement(term5654588, 2, true);
        setElement(term5654578, 1, term5654588);
        setBooleanElement(term5654592, 0, true);
        setBooleanElement(term5654592, 1, true);
        setBooleanElement(term5654592, 2, true);
        setBooleanElement(term5654592, 3, true);
        setBooleanElement(term5654592, 4, true);
        setBooleanElement(term5654592, 5, true);
        setElement(term5654578, 2, term5654592);
        setBooleanElement(term5654599, 2, true);
        setBooleanElement(term5654599, 4, true);
        setElement(term5654578, 3, term5654599);
        setBooleanElement(term5654605, 0, true);
        setBooleanElement(term5654605, 2, true);
        setBooleanElement(term5654605, 3, true);
        setBooleanElement(term5654605, 7, true);
        setElement(term5654578, 4, term5654605);
        setBooleanElement(term5654614, 3, true);
        setBooleanElement(term5654614, 4, true);
        setElement(term5654578, 5, term5654614);
        setField(term5654547, term5654547.getClass(), "spriteViewer", term5654578);
        setIntField(term5654547, term5654547.getClass(), "spriteHeight", -197820800);
        setBooleanField(term5654547, term5654547.getClass(), "resolutionMode", true);
        setIntField(term5654547, term5654547.getClass(), "currentPlane", 723812297);
        setBooleanField(term5654547, term5654547.getClass(), "xoMode", true);
        term5654625 = new Integer(1639448749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5654625;
        callMethod(klass, "scrollUp", argTypes, term5654547, args);
    }

};


