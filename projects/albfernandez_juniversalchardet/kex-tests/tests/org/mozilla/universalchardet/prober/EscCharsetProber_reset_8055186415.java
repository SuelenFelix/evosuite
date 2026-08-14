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

public class EscCharsetProber_reset_8055186415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311531;

    public EscCharsetProber_reset_8055186415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term311695 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term311694 = ((Class) term311695).getDeclaredField((String) "DETECTING");
        ((Field) term311694).setAccessible(true);
        Object enum47 = ((Field) term311694).get((Object) null);
        term311531 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber"));
        Object[] term311532 = (Object[]) newArray("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine", 4);
        Object term311533 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term311534 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.HZSMModel"));
        Object term311535 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term311541 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term311546 = (int[]) newIntArray(6);
        Object term311557 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term311558 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022CNSMModel"));
        Object term311559 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term311565 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term311570 = (int[]) newIntArray(9);
        Object term311584 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term311585 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022JPSMModel"));
        Object term311586 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term311592 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term311597 = (int[]) newIntArray(10);
        Object term311612 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term311613 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022KRSMModel"));
        Object term311614 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term311620 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term311625 = (int[]) newIntArray(6);
        setIntField(term311535, term311535.getClass(), "indexShift", 3);
        setIntField(term311535, term311535.getClass(), "shiftMask", 7);
        setIntField(term311535, term311535.getClass(), "bitShift", 2);
        setIntField(term311535, term311535.getClass(), "unitMask", 15);
        setField(term311535, term311535.getClass(), "data", null);
        setField(term311534, term311534.getClass(), "classTable", term311535);
        setIntField(term311534, term311534.getClass(), "classFactor", 6);
        setIntField(term311541, term311541.getClass(), "indexShift", 3);
        setIntField(term311541, term311541.getClass(), "shiftMask", 7);
        setIntField(term311541, term311541.getClass(), "bitShift", 2);
        setIntField(term311541, term311541.getClass(), "unitMask", 15);
        setField(term311541, term311541.getClass(), "data", null);
        setField(term311534, term311534.getClass(), "stateTable", term311541);
        setField(term311534, term311534.getClass(), "charLenTable", term311546);
        setField(term311534, term311534.getClass(), "name", "");
        setField(term311533, term311533.getClass(), "model", term311534);
        setIntField(term311533, term311533.getClass(), "currentState", 0);
        setIntField(term311533, term311533.getClass(), "currentCharLen", 0);
        setIntField(term311533, term311533.getClass(), "currentBytePos", 0);
        setElement(term311532, 0, term311533);
        setIntField(term311559, term311559.getClass(), "indexShift", 3);
        setIntField(term311559, term311559.getClass(), "shiftMask", 7);
        setIntField(term311559, term311559.getClass(), "bitShift", 2);
        setIntField(term311559, term311559.getClass(), "unitMask", 15);
        setField(term311559, term311559.getClass(), "data", null);
        setField(term311558, term311558.getClass(), "classTable", term311559);
        setIntField(term311558, term311558.getClass(), "classFactor", 9);
        setIntField(term311565, term311565.getClass(), "indexShift", 3);
        setIntField(term311565, term311565.getClass(), "shiftMask", 7);
        setIntField(term311565, term311565.getClass(), "bitShift", 2);
        setIntField(term311565, term311565.getClass(), "unitMask", 15);
        setField(term311565, term311565.getClass(), "data", null);
        setField(term311558, term311558.getClass(), "stateTable", term311565);
        setField(term311558, term311558.getClass(), "charLenTable", term311570);
        setField(term311558, term311558.getClass(), "name", "");
        setField(term311557, term311557.getClass(), "model", term311558);
        setIntField(term311557, term311557.getClass(), "currentState", 0);
        setIntField(term311557, term311557.getClass(), "currentCharLen", 0);
        setIntField(term311557, term311557.getClass(), "currentBytePos", 0);
        setElement(term311532, 1, term311557);
        setIntField(term311586, term311586.getClass(), "indexShift", 3);
        setIntField(term311586, term311586.getClass(), "shiftMask", 7);
        setIntField(term311586, term311586.getClass(), "bitShift", 2);
        setIntField(term311586, term311586.getClass(), "unitMask", 15);
        setField(term311586, term311586.getClass(), "data", null);
        setField(term311585, term311585.getClass(), "classTable", term311586);
        setIntField(term311585, term311585.getClass(), "classFactor", 10);
        setIntField(term311592, term311592.getClass(), "indexShift", 3);
        setIntField(term311592, term311592.getClass(), "shiftMask", 7);
        setIntField(term311592, term311592.getClass(), "bitShift", 2);
        setIntField(term311592, term311592.getClass(), "unitMask", 15);
        setField(term311592, term311592.getClass(), "data", null);
        setField(term311585, term311585.getClass(), "stateTable", term311592);
        setField(term311585, term311585.getClass(), "charLenTable", term311597);
        setField(term311585, term311585.getClass(), "name", "");
        setField(term311584, term311584.getClass(), "model", term311585);
        setIntField(term311584, term311584.getClass(), "currentState", 0);
        setIntField(term311584, term311584.getClass(), "currentCharLen", 0);
        setIntField(term311584, term311584.getClass(), "currentBytePos", 0);
        setElement(term311532, 2, term311584);
        setIntField(term311614, term311614.getClass(), "indexShift", 3);
        setIntField(term311614, term311614.getClass(), "shiftMask", 7);
        setIntField(term311614, term311614.getClass(), "bitShift", 2);
        setIntField(term311614, term311614.getClass(), "unitMask", 15);
        setField(term311614, term311614.getClass(), "data", null);
        setField(term311613, term311613.getClass(), "classTable", term311614);
        setIntField(term311613, term311613.getClass(), "classFactor", 6);
        setIntField(term311620, term311620.getClass(), "indexShift", 3);
        setIntField(term311620, term311620.getClass(), "shiftMask", 7);
        setIntField(term311620, term311620.getClass(), "bitShift", 2);
        setIntField(term311620, term311620.getClass(), "unitMask", 15);
        setField(term311620, term311620.getClass(), "data", null);
        setField(term311613, term311613.getClass(), "stateTable", term311620);
        setField(term311613, term311613.getClass(), "charLenTable", term311625);
        setField(term311613, term311613.getClass(), "name", "");
        setField(term311612, term311612.getClass(), "model", term311613);
        setIntField(term311612, term311612.getClass(), "currentState", 0);
        setIntField(term311612, term311612.getClass(), "currentCharLen", 0);
        setIntField(term311612, term311612.getClass(), "currentBytePos", 0);
        setElement(term311532, 3, term311612);
        setField(term311531, term311531.getClass(), "codingSM", term311532);
        setIntField(term311531, term311531.getClass(), "activeSM", 4);
        setField(term311531, term311531.getClass(), "state", enum47);
        setField(term311531, term311531.getClass(), "detectedCharset", "SzjVpOQTyS");
        setBooleanField(term311531, term311531.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term311531, args);
    }

};


