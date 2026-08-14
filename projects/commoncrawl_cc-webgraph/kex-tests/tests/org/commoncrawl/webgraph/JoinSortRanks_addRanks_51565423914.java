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
     Object term9948;

    public JoinSortRanks_addRanks_51565423914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9948 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9949 = (float[]) newFloatArray(4);
        double[] term9954 = (double[]) newDoubleArray(0);
        int[] term9955 = (int[]) newIntArray(7);
        int[] term9963 = (int[]) newIntArray(3);
        int[] term9967 = (int[]) newIntArray(5);
        setFloatElement(term9949, 0, 0.28898114F);
        setFloatElement(term9949, 1, 0.40120173F);
        setFloatElement(term9949, 2, 0.7856101F);
        setFloatElement(term9949, 3, 0.6200908F);
        setField(term9948, term9948.getClass(), "harmonicCentralityValues", term9949);
        setField(term9948, term9948.getClass(), "pageRankValues", term9954);
        setIntElement(term9955, 0, -266625190);
        setIntElement(term9955, 1, 489201218);
        setIntElement(term9955, 2, 464181937);
        setIntElement(term9955, 3, -1455526612);
        setIntElement(term9955, 4, -941356098);
        setIntElement(term9955, 5, -201517446);
        setIntElement(term9955, 6, -97742366);
        setField(term9948, term9948.getClass(), "harmonicCentralityRanks", term9955);
        setIntElement(term9963, 0, 1638851942);
        setIntElement(term9963, 1, 1374790203);
        setIntElement(term9963, 2, 1160010161);
        setField(term9948, term9948.getClass(), "pageRankRanks", term9963);
        setIntElement(term9967, 0, -423900705);
        setIntElement(term9967, 1, -525570815);
        setIntElement(term9967, 2, 754055848);
        setIntElement(term9967, 3, -19246901);
        setIntElement(term9967, 4, -370828664);
        setField(term9948, term9948.getClass(), "indirectSortPerm", term9967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GgZWSjxjyE";
        callMethod(klass, "addRanks", argTypes, term9948, args);
    }

};


