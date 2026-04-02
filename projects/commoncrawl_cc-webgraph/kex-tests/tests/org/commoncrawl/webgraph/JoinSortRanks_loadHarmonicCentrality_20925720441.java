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
     Object term8457;

    public JoinSortRanks_loadHarmonicCentrality_20925720441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8457 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8458 = (float[]) newFloatArray(7);
        double[] term8466 = (double[]) newDoubleArray(2);
        int[] term8469 = (int[]) newIntArray(3);
        int[] term8473 = (int[]) newIntArray(6);
        int[] term8480 = (int[]) newIntArray(4);
        setFloatElement(term8458, 0, 0.79774547F);
        setFloatElement(term8458, 1, 0.4476599F);
        setFloatElement(term8458, 2, 0.5329919F);
        setFloatElement(term8458, 3, 0.93280405F);
        setFloatElement(term8458, 4, 0.7046975F);
        setFloatElement(term8458, 5, 0.20434368F);
        setFloatElement(term8458, 6, 0.6896952F);
        setField(term8457, term8457.getClass(), "harmonicCentralityValues", term8458);
        setDoubleElement(term8466, 0, 0.22059525284415726);
        setDoubleElement(term8466, 1, 0.281059649526194);
        setField(term8457, term8457.getClass(), "pageRankValues", term8466);
        setIntElement(term8469, 0, 252575029);
        setIntElement(term8469, 1, 57189932);
        setIntElement(term8469, 2, 1460722225);
        setField(term8457, term8457.getClass(), "harmonicCentralityRanks", term8469);
        setIntElement(term8473, 0, 1743224434);
        setIntElement(term8473, 1, 842904495);
        setIntElement(term8473, 2, 1008080511);
        setIntElement(term8473, 3, 1935707624);
        setIntElement(term8473, 4, 1507074215);
        setIntElement(term8473, 5, -282881827);
        setField(term8457, term8457.getClass(), "pageRankRanks", term8473);
        setIntElement(term8480, 0, -1183353915);
        setIntElement(term8480, 1, -420030135);
        setIntElement(term8480, 2, 267763294);
        setIntElement(term8480, 3, -1497710478);
        setField(term8457, term8457.getClass(), "indirectSortPerm", term8480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XOiDvlDhdc";
        callMethod(klass, "loadHarmonicCentrality", argTypes, term8457, args);
    }

};


