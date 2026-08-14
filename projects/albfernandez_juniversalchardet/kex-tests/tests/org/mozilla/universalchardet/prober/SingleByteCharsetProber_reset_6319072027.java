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

public class SingleByteCharsetProber_reset_6319072027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147761;

    public SingleByteCharsetProber_reset_6319072027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term147788 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term147787 = ((Class) term147788).getDeclaredField((String) "FOUND_IT");
        ((Field) term147787).setAccessible(true);
        Object enum23 = ((Field) term147787).get((Object) null);
        term147761 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber"));
        int[] term147777 = (int[]) newIntArray(6);
        setField(term147761, term147761.getClass(), "state", enum23);
        setField(term147761, term147761.getClass(), "model", null);
        setBooleanField(term147761, term147761.getClass(), "reversed", false);
        setShortField(term147761, term147761.getClass(), "lastOrder", (short) -5174);
        setIntField(term147761, term147761.getClass(), "totalSeqs", 1240914516);
        setIntElement(term147777, 0, -1465035361);
        setIntElement(term147777, 1, 1090617576);
        setIntElement(term147777, 2, -1547384488);
        setIntElement(term147777, 3, 1442160736);
        setIntElement(term147777, 4, 1114000454);
        setIntElement(term147777, 5, -556405712);
        setField(term147761, term147761.getClass(), "seqCounters", term147777);
        setIntField(term147761, term147761.getClass(), "totalChar", -1772434990);
        setIntField(term147761, term147761.getClass(), "freqChar", -1845499264);
        setField(term147761, term147761.getClass(), "nameProber", null);
        setBooleanField(term147761, term147761.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term147761, args);
    }

};


