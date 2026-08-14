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
import java.lang.Integer;

public class PixelManager_setCurrentPlane_183780369036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5661074;
     Object term5661192;

    public PixelManager_setCurrentPlane_183780369036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5661075 = new HashMap();
        term5661074 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5661080 = (Object[]) newArray("[[Z", 3);
        Object[] term5661081 = (Object[]) newArray("[Z", 6);
        boolean[] term5661082 = (boolean[]) newBooleanArray(2);
        boolean[] term5661085 = (boolean[]) newBooleanArray(5);
        boolean[] term5661091 = (boolean[]) newBooleanArray(0);
        boolean[] term5661092 = (boolean[]) newBooleanArray(5);
        boolean[] term5661098 = (boolean[]) newBooleanArray(4);
        boolean[] term5661103 = (boolean[]) newBooleanArray(2);
        Object[] term5661106 = (Object[]) newArray("[Z", 7);
        boolean[] term5661107 = (boolean[]) newBooleanArray(6);
        boolean[] term5661114 = (boolean[]) newBooleanArray(2);
        boolean[] term5661117 = (boolean[]) newBooleanArray(7);
        boolean[] term5661125 = (boolean[]) newBooleanArray(3);
        boolean[] term5661129 = (boolean[]) newBooleanArray(5);
        boolean[] term5661135 = (boolean[]) newBooleanArray(6);
        boolean[] term5661142 = (boolean[]) newBooleanArray(4);
        Object[] term5661147 = (Object[]) newArray("[Z", 2);
        boolean[] term5661148 = (boolean[]) newBooleanArray(2);
        boolean[] term5661151 = (boolean[]) newBooleanArray(0);
        Object[] term5661156 = (Object[]) newArray("[Z", 5);
        boolean[] term5661157 = (boolean[]) newBooleanArray(5);
        boolean[] term5661163 = (boolean[]) newBooleanArray(4);
        boolean[] term5661168 = (boolean[]) newBooleanArray(7);
        boolean[] term5661176 = (boolean[]) newBooleanArray(1);
        boolean[] term5661178 = (boolean[]) newBooleanArray(9);
        setField(term5661074, term5661074.getClass(), "fadeMap", term5661075);
        setElement(term5661081, 0, term5661082);
        setBooleanElement(term5661085, 1, true);
        setBooleanElement(term5661085, 2, true);
        setBooleanElement(term5661085, 3, true);
        setBooleanElement(term5661085, 4, true);
        setElement(term5661081, 1, term5661085);
        setElement(term5661081, 2, term5661091);
        setBooleanElement(term5661092, 0, true);
        setBooleanElement(term5661092, 1, true);
        setBooleanElement(term5661092, 3, true);
        setElement(term5661081, 3, term5661092);
        setBooleanElement(term5661098, 0, true);
        setElement(term5661081, 4, term5661098);
        setBooleanElement(term5661103, 0, true);
        setElement(term5661081, 5, term5661103);
        setElement(term5661080, 0, term5661081);
        setBooleanElement(term5661107, 5, true);
        setElement(term5661106, 0, term5661107);
        setBooleanElement(term5661114, 1, true);
        setElement(term5661106, 1, term5661114);
        setBooleanElement(term5661117, 0, true);
        setBooleanElement(term5661117, 1, true);
        setBooleanElement(term5661117, 3, true);
        setBooleanElement(term5661117, 6, true);
        setElement(term5661106, 2, term5661117);
        setBooleanElement(term5661125, 0, true);
        setBooleanElement(term5661125, 2, true);
        setElement(term5661106, 3, term5661125);
        setBooleanElement(term5661129, 0, true);
        setBooleanElement(term5661129, 3, true);
        setElement(term5661106, 4, term5661129);
        setBooleanElement(term5661135, 1, true);
        setBooleanElement(term5661135, 3, true);
        setBooleanElement(term5661135, 4, true);
        setElement(term5661106, 5, term5661135);
        setBooleanElement(term5661142, 2, true);
        setBooleanElement(term5661142, 3, true);
        setElement(term5661106, 6, term5661142);
        setElement(term5661080, 1, term5661106);
        setBooleanElement(term5661148, 0, true);
        setBooleanElement(term5661148, 1, true);
        setElement(term5661147, 0, term5661148);
        setElement(term5661147, 1, term5661151);
        setElement(term5661080, 2, term5661147);
        setField(term5661074, term5661074.getClass(), "display", term5661080);
        setIntField(term5661074, term5661074.getClass(), "x", 1801052257);
        setIntField(term5661074, term5661074.getClass(), "y", -2110556060);
        setBooleanField(term5661074, term5661074.getClass(), "fade", false);
        setDoubleField(term5661074, term5661074.getClass(), "fadeSpeed", 0.9711083796772954);
        setBooleanElement(term5661157, 1, true);
        setBooleanElement(term5661157, 4, true);
        setElement(term5661156, 0, term5661157);
        setBooleanElement(term5661163, 0, true);
        setBooleanElement(term5661163, 1, true);
        setBooleanElement(term5661163, 2, true);
        setBooleanElement(term5661163, 3, true);
        setElement(term5661156, 1, term5661163);
        setBooleanElement(term5661168, 1, true);
        setBooleanElement(term5661168, 2, true);
        setBooleanElement(term5661168, 4, true);
        setBooleanElement(term5661168, 6, true);
        setElement(term5661156, 2, term5661168);
        setElement(term5661156, 3, term5661176);
        setBooleanElement(term5661178, 0, true);
        setBooleanElement(term5661178, 3, true);
        setBooleanElement(term5661178, 5, true);
        setBooleanElement(term5661178, 8, true);
        setElement(term5661156, 4, term5661178);
        setField(term5661074, term5661074.getClass(), "spriteViewer", term5661156);
        setIntField(term5661074, term5661074.getClass(), "spriteHeight", 313459791);
        setBooleanField(term5661074, term5661074.getClass(), "resolutionMode", true);
        setIntField(term5661074, term5661074.getClass(), "currentPlane", 752615112);
        setBooleanField(term5661074, term5661074.getClass(), "xoMode", false);
        term5661192 = new Integer(-1674430871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5661192;
        callMethod(klass, "setCurrentPlane", argTypes, term5661074, args);
    }

};


