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

public class JoinSortRanks_addRanks_51565423914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9552;

    public JoinSortRanks_addRanks_51565423914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9552 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9553 = (float[]) newFloatArray(4);
        double[] term9558 = (double[]) newDoubleArray(0);
        int[] term9559 = (int[]) newIntArray(7);
        int[] term9567 = (int[]) newIntArray(3);
        int[] term9571 = (int[]) newIntArray(5);
        setFloatElement(term9553, 0, 0.28898114F);
        setFloatElement(term9553, 1, 0.40120173F);
        setFloatElement(term9553, 2, 0.7856101F);
        setFloatElement(term9553, 3, 0.6200908F);
        setField(term9552, term9552.getClass(), "harmonicCentralityValues", term9553);
        setField(term9552, term9552.getClass(), "pageRankValues", term9558);
        setIntElement(term9559, 0, -266625190);
        setIntElement(term9559, 1, 489201218);
        setIntElement(term9559, 2, 464181937);
        setIntElement(term9559, 3, -1455526612);
        setIntElement(term9559, 4, -941356098);
        setIntElement(term9559, 5, -201517446);
        setIntElement(term9559, 6, -97742366);
        setField(term9552, term9552.getClass(), "harmonicCentralityRanks", term9559);
        setIntElement(term9567, 0, 1638851942);
        setIntElement(term9567, 1, 1374790203);
        setIntElement(term9567, 2, 1160010161);
        setField(term9552, term9552.getClass(), "pageRankRanks", term9567);
        setIntElement(term9571, 0, -423900705);
        setIntElement(term9571, 1, -525570815);
        setIntElement(term9571, 2, 754055848);
        setIntElement(term9571, 3, -19246901);
        setIntElement(term9571, 4, -370828664);
        setField(term9552, term9552.getClass(), "indirectSortPerm", term9571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        callMethod(klass, "addRanks", argTypes, term9552, args);
    }

};


