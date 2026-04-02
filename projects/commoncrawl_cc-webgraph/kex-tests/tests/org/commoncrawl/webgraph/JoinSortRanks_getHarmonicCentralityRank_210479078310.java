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
import java.lang.Long;

public class JoinSortRanks_getHarmonicCentralityRank_210479078310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9046;
     Object term9062;

    public JoinSortRanks_getHarmonicCentralityRank_210479078310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9046 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9047 = (float[]) newFloatArray(4);
        double[] term9052 = (double[]) newDoubleArray(1);
        int[] term9054 = (int[]) newIntArray(5);
        int[] term9060 = (int[]) newIntArray(0);
        int[] term9061 = (int[]) newIntArray(0);
        setFloatElement(term9047, 0, 0.78008145F);
        setFloatElement(term9047, 1, 0.48050702F);
        setFloatElement(term9047, 2, 0.38612437F);
        setFloatElement(term9047, 3, 0.49902177F);
        setField(term9046, term9046.getClass(), "harmonicCentralityValues", term9047);
        setDoubleElement(term9052, 0, 0.7984332537471793);
        setField(term9046, term9046.getClass(), "pageRankValues", term9052);
        setIntElement(term9054, 0, 2063762142);
        setIntElement(term9054, 1, 1658391716);
        setIntElement(term9054, 2, 2143282300);
        setIntElement(term9054, 3, 1137624258);
        setIntElement(term9054, 4, 977862393);
        setField(term9046, term9046.getClass(), "harmonicCentralityRanks", term9054);
        setField(term9046, term9046.getClass(), "pageRankRanks", term9060);
        setField(term9046, term9046.getClass(), "indirectSortPerm", term9061);
        term9062 = new Long(-2456427474561523240L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9062;
        callMethod(klass, "getHarmonicCentralityRank", argTypes, term9046, args);
    }

};


