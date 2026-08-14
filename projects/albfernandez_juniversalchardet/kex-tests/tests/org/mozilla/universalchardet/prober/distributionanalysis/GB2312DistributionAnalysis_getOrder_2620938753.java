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

public class GB2312DistributionAnalysis_getOrder_2620938753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33843;
     Object term33847;

    public GB2312DistributionAnalysis_getOrder_2620938753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33843 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.GB2312DistributionAnalysis"));
        setIntField(term33843, term33843.getClass(), "freqChars", 0);
        setIntField(term33843, term33843.getClass(), "totalChars", 0);
        setField(term33843, term33843.getClass(), "charToFreqOrder", null);
        setFloatField(term33843, term33843.getClass(), "typicalDistributionRatio", 0.0F);
        term33847 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.GB2312DistributionAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term33847;
        callMethod(klass, "getOrder", argTypes, term33843, args);
    }

};


