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

public class PixelManager_setFade_105806505931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5659032;
     Object term5659215;

    public PixelManager_setFade_105806505931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5659033 = new HashMap();
        term5659032 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5659038 = (Object[]) newArray("[[Z", 3);
        Object[] term5659039 = (Object[]) newArray("[Z", 4);
        boolean[] term5659040 = (boolean[]) newBooleanArray(1);
        boolean[] term5659042 = (boolean[]) newBooleanArray(8);
        boolean[] term5659051 = (boolean[]) newBooleanArray(7);
        boolean[] term5659059 = (boolean[]) newBooleanArray(6);
        Object[] term5659066 = (Object[]) newArray("[Z", 8);
        boolean[] term5659067 = (boolean[]) newBooleanArray(8);
        boolean[] term5659076 = (boolean[]) newBooleanArray(9);
        boolean[] term5659086 = (boolean[]) newBooleanArray(7);
        boolean[] term5659094 = (boolean[]) newBooleanArray(9);
        boolean[] term5659104 = (boolean[]) newBooleanArray(9);
        boolean[] term5659114 = (boolean[]) newBooleanArray(2);
        boolean[] term5659117 = (boolean[]) newBooleanArray(8);
        boolean[] term5659126 = (boolean[]) newBooleanArray(5);
        Object[] term5659132 = (Object[]) newArray("[Z", 6);
        boolean[] term5659133 = (boolean[]) newBooleanArray(1);
        boolean[] term5659135 = (boolean[]) newBooleanArray(4);
        boolean[] term5659140 = (boolean[]) newBooleanArray(9);
        boolean[] term5659150 = (boolean[]) newBooleanArray(7);
        boolean[] term5659158 = (boolean[]) newBooleanArray(1);
        boolean[] term5659160 = (boolean[]) newBooleanArray(8);
        Object[] term5659173 = (Object[]) newArray("[Z", 7);
        boolean[] term5659174 = (boolean[]) newBooleanArray(6);
        boolean[] term5659181 = (boolean[]) newBooleanArray(7);
        boolean[] term5659189 = (boolean[]) newBooleanArray(4);
        boolean[] term5659194 = (boolean[]) newBooleanArray(7);
        boolean[] term5659202 = (boolean[]) newBooleanArray(4);
        boolean[] term5659207 = (boolean[]) newBooleanArray(2);
        boolean[] term5659210 = (boolean[]) newBooleanArray(0);
        setField(term5659032, term5659032.getClass(), "fadeMap", term5659033);
        setBooleanElement(term5659040, 0, true);
        setElement(term5659039, 0, term5659040);
        setBooleanElement(term5659042, 5, true);
        setElement(term5659039, 1, term5659042);
        setBooleanElement(term5659051, 3, true);
        setElement(term5659039, 2, term5659051);
        setBooleanElement(term5659059, 3, true);
        setBooleanElement(term5659059, 4, true);
        setBooleanElement(term5659059, 5, true);
        setElement(term5659039, 3, term5659059);
        setElement(term5659038, 0, term5659039);
        setBooleanElement(term5659067, 1, true);
        setBooleanElement(term5659067, 2, true);
        setBooleanElement(term5659067, 3, true);
        setBooleanElement(term5659067, 4, true);
        setBooleanElement(term5659067, 5, true);
        setBooleanElement(term5659067, 7, true);
        setElement(term5659066, 0, term5659067);
        setBooleanElement(term5659076, 0, true);
        setBooleanElement(term5659076, 2, true);
        setBooleanElement(term5659076, 3, true);
        setBooleanElement(term5659076, 4, true);
        setBooleanElement(term5659076, 5, true);
        setBooleanElement(term5659076, 6, true);
        setBooleanElement(term5659076, 7, true);
        setElement(term5659066, 1, term5659076);
        setBooleanElement(term5659086, 1, true);
        setBooleanElement(term5659086, 4, true);
        setBooleanElement(term5659086, 6, true);
        setElement(term5659066, 2, term5659086);
        setBooleanElement(term5659094, 1, true);
        setBooleanElement(term5659094, 5, true);
        setBooleanElement(term5659094, 6, true);
        setBooleanElement(term5659094, 7, true);
        setBooleanElement(term5659094, 8, true);
        setElement(term5659066, 3, term5659094);
        setBooleanElement(term5659104, 0, true);
        setBooleanElement(term5659104, 5, true);
        setBooleanElement(term5659104, 6, true);
        setBooleanElement(term5659104, 7, true);
        setBooleanElement(term5659104, 8, true);
        setElement(term5659066, 4, term5659104);
        setElement(term5659066, 5, term5659114);
        setBooleanElement(term5659117, 0, true);
        setBooleanElement(term5659117, 7, true);
        setElement(term5659066, 6, term5659117);
        setBooleanElement(term5659126, 0, true);
        setBooleanElement(term5659126, 1, true);
        setElement(term5659066, 7, term5659126);
        setElement(term5659038, 1, term5659066);
        setElement(term5659132, 0, term5659133);
        setBooleanElement(term5659135, 2, true);
        setElement(term5659132, 1, term5659135);
        setBooleanElement(term5659140, 1, true);
        setBooleanElement(term5659140, 2, true);
        setBooleanElement(term5659140, 3, true);
        setBooleanElement(term5659140, 4, true);
        setBooleanElement(term5659140, 6, true);
        setBooleanElement(term5659140, 7, true);
        setBooleanElement(term5659140, 8, true);
        setElement(term5659132, 2, term5659140);
        setBooleanElement(term5659150, 4, true);
        setBooleanElement(term5659150, 6, true);
        setElement(term5659132, 3, term5659150);
        setElement(term5659132, 4, term5659158);
        setBooleanElement(term5659160, 0, true);
        setBooleanElement(term5659160, 1, true);
        setBooleanElement(term5659160, 2, true);
        setBooleanElement(term5659160, 3, true);
        setBooleanElement(term5659160, 4, true);
        setBooleanElement(term5659160, 7, true);
        setElement(term5659132, 5, term5659160);
        setElement(term5659038, 2, term5659132);
        setField(term5659032, term5659032.getClass(), "display", term5659038);
        setIntField(term5659032, term5659032.getClass(), "x", 1706047059);
        setIntField(term5659032, term5659032.getClass(), "y", 590451710);
        setBooleanField(term5659032, term5659032.getClass(), "fade", false);
        setDoubleField(term5659032, term5659032.getClass(), "fadeSpeed", 0.5180566811475131);
        setBooleanElement(term5659174, 4, true);
        setBooleanElement(term5659174, 5, true);
        setElement(term5659173, 0, term5659174);
        setBooleanElement(term5659181, 0, true);
        setBooleanElement(term5659181, 1, true);
        setBooleanElement(term5659181, 2, true);
        setBooleanElement(term5659181, 3, true);
        setElement(term5659173, 1, term5659181);
        setBooleanElement(term5659189, 1, true);
        setBooleanElement(term5659189, 3, true);
        setElement(term5659173, 2, term5659189);
        setBooleanElement(term5659194, 0, true);
        setBooleanElement(term5659194, 1, true);
        setBooleanElement(term5659194, 2, true);
        setBooleanElement(term5659194, 4, true);
        setBooleanElement(term5659194, 5, true);
        setBooleanElement(term5659194, 6, true);
        setElement(term5659173, 3, term5659194);
        setBooleanElement(term5659202, 0, true);
        setElement(term5659173, 4, term5659202);
        setElement(term5659173, 5, term5659207);
        setElement(term5659173, 6, term5659210);
        setField(term5659032, term5659032.getClass(), "spriteViewer", term5659173);
        setIntField(term5659032, term5659032.getClass(), "spriteHeight", -1999787419);
        setBooleanField(term5659032, term5659032.getClass(), "resolutionMode", true);
        setIntField(term5659032, term5659032.getClass(), "currentPlane", -1224443634);
        setBooleanField(term5659032, term5659032.getClass(), "xoMode", false);
        term5659215 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5659215;
        callMethod(klass, "setFade", argTypes, term5659032, args);
    }

};


