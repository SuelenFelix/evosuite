package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Double;
import java.lang.Integer;

public class StoerWagnerMinimumCut_compute_16868652794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161;

    public StoerWagnerMinimumCut_compute_16868652794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term185 = new HashMap();
        Double term198 = new Double(0.28570734989730284);
        Integer term200 = new Integer(-616727354);
        Double term215 = new Double(0.40176586625454525);
        term161 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut"));
        Object term163 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term164 = (int[]) newIntArray(0);
        int[] term165 = (int[]) newIntArray(2);
        boolean[] term169 = (boolean[]) newBooleanArray(8);
        double[] term178 = (double[]) newDoubleArray(6);
        Object term202 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term203 = (int[]) newIntArray(1);
        int[] term205 = (int[]) newIntArray(9);
        Object term217 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term161, term161.getClass(), "ignoreWeights", false);
        setField(term161, term161.getClass(), "workGraph", null);
        setField(term163, term163.getClass(), "graph", null);
        setField(term163, term163.getClass(), "comparator", null);
        setField(term163, term163.getClass(), "keys", term164);
        setIntElement(term165, 0, 1876565163);
        setIntElement(term165, 1, -817164822);
        setField(term163, term163.getClass(), "positions", term165);
        setIntField(term163, term163.getClass(), "size", -1016503459);
        setField(term161, term161.getClass(), "maxHeap", term163);
        setBooleanElement(term169, 1, true);
        setBooleanElement(term169, 2, true);
        setBooleanElement(term169, 5, true);
        setBooleanElement(term169, 6, true);
        setBooleanElement(term169, 7, true);
        setField(term161, term161.getClass(), "processed", term169);
        setDoubleElement(term178, 0, 0.37773193782763337);
        setDoubleElement(term178, 1, 0.8474802076607362);
        setDoubleElement(term178, 2, 0.5183269973490326);
        setDoubleElement(term178, 3, 0.7655020693602768);
        setDoubleElement(term178, 4, 0.1374549299694151);
        setDoubleElement(term178, 5, 0.7031006357544823);
        setField(term161, term161.getClass(), "weight", term178);
        setField(term161, term161.getClass(), "vertexMap", term185);
        setField(term161, term161.getClass(), "minWeight", term198);
        setField(term161, term161.getClass(), "minCutVertex", term200);
        setField(term202, term202.getClass(), "graph", null);
        setIntElement(term203, 0, -1786399638);
        setField(term202, term202.getClass(), "leftSide", term203);
        setIntElement(term205, 0, 2055867847);
        setIntElement(term205, 1, -1048298087);
        setIntElement(term205, 2, 292681826);
        setIntElement(term205, 3, 458147407);
        setIntElement(term205, 4, -184153539);
        setIntElement(term205, 5, 493620644);
        setIntElement(term205, 6, 1328271830);
        setIntElement(term205, 7, 1596070772);
        setIntElement(term205, 8, 97029295);
        setField(term202, term202.getClass(), "rightSide", term205);
        setField(term202, term202.getClass(), "weight", term215);
        setField(term217, term217.getClass(), "graph", null);
        setField(term217, term217.getClass(), "map", null);
        setField(term202, term202.getClass(), "edges", term217);
        setField(term161, term161.getClass(), "minCut", term202);
        setField(term161, term161.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term161, args);
    }

};


