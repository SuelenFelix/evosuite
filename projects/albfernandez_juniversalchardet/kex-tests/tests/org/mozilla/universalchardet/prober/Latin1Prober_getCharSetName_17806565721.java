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

public class Latin1Prober_getCharSetName_17806565721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321384;

    public Latin1Prober_getCharSetName_17806565721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term321406 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term321405 = ((Class) term321406).getDeclaredField((String) "DETECTING");
        ((Field) term321405).setAccessible(true);
        Object enum49 = ((Field) term321405).get((Object) null);
        term321384 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Latin1Prober"));
        int[] term321399 = (int[]) newIntArray(4);
        setField(term321384, term321384.getClass(), "state", enum49);
        setByteField(term321384, term321384.getClass(), "lastCharClass", (byte) 1);
        setField(term321384, term321384.getClass(), "freqCounter", term321399);
        setBooleanField(term321384, term321384.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.Latin1Prober");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharSetName", argTypes, term321384, args);
    }

};


