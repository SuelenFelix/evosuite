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

public class SJISDistributionAnalysis_getOrder_8677680093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42597;
     Object term42601;

    public SJISDistributionAnalysis_getOrder_8677680093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42597 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.SJISDistributionAnalysis"));
        setIntField(term42597, term42597.getClass(), "freqChars", 0);
        setIntField(term42597, term42597.getClass(), "totalChars", 0);
        setField(term42597, term42597.getClass(), "charToFreqOrder", null);
        setFloatField(term42597, term42597.getClass(), "typicalDistributionRatio", 0.0F);
        term42601 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.SJISDistributionAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term42601;
        callMethod(klass, "getOrder", argTypes, term42597, args);
    }

};


