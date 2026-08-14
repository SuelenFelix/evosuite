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

public class EUCJPProber_handleData_201662915011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55527;
     Object term55529;
     Object term55531;

    public EUCJPProber_handleData_201662915011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55527 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCJPProber"));
        setField(term55527, term55527.getClass(), "codingSM", null);
        setField(term55527, term55527.getClass(), "state", null);
        setField(term55527, term55527.getClass(), "contextAnalyzer", null);
        setField(term55527, term55527.getClass(), "distributionAnalyzer", null);
        setField(term55527, term55527.getClass(), "lastChar", null);
        setBooleanField(term55527, term55527.getClass(), "active", false);
        term55529 = new Integer(0);
        term55531 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EUCJPProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term55529;
        args[2] = term55531;
        callMethod(klass, "handleData", argTypes, term55527, args);
    }

};


