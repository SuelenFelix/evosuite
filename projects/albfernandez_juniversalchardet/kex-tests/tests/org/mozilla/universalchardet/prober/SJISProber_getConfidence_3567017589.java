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

public class SJISProber_getConfidence_3567017589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379128;

    public SJISProber_getConfidence_3567017589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379128 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SJISProber"));
        setField(term379128, term379128.getClass(), "codingSM", null);
        setField(term379128, term379128.getClass(), "state", null);
        setField(term379128, term379128.getClass(), "contextAnalyzer", null);
        setField(term379128, term379128.getClass(), "distributionAnalyzer", null);
        setField(term379128, term379128.getClass(), "lastChar", null);
        setBooleanField(term379128, term379128.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SJISProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfidence", argTypes, term379128, args);
    }

};


