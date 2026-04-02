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

public class PixelManager_clearSprite_16342601075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653023;

    public PixelManager_clearSprite_16342601075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5653024 = new HashMap();
        term5653023 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5653029 = (Object[]) newArray("[[Z", 2);
        Object[] term5653030 = (Object[]) newArray("[Z", 3);
        boolean[] term5653031 = (boolean[]) newBooleanArray(2);
        boolean[] term5653034 = (boolean[]) newBooleanArray(6);
        boolean[] term5653041 = (boolean[]) newBooleanArray(5);
        Object[] term5653047 = (Object[]) newArray("[Z", 6);
        boolean[] term5653048 = (boolean[]) newBooleanArray(4);
        boolean[] term5653053 = (boolean[]) newBooleanArray(1);
        boolean[] term5653055 = (boolean[]) newBooleanArray(7);
        boolean[] term5653063 = (boolean[]) newBooleanArray(1);
        boolean[] term5653065 = (boolean[]) newBooleanArray(3);
        boolean[] term5653069 = (boolean[]) newBooleanArray(7);
        Object[] term5653081 = (Object[]) newArray("[Z", 7);
        boolean[] term5653082 = (boolean[]) newBooleanArray(3);
        boolean[] term5653086 = (boolean[]) newBooleanArray(2);
        boolean[] term5653089 = (boolean[]) newBooleanArray(3);
        boolean[] term5653093 = (boolean[]) newBooleanArray(6);
        boolean[] term5653100 = (boolean[]) newBooleanArray(8);
        boolean[] term5653109 = (boolean[]) newBooleanArray(2);
        boolean[] term5653112 = (boolean[]) newBooleanArray(6);
        setField(term5653023, term5653023.getClass(), "fadeMap", term5653024);
        setBooleanElement(term5653031, 0, true);
        setBooleanElement(term5653031, 1, true);
        setElement(term5653030, 0, term5653031);
        setBooleanElement(term5653034, 0, true);
        setBooleanElement(term5653034, 3, true);
        setElement(term5653030, 1, term5653034);
        setBooleanElement(term5653041, 1, true);
        setBooleanElement(term5653041, 2, true);
        setBooleanElement(term5653041, 4, true);
        setElement(term5653030, 2, term5653041);
        setElement(term5653029, 0, term5653030);
        setBooleanElement(term5653048, 0, true);
        setBooleanElement(term5653048, 2, true);
        setElement(term5653047, 0, term5653048);
        setBooleanElement(term5653053, 0, true);
        setElement(term5653047, 1, term5653053);
        setBooleanElement(term5653055, 1, true);
        setBooleanElement(term5653055, 2, true);
        setBooleanElement(term5653055, 3, true);
        setBooleanElement(term5653055, 6, true);
        setElement(term5653047, 2, term5653055);
        setElement(term5653047, 3, term5653063);
        setBooleanElement(term5653065, 2, true);
        setElement(term5653047, 4, term5653065);
        setBooleanElement(term5653069, 0, true);
        setBooleanElement(term5653069, 1, true);
        setBooleanElement(term5653069, 2, true);
        setBooleanElement(term5653069, 4, true);
        setBooleanElement(term5653069, 5, true);
        setBooleanElement(term5653069, 6, true);
        setElement(term5653047, 5, term5653069);
        setElement(term5653029, 1, term5653047);
        setField(term5653023, term5653023.getClass(), "display", term5653029);
        setIntField(term5653023, term5653023.getClass(), "x", -423900705);
        setIntField(term5653023, term5653023.getClass(), "y", -525570815);
        setBooleanField(term5653023, term5653023.getClass(), "fade", true);
        setDoubleField(term5653023, term5653023.getClass(), "fadeSpeed", 0.9172358414700745);
        setBooleanElement(term5653082, 1, true);
        setBooleanElement(term5653082, 2, true);
        setElement(term5653081, 0, term5653082);
        setBooleanElement(term5653086, 0, true);
        setBooleanElement(term5653086, 1, true);
        setElement(term5653081, 1, term5653086);
        setBooleanElement(term5653089, 0, true);
        setElement(term5653081, 2, term5653089);
        setBooleanElement(term5653093, 0, true);
        setBooleanElement(term5653093, 3, true);
        setElement(term5653081, 3, term5653093);
        setBooleanElement(term5653100, 1, true);
        setBooleanElement(term5653100, 7, true);
        setElement(term5653081, 4, term5653100);
        setBooleanElement(term5653109, 1, true);
        setElement(term5653081, 5, term5653109);
        setBooleanElement(term5653112, 0, true);
        setBooleanElement(term5653112, 1, true);
        setElement(term5653081, 6, term5653112);
        setField(term5653023, term5653023.getClass(), "spriteViewer", term5653081);
        setIntField(term5653023, term5653023.getClass(), "spriteHeight", 754055848);
        setBooleanField(term5653023, term5653023.getClass(), "resolutionMode", false);
        setIntField(term5653023, term5653023.getClass(), "currentPlane", -19246901);
        setBooleanField(term5653023, term5653023.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearSprite", argTypes, term5653023, args);
    }

};


