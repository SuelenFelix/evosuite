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

public class PixelManager_clearDisplay_3039290963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5652758;

    public PixelManager_clearDisplay_3039290963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5652759 = new HashMap();
        term5652758 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5652764 = (Object[]) newArray("[[Z", 3);
        Object[] term5652765 = (Object[]) newArray("[Z", 1);
        boolean[] term5652766 = (boolean[]) newBooleanArray(5);
        Object[] term5652772 = (Object[]) newArray("[Z", 4);
        boolean[] term5652773 = (boolean[]) newBooleanArray(3);
        boolean[] term5652777 = (boolean[]) newBooleanArray(9);
        boolean[] term5652787 = (boolean[]) newBooleanArray(6);
        boolean[] term5652794 = (boolean[]) newBooleanArray(0);
        Object[] term5652795 = (Object[]) newArray("[Z", 8);
        boolean[] term5652796 = (boolean[]) newBooleanArray(7);
        boolean[] term5652804 = (boolean[]) newBooleanArray(4);
        boolean[] term5652809 = (boolean[]) newBooleanArray(1);
        boolean[] term5652811 = (boolean[]) newBooleanArray(5);
        boolean[] term5652817 = (boolean[]) newBooleanArray(7);
        boolean[] term5652825 = (boolean[]) newBooleanArray(7);
        boolean[] term5652833 = (boolean[]) newBooleanArray(1);
        boolean[] term5652835 = (boolean[]) newBooleanArray(4);
        Object[] term5652844 = (Object[]) newArray("[Z", 1);
        boolean[] term5652845 = (boolean[]) newBooleanArray(6);
        setField(term5652758, term5652758.getClass(), "fadeMap", term5652759);
        setBooleanElement(term5652766, 1, true);
        setBooleanElement(term5652766, 3, true);
        setElement(term5652765, 0, term5652766);
        setElement(term5652764, 0, term5652765);
        setBooleanElement(term5652773, 1, true);
        setBooleanElement(term5652773, 2, true);
        setElement(term5652772, 0, term5652773);
        setBooleanElement(term5652777, 3, true);
        setBooleanElement(term5652777, 4, true);
        setBooleanElement(term5652777, 7, true);
        setBooleanElement(term5652777, 8, true);
        setElement(term5652772, 1, term5652777);
        setBooleanElement(term5652787, 3, true);
        setBooleanElement(term5652787, 4, true);
        setBooleanElement(term5652787, 5, true);
        setElement(term5652772, 2, term5652787);
        setElement(term5652772, 3, term5652794);
        setElement(term5652764, 1, term5652772);
        setBooleanElement(term5652796, 0, true);
        setBooleanElement(term5652796, 1, true);
        setBooleanElement(term5652796, 3, true);
        setBooleanElement(term5652796, 4, true);
        setBooleanElement(term5652796, 5, true);
        setBooleanElement(term5652796, 6, true);
        setElement(term5652795, 0, term5652796);
        setBooleanElement(term5652804, 1, true);
        setBooleanElement(term5652804, 2, true);
        setElement(term5652795, 1, term5652804);
        setBooleanElement(term5652809, 0, true);
        setElement(term5652795, 2, term5652809);
        setBooleanElement(term5652811, 0, true);
        setBooleanElement(term5652811, 2, true);
        setElement(term5652795, 3, term5652811);
        setBooleanElement(term5652817, 0, true);
        setBooleanElement(term5652817, 1, true);
        setBooleanElement(term5652817, 3, true);
        setElement(term5652795, 4, term5652817);
        setBooleanElement(term5652825, 2, true);
        setBooleanElement(term5652825, 3, true);
        setElement(term5652795, 5, term5652825);
        setElement(term5652795, 6, term5652833);
        setBooleanElement(term5652835, 0, true);
        setBooleanElement(term5652835, 1, true);
        setElement(term5652795, 7, term5652835);
        setElement(term5652764, 2, term5652795);
        setField(term5652758, term5652758.getClass(), "display", term5652764);
        setIntField(term5652758, term5652758.getClass(), "x", -266625190);
        setIntField(term5652758, term5652758.getClass(), "y", 489201218);
        setBooleanField(term5652758, term5652758.getClass(), "fade", false);
        setDoubleField(term5652758, term5652758.getClass(), "fadeSpeed", 0.0013046823258857643);
        setBooleanElement(term5652845, 2, true);
        setBooleanElement(term5652845, 3, true);
        setBooleanElement(term5652845, 4, true);
        setElement(term5652844, 0, term5652845);
        setField(term5652758, term5652758.getClass(), "spriteViewer", term5652844);
        setIntField(term5652758, term5652758.getClass(), "spriteHeight", 464181937);
        setBooleanField(term5652758, term5652758.getClass(), "resolutionMode", false);
        setIntField(term5652758, term5652758.getClass(), "currentPlane", -1455526612);
        setBooleanField(term5652758, term5652758.getClass(), "xoMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearDisplay", argTypes, term5652758, args);
    }

};


