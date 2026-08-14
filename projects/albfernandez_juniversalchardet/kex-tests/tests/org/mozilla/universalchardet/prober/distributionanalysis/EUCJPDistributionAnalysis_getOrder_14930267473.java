package org.mozilla.universalchardet.prober.distributionanalysis;

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
import static org.mozilla.universalchardet.prober.distributionanalysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class EUCJPDistributionAnalysis_getOrder_14930267473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51359;
     Object term51363;

    public EUCJPDistributionAnalysis_getOrder_14930267473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51359 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCJPDistributionAnalysis"));
        setIntField(term51359, term51359.getClass(), "freqChars", 0);
        setIntField(term51359, term51359.getClass(), "totalChars", 0);
        setField(term51359, term51359.getClass(), "charToFreqOrder", null);
        setFloatField(term51359, term51359.getClass(), "typicalDistributionRatio", 0.0F);
        term51363 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCJPDistributionAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term51363;
        callMethod(klass, "getOrder", argTypes, term51359, args);
    }

};


