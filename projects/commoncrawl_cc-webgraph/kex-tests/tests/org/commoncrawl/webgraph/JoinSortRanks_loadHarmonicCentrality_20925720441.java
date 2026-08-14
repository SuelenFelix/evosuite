package org.commoncrawl.webgraph;

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
import static org.commoncrawl.webgraph.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JoinSortRanks_loadHarmonicCentrality_20925720441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8853;

    public JoinSortRanks_loadHarmonicCentrality_20925720441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8853 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8854 = (float[]) newFloatArray(7);
        double[] term8862 = (double[]) newDoubleArray(2);
        int[] term8865 = (int[]) newIntArray(3);
        int[] term8869 = (int[]) newIntArray(6);
        int[] term8876 = (int[]) newIntArray(4);
        setFloatElement(term8854, 0, 0.79774547F);
        setFloatElement(term8854, 1, 0.4476599F);
        setFloatElement(term8854, 2, 0.5329919F);
        setFloatElement(term8854, 3, 0.93280405F);
        setFloatElement(term8854, 4, 0.7046975F);
        setFloatElement(term8854, 5, 0.20434368F);
        setFloatElement(term8854, 6, 0.6896952F);
        setField(term8853, term8853.getClass(), "harmonicCentralityValues", term8854);
        setDoubleElement(term8862, 0, 0.22059525284415726);
        setDoubleElement(term8862, 1, 0.281059649526194);
        setField(term8853, term8853.getClass(), "pageRankValues", term8862);
        setIntElement(term8865, 0, 252575029);
        setIntElement(term8865, 1, 57189932);
        setIntElement(term8865, 2, 1460722225);
        setField(term8853, term8853.getClass(), "harmonicCentralityRanks", term8865);
        setIntElement(term8869, 0, 1743224434);
        setIntElement(term8869, 1, 842904495);
        setIntElement(term8869, 2, 1008080511);
        setIntElement(term8869, 3, 1935707624);
        setIntElement(term8869, 4, 1507074215);
        setIntElement(term8869, 5, -282881827);
        setField(term8853, term8853.getClass(), "pageRankRanks", term8869);
        setIntElement(term8876, 0, -1183353915);
        setIntElement(term8876, 1, -420030135);
        setIntElement(term8876, 2, 267763294);
        setIntElement(term8876, 3, -1497710478);
        setField(term8853, term8853.getClass(), "indirectSortPerm", term8876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        callMethod(klass, "loadHarmonicCentrality", argTypes, term8853, args);
    }

};


