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

public class PixelManager_isResolutionMode_105845429624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5657108;

    public PixelManager_isResolutionMode_105845429624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5657109 = new HashMap();
        term5657108 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5657114 = (Object[]) newArray("[[Z", 4);
        Object[] term5657115 = (Object[]) newArray("[Z", 5);
        boolean[] term5657116 = (boolean[]) newBooleanArray(9);
        boolean[] term5657126 = (boolean[]) newBooleanArray(4);
        boolean[] term5657131 = (boolean[]) newBooleanArray(5);
        boolean[] term5657137 = (boolean[]) newBooleanArray(3);
        boolean[] term5657141 = (boolean[]) newBooleanArray(4);
        Object[] term5657146 = (Object[]) newArray("[Z", 0);
        Object[] term5657147 = (Object[]) newArray("[Z", 5);
        boolean[] term5657148 = (boolean[]) newBooleanArray(6);
        boolean[] term5657155 = (boolean[]) newBooleanArray(5);
        boolean[] term5657161 = (boolean[]) newBooleanArray(8);
        boolean[] term5657170 = (boolean[]) newBooleanArray(9);
        boolean[] term5657180 = (boolean[]) newBooleanArray(6);
        Object[] term5657187 = (Object[]) newArray("[Z", 4);
        boolean[] term5657188 = (boolean[]) newBooleanArray(6);
        boolean[] term5657195 = (boolean[]) newBooleanArray(3);
        boolean[] term5657199 = (boolean[]) newBooleanArray(3);
        boolean[] term5657203 = (boolean[]) newBooleanArray(1);
        Object[] term5657209 = (Object[]) newArray("[Z", 1);
        boolean[] term5657210 = (boolean[]) newBooleanArray(3);
        setField(term5657108, term5657108.getClass(), "fadeMap", term5657109);
        setBooleanElement(term5657116, 0, true);
        setBooleanElement(term5657116, 1, true);
        setBooleanElement(term5657116, 3, true);
        setBooleanElement(term5657116, 4, true);
        setBooleanElement(term5657116, 5, true);
        setBooleanElement(term5657116, 6, true);
        setBooleanElement(term5657116, 7, true);
        setBooleanElement(term5657116, 8, true);
        setElement(term5657115, 0, term5657116);
        setBooleanElement(term5657126, 0, true);
        setBooleanElement(term5657126, 1, true);
        setBooleanElement(term5657126, 3, true);
        setElement(term5657115, 1, term5657126);
        setBooleanElement(term5657131, 2, true);
        setBooleanElement(term5657131, 3, true);
        setElement(term5657115, 2, term5657131);
        setBooleanElement(term5657137, 0, true);
        setBooleanElement(term5657137, 2, true);
        setElement(term5657115, 3, term5657137);
        setElement(term5657115, 4, term5657141);
        setElement(term5657114, 0, term5657115);
        setElement(term5657114, 1, term5657146);
        setBooleanElement(term5657148, 1, true);
        setBooleanElement(term5657148, 3, true);
        setElement(term5657147, 0, term5657148);
        setBooleanElement(term5657155, 0, true);
        setBooleanElement(term5657155, 1, true);
        setBooleanElement(term5657155, 2, true);
        setElement(term5657147, 1, term5657155);
        setBooleanElement(term5657161, 2, true);
        setBooleanElement(term5657161, 4, true);
        setBooleanElement(term5657161, 5, true);
        setBooleanElement(term5657161, 7, true);
        setElement(term5657147, 2, term5657161);
        setBooleanElement(term5657170, 3, true);
        setBooleanElement(term5657170, 4, true);
        setBooleanElement(term5657170, 7, true);
        setElement(term5657147, 3, term5657170);
        setBooleanElement(term5657180, 0, true);
        setBooleanElement(term5657180, 1, true);
        setBooleanElement(term5657180, 4, true);
        setElement(term5657147, 4, term5657180);
        setElement(term5657114, 2, term5657147);
        setBooleanElement(term5657188, 0, true);
        setBooleanElement(term5657188, 3, true);
        setElement(term5657187, 0, term5657188);
        setBooleanElement(term5657195, 0, true);
        setBooleanElement(term5657195, 2, true);
        setElement(term5657187, 1, term5657195);
        setBooleanElement(term5657199, 1, true);
        setElement(term5657187, 2, term5657199);
        setBooleanElement(term5657203, 0, true);
        setElement(term5657187, 3, term5657203);
        setElement(term5657114, 3, term5657187);
        setField(term5657108, term5657108.getClass(), "display", term5657114);
        setIntField(term5657108, term5657108.getClass(), "x", 1716165145);
        setIntField(term5657108, term5657108.getClass(), "y", 1692937831);
        setBooleanField(term5657108, term5657108.getClass(), "fade", false);
        setDoubleField(term5657108, term5657108.getClass(), "fadeSpeed", 0.8303221706066055);
        setBooleanElement(term5657210, 0, true);
        setElement(term5657209, 0, term5657210);
        setField(term5657108, term5657108.getClass(), "spriteViewer", term5657209);
        setIntField(term5657108, term5657108.getClass(), "spriteHeight", -1539747985);
        setBooleanField(term5657108, term5657108.getClass(), "resolutionMode", false);
        setIntField(term5657108, term5657108.getClass(), "currentPlane", -1982489643);
        setBooleanField(term5657108, term5657108.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isResolutionMode", argTypes, term5657108, args);
    }

};


