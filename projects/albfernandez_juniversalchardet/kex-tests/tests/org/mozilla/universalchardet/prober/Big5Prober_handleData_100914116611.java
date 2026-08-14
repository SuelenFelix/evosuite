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

public class Big5Prober_handleData_100914116611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283523;
     Object term283525;
     Object term283527;

    public Big5Prober_handleData_100914116611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283523 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Big5Prober"));
        setField(term283523, term283523.getClass(), "codingSM", null);
        setField(term283523, term283523.getClass(), "state", null);
        setField(term283523, term283523.getClass(), "distributionAnalyzer", null);
        setField(term283523, term283523.getClass(), "lastChar", null);
        setBooleanField(term283523, term283523.getClass(), "active", false);
        term283525 = new Integer(0);
        term283527 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.Big5Prober");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term283525;
        args[2] = term283527;
        callMethod(klass, "handleData", argTypes, term283523, args);
    }

};


