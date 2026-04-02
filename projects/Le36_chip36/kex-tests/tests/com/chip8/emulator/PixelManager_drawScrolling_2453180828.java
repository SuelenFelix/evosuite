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
import java.lang.String;

public class PixelManager_drawScrolling_2453180828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653581;
     Object term5653701;
     Object term5653703;
     Object term5653705;
     Object enum35;

    public PixelManager_drawScrolling_2453180828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5653582 = new HashMap();
        term5653581 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5653587 = (Object[]) newArray("[[Z", 4);
        Object[] term5653588 = (Object[]) newArray("[Z", 0);
        Object[] term5653589 = (Object[]) newArray("[Z", 3);
        boolean[] term5653590 = (boolean[]) newBooleanArray(2);
        boolean[] term5653593 = (boolean[]) newBooleanArray(8);
        boolean[] term5653602 = (boolean[]) newBooleanArray(7);
        Object[] term5653610 = (Object[]) newArray("[Z", 9);
        boolean[] term5653611 = (boolean[]) newBooleanArray(9);
        boolean[] term5653621 = (boolean[]) newBooleanArray(6);
        boolean[] term5653628 = (boolean[]) newBooleanArray(4);
        boolean[] term5653633 = (boolean[]) newBooleanArray(1);
        boolean[] term5653635 = (boolean[]) newBooleanArray(3);
        boolean[] term5653639 = (boolean[]) newBooleanArray(2);
        boolean[] term5653642 = (boolean[]) newBooleanArray(8);
        boolean[] term5653651 = (boolean[]) newBooleanArray(3);
        boolean[] term5653655 = (boolean[]) newBooleanArray(7);
        Object[] term5653663 = (Object[]) newArray("[Z", 6);
        boolean[] term5653664 = (boolean[]) newBooleanArray(3);
        boolean[] term5653668 = (boolean[]) newBooleanArray(2);
        boolean[] term5653671 = (boolean[]) newBooleanArray(5);
        boolean[] term5653677 = (boolean[]) newBooleanArray(2);
        boolean[] term5653680 = (boolean[]) newBooleanArray(1);
        boolean[] term5653682 = (boolean[]) newBooleanArray(5);
        Object[] term5653692 = (Object[]) newArray("[Z", 1);
        boolean[] term5653693 = (boolean[]) newBooleanArray(3);
        setField(term5653581, term5653581.getClass(), "fadeMap", term5653582);
        setElement(term5653587, 0, term5653588);
        setElement(term5653589, 0, term5653590);
        setBooleanElement(term5653593, 5, true);
        setBooleanElement(term5653593, 7, true);
        setElement(term5653589, 1, term5653593);
        setBooleanElement(term5653602, 0, true);
        setBooleanElement(term5653602, 1, true);
        setBooleanElement(term5653602, 2, true);
        setBooleanElement(term5653602, 5, true);
        setElement(term5653589, 2, term5653602);
        setElement(term5653587, 1, term5653589);
        setBooleanElement(term5653611, 0, true);
        setBooleanElement(term5653611, 3, true);
        setBooleanElement(term5653611, 4, true);
        setBooleanElement(term5653611, 5, true);
        setBooleanElement(term5653611, 6, true);
        setBooleanElement(term5653611, 8, true);
        setElement(term5653610, 0, term5653611);
        setBooleanElement(term5653621, 0, true);
        setBooleanElement(term5653621, 1, true);
        setBooleanElement(term5653621, 2, true);
        setBooleanElement(term5653621, 3, true);
        setBooleanElement(term5653621, 5, true);
        setElement(term5653610, 1, term5653621);
        setBooleanElement(term5653628, 1, true);
        setElement(term5653610, 2, term5653628);
        setElement(term5653610, 3, term5653633);
        setBooleanElement(term5653635, 0, true);
        setBooleanElement(term5653635, 2, true);
        setElement(term5653610, 4, term5653635);
        setElement(term5653610, 5, term5653639);
        setBooleanElement(term5653642, 1, true);
        setElement(term5653610, 6, term5653642);
        setBooleanElement(term5653651, 1, true);
        setBooleanElement(term5653651, 2, true);
        setElement(term5653610, 7, term5653651);
        setBooleanElement(term5653655, 0, true);
        setBooleanElement(term5653655, 2, true);
        setBooleanElement(term5653655, 3, true);
        setBooleanElement(term5653655, 4, true);
        setBooleanElement(term5653655, 5, true);
        setElement(term5653610, 8, term5653655);
        setElement(term5653587, 2, term5653610);
        setBooleanElement(term5653664, 0, true);
        setBooleanElement(term5653664, 2, true);
        setElement(term5653663, 0, term5653664);
        setBooleanElement(term5653668, 0, true);
        setElement(term5653663, 1, term5653668);
        setBooleanElement(term5653671, 1, true);
        setBooleanElement(term5653671, 4, true);
        setElement(term5653663, 2, term5653671);
        setElement(term5653663, 3, term5653677);
        setElement(term5653663, 4, term5653680);
        setElement(term5653663, 5, term5653682);
        setElement(term5653587, 3, term5653663);
        setField(term5653581, term5653581.getClass(), "display", term5653587);
        setIntField(term5653581, term5653581.getClass(), "x", 1003743923);
        setIntField(term5653581, term5653581.getClass(), "y", 1887772522);
        setBooleanField(term5653581, term5653581.getClass(), "fade", true);
        setDoubleField(term5653581, term5653581.getClass(), "fadeSpeed", 0.6213122016266206);
        setBooleanElement(term5653693, 0, true);
        setElement(term5653692, 0, term5653693);
        setField(term5653581, term5653581.getClass(), "spriteViewer", term5653692);
        setIntField(term5653581, term5653581.getClass(), "spriteHeight", 354196060);
        setBooleanField(term5653581, term5653581.getClass(), "resolutionMode", false);
        setIntField(term5653581, term5653581.getClass(), "currentPlane", -1840305774);
        setBooleanField(term5653581, term5653581.getClass(), "xoMode", true);
        term5653701 = new Integer(1365087144);
        term5653703 = new Integer(-1537255112);
        term5653705 = new Integer(934477462);
        Class<? extends Object> term5653795 = Class.forName((String) "com.chip8.emulator.Scroll");
        Field term5653794 = ((Class) term5653795).getDeclaredField((String) "UP");
        ((Field) term5653794).setAccessible(true);
        enum35 = ((Field) term5653794).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.chip8.emulator.Scroll");
        Object[] args = new Object[4];
        args[0] = term5653701;
        args[1] = term5653703;
        args[2] = term5653705;
        args[3] = enum35;
        callMethod(klass, "drawScrolling", argTypes, term5653581, args);
    }

};


