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

public class JoinSortRanks_loadPageRank_20112555292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8529;

    public JoinSortRanks_loadPageRank_20112555292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8529 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8530 = (float[]) newFloatArray(5);
        double[] term8536 = (double[]) newDoubleArray(4);
        int[] term8541 = (int[]) newIntArray(4);
        int[] term8546 = (int[]) newIntArray(1);
        int[] term8548 = (int[]) newIntArray(6);
        setFloatElement(term8530, 0, 0.4131598F);
        setFloatElement(term8530, 1, 0.6693176F);
        setFloatElement(term8530, 2, 0.50650495F);
        setFloatElement(term8530, 3, 0.29628682F);
        setFloatElement(term8530, 4, 0.28167832F);
        setField(term8529, term8529.getClass(), "harmonicCentralityValues", term8530);
        setDoubleElement(term8536, 0, 0.049786419821445604);
        setDoubleElement(term8536, 1, 0.8814078959581401);
        setDoubleElement(term8536, 2, 0.47210750955444725);
        setDoubleElement(term8536, 3, 0.8381176594884352);
        setField(term8529, term8529.getClass(), "pageRankValues", term8536);
        setIntElement(term8541, 0, 49950830);
        setIntElement(term8541, 1, -525257914);
        setIntElement(term8541, 2, 147209682);
        setIntElement(term8541, 3, 34470066);
        setField(term8529, term8529.getClass(), "harmonicCentralityRanks", term8541);
        setIntElement(term8546, 0, 2058711405);
        setField(term8529, term8529.getClass(), "pageRankRanks", term8546);
        setIntElement(term8548, 0, 1743683601);
        setIntElement(term8548, 1, -945116798);
        setIntElement(term8548, 2, 1593461795);
        setIntElement(term8548, 3, 515182546);
        setIntElement(term8548, 4, -936895502);
        setIntElement(term8548, 5, -129547140);
        setField(term8529, term8529.getClass(), "indirectSortPerm", term8548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdxvLJhNLe";
        callMethod(klass, "loadPageRank", argTypes, term8529, args);
    }

};


