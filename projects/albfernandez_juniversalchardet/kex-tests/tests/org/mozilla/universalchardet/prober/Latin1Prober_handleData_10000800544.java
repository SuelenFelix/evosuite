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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Latin1Prober_handleData_10000800544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322491;
     Object term322512;
     Object term322515;
     Object term322517;

    public Latin1Prober_handleData_10000800544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term322520 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term322519 = ((Class) term322520).getDeclaredField((String) "DETECTING");
        ((Field) term322519).setAccessible(true);
        Object enum52 = ((Field) term322519).get((Object) null);
        term322491 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Latin1Prober"));
        int[] term322506 = (int[]) newIntArray(4);
        setField(term322491, term322491.getClass(), "state", enum52);
        setByteField(term322491, term322491.getClass(), "lastCharClass", (byte) 1);
        setField(term322491, term322491.getClass(), "freqCounter", term322506);
        setBooleanField(term322491, term322491.getClass(), "active", true);
        term322512 = (byte[]) newByteArray(2);
        setByteElement(term322512, 0, (byte) -2);
        setByteElement(term322512, 1, (byte) 28);
        term322515 = new Integer(-375014958);
        term322517 = new Integer(1107176718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.Latin1Prober");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term322512;
        args[1] = term322515;
        args[2] = term322517;
        callMethod(klass, "handleData", argTypes, term322491, args);
    }

};


