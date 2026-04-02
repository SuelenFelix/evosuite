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

public class JoinSortRanks_getPageRankValue_115339169011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9074;
     Object term9110;

    public JoinSortRanks_getPageRankValue_115339169011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9074 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9075 = (float[]) newFloatArray(4);
        double[] term9080 = (double[]) newDoubleArray(9);
        int[] term9090 = (int[]) newIntArray(3);
        int[] term9094 = (int[]) newIntArray(6);
        int[] term9101 = (int[]) newIntArray(8);
        setFloatElement(term9075, 0, 0.26487374F);
        setFloatElement(term9075, 1, 0.22767627F);
        setFloatElement(term9075, 2, 0.07017553F);
        setFloatElement(term9075, 3, 0.46300822F);
        setField(term9074, term9074.getClass(), "harmonicCentralityValues", term9075);
        setDoubleElement(term9080, 0, 0.6782349539183316);
        setDoubleElement(term9080, 1, 0.6464654528667407);
        setDoubleElement(term9080, 2, 0.6416885379658445);
        setDoubleElement(term9080, 3, 0.604465128384297);
        setDoubleElement(term9080, 4, 0.5180566811475131);
        setDoubleElement(term9080, 5, 0.6773553630262286);
        setDoubleElement(term9080, 6, 0.0416412064984476);
        setDoubleElement(term9080, 7, 0.9188322321077216);
        setDoubleElement(term9080, 8, 0.8046904246652031);
        setField(term9074, term9074.getClass(), "pageRankValues", term9080);
        setIntElement(term9090, 0, 301401782);
        setIntElement(term9090, 1, 1988605357);
        setIntElement(term9090, 2, 808203320);
        setField(term9074, term9074.getClass(), "harmonicCentralityRanks", term9090);
        setIntElement(term9094, 0, -544382127);
        setIntElement(term9094, 1, -1830198043);
        setIntElement(term9094, 2, -439048495);
        setIntElement(term9094, 3, -1849105286);
        setIntElement(term9094, 4, 1334483645);
        setIntElement(term9094, 5, 917513193);
        setField(term9074, term9074.getClass(), "pageRankRanks", term9094);
        setIntElement(term9101, 0, 787278105);
        setIntElement(term9101, 1, -2063843486);
        setIntElement(term9101, 2, 833762980);
        setIntElement(term9101, 3, 320711637);
        setIntElement(term9101, 4, 1241164745);
        setIntElement(term9101, 5, 1723148410);
        setIntElement(term9101, 6, -920797484);
        setIntElement(term9101, 7, -1631697577);
        setField(term9074, term9074.getClass(), "indirectSortPerm", term9101);
        term9110 = new Long(-7010338441819086776L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9110;
        callMethod(klass, "getPageRankValue", argTypes, term9074, args);
    }

};


