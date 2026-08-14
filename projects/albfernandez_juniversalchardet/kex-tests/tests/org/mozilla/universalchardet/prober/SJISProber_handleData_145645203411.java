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

public class SJISProber_handleData_145645203411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379132;
     Object term379134;
     Object term379136;

    public SJISProber_handleData_145645203411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379132 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SJISProber"));
        setField(term379132, term379132.getClass(), "codingSM", null);
        setField(term379132, term379132.getClass(), "state", null);
        setField(term379132, term379132.getClass(), "contextAnalyzer", null);
        setField(term379132, term379132.getClass(), "distributionAnalyzer", null);
        setField(term379132, term379132.getClass(), "lastChar", null);
        setBooleanField(term379132, term379132.getClass(), "active", false);
        term379134 = new Integer(0);
        term379136 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SJISProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term379134;
        args[2] = term379136;
        callMethod(klass, "handleData", argTypes, term379132, args);
    }

};


