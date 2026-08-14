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

public class UTF8Prober_getState_19119733113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383941;

    public UTF8Prober_getState_19119733113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term384137 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term384136 = ((Class) term384137).getDeclaredField((String) "DETECTING");
        ((Field) term384136).setAccessible(true);
        Object enum69 = ((Field) term384136).get((Object) null);
        term383941 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term383942 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term383943 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.UTF8SMModel"));
        Object term383944 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term383949 = (int[]) newIntArray(32);
        Object term383983 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term383988 = (int[]) newIntArray(26);
        int[] term384015 = (int[]) newIntArray(16);
        setIntField(term383944, term383944.getClass(), "indexShift", 3);
        setIntField(term383944, term383944.getClass(), "shiftMask", 7);
        setIntField(term383944, term383944.getClass(), "bitShift", 2);
        setIntField(term383944, term383944.getClass(), "unitMask", 15);
        setIntElement(term383949, 0, 286331153);
        setIntElement(term383949, 1, 1118481);
        setIntElement(term383949, 2, 286331153);
        setIntElement(term383949, 3, 286327057);
        setIntElement(term383949, 4, 286331153);
        setIntElement(term383949, 5, 286331153);
        setIntElement(term383949, 6, 286331153);
        setIntElement(term383949, 7, 286331153);
        setIntElement(term383949, 8, 286331153);
        setIntElement(term383949, 9, 286331153);
        setIntElement(term383949, 10, 286331153);
        setIntElement(term383949, 11, 286331153);
        setIntElement(term383949, 12, 286331153);
        setIntElement(term383949, 13, 286331153);
        setIntElement(term383949, 14, 286331153);
        setIntElement(term383949, 15, 286331153);
        setIntElement(term383949, 16, 858989090);
        setIntElement(term383949, 17, 1145324612);
        setIntElement(term383949, 18, 1145324612);
        setIntElement(term383949, 19, 1145324612);
        setIntElement(term383949, 20, 1431655765);
        setIntElement(term383949, 21, 1431655765);
        setIntElement(term383949, 22, 1431655765);
        setIntElement(term383949, 23, 1431655765);
        setIntElement(term383949, 24, 1717986816);
        setIntElement(term383949, 25, 1717986918);
        setIntElement(term383949, 26, 1717986918);
        setIntElement(term383949, 27, 1717986918);
        setIntElement(term383949, 28, -2004318073);
        setIntElement(term383949, 29, -2003269496);
        setIntElement(term383949, 30, -1145324614);
        setIntElement(term383949, 31, 16702940);
        setField(term383944, term383944.getClass(), "data", term383949);
        setField(term383943, term383943.getClass(), "classTable", term383944);
        setIntField(term383943, term383943.getClass(), "classFactor", 16);
        setIntField(term383983, term383983.getClass(), "indexShift", 3);
        setIntField(term383983, term383983.getClass(), "shiftMask", 7);
        setIntField(term383983, term383983.getClass(), "bitShift", 2);
        setIntField(term383983, term383983.getClass(), "unitMask", 15);
        setIntElement(term383988, 0, -1408167679);
        setIntElement(term383988, 1, 878082233);
        setIntElement(term383988, 2, 286331153);
        setIntElement(term383988, 3, 286331153);
        setIntElement(term383988, 4, 572662306);
        setIntElement(term383988, 5, 572662306);
        setIntElement(term383988, 6, 290805009);
        setIntElement(term383988, 7, 286331153);
        setIntElement(term383988, 8, 290803985);
        setIntElement(term383988, 9, 286331153);
        setIntElement(term383988, 10, 293041937);
        setIntElement(term383988, 11, 286331153);
        setIntElement(term383988, 12, 293015825);
        setIntElement(term383988, 13, 286331153);
        setIntElement(term383988, 14, 295278865);
        setIntElement(term383988, 15, 286331153);
        setIntElement(term383988, 16, 295244049);
        setIntElement(term383988, 17, 286331153);
        setIntElement(term383988, 18, 298634257);
        setIntElement(term383988, 19, 286331153);
        setIntElement(term383988, 20, 297865489);
        setIntElement(term383988, 21, 286331153);
        setIntElement(term383988, 22, 287099921);
        setIntElement(term383988, 23, 286331153);
        setIntElement(term383988, 24, 285212689);
        setIntElement(term383988, 25, 286331153);
        setField(term383983, term383983.getClass(), "data", term383988);
        setField(term383943, term383943.getClass(), "stateTable", term383983);
        setIntElement(term384015, 1, 1);
        setIntElement(term384015, 6, 2);
        setIntElement(term384015, 7, 3);
        setIntElement(term384015, 8, 3);
        setIntElement(term384015, 9, 3);
        setIntElement(term384015, 10, 4);
        setIntElement(term384015, 11, 4);
        setIntElement(term384015, 12, 5);
        setIntElement(term384015, 13, 5);
        setIntElement(term384015, 14, 6);
        setIntElement(term384015, 15, 6);
        setField(term383943, term383943.getClass(), "charLenTable", term384015);
        setField(term383943, term383943.getClass(), "name", "UTF-8");
        setField(term383942, term383942.getClass(), "model", term383943);
        setIntField(term383942, term383942.getClass(), "currentState", 0);
        setIntField(term383942, term383942.getClass(), "currentCharLen", 0);
        setIntField(term383942, term383942.getClass(), "currentBytePos", 0);
        setField(term383941, term383941.getClass(), "codingSM", term383942);
        setField(term383941, term383941.getClass(), "state", enum69);
        setIntField(term383941, term383941.getClass(), "numOfMBChar", 1296895584);
        setBooleanField(term383941, term383941.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.UTF8Prober");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term383941, args);
    }

};


