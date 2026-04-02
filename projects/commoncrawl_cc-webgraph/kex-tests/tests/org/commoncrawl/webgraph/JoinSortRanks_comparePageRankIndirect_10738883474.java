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

public class JoinSortRanks_comparePageRankIndirect_10738883474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8665;
     Object term8705;
     Object term8707;

    public JoinSortRanks_comparePageRankIndirect_10738883474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8665 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8666 = (float[]) newFloatArray(9);
        double[] term8676 = (double[]) newDoubleArray(8);
        int[] term8685 = (int[]) newIntArray(5);
        int[] term8691 = (int[]) newIntArray(6);
        int[] term8698 = (int[]) newIntArray(6);
        setFloatElement(term8666, 0, 0.2547418F);
        setFloatElement(term8666, 1, 0.19656086F);
        setFloatElement(term8666, 2, 0.99575853F);
        setFloatElement(term8666, 3, 0.5778128F);
        setFloatElement(term8666, 4, 0.16755807F);
        setFloatElement(term8666, 5, 0.6467969F);
        setFloatElement(term8666, 6, 0.9090794F);
        setFloatElement(term8666, 7, 0.6117589F);
        setFloatElement(term8666, 8, 0.2599733F);
        setField(term8665, term8665.getClass(), "harmonicCentralityValues", term8666);
        setDoubleElement(term8676, 0, 0.28813953022653416);
        setDoubleElement(term8676, 1, 0.6221715730666386);
        setDoubleElement(term8676, 2, 0.6375926466054153);
        setDoubleElement(term8676, 3, 0.6933516214415875);
        setDoubleElement(term8676, 4, 0.7039847711405768);
        setDoubleElement(term8676, 5, 0.7157998497507287);
        setDoubleElement(term8676, 6, 0.8399796378537906);
        setDoubleElement(term8676, 7, 0.009446329384675933);
        setField(term8665, term8665.getClass(), "pageRankValues", term8676);
        setIntElement(term8685, 0, -1070592289);
        setIntElement(term8685, 1, -1464172784);
        setIntElement(term8685, 2, 32185364);
        setIntElement(term8685, 3, 1768204942);
        setIntElement(term8685, 4, 1252951645);
        setField(term8665, term8665.getClass(), "harmonicCentralityRanks", term8685);
        setIntElement(term8691, 0, 574481092);
        setIntElement(term8691, 1, -310528004);
        setIntElement(term8691, 2, -634976996);
        setIntElement(term8691, 3, -1015274146);
        setIntElement(term8691, 4, -49052672);
        setIntElement(term8691, 5, 339372704);
        setField(term8665, term8665.getClass(), "pageRankRanks", term8691);
        setIntElement(term8698, 0, -851097944);
        setIntElement(term8698, 1, 803925431);
        setIntElement(term8698, 2, 76929641);
        setIntElement(term8698, 3, -2003192918);
        setIntElement(term8698, 4, -1362856620);
        setIntElement(term8698, 5, -1835839814);
        setField(term8665, term8665.getClass(), "indirectSortPerm", term8698);
        term8705 = new Integer(-1404350380);
        term8707 = new Integer(-2013924238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8705;
        args[1] = term8707;
        callMethod(klass, "comparePageRankIndirect", argTypes, term8665, args);
    }

};


