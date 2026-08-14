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

public class UTF8Prober_getCharSetName_20058519121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382856;

    public UTF8Prober_getCharSetName_20058519121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term383052 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term383051 = ((Class) term383052).getDeclaredField((String) "DETECTING");
        ((Field) term383051).setAccessible(true);
        Object enum67 = ((Field) term383051).get((Object) null);
        term382856 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term382857 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term382858 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.UTF8SMModel"));
        Object term382859 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term382864 = (int[]) newIntArray(32);
        Object term382898 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term382903 = (int[]) newIntArray(26);
        int[] term382930 = (int[]) newIntArray(16);
        setIntField(term382859, term382859.getClass(), "indexShift", 3);
        setIntField(term382859, term382859.getClass(), "shiftMask", 7);
        setIntField(term382859, term382859.getClass(), "bitShift", 2);
        setIntField(term382859, term382859.getClass(), "unitMask", 15);
        setIntElement(term382864, 0, 286331153);
        setIntElement(term382864, 1, 1118481);
        setIntElement(term382864, 2, 286331153);
        setIntElement(term382864, 3, 286327057);
        setIntElement(term382864, 4, 286331153);
        setIntElement(term382864, 5, 286331153);
        setIntElement(term382864, 6, 286331153);
        setIntElement(term382864, 7, 286331153);
        setIntElement(term382864, 8, 286331153);
        setIntElement(term382864, 9, 286331153);
        setIntElement(term382864, 10, 286331153);
        setIntElement(term382864, 11, 286331153);
        setIntElement(term382864, 12, 286331153);
        setIntElement(term382864, 13, 286331153);
        setIntElement(term382864, 14, 286331153);
        setIntElement(term382864, 15, 286331153);
        setIntElement(term382864, 16, 858989090);
        setIntElement(term382864, 17, 1145324612);
        setIntElement(term382864, 18, 1145324612);
        setIntElement(term382864, 19, 1145324612);
        setIntElement(term382864, 20, 1431655765);
        setIntElement(term382864, 21, 1431655765);
        setIntElement(term382864, 22, 1431655765);
        setIntElement(term382864, 23, 1431655765);
        setIntElement(term382864, 24, 1717986816);
        setIntElement(term382864, 25, 1717986918);
        setIntElement(term382864, 26, 1717986918);
        setIntElement(term382864, 27, 1717986918);
        setIntElement(term382864, 28, -2004318073);
        setIntElement(term382864, 29, -2003269496);
        setIntElement(term382864, 30, -1145324614);
        setIntElement(term382864, 31, 16702940);
        setField(term382859, term382859.getClass(), "data", term382864);
        setField(term382858, term382858.getClass(), "classTable", term382859);
        setIntField(term382858, term382858.getClass(), "classFactor", 16);
        setIntField(term382898, term382898.getClass(), "indexShift", 3);
        setIntField(term382898, term382898.getClass(), "shiftMask", 7);
        setIntField(term382898, term382898.getClass(), "bitShift", 2);
        setIntField(term382898, term382898.getClass(), "unitMask", 15);
        setIntElement(term382903, 0, -1408167679);
        setIntElement(term382903, 1, 878082233);
        setIntElement(term382903, 2, 286331153);
        setIntElement(term382903, 3, 286331153);
        setIntElement(term382903, 4, 572662306);
        setIntElement(term382903, 5, 572662306);
        setIntElement(term382903, 6, 290805009);
        setIntElement(term382903, 7, 286331153);
        setIntElement(term382903, 8, 290803985);
        setIntElement(term382903, 9, 286331153);
        setIntElement(term382903, 10, 293041937);
        setIntElement(term382903, 11, 286331153);
        setIntElement(term382903, 12, 293015825);
        setIntElement(term382903, 13, 286331153);
        setIntElement(term382903, 14, 295278865);
        setIntElement(term382903, 15, 286331153);
        setIntElement(term382903, 16, 295244049);
        setIntElement(term382903, 17, 286331153);
        setIntElement(term382903, 18, 298634257);
        setIntElement(term382903, 19, 286331153);
        setIntElement(term382903, 20, 297865489);
        setIntElement(term382903, 21, 286331153);
        setIntElement(term382903, 22, 287099921);
        setIntElement(term382903, 23, 286331153);
        setIntElement(term382903, 24, 285212689);
        setIntElement(term382903, 25, 286331153);
        setField(term382898, term382898.getClass(), "data", term382903);
        setField(term382858, term382858.getClass(), "stateTable", term382898);
        setIntElement(term382930, 1, 1);
        setIntElement(term382930, 6, 2);
        setIntElement(term382930, 7, 3);
        setIntElement(term382930, 8, 3);
        setIntElement(term382930, 9, 3);
        setIntElement(term382930, 10, 4);
        setIntElement(term382930, 11, 4);
        setIntElement(term382930, 12, 5);
        setIntElement(term382930, 13, 5);
        setIntElement(term382930, 14, 6);
        setIntElement(term382930, 15, 6);
        setField(term382858, term382858.getClass(), "charLenTable", term382930);
        setField(term382858, term382858.getClass(), "name", "UTF-8");
        setField(term382857, term382857.getClass(), "model", term382858);
        setIntField(term382857, term382857.getClass(), "currentState", 0);
        setIntField(term382857, term382857.getClass(), "currentCharLen", 0);
        setIntField(term382857, term382857.getClass(), "currentBytePos", 0);
        setField(term382856, term382856.getClass(), "codingSM", term382857);
        setField(term382856, term382856.getClass(), "state", enum67);
        setIntField(term382856, term382856.getClass(), "numOfMBChar", -243422082);
        setBooleanField(term382856, term382856.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.UTF8Prober");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharSetName", argTypes, term382856, args);
    }

};


