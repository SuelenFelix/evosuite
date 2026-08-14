package org.mozilla.universalchardet.prober;

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
import static org.mozilla.universalchardet.prober.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class UTF8Prober_reset_17389559574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384480;

    public UTF8Prober_reset_17389559574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term384676 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term384675 = ((Class) term384676).getDeclaredField((String) "DETECTING");
        ((Field) term384675).setAccessible(true);
        Object enum70 = ((Field) term384675).get((Object) null);
        term384480 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term384481 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term384482 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.UTF8SMModel"));
        Object term384483 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term384488 = (int[]) newIntArray(32);
        Object term384522 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term384527 = (int[]) newIntArray(26);
        int[] term384554 = (int[]) newIntArray(16);
        setIntField(term384483, term384483.getClass(), "indexShift", 3);
        setIntField(term384483, term384483.getClass(), "shiftMask", 7);
        setIntField(term384483, term384483.getClass(), "bitShift", 2);
        setIntField(term384483, term384483.getClass(), "unitMask", 15);
        setIntElement(term384488, 0, 286331153);
        setIntElement(term384488, 1, 1118481);
        setIntElement(term384488, 2, 286331153);
        setIntElement(term384488, 3, 286327057);
        setIntElement(term384488, 4, 286331153);
        setIntElement(term384488, 5, 286331153);
        setIntElement(term384488, 6, 286331153);
        setIntElement(term384488, 7, 286331153);
        setIntElement(term384488, 8, 286331153);
        setIntElement(term384488, 9, 286331153);
        setIntElement(term384488, 10, 286331153);
        setIntElement(term384488, 11, 286331153);
        setIntElement(term384488, 12, 286331153);
        setIntElement(term384488, 13, 286331153);
        setIntElement(term384488, 14, 286331153);
        setIntElement(term384488, 15, 286331153);
        setIntElement(term384488, 16, 858989090);
        setIntElement(term384488, 17, 1145324612);
        setIntElement(term384488, 18, 1145324612);
        setIntElement(term384488, 19, 1145324612);
        setIntElement(term384488, 20, 1431655765);
        setIntElement(term384488, 21, 1431655765);
        setIntElement(term384488, 22, 1431655765);
        setIntElement(term384488, 23, 1431655765);
        setIntElement(term384488, 24, 1717986816);
        setIntElement(term384488, 25, 1717986918);
        setIntElement(term384488, 26, 1717986918);
        setIntElement(term384488, 27, 1717986918);
        setIntElement(term384488, 28, -2004318073);
        setIntElement(term384488, 29, -2003269496);
        setIntElement(term384488, 30, -1145324614);
        setIntElement(term384488, 31, 16702940);
        setField(term384483, term384483.getClass(), "data", term384488);
        setField(term384482, term384482.getClass(), "classTable", term384483);
        setIntField(term384482, term384482.getClass(), "classFactor", 16);
        setIntField(term384522, term384522.getClass(), "indexShift", 3);
        setIntField(term384522, term384522.getClass(), "shiftMask", 7);
        setIntField(term384522, term384522.getClass(), "bitShift", 2);
        setIntField(term384522, term384522.getClass(), "unitMask", 15);
        setIntElement(term384527, 0, -1408167679);
        setIntElement(term384527, 1, 878082233);
        setIntElement(term384527, 2, 286331153);
        setIntElement(term384527, 3, 286331153);
        setIntElement(term384527, 4, 572662306);
        setIntElement(term384527, 5, 572662306);
        setIntElement(term384527, 6, 290805009);
        setIntElement(term384527, 7, 286331153);
        setIntElement(term384527, 8, 290803985);
        setIntElement(term384527, 9, 286331153);
        setIntElement(term384527, 10, 293041937);
        setIntElement(term384527, 11, 286331153);
        setIntElement(term384527, 12, 293015825);
        setIntElement(term384527, 13, 286331153);
        setIntElement(term384527, 14, 295278865);
        setIntElement(term384527, 15, 286331153);
        setIntElement(term384527, 16, 295244049);
        setIntElement(term384527, 17, 286331153);
        setIntElement(term384527, 18, 298634257);
        setIntElement(term384527, 19, 286331153);
        setIntElement(term384527, 20, 297865489);
        setIntElement(term384527, 21, 286331153);
        setIntElement(term384527, 22, 287099921);
        setIntElement(term384527, 23, 286331153);
        setIntElement(term384527, 24, 285212689);
        setIntElement(term384527, 25, 286331153);
        setField(term384522, term384522.getClass(), "data", term384527);
        setField(term384482, term384482.getClass(), "stateTable", term384522);
        setIntElement(term384554, 1, 1);
        setIntElement(term384554, 6, 2);
        setIntElement(term384554, 7, 3);
        setIntElement(term384554, 8, 3);
        setIntElement(term384554, 9, 3);
        setIntElement(term384554, 10, 4);
        setIntElement(term384554, 11, 4);
        setIntElement(term384554, 12, 5);
        setIntElement(term384554, 13, 5);
        setIntElement(term384554, 14, 6);
        setIntElement(term384554, 15, 6);
        setField(term384482, term384482.getClass(), "charLenTable", term384554);
        setField(term384482, term384482.getClass(), "name", "UTF-8");
        setField(term384481, term384481.getClass(), "model", term384482);
        setIntField(term384481, term384481.getClass(), "currentState", 0);
        setIntField(term384481, term384481.getClass(), "currentCharLen", 0);
        setIntField(term384481, term384481.getClass(), "currentBytePos", 0);
        setField(term384480, term384480.getClass(), "codingSM", term384481);
        setField(term384480, term384480.getClass(), "state", enum70);
        setIntField(term384480, term384480.getClass(), "numOfMBChar", 628918458);
        setBooleanField(term384480, term384480.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.UTF8Prober");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term384480, args);
    }

};


