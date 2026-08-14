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

public class PixelManager_fader_2325430479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653932;
     Object term5654067;
     Object term5654069;

    public PixelManager_fader_2325430479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5653933 = new HashMap();
        term5653932 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5653938 = (Object[]) newArray("[[Z", 3);
        Object[] term5653939 = (Object[]) newArray("[Z", 5);
        boolean[] term5653940 = (boolean[]) newBooleanArray(1);
        boolean[] term5653942 = (boolean[]) newBooleanArray(2);
        boolean[] term5653945 = (boolean[]) newBooleanArray(3);
        boolean[] term5653949 = (boolean[]) newBooleanArray(6);
        boolean[] term5653956 = (boolean[]) newBooleanArray(0);
        Object[] term5653957 = (Object[]) newArray("[Z", 8);
        boolean[] term5653958 = (boolean[]) newBooleanArray(4);
        boolean[] term5653963 = (boolean[]) newBooleanArray(6);
        boolean[] term5653970 = (boolean[]) newBooleanArray(7);
        boolean[] term5653978 = (boolean[]) newBooleanArray(2);
        boolean[] term5653981 = (boolean[]) newBooleanArray(3);
        boolean[] term5653985 = (boolean[]) newBooleanArray(6);
        boolean[] term5653992 = (boolean[]) newBooleanArray(6);
        boolean[] term5653999 = (boolean[]) newBooleanArray(5);
        Object[] term5654005 = (Object[]) newArray("[Z", 7);
        boolean[] term5654006 = (boolean[]) newBooleanArray(9);
        boolean[] term5654016 = (boolean[]) newBooleanArray(4);
        boolean[] term5654021 = (boolean[]) newBooleanArray(5);
        boolean[] term5654027 = (boolean[]) newBooleanArray(6);
        boolean[] term5654034 = (boolean[]) newBooleanArray(0);
        boolean[] term5654035 = (boolean[]) newBooleanArray(3);
        boolean[] term5654039 = (boolean[]) newBooleanArray(5);
        Object[] term5654049 = (Object[]) newArray("[Z", 2);
        boolean[] term5654050 = (boolean[]) newBooleanArray(9);
        boolean[] term5654060 = (boolean[]) newBooleanArray(2);
        setField(term5653932, term5653932.getClass(), "fadeMap", term5653933);
        setBooleanElement(term5653940, 0, true);
        setElement(term5653939, 0, term5653940);
        setBooleanElement(term5653942, 0, true);
        setElement(term5653939, 1, term5653942);
        setElement(term5653939, 2, term5653945);
        setBooleanElement(term5653949, 0, true);
        setBooleanElement(term5653949, 3, true);
        setElement(term5653939, 3, term5653949);
        setElement(term5653939, 4, term5653956);
        setElement(term5653938, 0, term5653939);
        setBooleanElement(term5653958, 0, true);
        setBooleanElement(term5653958, 1, true);
        setBooleanElement(term5653958, 3, true);
        setElement(term5653957, 0, term5653958);
        setBooleanElement(term5653963, 0, true);
        setBooleanElement(term5653963, 3, true);
        setBooleanElement(term5653963, 4, true);
        setElement(term5653957, 1, term5653963);
        setBooleanElement(term5653970, 1, true);
        setBooleanElement(term5653970, 5, true);
        setElement(term5653957, 2, term5653970);
        setBooleanElement(term5653978, 1, true);
        setElement(term5653957, 3, term5653978);
        setBooleanElement(term5653981, 1, true);
        setBooleanElement(term5653981, 2, true);
        setElement(term5653957, 4, term5653981);
        setBooleanElement(term5653985, 0, true);
        setBooleanElement(term5653985, 1, true);
        setBooleanElement(term5653985, 4, true);
        setBooleanElement(term5653985, 5, true);
        setElement(term5653957, 5, term5653985);
        setBooleanElement(term5653992, 5, true);
        setElement(term5653957, 6, term5653992);
        setBooleanElement(term5653999, 0, true);
        setBooleanElement(term5653999, 1, true);
        setElement(term5653957, 7, term5653999);
        setElement(term5653938, 1, term5653957);
        setBooleanElement(term5654006, 0, true);
        setBooleanElement(term5654006, 1, true);
        setBooleanElement(term5654006, 2, true);
        setBooleanElement(term5654006, 4, true);
        setBooleanElement(term5654006, 8, true);
        setElement(term5654005, 0, term5654006);
        setBooleanElement(term5654016, 0, true);
        setBooleanElement(term5654016, 1, true);
        setElement(term5654005, 1, term5654016);
        setBooleanElement(term5654021, 0, true);
        setBooleanElement(term5654021, 2, true);
        setElement(term5654005, 2, term5654021);
        setBooleanElement(term5654027, 0, true);
        setBooleanElement(term5654027, 1, true);
        setBooleanElement(term5654027, 4, true);
        setBooleanElement(term5654027, 5, true);
        setElement(term5654005, 3, term5654027);
        setElement(term5654005, 4, term5654034);
        setBooleanElement(term5654035, 0, true);
        setBooleanElement(term5654035, 1, true);
        setBooleanElement(term5654035, 2, true);
        setElement(term5654005, 5, term5654035);
        setBooleanElement(term5654039, 0, true);
        setBooleanElement(term5654039, 2, true);
        setElement(term5654005, 6, term5654039);
        setElement(term5653938, 2, term5654005);
        setField(term5653932, term5653932.getClass(), "display", term5653938);
        setIntField(term5653932, term5653932.getClass(), "x", 4900410);
        setIntField(term5653932, term5653932.getClass(), "y", -1252345779);
        setBooleanField(term5653932, term5653932.getClass(), "fade", false);
        setDoubleField(term5653932, term5653932.getClass(), "fadeSpeed", 0.540850203722707);
        setBooleanElement(term5654050, 0, true);
        setBooleanElement(term5654050, 2, true);
        setBooleanElement(term5654050, 8, true);
        setElement(term5654049, 0, term5654050);
        setElement(term5654049, 1, term5654060);
        setField(term5653932, term5653932.getClass(), "spriteViewer", term5654049);
        setIntField(term5653932, term5653932.getClass(), "spriteHeight", -2063365430);
        setBooleanField(term5653932, term5653932.getClass(), "resolutionMode", true);
        setIntField(term5653932, term5653932.getClass(), "currentPlane", 812570053);
        setBooleanField(term5653932, term5653932.getClass(), "xoMode", true);
        term5654067 = new Integer(-1488938905);
        term5654069 = new Integer(1916544127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5654067;
        args[1] = term5654069;
        callMethod(klass, "fader", argTypes, term5653932, args);
    }

};


