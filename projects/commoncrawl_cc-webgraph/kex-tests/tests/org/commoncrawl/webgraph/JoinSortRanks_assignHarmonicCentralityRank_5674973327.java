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

public class JoinSortRanks_assignHarmonicCentralityRank_5674973327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9256;

    public JoinSortRanks_assignHarmonicCentralityRank_5674973327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9256 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9257 = (float[]) newFloatArray(5);
        double[] term9263 = (double[]) newDoubleArray(0);
        int[] term9264 = (int[]) newIntArray(3);
        int[] term9268 = (int[]) newIntArray(4);
        int[] term9273 = (int[]) newIntArray(9);
        setFloatElement(term9257, 0, 0.638206F);
        setFloatElement(term9257, 1, 0.3034814F);
        setFloatElement(term9257, 2, 0.18499982F);
        setFloatElement(term9257, 3, 0.8988424F);
        setFloatElement(term9257, 4, 0.36312395F);
        setField(term9256, term9256.getClass(), "harmonicCentralityValues", term9257);
        setField(term9256, term9256.getClass(), "pageRankValues", term9263);
        setIntElement(term9264, 0, 1922684808);
        setIntElement(term9264, 1, -2005784375);
        setIntElement(term9264, 2, -288604325);
        setField(term9256, term9256.getClass(), "harmonicCentralityRanks", term9264);
        setIntElement(term9268, 0, -1268314569);
        setIntElement(term9268, 1, 877649659);
        setIntElement(term9268, 2, -1332748804);
        setIntElement(term9268, 3, 1774507971);
        setField(term9256, term9256.getClass(), "pageRankRanks", term9268);
        setIntElement(term9273, 0, -1420269858);
        setIntElement(term9273, 1, -2119545015);
        setIntElement(term9273, 2, 1272542218);
        setIntElement(term9273, 3, 1209799204);
        setIntElement(term9273, 4, 1094107751);
        setIntElement(term9273, 5, 844222656);
        setIntElement(term9273, 6, -18216811);
        setIntElement(term9273, 7, -1813280137);
        setIntElement(term9273, 8, 719656595);
        setField(term9256, term9256.getClass(), "indirectSortPerm", term9273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignHarmonicCentralityRank", argTypes, term9256, args);
    }

};


