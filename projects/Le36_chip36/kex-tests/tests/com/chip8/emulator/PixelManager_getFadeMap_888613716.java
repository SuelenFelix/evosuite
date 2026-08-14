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

public class PixelManager_getFadeMap_888613716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5655364;

    public PixelManager_getFadeMap_888613716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5655365 = new HashMap();
        term5655364 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5655370 = (Object[]) newArray("[[Z", 1);
        Object[] term5655371 = (Object[]) newArray("[Z", 1);
        boolean[] term5655372 = (boolean[]) newBooleanArray(2);
        Object[] term5655379 = (Object[]) newArray("[Z", 0);
        setField(term5655364, term5655364.getClass(), "fadeMap", term5655365);
        setBooleanElement(term5655372, 0, true);
        setBooleanElement(term5655372, 1, true);
        setElement(term5655371, 0, term5655372);
        setElement(term5655370, 0, term5655371);
        setField(term5655364, term5655364.getClass(), "display", term5655370);
        setIntField(term5655364, term5655364.getClass(), "x", 319853052);
        setIntField(term5655364, term5655364.getClass(), "y", -1097563716);
        setBooleanField(term5655364, term5655364.getClass(), "fade", true);
        setDoubleField(term5655364, term5655364.getClass(), "fadeSpeed", 0.9196949182738653);
        setField(term5655364, term5655364.getClass(), "spriteViewer", term5655379);
        setIntField(term5655364, term5655364.getClass(), "spriteHeight", 1572907769);
        setBooleanField(term5655364, term5655364.getClass(), "resolutionMode", true);
        setIntField(term5655364, term5655364.getClass(), "currentPlane", 1608016787);
        setBooleanField(term5655364, term5655364.getClass(), "xoMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFadeMap", argTypes, term5655364, args);
    }

};


