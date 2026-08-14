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
     Object term9442;
     Object term9458;

    public JoinSortRanks_getHarmonicCentralityRank_210479078310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9442 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9443 = (float[]) newFloatArray(4);
        double[] term9448 = (double[]) newDoubleArray(1);
        int[] term9450 = (int[]) newIntArray(5);
        int[] term9456 = (int[]) newIntArray(0);
        int[] term9457 = (int[]) newIntArray(0);
        setFloatElement(term9443, 0, 0.78008145F);
        setFloatElement(term9443, 1, 0.48050702F);
        setFloatElement(term9443, 2, 0.38612437F);
        setFloatElement(term9443, 3, 0.49902177F);
        setField(term9442, term9442.getClass(), "harmonicCentralityValues", term9443);
        setDoubleElement(term9448, 0, 0.7984332537471793);
        setField(term9442, term9442.getClass(), "pageRankValues", term9448);
        setIntElement(term9450, 0, 2063762142);
        setIntElement(term9450, 1, 1658391716);
        setIntElement(term9450, 2, 2143282300);
        setIntElement(term9450, 3, 1137624258);
        setIntElement(term9450, 4, 977862393);
        setField(term9442, term9442.getClass(), "harmonicCentralityRanks", term9450);
        setField(term9442, term9442.getClass(), "pageRankRanks", term9456);
        setField(term9442, term9442.getClass(), "indirectSortPerm", term9457);
        term9458 = new Long(-2456427474561523240L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9458;
        callMethod(klass, "getHarmonicCentralityRank", argTypes, term9442, args);
    }

};


