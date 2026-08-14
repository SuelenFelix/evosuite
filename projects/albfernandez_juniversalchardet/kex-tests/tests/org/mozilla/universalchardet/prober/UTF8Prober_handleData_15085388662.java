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
import java.lang.Integer;

public class UTF8Prober_handleData_15085388662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383395;
     Object term383511;
     Object term383513;
     Object term383515;

    public UTF8Prober_handleData_15085388662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term383597 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term383596 = ((Class) term383597).getDeclaredField((String) "DETECTING");
        ((Field) term383596).setAccessible(true);
        Object enum68 = ((Field) term383596).get((Object) null);
        term383395 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term383396 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term383397 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.UTF8SMModel"));
        Object term383398 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term383403 = (int[]) newIntArray(32);
        Object term383437 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term383442 = (int[]) newIntArray(26);
        int[] term383469 = (int[]) newIntArray(16);
        setIntField(term383398, term383398.getClass(), "indexShift", 3);
        setIntField(term383398, term383398.getClass(), "shiftMask", 7);
        setIntField(term383398, term383398.getClass(), "bitShift", 2);
        setIntField(term383398, term383398.getClass(), "unitMask", 15);
        setIntElement(term383403, 0, 286331153);
        setIntElement(term383403, 1, 1118481);
        setIntElement(term383403, 2, 286331153);
        setIntElement(term383403, 3, 286327057);
        setIntElement(term383403, 4, 286331153);
        setIntElement(term383403, 5, 286331153);
        setIntElement(term383403, 6, 286331153);
        setIntElement(term383403, 7, 286331153);
        setIntElement(term383403, 8, 286331153);
        setIntElement(term383403, 9, 286331153);
        setIntElement(term383403, 10, 286331153);
        setIntElement(term383403, 11, 286331153);
        setIntElement(term383403, 12, 286331153);
        setIntElement(term383403, 13, 286331153);
        setIntElement(term383403, 14, 286331153);
        setIntElement(term383403, 15, 286331153);
        setIntElement(term383403, 16, 858989090);
        setIntElement(term383403, 17, 1145324612);
        setIntElement(term383403, 18, 1145324612);
        setIntElement(term383403, 19, 1145324612);
        setIntElement(term383403, 20, 1431655765);
        setIntElement(term383403, 21, 1431655765);
        setIntElement(term383403, 22, 1431655765);
        setIntElement(term383403, 23, 1431655765);
        setIntElement(term383403, 24, 1717986816);
        setIntElement(term383403, 25, 1717986918);
        setIntElement(term383403, 26, 1717986918);
        setIntElement(term383403, 27, 1717986918);
        setIntElement(term383403, 28, -2004318073);
        setIntElement(term383403, 29, -2003269496);
        setIntElement(term383403, 30, -1145324614);
        setIntElement(term383403, 31, 16702940);
        setField(term383398, term383398.getClass(), "data", term383403);
        setField(term383397, term383397.getClass(), "classTable", term383398);
        setIntField(term383397, term383397.getClass(), "classFactor", 16);
        setIntField(term383437, term383437.getClass(), "indexShift", 3);
        setIntField(term383437, term383437.getClass(), "shiftMask", 7);
        setIntField(term383437, term383437.getClass(), "bitShift", 2);
        setIntField(term383437, term383437.getClass(), "unitMask", 15);
        setIntElement(term383442, 0, -1408167679);
        setIntElement(term383442, 1, 878082233);
        setIntElement(term383442, 2, 286331153);
        setIntElement(term383442, 3, 286331153);
        setIntElement(term383442, 4, 572662306);
        setIntElement(term383442, 5, 572662306);
        setIntElement(term383442, 6, 290805009);
        setIntElement(term383442, 7, 286331153);
        setIntElement(term383442, 8, 290803985);
        setIntElement(term383442, 9, 286331153);
        setIntElement(term383442, 10, 293041937);
        setIntElement(term383442, 11, 286331153);
        setIntElement(term383442, 12, 293015825);
        setIntElement(term383442, 13, 286331153);
        setIntElement(term383442, 14, 295278865);
        setIntElement(term383442, 15, 286331153);
        setIntElement(term383442, 16, 295244049);
        setIntElement(term383442, 17, 286331153);
        setIntElement(term383442, 18, 298634257);
        setIntElement(term383442, 19, 286331153);
        setIntElement(term383442, 20, 297865489);
        setIntElement(term383442, 21, 286331153);
        setIntElement(term383442, 22, 287099921);
        setIntElement(term383442, 23, 286331153);
        setIntElement(term383442, 24, 285212689);
        setIntElement(term383442, 25, 286331153);
        setField(term383437, term383437.getClass(), "data", term383442);
        setField(term383397, term383397.getClass(), "stateTable", term383437);
        setIntElement(term383469, 1, 1);
        setIntElement(term383469, 6, 2);
        setIntElement(term383469, 7, 3);
        setIntElement(term383469, 8, 3);
        setIntElement(term383469, 9, 3);
        setIntElement(term383469, 10, 4);
        setIntElement(term383469, 11, 4);
        setIntElement(term383469, 12, 5);
        setIntElement(term383469, 13, 5);
        setIntElement(term383469, 14, 6);
        setIntElement(term383469, 15, 6);
        setField(term383397, term383397.getClass(), "charLenTable", term383469);
        setField(term383397, term383397.getClass(), "name", "UTF-8");
        setField(term383396, term383396.getClass(), "model", term383397);
        setIntField(term383396, term383396.getClass(), "currentState", 0);
        setIntField(term383396, term383396.getClass(), "currentCharLen", 0);
        setIntField(term383396, term383396.getClass(), "currentBytePos", 0);
        setField(term383395, term383395.getClass(), "codingSM", term383396);
        setField(term383395, term383395.getClass(), "state", enum68);
        setIntField(term383395, term383395.getClass(), "numOfMBChar", 1384592638);
        setBooleanField(term383395, term383395.getClass(), "active", true);
        term383511 = (byte[]) newByteArray(1);
        setByteElement(term383511, 0, (byte) 51);
        term383513 = new Integer(-1002370457);
        term383515 = new Integer(-2014576105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.UTF8Prober");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term383511;
        args[1] = term383513;
        args[2] = term383515;
        callMethod(klass, "handleData", argTypes, term383395, args);
    }

};


