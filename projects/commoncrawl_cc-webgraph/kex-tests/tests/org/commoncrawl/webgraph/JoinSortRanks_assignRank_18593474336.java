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

public class JoinSortRanks_assignRank_18593474336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9207;
     Object term9231;

    public JoinSortRanks_assignRank_18593474336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9207 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9208 = (float[]) newFloatArray(2);
        double[] term9211 = (double[]) newDoubleArray(6);
        int[] term9218 = (int[]) newIntArray(3);
        int[] term9222 = (int[]) newIntArray(1);
        int[] term9224 = (int[]) newIntArray(6);
        setFloatElement(term9208, 0, 0.5657654F);
        setFloatElement(term9208, 1, 0.3954653F);
        setField(term9207, term9207.getClass(), "harmonicCentralityValues", term9208);
        setDoubleElement(term9211, 0, 0.9172358414700745);
        setDoubleElement(term9211, 1, 0.3804251745476508);
        setDoubleElement(term9211, 2, 0.6704848280926606);
        setDoubleElement(term9211, 3, 0.6213122016266206);
        setDoubleElement(term9211, 4, 0.540850203722707);
        setDoubleElement(term9211, 5, 6.134294677928587E-4);
        setField(term9207, term9207.getClass(), "pageRankValues", term9211);
        setIntElement(term9218, 0, -1972436591);
        setIntElement(term9218, 1, 68922753);
        setIntElement(term9218, 2, -220791533);
        setField(term9207, term9207.getClass(), "harmonicCentralityRanks", term9218);
        setIntElement(term9222, 0, 1741500243);
        setField(term9207, term9207.getClass(), "pageRankRanks", term9222);
        setIntElement(term9224, 0, -2070466617);
        setIntElement(term9224, 1, -1127721881);
        setIntElement(term9224, 2, 1074848808);
        setIntElement(term9224, 3, -146054762);
        setIntElement(term9224, 4, 798043553);
        setIntElement(term9224, 5, 533197381);
        setField(term9207, term9207.getClass(), "indirectSortPerm", term9224);
        term9231 = (int[]) newIntArray(3);
        setIntElement(term9231, 0, 1048271679);
        setIntElement(term9231, 1, -1529797673);
        setIntElement(term9231, 2, -868676396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("it.unimi.dsi.fastutil.ints.IntComparator");
        Object[] args = new Object[2];
        args[0] = term9231;
        args[1] = null;
        callMethod(klass, "assignRank", argTypes, term9207, args);
    }

};


