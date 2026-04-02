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
     Object term8743;
     Object term8778;
     Object term8780;

    public JoinSortRanks_swapIndirect_9215622285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8743 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8744 = (float[]) newFloatArray(3);
        double[] term8748 = (double[]) newDoubleArray(9);
        int[] term8758 = (int[]) newIntArray(3);
        int[] term8762 = (int[]) newIntArray(7);
        int[] term8770 = (int[]) newIntArray(7);
        setFloatElement(term8744, 0, 0.7806282F);
        setFloatElement(term8744, 1, 0.78148645F);
        setFloatElement(term8744, 2, 0.28933305F);
        setField(term8743, term8743.getClass(), "harmonicCentralityValues", term8744);
        setDoubleElement(term8748, 0, 0.20131600000037786);
        setDoubleElement(term8748, 1, 0.332320568233212);
        setDoubleElement(term8748, 2, 0.18561351983828822);
        setDoubleElement(term8748, 3, 0.9678135126533798);
        setDoubleElement(term8748, 4, 0.3275035827937727);
        setDoubleElement(term8748, 5, 0.13747524521333288);
        setDoubleElement(term8748, 6, 0.7149120009558162);
        setDoubleElement(term8748, 7, 0.0013046823258857643);
        setDoubleElement(term8748, 8, 0.5404409545293147);
        setField(term8743, term8743.getClass(), "pageRankValues", term8748);
        setIntElement(term8758, 0, 579006268);
        setIntElement(term8758, 1, -1694747156);
        setIntElement(term8758, 2, 1466373988);
        setField(term8743, term8743.getClass(), "harmonicCentralityRanks", term8758);
        setIntElement(term8762, 0, -358526505);
        setIntElement(term8762, 1, 1843268026);
        setIntElement(term8762, 2, 954660603);
        setIntElement(term8762, 3, -1351605385);
        setIntElement(term8762, 4, 278355793);
        setIntElement(term8762, 5, -310648604);
        setIntElement(term8762, 6, -648200466);
        setField(term8743, term8743.getClass(), "pageRankRanks", term8762);
        setIntElement(term8770, 0, 2007134147);
        setIntElement(term8770, 1, 993388358);
        setIntElement(term8770, 2, -765191335);
        setIntElement(term8770, 3, -1697741155);
        setIntElement(term8770, 4, 1295839803);
        setIntElement(term8770, 5, -1891015523);
        setIntElement(term8770, 6, -1560631747);
        setField(term8743, term8743.getClass(), "indirectSortPerm", term8770);
        term8778 = new Integer(1215150180);
        term8780 = new Integer(-1422859977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8778;
        args[1] = term8780;
        callMethod(klass, "swapIndirect", argTypes, term8743, args);
    }

};


