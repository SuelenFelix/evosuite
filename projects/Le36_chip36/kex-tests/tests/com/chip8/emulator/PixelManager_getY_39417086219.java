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

public class PixelManager_getY_39417086219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5655971;

    public PixelManager_getY_39417086219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5655972 = new HashMap();
        term5655971 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5655977 = (Object[]) newArray("[[Z", 3);
        Object[] term5655978 = (Object[]) newArray("[Z", 0);
        Object[] term5655979 = (Object[]) newArray("[Z", 3);
        boolean[] term5655980 = (boolean[]) newBooleanArray(1);
        boolean[] term5655982 = (boolean[]) newBooleanArray(0);
        boolean[] term5655983 = (boolean[]) newBooleanArray(6);
        Object[] term5655990 = (Object[]) newArray("[Z", 7);
        boolean[] term5655991 = (boolean[]) newBooleanArray(3);
        boolean[] term5655995 = (boolean[]) newBooleanArray(3);
        boolean[] term5655999 = (boolean[]) newBooleanArray(6);
        boolean[] term5656006 = (boolean[]) newBooleanArray(1);
        boolean[] term5656008 = (boolean[]) newBooleanArray(9);
        boolean[] term5656018 = (boolean[]) newBooleanArray(0);
        boolean[] term5656019 = (boolean[]) newBooleanArray(8);
        Object[] term5656032 = (Object[]) newArray("[Z", 4);
        boolean[] term5656033 = (boolean[]) newBooleanArray(7);
        boolean[] term5656041 = (boolean[]) newBooleanArray(0);
        boolean[] term5656042 = (boolean[]) newBooleanArray(3);
        boolean[] term5656046 = (boolean[]) newBooleanArray(6);
        setField(term5655971, term5655971.getClass(), "fadeMap", term5655972);
        setElement(term5655977, 0, term5655978);
        setElement(term5655979, 0, term5655980);
        setElement(term5655979, 1, term5655982);
        setBooleanElement(term5655983, 0, true);
        setBooleanElement(term5655983, 2, true);
        setBooleanElement(term5655983, 4, true);
        setElement(term5655979, 2, term5655983);
        setElement(term5655977, 1, term5655979);
        setBooleanElement(term5655991, 0, true);
        setBooleanElement(term5655991, 2, true);
        setElement(term5655990, 0, term5655991);
        setBooleanElement(term5655995, 1, true);
        setBooleanElement(term5655995, 2, true);
        setElement(term5655990, 1, term5655995);
        setBooleanElement(term5655999, 3, true);
        setBooleanElement(term5655999, 4, true);
        setBooleanElement(term5655999, 5, true);
        setElement(term5655990, 2, term5655999);
        setBooleanElement(term5656006, 0, true);
        setElement(term5655990, 3, term5656006);
        setBooleanElement(term5656008, 2, true);
        setBooleanElement(term5656008, 6, true);
        setBooleanElement(term5656008, 8, true);
        setElement(term5655990, 4, term5656008);
        setElement(term5655990, 5, term5656018);
        setBooleanElement(term5656019, 1, true);
        setBooleanElement(term5656019, 3, true);
        setBooleanElement(term5656019, 6, true);
        setElement(term5655990, 6, term5656019);
        setElement(term5655977, 2, term5655990);
        setField(term5655971, term5655971.getClass(), "display", term5655977);
        setIntField(term5655971, term5655971.getClass(), "x", -763799087);
        setIntField(term5655971, term5655971.getClass(), "y", 1207142014);
        setBooleanField(term5655971, term5655971.getClass(), "fade", true);
        setDoubleField(term5655971, term5655971.getClass(), "fadeSpeed", 0.2542403704113868);
        setBooleanElement(term5656033, 1, true);
        setBooleanElement(term5656033, 4, true);
        setElement(term5656032, 0, term5656033);
        setElement(term5656032, 1, term5656041);
        setBooleanElement(term5656042, 2, true);
        setElement(term5656032, 2, term5656042);
        setBooleanElement(term5656046, 1, true);
        setBooleanElement(term5656046, 5, true);
        setElement(term5656032, 3, term5656046);
        setField(term5655971, term5655971.getClass(), "spriteViewer", term5656032);
        setIntField(term5655971, term5655971.getClass(), "spriteHeight", -876426634);
        setBooleanField(term5655971, term5655971.getClass(), "resolutionMode", true);
        setIntField(term5655971, term5655971.getClass(), "currentPlane", 213831054);
        setBooleanField(term5655971, term5655971.getClass(), "xoMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term5655971, args);
    }

};


