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

public class EscCharsetProber_handleData_10359357324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311005;
     Object term311137;
     Object term311140;
     Object term311142;

    public EscCharsetProber_handleData_10359357324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term311176 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term311175 = ((Class) term311176).getDeclaredField((String) "DETECTING");
        ((Field) term311175).setAccessible(true);
        Object enum46 = ((Field) term311175).get((Object) null);
        term311005 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber"));
        Object[] term311006 = (Object[]) newArray("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine", 4);
        Object term311007 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term311008 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.HZSMModel"));
        Object term311009 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term311015 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term311020 = (int[]) newIntArray(6);
        Object term311031 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term311032 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022CNSMModel"));
        Object term311033 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term311039 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term311044 = (int[]) newIntArray(9);
        Object term311058 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term311059 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022JPSMModel"));
        Object term311060 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term311066 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term311071 = (int[]) newIntArray(10);
        Object term311086 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term311087 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022KRSMModel"));
        Object term311088 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term311094 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term311099 = (int[]) newIntArray(6);
        setIntField(term311009, term311009.getClass(), "indexShift", 3);
        setIntField(term311009, term311009.getClass(), "shiftMask", 7);
        setIntField(term311009, term311009.getClass(), "bitShift", 2);
        setIntField(term311009, term311009.getClass(), "unitMask", 15);
        setField(term311009, term311009.getClass(), "data", null);
        setField(term311008, term311008.getClass(), "classTable", term311009);
        setIntField(term311008, term311008.getClass(), "classFactor", 6);
        setIntField(term311015, term311015.getClass(), "indexShift", 3);
        setIntField(term311015, term311015.getClass(), "shiftMask", 7);
        setIntField(term311015, term311015.getClass(), "bitShift", 2);
        setIntField(term311015, term311015.getClass(), "unitMask", 15);
        setField(term311015, term311015.getClass(), "data", null);
        setField(term311008, term311008.getClass(), "stateTable", term311015);
        setField(term311008, term311008.getClass(), "charLenTable", term311020);
        setField(term311008, term311008.getClass(), "name", "");
        setField(term311007, term311007.getClass(), "model", term311008);
        setIntField(term311007, term311007.getClass(), "currentState", 0);
        setIntField(term311007, term311007.getClass(), "currentCharLen", 0);
        setIntField(term311007, term311007.getClass(), "currentBytePos", 0);
        setElement(term311006, 0, term311007);
        setIntField(term311033, term311033.getClass(), "indexShift", 3);
        setIntField(term311033, term311033.getClass(), "shiftMask", 7);
        setIntField(term311033, term311033.getClass(), "bitShift", 2);
        setIntField(term311033, term311033.getClass(), "unitMask", 15);
        setField(term311033, term311033.getClass(), "data", null);
        setField(term311032, term311032.getClass(), "classTable", term311033);
        setIntField(term311032, term311032.getClass(), "classFactor", 9);
        setIntField(term311039, term311039.getClass(), "indexShift", 3);
        setIntField(term311039, term311039.getClass(), "shiftMask", 7);
        setIntField(term311039, term311039.getClass(), "bitShift", 2);
        setIntField(term311039, term311039.getClass(), "unitMask", 15);
        setField(term311039, term311039.getClass(), "data", null);
        setField(term311032, term311032.getClass(), "stateTable", term311039);
        setField(term311032, term311032.getClass(), "charLenTable", term311044);
        setField(term311032, term311032.getClass(), "name", "");
        setField(term311031, term311031.getClass(), "model", term311032);
        setIntField(term311031, term311031.getClass(), "currentState", 0);
        setIntField(term311031, term311031.getClass(), "currentCharLen", 0);
        setIntField(term311031, term311031.getClass(), "currentBytePos", 0);
        setElement(term311006, 1, term311031);
        setIntField(term311060, term311060.getClass(), "indexShift", 3);
        setIntField(term311060, term311060.getClass(), "shiftMask", 7);
        setIntField(term311060, term311060.getClass(), "bitShift", 2);
        setIntField(term311060, term311060.getClass(), "unitMask", 15);
        setField(term311060, term311060.getClass(), "data", null);
        setField(term311059, term311059.getClass(), "classTable", term311060);
        setIntField(term311059, term311059.getClass(), "classFactor", 10);
        setIntField(term311066, term311066.getClass(), "indexShift", 3);
        setIntField(term311066, term311066.getClass(), "shiftMask", 7);
        setIntField(term311066, term311066.getClass(), "bitShift", 2);
        setIntField(term311066, term311066.getClass(), "unitMask", 15);
        setField(term311066, term311066.getClass(), "data", null);
        setField(term311059, term311059.getClass(), "stateTable", term311066);
        setField(term311059, term311059.getClass(), "charLenTable", term311071);
        setField(term311059, term311059.getClass(), "name", "");
        setField(term311058, term311058.getClass(), "model", term311059);
        setIntField(term311058, term311058.getClass(), "currentState", 0);
        setIntField(term311058, term311058.getClass(), "currentCharLen", 0);
        setIntField(term311058, term311058.getClass(), "currentBytePos", 0);
        setElement(term311006, 2, term311058);
        setIntField(term311088, term311088.getClass(), "indexShift", 3);
        setIntField(term311088, term311088.getClass(), "shiftMask", 7);
        setIntField(term311088, term311088.getClass(), "bitShift", 2);
        setIntField(term311088, term311088.getClass(), "unitMask", 15);
        setField(term311088, term311088.getClass(), "data", null);
        setField(term311087, term311087.getClass(), "classTable", term311088);
        setIntField(term311087, term311087.getClass(), "classFactor", 6);
        setIntField(term311094, term311094.getClass(), "indexShift", 3);
        setIntField(term311094, term311094.getClass(), "shiftMask", 7);
        setIntField(term311094, term311094.getClass(), "bitShift", 2);
        setIntField(term311094, term311094.getClass(), "unitMask", 15);
        setField(term311094, term311094.getClass(), "data", null);
        setField(term311087, term311087.getClass(), "stateTable", term311094);
        setField(term311087, term311087.getClass(), "charLenTable", term311099);
        setField(term311087, term311087.getClass(), "name", "");
        setField(term311086, term311086.getClass(), "model", term311087);
        setIntField(term311086, term311086.getClass(), "currentState", 0);
        setIntField(term311086, term311086.getClass(), "currentCharLen", 0);
        setIntField(term311086, term311086.getClass(), "currentBytePos", 0);
        setElement(term311006, 3, term311086);
        setField(term311005, term311005.getClass(), "codingSM", term311006);
        setIntField(term311005, term311005.getClass(), "activeSM", 4);
        setField(term311005, term311005.getClass(), "state", enum46);
        setField(term311005, term311005.getClass(), "detectedCharset", "EGtDIRbSSb");
        setBooleanField(term311005, term311005.getClass(), "active", true);
        term311137 = (byte[]) newByteArray(2);
        setByteElement(term311137, 0, (byte) 33);
        setByteElement(term311137, 1, (byte) -74);
        term311140 = new Integer(1072005683);
        term311142 = new Integer(1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term311137;
        args[1] = term311140;
        args[2] = term311142;
        callMethod(klass, "handleData", argTypes, term311005, args);
    }

};


