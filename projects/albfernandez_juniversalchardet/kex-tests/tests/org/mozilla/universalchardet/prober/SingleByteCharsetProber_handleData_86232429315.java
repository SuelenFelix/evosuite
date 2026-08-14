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
import java.lang.Integer;

public class SingleByteCharsetProber_handleData_86232429315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148521;
     Object term148528;
     Object term148530;

    public SingleByteCharsetProber_handleData_86232429315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148521 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber"));
        setField(term148521, term148521.getClass(), "state", null);
        setField(term148521, term148521.getClass(), "model", null);
        setBooleanField(term148521, term148521.getClass(), "reversed", false);
        setShortField(term148521, term148521.getClass(), "lastOrder", (short) 0);
        setIntField(term148521, term148521.getClass(), "totalSeqs", 0);
        setField(term148521, term148521.getClass(), "seqCounters", null);
        setIntField(term148521, term148521.getClass(), "totalChar", 0);
        setIntField(term148521, term148521.getClass(), "freqChar", 0);
        setField(term148521, term148521.getClass(), "nameProber", null);
        setBooleanField(term148521, term148521.getClass(), "active", false);
        term148528 = new Integer(0);
        term148530 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term148528;
        args[2] = term148530;
        callMethod(klass, "handleData", argTypes, term148521, args);
    }

};


