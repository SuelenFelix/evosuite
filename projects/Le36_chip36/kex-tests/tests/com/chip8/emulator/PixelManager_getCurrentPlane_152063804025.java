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

public class PixelManager_getCurrentPlane_152063804025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5657293;

    public PixelManager_getCurrentPlane_152063804025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5657294 = new HashMap();
        term5657293 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5657299 = (Object[]) newArray("[[Z", 5);
        Object[] term5657300 = (Object[]) newArray("[Z", 4);
        boolean[] term5657301 = (boolean[]) newBooleanArray(5);
        boolean[] term5657307 = (boolean[]) newBooleanArray(4);
        boolean[] term5657312 = (boolean[]) newBooleanArray(4);
        boolean[] term5657317 = (boolean[]) newBooleanArray(8);
        Object[] term5657326 = (Object[]) newArray("[Z", 0);
        Object[] term5657327 = (Object[]) newArray("[Z", 5);
        boolean[] term5657328 = (boolean[]) newBooleanArray(9);
        boolean[] term5657338 = (boolean[]) newBooleanArray(0);
        boolean[] term5657339 = (boolean[]) newBooleanArray(2);
        boolean[] term5657342 = (boolean[]) newBooleanArray(0);
        boolean[] term5657343 = (boolean[]) newBooleanArray(9);
        Object[] term5657353 = (Object[]) newArray("[Z", 8);
        boolean[] term5657354 = (boolean[]) newBooleanArray(4);
        boolean[] term5657359 = (boolean[]) newBooleanArray(0);
        boolean[] term5657360 = (boolean[]) newBooleanArray(0);
        boolean[] term5657361 = (boolean[]) newBooleanArray(0);
        boolean[] term5657362 = (boolean[]) newBooleanArray(2);
        boolean[] term5657365 = (boolean[]) newBooleanArray(8);
        boolean[] term5657374 = (boolean[]) newBooleanArray(9);
        boolean[] term5657384 = (boolean[]) newBooleanArray(9);
        Object[] term5657394 = (Object[]) newArray("[Z", 8);
        boolean[] term5657395 = (boolean[]) newBooleanArray(3);
        boolean[] term5657399 = (boolean[]) newBooleanArray(8);
        boolean[] term5657408 = (boolean[]) newBooleanArray(3);
        boolean[] term5657412 = (boolean[]) newBooleanArray(5);
        boolean[] term5657418 = (boolean[]) newBooleanArray(3);
        boolean[] term5657422 = (boolean[]) newBooleanArray(9);
        boolean[] term5657432 = (boolean[]) newBooleanArray(7);
        boolean[] term5657440 = (boolean[]) newBooleanArray(3);
        Object[] term5657448 = (Object[]) newArray("[Z", 4);
        boolean[] term5657449 = (boolean[]) newBooleanArray(7);
        boolean[] term5657457 = (boolean[]) newBooleanArray(4);
        boolean[] term5657462 = (boolean[]) newBooleanArray(1);
        boolean[] term5657464 = (boolean[]) newBooleanArray(3);
        setField(term5657293, term5657293.getClass(), "fadeMap", term5657294);
        setBooleanElement(term5657301, 1, true);
        setBooleanElement(term5657301, 3, true);
        setElement(term5657300, 0, term5657301);
        setBooleanElement(term5657307, 0, true);
        setBooleanElement(term5657307, 1, true);
        setBooleanElement(term5657307, 3, true);
        setElement(term5657300, 1, term5657307);
        setBooleanElement(term5657312, 0, true);
        setBooleanElement(term5657312, 3, true);
        setElement(term5657300, 2, term5657312);
        setBooleanElement(term5657317, 0, true);
        setBooleanElement(term5657317, 1, true);
        setBooleanElement(term5657317, 2, true);
        setBooleanElement(term5657317, 3, true);
        setBooleanElement(term5657317, 5, true);
        setBooleanElement(term5657317, 7, true);
        setElement(term5657300, 3, term5657317);
        setElement(term5657299, 0, term5657300);
        setElement(term5657299, 1, term5657326);
        setBooleanElement(term5657328, 0, true);
        setBooleanElement(term5657328, 2, true);
        setBooleanElement(term5657328, 3, true);
        setBooleanElement(term5657328, 4, true);
        setBooleanElement(term5657328, 6, true);
        setBooleanElement(term5657328, 8, true);
        setElement(term5657327, 0, term5657328);
        setElement(term5657327, 1, term5657338);
        setBooleanElement(term5657339, 0, true);
        setElement(term5657327, 2, term5657339);
        setElement(term5657327, 3, term5657342);
        setBooleanElement(term5657343, 0, true);
        setBooleanElement(term5657343, 4, true);
        setBooleanElement(term5657343, 6, true);
        setBooleanElement(term5657343, 7, true);
        setElement(term5657327, 4, term5657343);
        setElement(term5657299, 2, term5657327);
        setBooleanElement(term5657354, 3, true);
        setElement(term5657353, 0, term5657354);
        setElement(term5657353, 1, term5657359);
        setElement(term5657353, 2, term5657360);
        setElement(term5657353, 3, term5657361);
        setBooleanElement(term5657362, 0, true);
        setElement(term5657353, 4, term5657362);
        setBooleanElement(term5657365, 0, true);
        setBooleanElement(term5657365, 3, true);
        setBooleanElement(term5657365, 5, true);
        setBooleanElement(term5657365, 6, true);
        setBooleanElement(term5657365, 7, true);
        setElement(term5657353, 5, term5657365);
        setBooleanElement(term5657374, 0, true);
        setBooleanElement(term5657374, 1, true);
        setBooleanElement(term5657374, 2, true);
        setBooleanElement(term5657374, 6, true);
        setBooleanElement(term5657374, 7, true);
        setBooleanElement(term5657374, 8, true);
        setElement(term5657353, 6, term5657374);
        setBooleanElement(term5657384, 0, true);
        setBooleanElement(term5657384, 4, true);
        setBooleanElement(term5657384, 5, true);
        setBooleanElement(term5657384, 6, true);
        setElement(term5657353, 7, term5657384);
        setElement(term5657299, 3, term5657353);
        setBooleanElement(term5657395, 0, true);
        setBooleanElement(term5657395, 2, true);
        setElement(term5657394, 0, term5657395);
        setBooleanElement(term5657399, 0, true);
        setBooleanElement(term5657399, 7, true);
        setElement(term5657394, 1, term5657399);
        setBooleanElement(term5657408, 0, true);
        setBooleanElement(term5657408, 2, true);
        setElement(term5657394, 2, term5657408);
        setBooleanElement(term5657412, 0, true);
        setBooleanElement(term5657412, 2, true);
        setBooleanElement(term5657412, 3, true);
        setBooleanElement(term5657412, 4, true);
        setElement(term5657394, 3, term5657412);
        setElement(term5657394, 4, term5657418);
        setBooleanElement(term5657422, 0, true);
        setBooleanElement(term5657422, 1, true);
        setBooleanElement(term5657422, 3, true);
        setBooleanElement(term5657422, 4, true);
        setBooleanElement(term5657422, 7, true);
        setElement(term5657394, 5, term5657422);
        setBooleanElement(term5657432, 1, true);
        setBooleanElement(term5657432, 2, true);
        setBooleanElement(term5657432, 3, true);
        setBooleanElement(term5657432, 4, true);
        setElement(term5657394, 6, term5657432);
        setBooleanElement(term5657440, 0, true);
        setBooleanElement(term5657440, 2, true);
        setElement(term5657394, 7, term5657440);
        setElement(term5657299, 4, term5657394);
        setField(term5657293, term5657293.getClass(), "display", term5657299);
        setIntField(term5657293, term5657293.getClass(), "x", 550892835);
        setIntField(term5657293, term5657293.getClass(), "y", 1237549886);
        setBooleanField(term5657293, term5657293.getClass(), "fade", false);
        setDoubleField(term5657293, term5657293.getClass(), "fadeSpeed", 0.7102687477135848);
        setBooleanElement(term5657449, 2, true);
        setBooleanElement(term5657449, 3, true);
        setBooleanElement(term5657449, 5, true);
        setBooleanElement(term5657449, 6, true);
        setElement(term5657448, 0, term5657449);
        setBooleanElement(term5657457, 1, true);
        setBooleanElement(term5657457, 2, true);
        setElement(term5657448, 1, term5657457);
        setElement(term5657448, 2, term5657462);
        setBooleanElement(term5657464, 0, true);
        setBooleanElement(term5657464, 1, true);
        setElement(term5657448, 3, term5657464);
        setField(term5657293, term5657293.getClass(), "spriteViewer", term5657448);
        setIntField(term5657293, term5657293.getClass(), "spriteHeight", -1945635750);
        setBooleanField(term5657293, term5657293.getClass(), "resolutionMode", true);
        setIntField(term5657293, term5657293.getClass(), "currentPlane", -1622760744);
        setBooleanField(term5657293, term5657293.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentPlane", argTypes, term5657293, args);
    }

};


