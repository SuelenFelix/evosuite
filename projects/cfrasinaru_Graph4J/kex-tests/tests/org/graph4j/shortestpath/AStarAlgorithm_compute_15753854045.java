package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AStarAlgorithm_compute_15753854045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122811;

    public AStarAlgorithm_compute_15753854045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122811 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term122814 = (int[]) newIntArray(8);
        double[] term122823 = (double[]) newDoubleArray(9);
        int[] term122833 = (int[]) newIntArray(0);
        int[] term122834 = (int[]) newIntArray(1);
        boolean[] term122836 = (boolean[]) newBooleanArray(7);
        Object term122845 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term122846 = (int[]) newIntArray(9);
        int[] term122856 = (int[]) newIntArray(0);
        setIntField(term122811, term122811.getClass(), "source", 2043867906);
        setIntField(term122811, term122811.getClass(), "target", -1530948763);
        setIntElement(term122814, 0, 1444611292);
        setIntElement(term122814, 1, -1073109453);
        setIntElement(term122814, 2, -221689194);
        setIntElement(term122814, 3, 1181534417);
        setIntElement(term122814, 4, 938718786);
        setIntElement(term122814, 5, 1853375526);
        setIntElement(term122814, 6, 257389395);
        setIntElement(term122814, 7, -2069461138);
        setField(term122811, term122811.getClass(), "vertices", term122814);
        setDoubleElement(term122823, 0, 0.6409326417517721);
        setDoubleElement(term122823, 1, 0.8113827176012267);
        setDoubleElement(term122823, 2, 0.6223206481850296);
        setDoubleElement(term122823, 3, 0.9477995878961528);
        setDoubleElement(term122823, 4, 0.11489036708732814);
        setDoubleElement(term122823, 5, 0.4066431961233574);
        setDoubleElement(term122823, 6, 0.5211354040112401);
        setDoubleElement(term122823, 7, 0.3949183445536065);
        setDoubleElement(term122823, 8, 0.27371092985005274);
        setField(term122811, term122811.getClass(), "cost", term122823);
        setField(term122811, term122811.getClass(), "before", term122833);
        setIntElement(term122834, 0, 1337558872);
        setField(term122811, term122811.getClass(), "size", term122834);
        setBooleanElement(term122836, 0, true);
        setBooleanElement(term122836, 2, true);
        setBooleanElement(term122836, 4, true);
        setBooleanElement(term122836, 5, true);
        setBooleanElement(term122836, 6, true);
        setField(term122811, term122811.getClass(), "solved", term122836);
        setIntField(term122811, term122811.getClass(), "numSolved", 1213295046);
        setField(term122845, term122845.getClass(), "graph", null);
        setField(term122845, term122845.getClass(), "comparator", null);
        setIntElement(term122846, 0, 2109471016);
        setIntElement(term122846, 1, 1173146006);
        setIntElement(term122846, 2, 1453240334);
        setIntElement(term122846, 3, -181940055);
        setIntElement(term122846, 4, 1153346490);
        setIntElement(term122846, 5, 209125932);
        setIntElement(term122846, 6, -260090114);
        setIntElement(term122846, 7, -1126440972);
        setIntElement(term122846, 8, -828056931);
        setField(term122845, term122845.getClass(), "keys", term122846);
        setField(term122845, term122845.getClass(), "positions", term122856);
        setIntField(term122845, term122845.getClass(), "size", -1506249031);
        setField(term122811, term122811.getClass(), "heap", term122845);
        setField(term122811, term122811.getClass(), "heuristic", null);
        setField(term122811, term122811.getClass(), "graph", null);
        setBooleanField(term122811, term122811.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term122811, args);
    }

};


