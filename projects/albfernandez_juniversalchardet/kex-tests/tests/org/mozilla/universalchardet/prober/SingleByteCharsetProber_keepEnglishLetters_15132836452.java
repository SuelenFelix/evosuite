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

public class SingleByteCharsetProber_keepEnglishLetters_15132836452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145931;

    public SingleByteCharsetProber_keepEnglishLetters_15132836452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term145954 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term145953 = ((Class) term145954).getDeclaredField((String) "FOUND_IT");
        ((Field) term145953).setAccessible(true);
        Object enum18 = ((Field) term145953).get((Object) null);
        term145931 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber"));
        int[] term145947 = (int[]) newIntArray(2);
        setField(term145931, term145931.getClass(), "state", enum18);
        setField(term145931, term145931.getClass(), "model", null);
        setBooleanField(term145931, term145931.getClass(), "reversed", true);
        setShortField(term145931, term145931.getClass(), "lastOrder", (short) 31422);
        setIntField(term145931, term145931.getClass(), "totalSeqs", 2055867847);
        setIntElement(term145947, 0, -1048298087);
        setIntElement(term145947, 1, 292681826);
        setField(term145931, term145931.getClass(), "seqCounters", term145947);
        setIntField(term145931, term145931.getClass(), "totalChar", 458147407);
        setIntField(term145931, term145931.getClass(), "freqChar", -184153539);
        setField(term145931, term145931.getClass(), "nameProber", null);
        setBooleanField(term145931, term145931.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keepEnglishLetters", argTypes, term145931, args);
    }

};


