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

public class EUCTWProber_handleData_43672416111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216112;
     Object term216114;
     Object term216116;

    public EUCTWProber_handleData_43672416111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216112 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCTWProber"));
        setField(term216112, term216112.getClass(), "codingSM", null);
        setField(term216112, term216112.getClass(), "state", null);
        setField(term216112, term216112.getClass(), "distributionAnalyzer", null);
        setField(term216112, term216112.getClass(), "lastChar", null);
        setBooleanField(term216112, term216112.getClass(), "active", false);
        term216114 = new Integer(0);
        term216116 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EUCTWProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term216114;
        args[2] = term216116;
        callMethod(klass, "handleData", argTypes, term216112, args);
    }

};


