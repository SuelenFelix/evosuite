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

public class PixelManager_equals_150643986938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5661830;
     Object term5662004;

    public PixelManager_equals_150643986938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5661831 = new HashMap();
        term5661830 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5661836 = (Object[]) newArray("[[Z", 2);
        Object[] term5661837 = (Object[]) newArray("[Z", 8);
        boolean[] term5661838 = (boolean[]) newBooleanArray(7);
        boolean[] term5661846 = (boolean[]) newBooleanArray(3);
        boolean[] term5661850 = (boolean[]) newBooleanArray(1);
        boolean[] term5661852 = (boolean[]) newBooleanArray(9);
        boolean[] term5661862 = (boolean[]) newBooleanArray(6);
        boolean[] term5661869 = (boolean[]) newBooleanArray(9);
        boolean[] term5661879 = (boolean[]) newBooleanArray(3);
        boolean[] term5661883 = (boolean[]) newBooleanArray(8);
        Object[] term5661892 = (Object[]) newArray("[Z", 8);
        boolean[] term5661893 = (boolean[]) newBooleanArray(9);
        boolean[] term5661903 = (boolean[]) newBooleanArray(0);
        boolean[] term5661904 = (boolean[]) newBooleanArray(3);
        boolean[] term5661908 = (boolean[]) newBooleanArray(3);
        boolean[] term5661912 = (boolean[]) newBooleanArray(6);
        boolean[] term5661919 = (boolean[]) newBooleanArray(4);
        boolean[] term5661924 = (boolean[]) newBooleanArray(7);
        boolean[] term5661932 = (boolean[]) newBooleanArray(9);
        Object[] term5661946 = (Object[]) newArray("[Z", 7);
        boolean[] term5661947 = (boolean[]) newBooleanArray(9);
        boolean[] term5661957 = (boolean[]) newBooleanArray(8);
        boolean[] term5661966 = (boolean[]) newBooleanArray(8);
        boolean[] term5661975 = (boolean[]) newBooleanArray(3);
        boolean[] term5661979 = (boolean[]) newBooleanArray(9);
        boolean[] term5661989 = (boolean[]) newBooleanArray(6);
        boolean[] term5661996 = (boolean[]) newBooleanArray(3);
        setField(term5661830, term5661830.getClass(), "fadeMap", term5661831);
        setBooleanElement(term5661838, 1, true);
        setBooleanElement(term5661838, 6, true);
        setElement(term5661837, 0, term5661838);
        setBooleanElement(term5661846, 0, true);
        setBooleanElement(term5661846, 1, true);
        setElement(term5661837, 1, term5661846);
        setElement(term5661837, 2, term5661850);
        setBooleanElement(term5661852, 0, true);
        setBooleanElement(term5661852, 1, true);
        setBooleanElement(term5661852, 3, true);
        setBooleanElement(term5661852, 7, true);
        setElement(term5661837, 3, term5661852);
        setBooleanElement(term5661862, 0, true);
        setBooleanElement(term5661862, 3, true);
        setBooleanElement(term5661862, 4, true);
        setBooleanElement(term5661862, 5, true);
        setElement(term5661837, 4, term5661862);
        setBooleanElement(term5661869, 1, true);
        setBooleanElement(term5661869, 2, true);
        setBooleanElement(term5661869, 3, true);
        setBooleanElement(term5661869, 4, true);
        setBooleanElement(term5661869, 5, true);
        setElement(term5661837, 5, term5661869);
        setBooleanElement(term5661879, 0, true);
        setBooleanElement(term5661879, 2, true);
        setElement(term5661837, 6, term5661879);
        setBooleanElement(term5661883, 1, true);
        setBooleanElement(term5661883, 3, true);
        setBooleanElement(term5661883, 4, true);
        setBooleanElement(term5661883, 7, true);
        setElement(term5661837, 7, term5661883);
        setElement(term5661836, 0, term5661837);
        setBooleanElement(term5661893, 1, true);
        setBooleanElement(term5661893, 4, true);
        setBooleanElement(term5661893, 5, true);
        setBooleanElement(term5661893, 7, true);
        setElement(term5661892, 0, term5661893);
        setElement(term5661892, 1, term5661903);
        setBooleanElement(term5661904, 1, true);
        setBooleanElement(term5661904, 2, true);
        setElement(term5661892, 2, term5661904);
        setBooleanElement(term5661908, 0, true);
        setBooleanElement(term5661908, 2, true);
        setElement(term5661892, 3, term5661908);
        setBooleanElement(term5661912, 3, true);
        setBooleanElement(term5661912, 4, true);
        setBooleanElement(term5661912, 5, true);
        setElement(term5661892, 4, term5661912);
        setBooleanElement(term5661919, 0, true);
        setBooleanElement(term5661919, 1, true);
        setBooleanElement(term5661919, 2, true);
        setElement(term5661892, 5, term5661919);
        setBooleanElement(term5661924, 3, true);
        setBooleanElement(term5661924, 6, true);
        setElement(term5661892, 6, term5661924);
        setBooleanElement(term5661932, 0, true);
        setBooleanElement(term5661932, 5, true);
        setBooleanElement(term5661932, 6, true);
        setBooleanElement(term5661932, 8, true);
        setElement(term5661892, 7, term5661932);
        setElement(term5661836, 1, term5661892);
        setField(term5661830, term5661830.getClass(), "display", term5661836);
        setIntField(term5661830, term5661830.getClass(), "x", 1131398807);
        setIntField(term5661830, term5661830.getClass(), "y", -344907703);
        setBooleanField(term5661830, term5661830.getClass(), "fade", false);
        setDoubleField(term5661830, term5661830.getClass(), "fadeSpeed", 0.8664463700873805);
        setBooleanElement(term5661947, 0, true);
        setBooleanElement(term5661947, 1, true);
        setBooleanElement(term5661947, 2, true);
        setBooleanElement(term5661947, 5, true);
        setBooleanElement(term5661947, 7, true);
        setElement(term5661946, 0, term5661947);
        setBooleanElement(term5661957, 1, true);
        setBooleanElement(term5661957, 4, true);
        setBooleanElement(term5661957, 7, true);
        setElement(term5661946, 1, term5661957);
        setBooleanElement(term5661966, 0, true);
        setBooleanElement(term5661966, 1, true);
        setBooleanElement(term5661966, 5, true);
        setBooleanElement(term5661966, 6, true);
        setBooleanElement(term5661966, 7, true);
        setElement(term5661946, 2, term5661966);
        setBooleanElement(term5661975, 0, true);
        setElement(term5661946, 3, term5661975);
        setBooleanElement(term5661979, 0, true);
        setBooleanElement(term5661979, 2, true);
        setBooleanElement(term5661979, 3, true);
        setBooleanElement(term5661979, 4, true);
        setBooleanElement(term5661979, 5, true);
        setBooleanElement(term5661979, 6, true);
        setBooleanElement(term5661979, 8, true);
        setElement(term5661946, 4, term5661979);
        setBooleanElement(term5661989, 0, true);
        setBooleanElement(term5661989, 3, true);
        setElement(term5661946, 5, term5661989);
        setBooleanElement(term5661996, 0, true);
        setElement(term5661946, 6, term5661996);
        setField(term5661830, term5661830.getClass(), "spriteViewer", term5661946);
        setIntField(term5661830, term5661830.getClass(), "spriteHeight", 824341437);
        setBooleanField(term5661830, term5661830.getClass(), "resolutionMode", false);
        setIntField(term5661830, term5661830.getClass(), "currentPlane", -1794965320);
        setBooleanField(term5661830, term5661830.getClass(), "xoMode", false);
        term5662004 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5662004;
        callMethod(klass, "equals", argTypes, term5661830, args);
    }

};


