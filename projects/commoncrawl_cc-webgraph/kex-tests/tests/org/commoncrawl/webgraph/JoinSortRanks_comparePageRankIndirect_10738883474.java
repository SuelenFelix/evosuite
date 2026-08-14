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
     Object term9061;
     Object term9101;
     Object term9103;

    public JoinSortRanks_comparePageRankIndirect_10738883474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9061 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9062 = (float[]) newFloatArray(9);
        double[] term9072 = (double[]) newDoubleArray(8);
        int[] term9081 = (int[]) newIntArray(5);
        int[] term9087 = (int[]) newIntArray(6);
        int[] term9094 = (int[]) newIntArray(6);
        setFloatElement(term9062, 0, 0.2547418F);
        setFloatElement(term9062, 1, 0.19656086F);
        setFloatElement(term9062, 2, 0.99575853F);
        setFloatElement(term9062, 3, 0.5778128F);
        setFloatElement(term9062, 4, 0.16755807F);
        setFloatElement(term9062, 5, 0.6467969F);
        setFloatElement(term9062, 6, 0.9090794F);
        setFloatElement(term9062, 7, 0.6117589F);
        setFloatElement(term9062, 8, 0.2599733F);
        setField(term9061, term9061.getClass(), "harmonicCentralityValues", term9062);
        setDoubleElement(term9072, 0, 0.28813953022653416);
        setDoubleElement(term9072, 1, 0.6221715730666386);
        setDoubleElement(term9072, 2, 0.6375926466054153);
        setDoubleElement(term9072, 3, 0.6933516214415875);
        setDoubleElement(term9072, 4, 0.7039847711405768);
        setDoubleElement(term9072, 5, 0.7157998497507287);
        setDoubleElement(term9072, 6, 0.8399796378537906);
        setDoubleElement(term9072, 7, 0.009446329384675933);
        setField(term9061, term9061.getClass(), "pageRankValues", term9072);
        setIntElement(term9081, 0, -1070592289);
        setIntElement(term9081, 1, -1464172784);
        setIntElement(term9081, 2, 32185364);
        setIntElement(term9081, 3, 1768204942);
        setIntElement(term9081, 4, 1252951645);
        setField(term9061, term9061.getClass(), "harmonicCentralityRanks", term9081);
        setIntElement(term9087, 0, 574481092);
        setIntElement(term9087, 1, -310528004);
        setIntElement(term9087, 2, -634976996);
        setIntElement(term9087, 3, -1015274146);
        setIntElement(term9087, 4, -49052672);
        setIntElement(term9087, 5, 339372704);
        setField(term9061, term9061.getClass(), "pageRankRanks", term9087);
        setIntElement(term9094, 0, -851097944);
        setIntElement(term9094, 1, 803925431);
        setIntElement(term9094, 2, 76929641);
        setIntElement(term9094, 3, -2003192918);
        setIntElement(term9094, 4, -1362856620);
        setIntElement(term9094, 5, -1835839814);
        setField(term9061, term9061.getClass(), "indirectSortPerm", term9094);
        term9101 = new Integer(-1404350380);
        term9103 = new Integer(-2013924238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9101;
        args[1] = term9103;
        callMethod(klass, "comparePageRankIndirect", argTypes, term9061, args);
    }

};


