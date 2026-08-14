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

public class EscCharsetProber_getCharSetName_2553592141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309454;

    public EscCharsetProber_getCharSetName_2553592141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term309618 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term309617 = ((Class) term309618).getDeclaredField((String) "DETECTING");
        ((Field) term309617).setAccessible(true);
        Object enum43 = ((Field) term309617).get((Object) null);
        term309454 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber"));
        Object[] term309455 = (Object[]) newArray("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine", 4);
        Object term309456 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309457 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.HZSMModel"));
        Object term309458 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term309464 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term309469 = (int[]) newIntArray(6);
        Object term309480 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309481 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022CNSMModel"));
        Object term309482 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term309488 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term309493 = (int[]) newIntArray(9);
        Object term309507 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309508 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022JPSMModel"));
        Object term309509 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term309515 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term309520 = (int[]) newIntArray(10);
        Object term309535 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309536 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022KRSMModel"));
        Object term309537 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term309543 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term309548 = (int[]) newIntArray(6);
        setIntField(term309458, term309458.getClass(), "indexShift", 3);
        setIntField(term309458, term309458.getClass(), "shiftMask", 7);
        setIntField(term309458, term309458.getClass(), "bitShift", 2);
        setIntField(term309458, term309458.getClass(), "unitMask", 15);
        setField(term309458, term309458.getClass(), "data", null);
        setField(term309457, term309457.getClass(), "classTable", term309458);
        setIntField(term309457, term309457.getClass(), "classFactor", 6);
        setIntField(term309464, term309464.getClass(), "indexShift", 3);
        setIntField(term309464, term309464.getClass(), "shiftMask", 7);
        setIntField(term309464, term309464.getClass(), "bitShift", 2);
        setIntField(term309464, term309464.getClass(), "unitMask", 15);
        setField(term309464, term309464.getClass(), "data", null);
        setField(term309457, term309457.getClass(), "stateTable", term309464);
        setField(term309457, term309457.getClass(), "charLenTable", term309469);
        setField(term309457, term309457.getClass(), "name", "");
        setField(term309456, term309456.getClass(), "model", term309457);
        setIntField(term309456, term309456.getClass(), "currentState", 0);
        setIntField(term309456, term309456.getClass(), "currentCharLen", 0);
        setIntField(term309456, term309456.getClass(), "currentBytePos", 0);
        setElement(term309455, 0, term309456);
        setIntField(term309482, term309482.getClass(), "indexShift", 3);
        setIntField(term309482, term309482.getClass(), "shiftMask", 7);
        setIntField(term309482, term309482.getClass(), "bitShift", 2);
        setIntField(term309482, term309482.getClass(), "unitMask", 15);
        setField(term309482, term309482.getClass(), "data", null);
        setField(term309481, term309481.getClass(), "classTable", term309482);
        setIntField(term309481, term309481.getClass(), "classFactor", 9);
        setIntField(term309488, term309488.getClass(), "indexShift", 3);
        setIntField(term309488, term309488.getClass(), "shiftMask", 7);
        setIntField(term309488, term309488.getClass(), "bitShift", 2);
        setIntField(term309488, term309488.getClass(), "unitMask", 15);
        setField(term309488, term309488.getClass(), "data", null);
        setField(term309481, term309481.getClass(), "stateTable", term309488);
        setField(term309481, term309481.getClass(), "charLenTable", term309493);
        setField(term309481, term309481.getClass(), "name", "");
        setField(term309480, term309480.getClass(), "model", term309481);
        setIntField(term309480, term309480.getClass(), "currentState", 0);
        setIntField(term309480, term309480.getClass(), "currentCharLen", 0);
        setIntField(term309480, term309480.getClass(), "currentBytePos", 0);
        setElement(term309455, 1, term309480);
        setIntField(term309509, term309509.getClass(), "indexShift", 3);
        setIntField(term309509, term309509.getClass(), "shiftMask", 7);
        setIntField(term309509, term309509.getClass(), "bitShift", 2);
        setIntField(term309509, term309509.getClass(), "unitMask", 15);
        setField(term309509, term309509.getClass(), "data", null);
        setField(term309508, term309508.getClass(), "classTable", term309509);
        setIntField(term309508, term309508.getClass(), "classFactor", 10);
        setIntField(term309515, term309515.getClass(), "indexShift", 3);
        setIntField(term309515, term309515.getClass(), "shiftMask", 7);
        setIntField(term309515, term309515.getClass(), "bitShift", 2);
        setIntField(term309515, term309515.getClass(), "unitMask", 15);
        setField(term309515, term309515.getClass(), "data", null);
        setField(term309508, term309508.getClass(), "stateTable", term309515);
        setField(term309508, term309508.getClass(), "charLenTable", term309520);
        setField(term309508, term309508.getClass(), "name", "");
        setField(term309507, term309507.getClass(), "model", term309508);
        setIntField(term309507, term309507.getClass(), "currentState", 0);
        setIntField(term309507, term309507.getClass(), "currentCharLen", 0);
        setIntField(term309507, term309507.getClass(), "currentBytePos", 0);
        setElement(term309455, 2, term309507);
        setIntField(term309537, term309537.getClass(), "indexShift", 3);
        setIntField(term309537, term309537.getClass(), "shiftMask", 7);
        setIntField(term309537, term309537.getClass(), "bitShift", 2);
        setIntField(term309537, term309537.getClass(), "unitMask", 15);
        setField(term309537, term309537.getClass(), "data", null);
        setField(term309536, term309536.getClass(), "classTable", term309537);
        setIntField(term309536, term309536.getClass(), "classFactor", 6);
        setIntField(term309543, term309543.getClass(), "indexShift", 3);
        setIntField(term309543, term309543.getClass(), "shiftMask", 7);
        setIntField(term309543, term309543.getClass(), "bitShift", 2);
        setIntField(term309543, term309543.getClass(), "unitMask", 15);
        setField(term309543, term309543.getClass(), "data", null);
        setField(term309536, term309536.getClass(), "stateTable", term309543);
        setField(term309536, term309536.getClass(), "charLenTable", term309548);
        setField(term309536, term309536.getClass(), "name", "");
        setField(term309535, term309535.getClass(), "model", term309536);
        setIntField(term309535, term309535.getClass(), "currentState", 0);
        setIntField(term309535, term309535.getClass(), "currentCharLen", 0);
        setIntField(term309535, term309535.getClass(), "currentBytePos", 0);
        setElement(term309455, 3, term309535);
        setField(term309454, term309454.getClass(), "codingSM", term309455);
        setIntField(term309454, term309454.getClass(), "activeSM", 4);
        setField(term309454, term309454.getClass(), "state", enum43);
        setField(term309454, term309454.getClass(), "detectedCharset", "MuLcgQHgqz");
        setBooleanField(term309454, term309454.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharSetName", argTypes, term309454, args);
    }

};


