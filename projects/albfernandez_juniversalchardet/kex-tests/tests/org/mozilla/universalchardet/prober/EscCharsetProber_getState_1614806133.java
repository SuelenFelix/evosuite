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

public class EscCharsetProber_getState_1614806133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310488;

    public EscCharsetProber_getState_1614806133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term310652 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term310651 = ((Class) term310652).getDeclaredField((String) "DETECTING");
        ((Field) term310651).setAccessible(true);
        Object enum45 = ((Field) term310651).get((Object) null);
        term310488 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber"));
        Object[] term310489 = (Object[]) newArray("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine", 4);
        Object term310490 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term310491 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.HZSMModel"));
        Object term310492 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term310498 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term310503 = (int[]) newIntArray(6);
        Object term310514 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term310515 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022CNSMModel"));
        Object term310516 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term310522 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term310527 = (int[]) newIntArray(9);
        Object term310541 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term310542 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022JPSMModel"));
        Object term310543 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term310549 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term310554 = (int[]) newIntArray(10);
        Object term310569 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term310570 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022KRSMModel"));
        Object term310571 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term310577 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term310582 = (int[]) newIntArray(6);
        setIntField(term310492, term310492.getClass(), "indexShift", 3);
        setIntField(term310492, term310492.getClass(), "shiftMask", 7);
        setIntField(term310492, term310492.getClass(), "bitShift", 2);
        setIntField(term310492, term310492.getClass(), "unitMask", 15);
        setField(term310492, term310492.getClass(), "data", null);
        setField(term310491, term310491.getClass(), "classTable", term310492);
        setIntField(term310491, term310491.getClass(), "classFactor", 6);
        setIntField(term310498, term310498.getClass(), "indexShift", 3);
        setIntField(term310498, term310498.getClass(), "shiftMask", 7);
        setIntField(term310498, term310498.getClass(), "bitShift", 2);
        setIntField(term310498, term310498.getClass(), "unitMask", 15);
        setField(term310498, term310498.getClass(), "data", null);
        setField(term310491, term310491.getClass(), "stateTable", term310498);
        setField(term310491, term310491.getClass(), "charLenTable", term310503);
        setField(term310491, term310491.getClass(), "name", "");
        setField(term310490, term310490.getClass(), "model", term310491);
        setIntField(term310490, term310490.getClass(), "currentState", 0);
        setIntField(term310490, term310490.getClass(), "currentCharLen", 0);
        setIntField(term310490, term310490.getClass(), "currentBytePos", 0);
        setElement(term310489, 0, term310490);
        setIntField(term310516, term310516.getClass(), "indexShift", 3);
        setIntField(term310516, term310516.getClass(), "shiftMask", 7);
        setIntField(term310516, term310516.getClass(), "bitShift", 2);
        setIntField(term310516, term310516.getClass(), "unitMask", 15);
        setField(term310516, term310516.getClass(), "data", null);
        setField(term310515, term310515.getClass(), "classTable", term310516);
        setIntField(term310515, term310515.getClass(), "classFactor", 9);
        setIntField(term310522, term310522.getClass(), "indexShift", 3);
        setIntField(term310522, term310522.getClass(), "shiftMask", 7);
        setIntField(term310522, term310522.getClass(), "bitShift", 2);
        setIntField(term310522, term310522.getClass(), "unitMask", 15);
        setField(term310522, term310522.getClass(), "data", null);
        setField(term310515, term310515.getClass(), "stateTable", term310522);
        setField(term310515, term310515.getClass(), "charLenTable", term310527);
        setField(term310515, term310515.getClass(), "name", "");
        setField(term310514, term310514.getClass(), "model", term310515);
        setIntField(term310514, term310514.getClass(), "currentState", 0);
        setIntField(term310514, term310514.getClass(), "currentCharLen", 0);
        setIntField(term310514, term310514.getClass(), "currentBytePos", 0);
        setElement(term310489, 1, term310514);
        setIntField(term310543, term310543.getClass(), "indexShift", 3);
        setIntField(term310543, term310543.getClass(), "shiftMask", 7);
        setIntField(term310543, term310543.getClass(), "bitShift", 2);
        setIntField(term310543, term310543.getClass(), "unitMask", 15);
        setField(term310543, term310543.getClass(), "data", null);
        setField(term310542, term310542.getClass(), "classTable", term310543);
        setIntField(term310542, term310542.getClass(), "classFactor", 10);
        setIntField(term310549, term310549.getClass(), "indexShift", 3);
        setIntField(term310549, term310549.getClass(), "shiftMask", 7);
        setIntField(term310549, term310549.getClass(), "bitShift", 2);
        setIntField(term310549, term310549.getClass(), "unitMask", 15);
        setField(term310549, term310549.getClass(), "data", null);
        setField(term310542, term310542.getClass(), "stateTable", term310549);
        setField(term310542, term310542.getClass(), "charLenTable", term310554);
        setField(term310542, term310542.getClass(), "name", "");
        setField(term310541, term310541.getClass(), "model", term310542);
        setIntField(term310541, term310541.getClass(), "currentState", 0);
        setIntField(term310541, term310541.getClass(), "currentCharLen", 0);
        setIntField(term310541, term310541.getClass(), "currentBytePos", 0);
        setElement(term310489, 2, term310541);
        setIntField(term310571, term310571.getClass(), "indexShift", 3);
        setIntField(term310571, term310571.getClass(), "shiftMask", 7);
        setIntField(term310571, term310571.getClass(), "bitShift", 2);
        setIntField(term310571, term310571.getClass(), "unitMask", 15);
        setField(term310571, term310571.getClass(), "data", null);
        setField(term310570, term310570.getClass(), "classTable", term310571);
        setIntField(term310570, term310570.getClass(), "classFactor", 6);
        setIntField(term310577, term310577.getClass(), "indexShift", 3);
        setIntField(term310577, term310577.getClass(), "shiftMask", 7);
        setIntField(term310577, term310577.getClass(), "bitShift", 2);
        setIntField(term310577, term310577.getClass(), "unitMask", 15);
        setField(term310577, term310577.getClass(), "data", null);
        setField(term310570, term310570.getClass(), "stateTable", term310577);
        setField(term310570, term310570.getClass(), "charLenTable", term310582);
        setField(term310570, term310570.getClass(), "name", "");
        setField(term310569, term310569.getClass(), "model", term310570);
        setIntField(term310569, term310569.getClass(), "currentState", 0);
        setIntField(term310569, term310569.getClass(), "currentCharLen", 0);
        setIntField(term310569, term310569.getClass(), "currentBytePos", 0);
        setElement(term310489, 3, term310569);
        setField(term310488, term310488.getClass(), "codingSM", term310489);
        setIntField(term310488, term310488.getClass(), "activeSM", 4);
        setField(term310488, term310488.getClass(), "state", enum45);
        setField(term310488, term310488.getClass(), "detectedCharset", "jJCZpVmanW");
        setBooleanField(term310488, term310488.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term310488, args);
    }

};


