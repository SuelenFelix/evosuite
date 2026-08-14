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

public class UTF8Prober_setOption_17427853156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385558;

    public UTF8Prober_setOption_17427853156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term385754 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term385753 = ((Class) term385754).getDeclaredField((String) "DETECTING");
        ((Field) term385753).setAccessible(true);
        Object enum72 = ((Field) term385753).get((Object) null);
        term385558 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term385559 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term385560 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.UTF8SMModel"));
        Object term385561 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term385566 = (int[]) newIntArray(32);
        Object term385600 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term385605 = (int[]) newIntArray(26);
        int[] term385632 = (int[]) newIntArray(16);
        setIntField(term385561, term385561.getClass(), "indexShift", 3);
        setIntField(term385561, term385561.getClass(), "shiftMask", 7);
        setIntField(term385561, term385561.getClass(), "bitShift", 2);
        setIntField(term385561, term385561.getClass(), "unitMask", 15);
        setIntElement(term385566, 0, 286331153);
        setIntElement(term385566, 1, 1118481);
        setIntElement(term385566, 2, 286331153);
        setIntElement(term385566, 3, 286327057);
        setIntElement(term385566, 4, 286331153);
        setIntElement(term385566, 5, 286331153);
        setIntElement(term385566, 6, 286331153);
        setIntElement(term385566, 7, 286331153);
        setIntElement(term385566, 8, 286331153);
        setIntElement(term385566, 9, 286331153);
        setIntElement(term385566, 10, 286331153);
        setIntElement(term385566, 11, 286331153);
        setIntElement(term385566, 12, 286331153);
        setIntElement(term385566, 13, 286331153);
        setIntElement(term385566, 14, 286331153);
        setIntElement(term385566, 15, 286331153);
        setIntElement(term385566, 16, 858989090);
        setIntElement(term385566, 17, 1145324612);
        setIntElement(term385566, 18, 1145324612);
        setIntElement(term385566, 19, 1145324612);
        setIntElement(term385566, 20, 1431655765);
        setIntElement(term385566, 21, 1431655765);
        setIntElement(term385566, 22, 1431655765);
        setIntElement(term385566, 23, 1431655765);
        setIntElement(term385566, 24, 1717986816);
        setIntElement(term385566, 25, 1717986918);
        setIntElement(term385566, 26, 1717986918);
        setIntElement(term385566, 27, 1717986918);
        setIntElement(term385566, 28, -2004318073);
        setIntElement(term385566, 29, -2003269496);
        setIntElement(term385566, 30, -1145324614);
        setIntElement(term385566, 31, 16702940);
        setField(term385561, term385561.getClass(), "data", term385566);
        setField(term385560, term385560.getClass(), "classTable", term385561);
        setIntField(term385560, term385560.getClass(), "classFactor", 16);
        setIntField(term385600, term385600.getClass(), "indexShift", 3);
        setIntField(term385600, term385600.getClass(), "shiftMask", 7);
        setIntField(term385600, term385600.getClass(), "bitShift", 2);
        setIntField(term385600, term385600.getClass(), "unitMask", 15);
        setIntElement(term385605, 0, -1408167679);
        setIntElement(term385605, 1, 878082233);
        setIntElement(term385605, 2, 286331153);
        setIntElement(term385605, 3, 286331153);
        setIntElement(term385605, 4, 572662306);
        setIntElement(term385605, 5, 572662306);
        setIntElement(term385605, 6, 290805009);
        setIntElement(term385605, 7, 286331153);
        setIntElement(term385605, 8, 290803985);
        setIntElement(term385605, 9, 286331153);
        setIntElement(term385605, 10, 293041937);
        setIntElement(term385605, 11, 286331153);
        setIntElement(term385605, 12, 293015825);
        setIntElement(term385605, 13, 286331153);
        setIntElement(term385605, 14, 295278865);
        setIntElement(term385605, 15, 286331153);
        setIntElement(term385605, 16, 295244049);
        setIntElement(term385605, 17, 286331153);
        setIntElement(term385605, 18, 298634257);
        setIntElement(term385605, 19, 286331153);
        setIntElement(term385605, 20, 297865489);
        setIntElement(term385605, 21, 286331153);
        setIntElement(term385605, 22, 287099921);
        setIntElement(term385605, 23, 286331153);
        setIntElement(term385605, 24, 285212689);
        setIntElement(term385605, 25, 286331153);
        setField(term385600, term385600.getClass(), "data", term385605);
        setField(term385560, term385560.getClass(), "stateTable", term385600);
        setIntElement(term385632, 1, 1);
        setIntElement(term385632, 6, 2);
        setIntElement(term385632, 7, 3);
        setIntElement(term385632, 8, 3);
        setIntElement(term385632, 9, 3);
        setIntElement(term385632, 10, 4);
        setIntElement(term385632, 11, 4);
        setIntElement(term385632, 12, 5);
        setIntElement(term385632, 13, 5);
        setIntElement(term385632, 14, 6);
        setIntElement(term385632, 15, 6);
        setField(term385560, term385560.getClass(), "charLenTable", term385632);
        setField(term385560, term385560.getClass(), "name", "UTF-8");
        setField(term385559, term385559.getClass(), "model", term385560);
        setIntField(term385559, term385559.getClass(), "currentState", 0);
        setIntField(term385559, term385559.getClass(), "currentCharLen", 0);
        setIntField(term385559, term385559.getClass(), "currentBytePos", 0);
        setField(term385558, term385558.getClass(), "codingSM", term385559);
        setField(term385558, term385558.getClass(), "state", enum72);
        setIntField(term385558, term385558.getClass(), "numOfMBChar", 1041916673);
        setBooleanField(term385558, term385558.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.UTF8Prober");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setOption", argTypes, term385558, args);
    }

};


