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
import java.lang.Boolean;

public class PixelManager_setResolutionMode_166178645435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5660952;
     Object term5661028;

    public PixelManager_setResolutionMode_166178645435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5660953 = new HashMap();
        term5660952 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5660958 = (Object[]) newArray("[[Z", 3);
        Object[] term5660959 = (Object[]) newArray("[Z", 0);
        Object[] term5660960 = (Object[]) newArray("[Z", 1);
        boolean[] term5660961 = (boolean[]) newBooleanArray(4);
        Object[] term5660966 = (Object[]) newArray("[Z", 5);
        boolean[] term5660967 = (boolean[]) newBooleanArray(0);
        boolean[] term5660968 = (boolean[]) newBooleanArray(2);
        boolean[] term5660971 = (boolean[]) newBooleanArray(8);
        boolean[] term5660980 = (boolean[]) newBooleanArray(8);
        boolean[] term5660989 = (boolean[]) newBooleanArray(5);
        Object[] term5660999 = (Object[]) newArray("[Z", 7);
        boolean[] term5661000 = (boolean[]) newBooleanArray(3);
        boolean[] term5661004 = (boolean[]) newBooleanArray(5);
        boolean[] term5661010 = (boolean[]) newBooleanArray(2);
        boolean[] term5661013 = (boolean[]) newBooleanArray(6);
        boolean[] term5661020 = (boolean[]) newBooleanArray(0);
        boolean[] term5661021 = (boolean[]) newBooleanArray(0);
        boolean[] term5661022 = (boolean[]) newBooleanArray(1);
        setField(term5660952, term5660952.getClass(), "fadeMap", term5660953);
        setElement(term5660958, 0, term5660959);
        setBooleanElement(term5660961, 1, true);
        setBooleanElement(term5660961, 2, true);
        setBooleanElement(term5660961, 3, true);
        setElement(term5660960, 0, term5660961);
        setElement(term5660958, 1, term5660960);
        setElement(term5660966, 0, term5660967);
        setBooleanElement(term5660968, 1, true);
        setElement(term5660966, 1, term5660968);
        setBooleanElement(term5660971, 2, true);
        setBooleanElement(term5660971, 5, true);
        setBooleanElement(term5660971, 6, true);
        setElement(term5660966, 2, term5660971);
        setBooleanElement(term5660980, 0, true);
        setBooleanElement(term5660980, 3, true);
        setBooleanElement(term5660980, 4, true);
        setBooleanElement(term5660980, 6, true);
        setBooleanElement(term5660980, 7, true);
        setElement(term5660966, 3, term5660980);
        setBooleanElement(term5660989, 0, true);
        setBooleanElement(term5660989, 1, true);
        setBooleanElement(term5660989, 3, true);
        setBooleanElement(term5660989, 4, true);
        setElement(term5660966, 4, term5660989);
        setElement(term5660958, 2, term5660966);
        setField(term5660952, term5660952.getClass(), "display", term5660958);
        setIntField(term5660952, term5660952.getClass(), "x", -1972033388);
        setIntField(term5660952, term5660952.getClass(), "y", -1005024758);
        setBooleanField(term5660952, term5660952.getClass(), "fade", true);
        setDoubleField(term5660952, term5660952.getClass(), "fadeSpeed", 0.16734523112870836);
        setBooleanElement(term5661000, 2, true);
        setElement(term5660999, 0, term5661000);
        setBooleanElement(term5661004, 0, true);
        setBooleanElement(term5661004, 1, true);
        setBooleanElement(term5661004, 4, true);
        setElement(term5660999, 1, term5661004);
        setBooleanElement(term5661010, 0, true);
        setBooleanElement(term5661010, 1, true);
        setElement(term5660999, 2, term5661010);
        setBooleanElement(term5661013, 1, true);
        setBooleanElement(term5661013, 2, true);
        setBooleanElement(term5661013, 3, true);
        setBooleanElement(term5661013, 4, true);
        setElement(term5660999, 3, term5661013);
        setElement(term5660999, 4, term5661020);
        setElement(term5660999, 5, term5661021);
        setElement(term5660999, 6, term5661022);
        setField(term5660952, term5660952.getClass(), "spriteViewer", term5660999);
        setIntField(term5660952, term5660952.getClass(), "spriteHeight", 2634669);
        setBooleanField(term5660952, term5660952.getClass(), "resolutionMode", false);
        setIntField(term5660952, term5660952.getClass(), "currentPlane", -1912429941);
        setBooleanField(term5660952, term5660952.getClass(), "xoMode", false);
        term5661028 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5661028;
        callMethod(klass, "setResolutionMode", argTypes, term5660952, args);
    }

};


