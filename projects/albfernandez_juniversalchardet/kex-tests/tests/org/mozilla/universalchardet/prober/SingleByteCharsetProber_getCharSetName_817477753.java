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

public class SingleByteCharsetProber_getCharSetName_817477753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146296;

    public SingleByteCharsetProber_getCharSetName_817477753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term146318 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term146317 = ((Class) term146318).getDeclaredField((String) "NOT_ME");
        ((Field) term146317).setAccessible(true);
        Object enum19 = ((Field) term146317).get((Object) null);
        term146296 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber"));
        int[] term146310 = (int[]) newIntArray(3);
        setField(term146296, term146296.getClass(), "state", enum19);
        setField(term146296, term146296.getClass(), "model", null);
        setBooleanField(term146296, term146296.getClass(), "reversed", true);
        setShortField(term146296, term146296.getClass(), "lastOrder", (short) 21075);
        setIntField(term146296, term146296.getClass(), "totalSeqs", 1328271830);
        setIntElement(term146310, 0, 1596070772);
        setIntElement(term146310, 1, 97029295);
        setIntElement(term146310, 2, -1371869594);
        setField(term146296, term146296.getClass(), "seqCounters", term146310);
        setIntField(term146296, term146296.getClass(), "totalChar", -2095575670);
        setIntField(term146296, term146296.getClass(), "freqChar", 1225272962);
        setField(term146296, term146296.getClass(), "nameProber", null);
        setBooleanField(term146296, term146296.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharSetName", argTypes, term146296, args);
    }

};


