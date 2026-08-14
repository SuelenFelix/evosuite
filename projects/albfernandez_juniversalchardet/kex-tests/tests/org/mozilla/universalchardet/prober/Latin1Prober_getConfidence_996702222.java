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

public class Latin1Prober_getConfidence_996702222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321753;

    public Latin1Prober_getConfidence_996702222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term321775 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term321774 = ((Class) term321775).getDeclaredField((String) "DETECTING");
        ((Field) term321774).setAccessible(true);
        Object enum50 = ((Field) term321774).get((Object) null);
        term321753 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Latin1Prober"));
        int[] term321768 = (int[]) newIntArray(4);
        setField(term321753, term321753.getClass(), "state", enum50);
        setByteField(term321753, term321753.getClass(), "lastCharClass", (byte) 1);
        setField(term321753, term321753.getClass(), "freqCounter", term321768);
        setBooleanField(term321753, term321753.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.Latin1Prober");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfidence", argTypes, term321753, args);
    }

};


