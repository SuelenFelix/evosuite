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

public class JoinSortRanks_getPageRankRank_141237172212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9538;
     Object term9556;

    public JoinSortRanks_getPageRankRank_141237172212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9538 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9539 = (float[]) newFloatArray(4);
        double[] term9544 = (double[]) newDoubleArray(0);
        int[] term9545 = (int[]) newIntArray(6);
        int[] term9552 = (int[]) newIntArray(2);
        int[] term9555 = (int[]) newIntArray(0);
        setFloatElement(term9539, 0, 0.18817449F);
        setFloatElement(term9539, 1, 0.87325114F);
        setFloatElement(term9539, 2, 0.57387376F);
        setFloatElement(term9539, 3, 0.897776F);
        setField(term9538, term9538.getClass(), "harmonicCentralityValues", term9539);
        setField(term9538, term9538.getClass(), "pageRankValues", term9544);
        setIntElement(term9545, 0, 765731371);
        setIntElement(term9545, 1, -1703035419);
        setIntElement(term9545, 2, 765766290);
        setIntElement(term9545, 3, -1284825282);
        setIntElement(term9545, 4, -1941343035);
        setIntElement(term9545, 5, 947897214);
        setField(term9538, term9538.getClass(), "harmonicCentralityRanks", term9545);
        setIntElement(term9552, 0, 1496340209);
        setIntElement(term9552, 1, -1748391876);
        setField(term9538, term9538.getClass(), "pageRankRanks", term9552);
        setField(term9538, term9538.getClass(), "indirectSortPerm", term9555);
        term9556 = new Long(1881020230556705937L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9556;
        callMethod(klass, "getPageRankRank", argTypes, term9538, args);
    }

};


