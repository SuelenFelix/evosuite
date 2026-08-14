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

public class UTF8Prober_getConfidence_4087885905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385019;

    public UTF8Prober_getConfidence_4087885905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term385215 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term385214 = ((Class) term385215).getDeclaredField((String) "DETECTING");
        ((Field) term385214).setAccessible(true);
        Object enum71 = ((Field) term385214).get((Object) null);
        term385019 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term385020 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term385021 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.UTF8SMModel"));
        Object term385022 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term385027 = (int[]) newIntArray(32);
        Object term385061 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term385066 = (int[]) newIntArray(26);
        int[] term385093 = (int[]) newIntArray(16);
        setIntField(term385022, term385022.getClass(), "indexShift", 3);
        setIntField(term385022, term385022.getClass(), "shiftMask", 7);
        setIntField(term385022, term385022.getClass(), "bitShift", 2);
        setIntField(term385022, term385022.getClass(), "unitMask", 15);
        setIntElement(term385027, 0, 286331153);
        setIntElement(term385027, 1, 1118481);
        setIntElement(term385027, 2, 286331153);
        setIntElement(term385027, 3, 286327057);
        setIntElement(term385027, 4, 286331153);
        setIntElement(term385027, 5, 286331153);
        setIntElement(term385027, 6, 286331153);
        setIntElement(term385027, 7, 286331153);
        setIntElement(term385027, 8, 286331153);
        setIntElement(term385027, 9, 286331153);
        setIntElement(term385027, 10, 286331153);
        setIntElement(term385027, 11, 286331153);
        setIntElement(term385027, 12, 286331153);
        setIntElement(term385027, 13, 286331153);
        setIntElement(term385027, 14, 286331153);
        setIntElement(term385027, 15, 286331153);
        setIntElement(term385027, 16, 858989090);
        setIntElement(term385027, 17, 1145324612);
        setIntElement(term385027, 18, 1145324612);
        setIntElement(term385027, 19, 1145324612);
        setIntElement(term385027, 20, 1431655765);
        setIntElement(term385027, 21, 1431655765);
        setIntElement(term385027, 22, 1431655765);
        setIntElement(term385027, 23, 1431655765);
        setIntElement(term385027, 24, 1717986816);
        setIntElement(term385027, 25, 1717986918);
        setIntElement(term385027, 26, 1717986918);
        setIntElement(term385027, 27, 1717986918);
        setIntElement(term385027, 28, -2004318073);
        setIntElement(term385027, 29, -2003269496);
        setIntElement(term385027, 30, -1145324614);
        setIntElement(term385027, 31, 16702940);
        setField(term385022, term385022.getClass(), "data", term385027);
        setField(term385021, term385021.getClass(), "classTable", term385022);
        setIntField(term385021, term385021.getClass(), "classFactor", 16);
        setIntField(term385061, term385061.getClass(), "indexShift", 3);
        setIntField(term385061, term385061.getClass(), "shiftMask", 7);
        setIntField(term385061, term385061.getClass(), "bitShift", 2);
        setIntField(term385061, term385061.getClass(), "unitMask", 15);
        setIntElement(term385066, 0, -1408167679);
        setIntElement(term385066, 1, 878082233);
        setIntElement(term385066, 2, 286331153);
        setIntElement(term385066, 3, 286331153);
        setIntElement(term385066, 4, 572662306);
        setIntElement(term385066, 5, 572662306);
        setIntElement(term385066, 6, 290805009);
        setIntElement(term385066, 7, 286331153);
        setIntElement(term385066, 8, 290803985);
        setIntElement(term385066, 9, 286331153);
        setIntElement(term385066, 10, 293041937);
        setIntElement(term385066, 11, 286331153);
        setIntElement(term385066, 12, 293015825);
        setIntElement(term385066, 13, 286331153);
        setIntElement(term385066, 14, 295278865);
        setIntElement(term385066, 15, 286331153);
        setIntElement(term385066, 16, 295244049);
        setIntElement(term385066, 17, 286331153);
        setIntElement(term385066, 18, 298634257);
        setIntElement(term385066, 19, 286331153);
        setIntElement(term385066, 20, 297865489);
        setIntElement(term385066, 21, 286331153);
        setIntElement(term385066, 22, 287099921);
        setIntElement(term385066, 23, 286331153);
        setIntElement(term385066, 24, 285212689);
        setIntElement(term385066, 25, 286331153);
        setField(term385061, term385061.getClass(), "data", term385066);
        setField(term385021, term385021.getClass(), "stateTable", term385061);
        setIntElement(term385093, 1, 1);
        setIntElement(term385093, 6, 2);
        setIntElement(term385093, 7, 3);
        setIntElement(term385093, 8, 3);
        setIntElement(term385093, 9, 3);
        setIntElement(term385093, 10, 4);
        setIntElement(term385093, 11, 4);
        setIntElement(term385093, 12, 5);
        setIntElement(term385093, 13, 5);
        setIntElement(term385093, 14, 6);
        setIntElement(term385093, 15, 6);
        setField(term385021, term385021.getClass(), "charLenTable", term385093);
        setField(term385021, term385021.getClass(), "name", "UTF-8");
        setField(term385020, term385020.getClass(), "model", term385021);
        setIntField(term385020, term385020.getClass(), "currentState", 0);
        setIntField(term385020, term385020.getClass(), "currentCharLen", 0);
        setIntField(term385020, term385020.getClass(), "currentBytePos", 0);
        setField(term385019, term385019.getClass(), "codingSM", term385020);
        setField(term385019, term385019.getClass(), "state", enum71);
        setIntField(term385019, term385019.getClass(), "numOfMBChar", -1274456137);
        setBooleanField(term385019, term385019.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.UTF8Prober");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfidence", argTypes, term385019, args);
    }

};


