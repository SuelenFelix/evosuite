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

public class Latin1Prober_reset_12304971455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322869;

    public Latin1Prober_reset_12304971455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term322891 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term322890 = ((Class) term322891).getDeclaredField((String) "DETECTING");
        ((Field) term322890).setAccessible(true);
        Object enum53 = ((Field) term322890).get((Object) null);
        term322869 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Latin1Prober"));
        int[] term322884 = (int[]) newIntArray(4);
        setField(term322869, term322869.getClass(), "state", enum53);
        setByteField(term322869, term322869.getClass(), "lastCharClass", (byte) 1);
        setField(term322869, term322869.getClass(), "freqCounter", term322884);
        setBooleanField(term322869, term322869.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.Latin1Prober");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term322869, args);
    }

};


