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

public class JoinSortRanks_assignRank_18593474336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8811;
     Object term8835;

    public JoinSortRanks_assignRank_18593474336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8811 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8812 = (float[]) newFloatArray(2);
        double[] term8815 = (double[]) newDoubleArray(6);
        int[] term8822 = (int[]) newIntArray(3);
        int[] term8826 = (int[]) newIntArray(1);
        int[] term8828 = (int[]) newIntArray(6);
        setFloatElement(term8812, 0, 0.5657654F);
        setFloatElement(term8812, 1, 0.3954653F);
        setField(term8811, term8811.getClass(), "harmonicCentralityValues", term8812);
        setDoubleElement(term8815, 0, 0.9172358414700745);
        setDoubleElement(term8815, 1, 0.3804251745476508);
        setDoubleElement(term8815, 2, 0.6704848280926606);
        setDoubleElement(term8815, 3, 0.6213122016266206);
        setDoubleElement(term8815, 4, 0.540850203722707);
        setDoubleElement(term8815, 5, 6.134294677928587E-4);
        setField(term8811, term8811.getClass(), "pageRankValues", term8815);
        setIntElement(term8822, 0, -1972436591);
        setIntElement(term8822, 1, 68922753);
        setIntElement(term8822, 2, -220791533);
        setField(term8811, term8811.getClass(), "harmonicCentralityRanks", term8822);
        setIntElement(term8826, 0, 1741500243);
        setField(term8811, term8811.getClass(), "pageRankRanks", term8826);
        setIntElement(term8828, 0, -2070466617);
        setIntElement(term8828, 1, -1127721881);
        setIntElement(term8828, 2, 1074848808);
        setIntElement(term8828, 3, -146054762);
        setIntElement(term8828, 4, 798043553);
        setIntElement(term8828, 5, 533197381);
        setField(term8811, term8811.getClass(), "indirectSortPerm", term8828);
        term8835 = (int[]) newIntArray(3);
        setIntElement(term8835, 0, 1048271679);
        setIntElement(term8835, 1, -1529797673);
        setIntElement(term8835, 2, -868676396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("it.unimi.dsi.fastutil.ints.IntComparator");
        Object[] args = new Object[2];
        args[0] = term8835;
        args[1] = null;
        callMethod(klass, "assignRank", argTypes, term8811, args);
    }

};


