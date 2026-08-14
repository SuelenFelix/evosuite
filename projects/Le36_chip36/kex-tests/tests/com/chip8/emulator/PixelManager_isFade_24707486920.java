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

public class PixelManager_isFade_24707486920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5656110;

    public PixelManager_isFade_24707486920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5656111 = new HashMap();
        term5656110 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5656116 = (Object[]) newArray("[[Z", 0);
        Object[] term5656121 = (Object[]) newArray("[Z", 5);
        boolean[] term5656122 = (boolean[]) newBooleanArray(0);
        boolean[] term5656123 = (boolean[]) newBooleanArray(3);
        boolean[] term5656127 = (boolean[]) newBooleanArray(2);
        boolean[] term5656130 = (boolean[]) newBooleanArray(8);
        boolean[] term5656139 = (boolean[]) newBooleanArray(5);
        setField(term5656110, term5656110.getClass(), "fadeMap", term5656111);
        setField(term5656110, term5656110.getClass(), "display", term5656116);
        setIntField(term5656110, term5656110.getClass(), "x", 330043745);
        setIntField(term5656110, term5656110.getClass(), "y", -509349195);
        setBooleanField(term5656110, term5656110.getClass(), "fade", true);
        setDoubleField(term5656110, term5656110.getClass(), "fadeSpeed", 0.4614378239284842);
        setElement(term5656121, 0, term5656122);
        setElement(term5656121, 1, term5656123);
        setBooleanElement(term5656127, 0, true);
        setBooleanElement(term5656127, 1, true);
        setElement(term5656121, 2, term5656127);
        setBooleanElement(term5656130, 0, true);
        setBooleanElement(term5656130, 1, true);
        setBooleanElement(term5656130, 2, true);
        setElement(term5656121, 3, term5656130);
        setBooleanElement(term5656139, 0, true);
        setBooleanElement(term5656139, 1, true);
        setBooleanElement(term5656139, 2, true);
        setBooleanElement(term5656139, 3, true);
        setBooleanElement(term5656139, 4, true);
        setElement(term5656121, 4, term5656139);
        setField(term5656110, term5656110.getClass(), "spriteViewer", term5656121);
        setIntField(term5656110, term5656110.getClass(), "spriteHeight", -1639041228);
        setBooleanField(term5656110, term5656110.getClass(), "resolutionMode", true);
        setIntField(term5656110, term5656110.getClass(), "currentPlane", 2027686272);
        setBooleanField(term5656110, term5656110.getClass(), "xoMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFade", argTypes, term5656110, args);
    }

};


