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
     Object term8925;

    public JoinSortRanks_loadPageRank_20112555292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8925 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8926 = (float[]) newFloatArray(5);
        double[] term8932 = (double[]) newDoubleArray(4);
        int[] term8937 = (int[]) newIntArray(4);
        int[] term8942 = (int[]) newIntArray(1);
        int[] term8944 = (int[]) newIntArray(6);
        setFloatElement(term8926, 0, 0.4131598F);
        setFloatElement(term8926, 1, 0.6693176F);
        setFloatElement(term8926, 2, 0.50650495F);
        setFloatElement(term8926, 3, 0.29628682F);
        setFloatElement(term8926, 4, 0.28167832F);
        setField(term8925, term8925.getClass(), "harmonicCentralityValues", term8926);
        setDoubleElement(term8932, 0, 0.049786419821445604);
        setDoubleElement(term8932, 1, 0.8814078959581401);
        setDoubleElement(term8932, 2, 0.47210750955444725);
        setDoubleElement(term8932, 3, 0.8381176594884352);
        setField(term8925, term8925.getClass(), "pageRankValues", term8932);
        setIntElement(term8937, 0, 49950830);
        setIntElement(term8937, 1, -525257914);
        setIntElement(term8937, 2, 147209682);
        setIntElement(term8937, 3, 34470066);
        setField(term8925, term8925.getClass(), "harmonicCentralityRanks", term8937);
        setIntElement(term8942, 0, 2058711405);
        setField(term8925, term8925.getClass(), "pageRankRanks", term8942);
        setIntElement(term8944, 0, 1743683601);
        setIntElement(term8944, 1, -945116798);
        setIntElement(term8944, 2, 1593461795);
        setIntElement(term8944, 3, 515182546);
        setIntElement(term8944, 4, -936895502);
        setIntElement(term8944, 5, -129547140);
        setField(term8925, term8925.getClass(), "indirectSortPerm", term8944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mvrkADEgpp";
        callMethod(klass, "loadPageRank", argTypes, term8925, args);
    }

};


