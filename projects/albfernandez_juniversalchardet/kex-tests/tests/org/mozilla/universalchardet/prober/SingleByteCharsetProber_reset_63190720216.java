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

public class SingleByteCharsetProber_reset_63190720216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148532;

    public SingleByteCharsetProber_reset_63190720216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148532 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber"));
        setField(term148532, term148532.getClass(), "state", null);
        setField(term148532, term148532.getClass(), "model", null);
        setBooleanField(term148532, term148532.getClass(), "reversed", false);
        setShortField(term148532, term148532.getClass(), "lastOrder", (short) 0);
        setIntField(term148532, term148532.getClass(), "totalSeqs", 0);
        setField(term148532, term148532.getClass(), "seqCounters", null);
        setIntField(term148532, term148532.getClass(), "totalChar", 0);
        setIntField(term148532, term148532.getClass(), "freqChar", 0);
        setField(term148532, term148532.getClass(), "nameProber", null);
        setBooleanField(term148532, term148532.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term148532, args);
    }

};


