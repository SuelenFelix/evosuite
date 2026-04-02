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

public class PixelManager_scrollLeft_9445172114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5655120;

    public PixelManager_scrollLeft_9445172114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5655121 = new HashMap();
        term5655120 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5655126 = (Object[]) newArray("[[Z", 4);
        Object[] term5655127 = (Object[]) newArray("[Z", 1);
        boolean[] term5655128 = (boolean[]) newBooleanArray(7);
        Object[] term5655136 = (Object[]) newArray("[Z", 6);
        boolean[] term5655137 = (boolean[]) newBooleanArray(7);
        boolean[] term5655145 = (boolean[]) newBooleanArray(5);
        boolean[] term5655151 = (boolean[]) newBooleanArray(5);
        boolean[] term5655157 = (boolean[]) newBooleanArray(4);
        boolean[] term5655162 = (boolean[]) newBooleanArray(3);
        boolean[] term5655166 = (boolean[]) newBooleanArray(0);
        Object[] term5655167 = (Object[]) newArray("[Z", 0);
        Object[] term5655168 = (Object[]) newArray("[Z", 2);
        boolean[] term5655169 = (boolean[]) newBooleanArray(5);
        boolean[] term5655175 = (boolean[]) newBooleanArray(7);
        Object[] term5655187 = (Object[]) newArray("[Z", 6);
        boolean[] term5655188 = (boolean[]) newBooleanArray(2);
        boolean[] term5655191 = (boolean[]) newBooleanArray(5);
        boolean[] term5655197 = (boolean[]) newBooleanArray(8);
        boolean[] term5655206 = (boolean[]) newBooleanArray(6);
        boolean[] term5655213 = (boolean[]) newBooleanArray(1);
        boolean[] term5655215 = (boolean[]) newBooleanArray(0);
        setField(term5655120, term5655120.getClass(), "fadeMap", term5655121);
        setBooleanElement(term5655128, 0, true);
        setBooleanElement(term5655128, 1, true);
        setBooleanElement(term5655128, 5, true);
        setElement(term5655127, 0, term5655128);
        setElement(term5655126, 0, term5655127);
        setBooleanElement(term5655137, 2, true);
        setBooleanElement(term5655137, 4, true);
        setElement(term5655136, 0, term5655137);
        setBooleanElement(term5655145, 1, true);
        setBooleanElement(term5655145, 3, true);
        setBooleanElement(term5655145, 4, true);
        setElement(term5655136, 1, term5655145);
        setBooleanElement(term5655151, 0, true);
        setBooleanElement(term5655151, 1, true);
        setBooleanElement(term5655151, 2, true);
        setBooleanElement(term5655151, 3, true);
        setElement(term5655136, 2, term5655151);
        setBooleanElement(term5655157, 1, true);
        setElement(term5655136, 3, term5655157);
        setBooleanElement(term5655162, 0, true);
        setBooleanElement(term5655162, 1, true);
        setElement(term5655136, 4, term5655162);
        setElement(term5655136, 5, term5655166);
        setElement(term5655126, 1, term5655136);
        setElement(term5655126, 2, term5655167);
        setBooleanElement(term5655169, 0, true);
        setElement(term5655168, 0, term5655169);
        setBooleanElement(term5655175, 4, true);
        setBooleanElement(term5655175, 5, true);
        setElement(term5655168, 1, term5655175);
        setElement(term5655126, 3, term5655168);
        setField(term5655120, term5655120.getClass(), "display", term5655126);
        setIntField(term5655120, term5655120.getClass(), "x", -1736183862);
        setIntField(term5655120, term5655120.getClass(), "y", 897010381);
        setBooleanField(term5655120, term5655120.getClass(), "fade", false);
        setDoubleField(term5655120, term5655120.getClass(), "fadeSpeed", 0.07932996853888874);
        setElement(term5655187, 0, term5655188);
        setBooleanElement(term5655191, 3, true);
        setBooleanElement(term5655191, 4, true);
        setElement(term5655187, 1, term5655191);
        setBooleanElement(term5655197, 1, true);
        setBooleanElement(term5655197, 2, true);
        setElement(term5655187, 2, term5655197);
        setBooleanElement(term5655206, 0, true);
        setBooleanElement(term5655206, 5, true);
        setElement(term5655187, 3, term5655206);
        setBooleanElement(term5655213, 0, true);
        setElement(term5655187, 4, term5655213);
        setElement(term5655187, 5, term5655215);
        setField(term5655120, term5655120.getClass(), "spriteViewer", term5655187);
        setIntField(term5655120, term5655120.getClass(), "spriteHeight", -15712667);
        setBooleanField(term5655120, term5655120.getClass(), "resolutionMode", false);
        setIntField(term5655120, term5655120.getClass(), "currentPlane", 1964967720);
        setBooleanField(term5655120, term5655120.getClass(), "xoMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "scrollLeft", argTypes, term5655120, args);
    }

};


