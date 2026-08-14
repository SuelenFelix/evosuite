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
     Object term9470;
     Object term9506;

    public JoinSortRanks_getPageRankValue_115339169011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9470 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9471 = (float[]) newFloatArray(4);
        double[] term9476 = (double[]) newDoubleArray(9);
        int[] term9486 = (int[]) newIntArray(3);
        int[] term9490 = (int[]) newIntArray(6);
        int[] term9497 = (int[]) newIntArray(8);
        setFloatElement(term9471, 0, 0.26487374F);
        setFloatElement(term9471, 1, 0.22767627F);
        setFloatElement(term9471, 2, 0.07017553F);
        setFloatElement(term9471, 3, 0.46300822F);
        setField(term9470, term9470.getClass(), "harmonicCentralityValues", term9471);
        setDoubleElement(term9476, 0, 0.6782349539183316);
        setDoubleElement(term9476, 1, 0.6464654528667407);
        setDoubleElement(term9476, 2, 0.6416885379658445);
        setDoubleElement(term9476, 3, 0.604465128384297);
        setDoubleElement(term9476, 4, 0.5180566811475131);
        setDoubleElement(term9476, 5, 0.6773553630262286);
        setDoubleElement(term9476, 6, 0.0416412064984476);
        setDoubleElement(term9476, 7, 0.9188322321077216);
        setDoubleElement(term9476, 8, 0.8046904246652031);
        setField(term9470, term9470.getClass(), "pageRankValues", term9476);
        setIntElement(term9486, 0, 301401782);
        setIntElement(term9486, 1, 1988605357);
        setIntElement(term9486, 2, 808203320);
        setField(term9470, term9470.getClass(), "harmonicCentralityRanks", term9486);
        setIntElement(term9490, 0, -544382127);
        setIntElement(term9490, 1, -1830198043);
        setIntElement(term9490, 2, -439048495);
        setIntElement(term9490, 3, -1849105286);
        setIntElement(term9490, 4, 1334483645);
        setIntElement(term9490, 5, 917513193);
        setField(term9470, term9470.getClass(), "pageRankRanks", term9490);
        setIntElement(term9497, 0, 787278105);
        setIntElement(term9497, 1, -2063843486);
        setIntElement(term9497, 2, 833762980);
        setIntElement(term9497, 3, 320711637);
        setIntElement(term9497, 4, 1241164745);
        setIntElement(term9497, 5, 1723148410);
        setIntElement(term9497, 6, -920797484);
        setIntElement(term9497, 7, -1631697577);
        setField(term9470, term9470.getClass(), "indirectSortPerm", term9497);
        term9506 = new Long(-7010338441819086776L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9506;
        callMethod(klass, "getPageRankValue", argTypes, term9470, args);
    }

};


