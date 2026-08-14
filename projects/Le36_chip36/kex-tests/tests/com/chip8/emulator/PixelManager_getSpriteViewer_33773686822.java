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

public class PixelManager_getSpriteViewer_33773686822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5656722;

    public PixelManager_getSpriteViewer_33773686822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5656723 = new HashMap();
        term5656722 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5656728 = (Object[]) newArray("[[Z", 2);
        Object[] term5656729 = (Object[]) newArray("[Z", 7);
        boolean[] term5656730 = (boolean[]) newBooleanArray(7);
        boolean[] term5656738 = (boolean[]) newBooleanArray(8);
        boolean[] term5656747 = (boolean[]) newBooleanArray(3);
        boolean[] term5656751 = (boolean[]) newBooleanArray(1);
        boolean[] term5656753 = (boolean[]) newBooleanArray(5);
        boolean[] term5656759 = (boolean[]) newBooleanArray(2);
        boolean[] term5656762 = (boolean[]) newBooleanArray(5);
        Object[] term5656768 = (Object[]) newArray("[Z", 9);
        boolean[] term5656769 = (boolean[]) newBooleanArray(1);
        boolean[] term5656771 = (boolean[]) newBooleanArray(8);
        boolean[] term5656780 = (boolean[]) newBooleanArray(0);
        boolean[] term5656781 = (boolean[]) newBooleanArray(5);
        boolean[] term5656787 = (boolean[]) newBooleanArray(9);
        boolean[] term5656797 = (boolean[]) newBooleanArray(0);
        boolean[] term5656798 = (boolean[]) newBooleanArray(6);
        boolean[] term5656805 = (boolean[]) newBooleanArray(5);
        boolean[] term5656811 = (boolean[]) newBooleanArray(5);
        Object[] term5656821 = (Object[]) newArray("[Z", 2);
        boolean[] term5656822 = (boolean[]) newBooleanArray(5);
        boolean[] term5656828 = (boolean[]) newBooleanArray(2);
        setField(term5656722, term5656722.getClass(), "fadeMap", term5656723);
        setBooleanElement(term5656730, 1, true);
        setBooleanElement(term5656730, 2, true);
        setBooleanElement(term5656730, 5, true);
        setElement(term5656729, 0, term5656730);
        setBooleanElement(term5656738, 1, true);
        setBooleanElement(term5656738, 5, true);
        setBooleanElement(term5656738, 6, true);
        setBooleanElement(term5656738, 7, true);
        setElement(term5656729, 1, term5656738);
        setBooleanElement(term5656747, 1, true);
        setElement(term5656729, 2, term5656747);
        setBooleanElement(term5656751, 0, true);
        setElement(term5656729, 3, term5656751);
        setBooleanElement(term5656753, 1, true);
        setBooleanElement(term5656753, 2, true);
        setBooleanElement(term5656753, 4, true);
        setElement(term5656729, 4, term5656753);
        setElement(term5656729, 5, term5656759);
        setBooleanElement(term5656762, 0, true);
        setBooleanElement(term5656762, 1, true);
        setBooleanElement(term5656762, 4, true);
        setElement(term5656729, 6, term5656762);
        setElement(term5656728, 0, term5656729);
        setBooleanElement(term5656769, 0, true);
        setElement(term5656768, 0, term5656769);
        setBooleanElement(term5656771, 4, true);
        setBooleanElement(term5656771, 6, true);
        setBooleanElement(term5656771, 7, true);
        setElement(term5656768, 1, term5656771);
        setElement(term5656768, 2, term5656780);
        setBooleanElement(term5656781, 2, true);
        setElement(term5656768, 3, term5656781);
        setBooleanElement(term5656787, 0, true);
        setBooleanElement(term5656787, 1, true);
        setBooleanElement(term5656787, 2, true);
        setBooleanElement(term5656787, 3, true);
        setBooleanElement(term5656787, 5, true);
        setBooleanElement(term5656787, 6, true);
        setElement(term5656768, 4, term5656787);
        setElement(term5656768, 5, term5656797);
        setBooleanElement(term5656798, 0, true);
        setBooleanElement(term5656798, 1, true);
        setBooleanElement(term5656798, 3, true);
        setElement(term5656768, 6, term5656798);
        setBooleanElement(term5656805, 0, true);
        setBooleanElement(term5656805, 1, true);
        setBooleanElement(term5656805, 2, true);
        setBooleanElement(term5656805, 4, true);
        setElement(term5656768, 7, term5656805);
        setBooleanElement(term5656811, 0, true);
        setBooleanElement(term5656811, 1, true);
        setBooleanElement(term5656811, 2, true);
        setBooleanElement(term5656811, 3, true);
        setElement(term5656768, 8, term5656811);
        setElement(term5656728, 1, term5656768);
        setField(term5656722, term5656722.getClass(), "display", term5656728);
        setIntField(term5656722, term5656722.getClass(), "x", 633598642);
        setIntField(term5656722, term5656722.getClass(), "y", 1862841859);
        setBooleanField(term5656722, term5656722.getClass(), "fade", false);
        setDoubleField(term5656722, term5656722.getClass(), "fadeSpeed", 0.34234234602085223);
        setBooleanElement(term5656822, 2, true);
        setBooleanElement(term5656822, 4, true);
        setElement(term5656821, 0, term5656822);
        setElement(term5656821, 1, term5656828);
        setField(term5656722, term5656722.getClass(), "spriteViewer", term5656821);
        setIntField(term5656722, term5656722.getClass(), "spriteHeight", -1114668574);
        setBooleanField(term5656722, term5656722.getClass(), "resolutionMode", false);
        setIntField(term5656722, term5656722.getClass(), "currentPlane", 514511037);
        setBooleanField(term5656722, term5656722.getClass(), "xoMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpriteViewer", argTypes, term5656722, args);
    }

};


