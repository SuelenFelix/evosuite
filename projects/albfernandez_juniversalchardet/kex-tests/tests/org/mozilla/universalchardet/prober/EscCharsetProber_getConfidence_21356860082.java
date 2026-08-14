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

public class EscCharsetProber_getConfidence_21356860082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309971;

    public EscCharsetProber_getConfidence_21356860082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term310135 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term310134 = ((Class) term310135).getDeclaredField((String) "DETECTING");
        ((Field) term310134).setAccessible(true);
        Object enum44 = ((Field) term310134).get((Object) null);
        term309971 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber"));
        Object[] term309972 = (Object[]) newArray("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine", 4);
        Object term309973 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309974 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.HZSMModel"));
        Object term309975 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term309981 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term309986 = (int[]) newIntArray(6);
        Object term309997 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309998 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022CNSMModel"));
        Object term309999 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term310005 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term310010 = (int[]) newIntArray(9);
        Object term310024 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term310025 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022JPSMModel"));
        Object term310026 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term310032 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term310037 = (int[]) newIntArray(10);
        Object term310052 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term310053 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.ISO2022KRSMModel"));
        Object term310054 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        Object term310060 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term310065 = (int[]) newIntArray(6);
        setIntField(term309975, term309975.getClass(), "indexShift", 3);
        setIntField(term309975, term309975.getClass(), "shiftMask", 7);
        setIntField(term309975, term309975.getClass(), "bitShift", 2);
        setIntField(term309975, term309975.getClass(), "unitMask", 15);
        setField(term309975, term309975.getClass(), "data", null);
        setField(term309974, term309974.getClass(), "classTable", term309975);
        setIntField(term309974, term309974.getClass(), "classFactor", 6);
        setIntField(term309981, term309981.getClass(), "indexShift", 3);
        setIntField(term309981, term309981.getClass(), "shiftMask", 7);
        setIntField(term309981, term309981.getClass(), "bitShift", 2);
        setIntField(term309981, term309981.getClass(), "unitMask", 15);
        setField(term309981, term309981.getClass(), "data", null);
        setField(term309974, term309974.getClass(), "stateTable", term309981);
        setField(term309974, term309974.getClass(), "charLenTable", term309986);
        setField(term309974, term309974.getClass(), "name", "");
        setField(term309973, term309973.getClass(), "model", term309974);
        setIntField(term309973, term309973.getClass(), "currentState", 0);
        setIntField(term309973, term309973.getClass(), "currentCharLen", 0);
        setIntField(term309973, term309973.getClass(), "currentBytePos", 0);
        setElement(term309972, 0, term309973);
        setIntField(term309999, term309999.getClass(), "indexShift", 3);
        setIntField(term309999, term309999.getClass(), "shiftMask", 7);
        setIntField(term309999, term309999.getClass(), "bitShift", 2);
        setIntField(term309999, term309999.getClass(), "unitMask", 15);
        setField(term309999, term309999.getClass(), "data", null);
        setField(term309998, term309998.getClass(), "classTable", term309999);
        setIntField(term309998, term309998.getClass(), "classFactor", 9);
        setIntField(term310005, term310005.getClass(), "indexShift", 3);
        setIntField(term310005, term310005.getClass(), "shiftMask", 7);
        setIntField(term310005, term310005.getClass(), "bitShift", 2);
        setIntField(term310005, term310005.getClass(), "unitMask", 15);
        setField(term310005, term310005.getClass(), "data", null);
        setField(term309998, term309998.getClass(), "stateTable", term310005);
        setField(term309998, term309998.getClass(), "charLenTable", term310010);
        setField(term309998, term309998.getClass(), "name", "");
        setField(term309997, term309997.getClass(), "model", term309998);
        setIntField(term309997, term309997.getClass(), "currentState", 0);
        setIntField(term309997, term309997.getClass(), "currentCharLen", 0);
        setIntField(term309997, term309997.getClass(), "currentBytePos", 0);
        setElement(term309972, 1, term309997);
        setIntField(term310026, term310026.getClass(), "indexShift", 3);
        setIntField(term310026, term310026.getClass(), "shiftMask", 7);
        setIntField(term310026, term310026.getClass(), "bitShift", 2);
        setIntField(term310026, term310026.getClass(), "unitMask", 15);
        setField(term310026, term310026.getClass(), "data", null);
        setField(term310025, term310025.getClass(), "classTable", term310026);
        setIntField(term310025, term310025.getClass(), "classFactor", 10);
        setIntField(term310032, term310032.getClass(), "indexShift", 3);
        setIntField(term310032, term310032.getClass(), "shiftMask", 7);
        setIntField(term310032, term310032.getClass(), "bitShift", 2);
        setIntField(term310032, term310032.getClass(), "unitMask", 15);
        setField(term310032, term310032.getClass(), "data", null);
        setField(term310025, term310025.getClass(), "stateTable", term310032);
        setField(term310025, term310025.getClass(), "charLenTable", term310037);
        setField(term310025, term310025.getClass(), "name", "");
        setField(term310024, term310024.getClass(), "model", term310025);
        setIntField(term310024, term310024.getClass(), "currentState", 0);
        setIntField(term310024, term310024.getClass(), "currentCharLen", 0);
        setIntField(term310024, term310024.getClass(), "currentBytePos", 0);
        setElement(term309972, 2, term310024);
        setIntField(term310054, term310054.getClass(), "indexShift", 3);
        setIntField(term310054, term310054.getClass(), "shiftMask", 7);
        setIntField(term310054, term310054.getClass(), "bitShift", 2);
        setIntField(term310054, term310054.getClass(), "unitMask", 15);
        setField(term310054, term310054.getClass(), "data", null);
        setField(term310053, term310053.getClass(), "classTable", term310054);
        setIntField(term310053, term310053.getClass(), "classFactor", 6);
        setIntField(term310060, term310060.getClass(), "indexShift", 3);
        setIntField(term310060, term310060.getClass(), "shiftMask", 7);
        setIntField(term310060, term310060.getClass(), "bitShift", 2);
        setIntField(term310060, term310060.getClass(), "unitMask", 15);
        setField(term310060, term310060.getClass(), "data", null);
        setField(term310053, term310053.getClass(), "stateTable", term310060);
        setField(term310053, term310053.getClass(), "charLenTable", term310065);
        setField(term310053, term310053.getClass(), "name", "");
        setField(term310052, term310052.getClass(), "model", term310053);
        setIntField(term310052, term310052.getClass(), "currentState", 0);
        setIntField(term310052, term310052.getClass(), "currentCharLen", 0);
        setIntField(term310052, term310052.getClass(), "currentBytePos", 0);
        setElement(term309972, 3, term310052);
        setField(term309971, term309971.getClass(), "codingSM", term309972);
        setIntField(term309971, term309971.getClass(), "activeSM", 4);
        setField(term309971, term309971.getClass(), "state", enum44);
        setField(term309971, term309971.getClass(), "detectedCharset", "xxtlPwDYFs");
        setBooleanField(term309971, term309971.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfidence", argTypes, term309971, args);
    }

};


