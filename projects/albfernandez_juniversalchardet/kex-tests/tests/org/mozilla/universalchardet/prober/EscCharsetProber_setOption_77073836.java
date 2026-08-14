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

public class EscCharsetProber_setOption_77073836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312048;

    public EscCharsetProber_setOption_77073836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term312212 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term312211 = ((Class) term312212).getDeclaredField((String) "DETECTING");
        ((Field) term312211).setAccessible(true);
        Object enum48 = ((Field) term312211).get((Object) null);
        term312048 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber"));
        Object[] term312049 = (Object[]) newArray("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine", 4);
        Object term312050 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term312051 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.HZSMModel"));
        Object term312052 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term312058 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term312063 = (int[]) newIntArray(6);
        Object term312074 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term312075 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022CNSMModel"));
        Object term312076 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term312082 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term312087 = (int[]) newIntArray(9);
        Object term312101 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term312102 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022JPSMModel"));
        Object term312103 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term312109 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term312114 = (int[]) newIntArray(10);
        Object term312129 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term312130 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022KRSMModel"));
        Object term312131 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term312137 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term312142 = (int[]) newIntArray(6);
        setIntField(term312052, term312052.getClass(), "indexShift", 3);
        setIntField(term312052, term312052.getClass(), "shiftMask", 7);
        setIntField(term312052, term312052.getClass(), "bitShift", 2);
        setIntField(term312052, term312052.getClass(), "unitMask", 15);
        setField(term312052, term312052.getClass(), "data", null);
        setField(term312051, term312051.getClass(), "classTable", term312052);
        setIntField(term312051, term312051.getClass(), "classFactor", 6);
        setIntField(term312058, term312058.getClass(), "indexShift", 3);
        setIntField(term312058, term312058.getClass(), "shiftMask", 7);
        setIntField(term312058, term312058.getClass(), "bitShift", 2);
        setIntField(term312058, term312058.getClass(), "unitMask", 15);
        setField(term312058, term312058.getClass(), "data", null);
        setField(term312051, term312051.getClass(), "stateTable", term312058);
        setField(term312051, term312051.getClass(), "charLenTable", term312063);
        setField(term312051, term312051.getClass(), "name", "");
        setField(term312050, term312050.getClass(), "model", term312051);
        setIntField(term312050, term312050.getClass(), "currentState", 0);
        setIntField(term312050, term312050.getClass(), "currentCharLen", 0);
        setIntField(term312050, term312050.getClass(), "currentBytePos", 0);
        setElement(term312049, 0, term312050);
        setIntField(term312076, term312076.getClass(), "indexShift", 3);
        setIntField(term312076, term312076.getClass(), "shiftMask", 7);
        setIntField(term312076, term312076.getClass(), "bitShift", 2);
        setIntField(term312076, term312076.getClass(), "unitMask", 15);
        setField(term312076, term312076.getClass(), "data", null);
        setField(term312075, term312075.getClass(), "classTable", term312076);
        setIntField(term312075, term312075.getClass(), "classFactor", 9);
        setIntField(term312082, term312082.getClass(), "indexShift", 3);
        setIntField(term312082, term312082.getClass(), "shiftMask", 7);
        setIntField(term312082, term312082.getClass(), "bitShift", 2);
        setIntField(term312082, term312082.getClass(), "unitMask", 15);
        setField(term312082, term312082.getClass(), "data", null);
        setField(term312075, term312075.getClass(), "stateTable", term312082);
        setField(term312075, term312075.getClass(), "charLenTable", term312087);
        setField(term312075, term312075.getClass(), "name", "");
        setField(term312074, term312074.getClass(), "model", term312075);
        setIntField(term312074, term312074.getClass(), "currentState", 0);
        setIntField(term312074, term312074.getClass(), "currentCharLen", 0);
        setIntField(term312074, term312074.getClass(), "currentBytePos", 0);
        setElement(term312049, 1, term312074);
        setIntField(term312103, term312103.getClass(), "indexShift", 3);
        setIntField(term312103, term312103.getClass(), "shiftMask", 7);
        setIntField(term312103, term312103.getClass(), "bitShift", 2);
        setIntField(term312103, term312103.getClass(), "unitMask", 15);
        setField(term312103, term312103.getClass(), "data", null);
        setField(term312102, term312102.getClass(), "classTable", term312103);
        setIntField(term312102, term312102.getClass(), "classFactor", 10);
        setIntField(term312109, term312109.getClass(), "indexShift", 3);
        setIntField(term312109, term312109.getClass(), "shiftMask", 7);
        setIntField(term312109, term312109.getClass(), "bitShift", 2);
        setIntField(term312109, term312109.getClass(), "unitMask", 15);
        setField(term312109, term312109.getClass(), "data", null);
        setField(term312102, term312102.getClass(), "stateTable", term312109);
        setField(term312102, term312102.getClass(), "charLenTable", term312114);
        setField(term312102, term312102.getClass(), "name", "");
        setField(term312101, term312101.getClass(), "model", term312102);
        setIntField(term312101, term312101.getClass(), "currentState", 0);
        setIntField(term312101, term312101.getClass(), "currentCharLen", 0);
        setIntField(term312101, term312101.getClass(), "currentBytePos", 0);
        setElement(term312049, 2, term312101);
        setIntField(term312131, term312131.getClass(), "indexShift", 3);
        setIntField(term312131, term312131.getClass(), "shiftMask", 7);
        setIntField(term312131, term312131.getClass(), "bitShift", 2);
        setIntField(term312131, term312131.getClass(), "unitMask", 15);
        setField(term312131, term312131.getClass(), "data", null);
        setField(term312130, term312130.getClass(), "classTable", term312131);
        setIntField(term312130, term312130.getClass(), "classFactor", 6);
        setIntField(term312137, term312137.getClass(), "indexShift", 3);
        setIntField(term312137, term312137.getClass(), "shiftMask", 7);
        setIntField(term312137, term312137.getClass(), "bitShift", 2);
        setIntField(term312137, term312137.getClass(), "unitMask", 15);
        setField(term312137, term312137.getClass(), "data", null);
        setField(term312130, term312130.getClass(), "stateTable", term312137);
        setField(term312130, term312130.getClass(), "charLenTable", term312142);
        setField(term312130, term312130.getClass(), "name", "");
        setField(term312129, term312129.getClass(), "model", term312130);
        setIntField(term312129, term312129.getClass(), "currentState", 0);
        setIntField(term312129, term312129.getClass(), "currentCharLen", 0);
        setIntField(term312129, term312129.getClass(), "currentBytePos", 0);
        setElement(term312049, 3, term312129);
        setField(term312048, term312048.getClass(), "codingSM", term312049);
        setIntField(term312048, term312048.getClass(), "activeSM", 4);
        setField(term312048, term312048.getClass(), "state", enum48);
        setField(term312048, term312048.getClass(), "detectedCharset", "MjGYSRKTNF");
        setBooleanField(term312048, term312048.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setOption", argTypes, term312048, args);
    }

};


