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

public class PixelManager_hashCode_105775319440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662463;

    public PixelManager_hashCode_105775319440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5662464 = new HashMap();
        term5662463 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5662469 = (Object[]) newArray("[[Z", 1);
        Object[] term5662470 = (Object[]) newArray("[Z", 2);
        boolean[] term5662471 = (boolean[]) newBooleanArray(5);
        boolean[] term5662477 = (boolean[]) newBooleanArray(4);
        Object[] term5662486 = (Object[]) newArray("[Z", 9);
        boolean[] term5662487 = (boolean[]) newBooleanArray(4);
        boolean[] term5662492 = (boolean[]) newBooleanArray(5);
        boolean[] term5662498 = (boolean[]) newBooleanArray(3);
        boolean[] term5662502 = (boolean[]) newBooleanArray(4);
        boolean[] term5662507 = (boolean[]) newBooleanArray(3);
        boolean[] term5662511 = (boolean[]) newBooleanArray(3);
        boolean[] term5662515 = (boolean[]) newBooleanArray(0);
        boolean[] term5662516 = (boolean[]) newBooleanArray(8);
        boolean[] term5662525 = (boolean[]) newBooleanArray(5);
        setField(term5662463, term5662463.getClass(), "fadeMap", term5662464);
        setElement(term5662470, 0, term5662471);
        setBooleanElement(term5662477, 0, true);
        setElement(term5662470, 1, term5662477);
        setElement(term5662469, 0, term5662470);
        setField(term5662463, term5662463.getClass(), "display", term5662469);
        setIntField(term5662463, term5662463.getClass(), "x", 1895143076);
        setIntField(term5662463, term5662463.getClass(), "y", 1981860404);
        setBooleanField(term5662463, term5662463.getClass(), "fade", true);
        setDoubleField(term5662463, term5662463.getClass(), "fadeSpeed", 0.9898207968242465);
        setBooleanElement(term5662487, 3, true);
        setElement(term5662486, 0, term5662487);
        setBooleanElement(term5662492, 1, true);
        setBooleanElement(term5662492, 3, true);
        setBooleanElement(term5662492, 4, true);
        setElement(term5662486, 1, term5662492);
        setBooleanElement(term5662498, 0, true);
        setBooleanElement(term5662498, 2, true);
        setElement(term5662486, 2, term5662498);
        setBooleanElement(term5662502, 1, true);
        setElement(term5662486, 3, term5662502);
        setElement(term5662486, 4, term5662507);
        setBooleanElement(term5662511, 0, true);
        setBooleanElement(term5662511, 2, true);
        setElement(term5662486, 5, term5662511);
        setElement(term5662486, 6, term5662515);
        setBooleanElement(term5662516, 0, true);
        setBooleanElement(term5662516, 2, true);
        setBooleanElement(term5662516, 3, true);
        setBooleanElement(term5662516, 7, true);
        setElement(term5662486, 7, term5662516);
        setBooleanElement(term5662525, 3, true);
        setElement(term5662486, 8, term5662525);
        setField(term5662463, term5662463.getClass(), "spriteViewer", term5662486);
        setIntField(term5662463, term5662463.getClass(), "spriteHeight", 732174235);
        setBooleanField(term5662463, term5662463.getClass(), "resolutionMode", true);
        setIntField(term5662463, term5662463.getClass(), "currentPlane", 470895808);
        setBooleanField(term5662463, term5662463.getClass(), "xoMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5662463, args);
    }

};


