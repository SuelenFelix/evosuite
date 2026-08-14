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

public class SingleByteCharsetProber_setOption_1813188228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148134;

    public SingleByteCharsetProber_setOption_1813188228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term148155 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term148154 = ((Class) term148155).getDeclaredField((String) "NOT_ME");
        ((Field) term148154).setAccessible(true);
        Object enum24 = ((Field) term148154).get((Object) null);
        term148134 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber"));
        int[] term148148 = (int[]) newIntArray(2);
        setField(term148134, term148134.getClass(), "state", enum24);
        setField(term148134, term148134.getClass(), "model", null);
        setBooleanField(term148134, term148134.getClass(), "reversed", true);
        setShortField(term148134, term148134.getClass(), "lastOrder", (short) -1725);
        setIntField(term148134, term148134.getClass(), "totalSeqs", -344842608);
        setIntElement(term148148, 0, 941650513);
        setIntElement(term148148, 1, 444029505);
        setField(term148134, term148134.getClass(), "seqCounters", term148148);
        setIntField(term148134, term148134.getClass(), "totalChar", -1034506028);
        setIntField(term148134, term148134.getClass(), "freqChar", -1263114719);
        setField(term148134, term148134.getClass(), "nameProber", null);
        setBooleanField(term148134, term148134.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setOption", argTypes, term148134, args);
    }

};


