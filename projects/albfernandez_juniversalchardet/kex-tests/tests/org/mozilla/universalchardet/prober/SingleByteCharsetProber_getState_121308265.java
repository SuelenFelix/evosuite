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

public class SingleByteCharsetProber_getState_121308265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147018;

    public SingleByteCharsetProber_getState_121308265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term147037 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term147036 = ((Class) term147037).getDeclaredField((String) "NOT_ME");
        ((Field) term147036).setAccessible(true);
        Object enum21 = ((Field) term147036).get((Object) null);
        term147018 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber"));
        int[] term147032 = (int[]) newIntArray(0);
        setField(term147018, term147018.getClass(), "state", enum21);
        setField(term147018, term147018.getClass(), "model", null);
        setBooleanField(term147018, term147018.getClass(), "reversed", false);
        setShortField(term147018, term147018.getClass(), "lastOrder", (short) 7097);
        setIntField(term147018, term147018.getClass(), "totalSeqs", 962840079);
        setField(term147018, term147018.getClass(), "seqCounters", term147032);
        setIntField(term147018, term147018.getClass(), "totalChar", 1540719661);
        setIntField(term147018, term147018.getClass(), "freqChar", 1265463001);
        setField(term147018, term147018.getClass(), "nameProber", null);
        setBooleanField(term147018, term147018.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term147018, args);
    }

};


