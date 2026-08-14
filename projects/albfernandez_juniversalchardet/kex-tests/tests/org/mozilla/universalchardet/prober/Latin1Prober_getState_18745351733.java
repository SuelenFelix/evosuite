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

public class Latin1Prober_getState_18745351733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322122;

    public Latin1Prober_getState_18745351733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term322144 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term322143 = ((Class) term322144).getDeclaredField((String) "DETECTING");
        ((Field) term322143).setAccessible(true);
        Object enum51 = ((Field) term322143).get((Object) null);
        term322122 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Latin1Prober"));
        int[] term322137 = (int[]) newIntArray(4);
        setField(term322122, term322122.getClass(), "state", enum51);
        setByteField(term322122, term322122.getClass(), "lastCharClass", (byte) 1);
        setField(term322122, term322122.getClass(), "freqCounter", term322137);
        setBooleanField(term322122, term322122.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.Latin1Prober");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term322122, args);
    }

};


