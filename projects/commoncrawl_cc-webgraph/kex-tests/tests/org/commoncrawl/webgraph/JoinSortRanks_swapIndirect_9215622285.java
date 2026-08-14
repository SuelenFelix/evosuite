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
import java.lang.Integer;

public class JoinSortRanks_swapIndirect_9215622285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9139;
     Object term9174;
     Object term9176;

    public JoinSortRanks_swapIndirect_9215622285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9139 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9140 = (float[]) newFloatArray(3);
        double[] term9144 = (double[]) newDoubleArray(9);
        int[] term9154 = (int[]) newIntArray(3);
        int[] term9158 = (int[]) newIntArray(7);
        int[] term9166 = (int[]) newIntArray(7);
        setFloatElement(term9140, 0, 0.7806282F);
        setFloatElement(term9140, 1, 0.78148645F);
        setFloatElement(term9140, 2, 0.28933305F);
        setField(term9139, term9139.getClass(), "harmonicCentralityValues", term9140);
        setDoubleElement(term9144, 0, 0.20131600000037786);
        setDoubleElement(term9144, 1, 0.332320568233212);
        setDoubleElement(term9144, 2, 0.18561351983828822);
        setDoubleElement(term9144, 3, 0.9678135126533798);
        setDoubleElement(term9144, 4, 0.3275035827937727);
        setDoubleElement(term9144, 5, 0.13747524521333288);
        setDoubleElement(term9144, 6, 0.7149120009558162);
        setDoubleElement(term9144, 7, 0.0013046823258857643);
        setDoubleElement(term9144, 8, 0.5404409545293147);
        setField(term9139, term9139.getClass(), "pageRankValues", term9144);
        setIntElement(term9154, 0, 579006268);
        setIntElement(term9154, 1, -1694747156);
        setIntElement(term9154, 2, 1466373988);
        setField(term9139, term9139.getClass(), "harmonicCentralityRanks", term9154);
        setIntElement(term9158, 0, -358526505);
        setIntElement(term9158, 1, 1843268026);
        setIntElement(term9158, 2, 954660603);
        setIntElement(term9158, 3, -1351605385);
        setIntElement(term9158, 4, 278355793);
        setIntElement(term9158, 5, -310648604);
        setIntElement(term9158, 6, -648200466);
        setField(term9139, term9139.getClass(), "pageRankRanks", term9158);
        setIntElement(term9166, 0, 2007134147);
        setIntElement(term9166, 1, 993388358);
        setIntElement(term9166, 2, -765191335);
        setIntElement(term9166, 3, -1697741155);
        setIntElement(term9166, 4, 1295839803);
        setIntElement(term9166, 5, -1891015523);
        setIntElement(term9166, 6, -1560631747);
        setField(term9139, term9139.getClass(), "indirectSortPerm", term9166);
        term9174 = new Integer(1215150180);
        term9176 = new Integer(-1422859977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9174;
        args[1] = term9176;
        callMethod(klass, "swapIndirect", argTypes, term9139, args);
    }

};


