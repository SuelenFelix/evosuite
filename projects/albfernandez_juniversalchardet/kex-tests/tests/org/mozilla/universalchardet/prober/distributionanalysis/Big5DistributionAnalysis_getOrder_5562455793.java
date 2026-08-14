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

public class Big5DistributionAnalysis_getOrder_5562455793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26297;
     Object term26301;

    public Big5DistributionAnalysis_getOrder_5562455793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26297 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.Big5DistributionAnalysis"));
        setIntField(term26297, term26297.getClass(), "freqChars", 0);
        setIntField(term26297, term26297.getClass(), "totalChars", 0);
        setField(term26297, term26297.getClass(), "charToFreqOrder", null);
        setFloatField(term26297, term26297.getClass(), "typicalDistributionRatio", 0.0F);
        term26301 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.Big5DistributionAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26301;
        callMethod(klass, "getOrder", argTypes, term26297, args);
    }

};


