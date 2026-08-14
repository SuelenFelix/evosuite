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

public class SingleByteCharsetProber_getConfidence_19620745694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146655;

    public SingleByteCharsetProber_getConfidence_19620745694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term146677 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term146676 = ((Class) term146677).getDeclaredField((String) "FOUND_IT");
        ((Field) term146676).setAccessible(true);
        Object enum20 = ((Field) term146676).get((Object) null);
        term146655 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber"));
        int[] term146671 = (int[]) newIntArray(1);
        setField(term146655, term146655.getClass(), "state", enum20);
        setField(term146655, term146655.getClass(), "model", null);
        setBooleanField(term146655, term146655.getClass(), "reversed", false);
        setShortField(term146655, term146655.getClass(), "lastOrder", (short) -2742);
        setIntField(term146655, term146655.getClass(), "totalSeqs", -1588772968);
        setIntElement(term146671, 0, -93135961);
        setField(term146655, term146655.getClass(), "seqCounters", term146671);
        setIntField(term146655, term146655.getClass(), "totalChar", -112921587);
        setIntField(term146655, term146655.getClass(), "freqChar", 933028652);
        setField(term146655, term146655.getClass(), "nameProber", null);
        setBooleanField(term146655, term146655.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfidence", argTypes, term146655, args);
    }

};


