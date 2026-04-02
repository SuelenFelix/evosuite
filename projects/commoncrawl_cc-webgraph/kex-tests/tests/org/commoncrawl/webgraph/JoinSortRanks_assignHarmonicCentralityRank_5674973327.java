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
     Object term8860;

    public JoinSortRanks_assignHarmonicCentralityRank_5674973327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8860 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8861 = (float[]) newFloatArray(5);
        double[] term8867 = (double[]) newDoubleArray(0);
        int[] term8868 = (int[]) newIntArray(3);
        int[] term8872 = (int[]) newIntArray(4);
        int[] term8877 = (int[]) newIntArray(9);
        setFloatElement(term8861, 0, 0.638206F);
        setFloatElement(term8861, 1, 0.3034814F);
        setFloatElement(term8861, 2, 0.18499982F);
        setFloatElement(term8861, 3, 0.8988424F);
        setFloatElement(term8861, 4, 0.36312395F);
        setField(term8860, term8860.getClass(), "harmonicCentralityValues", term8861);
        setField(term8860, term8860.getClass(), "pageRankValues", term8867);
        setIntElement(term8868, 0, 1922684808);
        setIntElement(term8868, 1, -2005784375);
        setIntElement(term8868, 2, -288604325);
        setField(term8860, term8860.getClass(), "harmonicCentralityRanks", term8868);
        setIntElement(term8872, 0, -1268314569);
        setIntElement(term8872, 1, 877649659);
        setIntElement(term8872, 2, -1332748804);
        setIntElement(term8872, 3, 1774507971);
        setField(term8860, term8860.getClass(), "pageRankRanks", term8872);
        setIntElement(term8877, 0, -1420269858);
        setIntElement(term8877, 1, -2119545015);
        setIntElement(term8877, 2, 1272542218);
        setIntElement(term8877, 3, 1209799204);
        setIntElement(term8877, 4, 1094107751);
        setIntElement(term8877, 5, 844222656);
        setIntElement(term8877, 6, -18216811);
        setIntElement(term8877, 7, -1813280137);
        setIntElement(term8877, 8, 719656595);
        setField(term8860, term8860.getClass(), "indirectSortPerm", term8877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignHarmonicCentralityRank", argTypes, term8860, args);
    }

};


