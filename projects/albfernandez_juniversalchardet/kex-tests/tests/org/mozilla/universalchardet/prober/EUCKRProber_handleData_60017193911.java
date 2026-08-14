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

public class EUCKRProber_handleData_60017193911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86798;
     Object term86800;
     Object term86802;

    public EUCKRProber_handleData_60017193911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86798 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCKRProber"));
        setField(term86798, term86798.getClass(), "codingSM", null);
        setField(term86798, term86798.getClass(), "state", null);
        setField(term86798, term86798.getClass(), "distributionAnalyzer", null);
        setField(term86798, term86798.getClass(), "lastChar", null);
        setBooleanField(term86798, term86798.getClass(), "active", false);
        term86800 = new Integer(0);
        term86802 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EUCKRProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term86800;
        args[2] = term86802;
        callMethod(klass, "handleData", argTypes, term86798, args);
    }

};


