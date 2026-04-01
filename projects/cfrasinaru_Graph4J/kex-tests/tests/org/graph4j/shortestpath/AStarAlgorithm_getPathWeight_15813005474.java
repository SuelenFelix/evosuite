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

public class AStarAlgorithm_getPathWeight_15813005474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122737;

    public AStarAlgorithm_getPathWeight_15813005474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122737 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term122740 = (int[]) newIntArray(4);
        double[] term122745 = (double[]) newDoubleArray(4);
        int[] term122750 = (int[]) newIntArray(6);
        int[] term122757 = (int[]) newIntArray(1);
        boolean[] term122759 = (boolean[]) newBooleanArray(3);
        Object term122764 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term122765 = (int[]) newIntArray(6);
        int[] term122772 = (int[]) newIntArray(6);
        setIntField(term122737, term122737.getClass(), "source", 1009600826);
        setIntField(term122737, term122737.getClass(), "target", -1548432397);
        setIntElement(term122740, 0, 73972775);
        setIntElement(term122740, 1, -1517164483);
        setIntElement(term122740, 2, -543646157);
        setIntElement(term122740, 3, -1489575010);
        setField(term122737, term122737.getClass(), "vertices", term122740);
        setDoubleElement(term122745, 0, 0.6615642299980122);
        setDoubleElement(term122745, 1, 0.9701431450974184);
        setDoubleElement(term122745, 2, 0.0414661749447669);
        setDoubleElement(term122745, 3, 0.10369913982196022);
        setField(term122737, term122737.getClass(), "cost", term122745);
        setIntElement(term122750, 0, 2059365027);
        setIntElement(term122750, 1, -1882752529);
        setIntElement(term122750, 2, 1080940354);
        setIntElement(term122750, 3, 1202769119);
        setIntElement(term122750, 4, 2136561070);
        setIntElement(term122750, 5, 609012058);
        setField(term122737, term122737.getClass(), "before", term122750);
        setIntElement(term122757, 0, 2086672902);
        setField(term122737, term122737.getClass(), "size", term122757);
        setBooleanElement(term122759, 1, true);
        setField(term122737, term122737.getClass(), "solved", term122759);
        setIntField(term122737, term122737.getClass(), "numSolved", 174619955);
        setField(term122764, term122764.getClass(), "graph", null);
        setField(term122764, term122764.getClass(), "comparator", null);
        setIntElement(term122765, 0, -1810980771);
        setIntElement(term122765, 1, -1306395034);
        setIntElement(term122765, 2, -1500115801);
        setIntElement(term122765, 3, 1598085752);
        setIntElement(term122765, 4, -755725066);
        setIntElement(term122765, 5, -1744733255);
        setField(term122764, term122764.getClass(), "keys", term122765);
        setIntElement(term122772, 0, 387460157);
        setIntElement(term122772, 1, -259892358);
        setIntElement(term122772, 2, -2021731334);
        setIntElement(term122772, 3, 460292973);
        setIntElement(term122772, 4, -127687310);
        setIntElement(term122772, 5, -936075827);
        setField(term122764, term122764.getClass(), "positions", term122772);
        setIntField(term122764, term122764.getClass(), "size", -1984895131);
        setField(term122737, term122737.getClass(), "heap", term122764);
        setField(term122737, term122737.getClass(), "heuristic", null);
        setField(term122737, term122737.getClass(), "graph", null);
        setBooleanField(term122737, term122737.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeight", argTypes, term122737, args);
    }

};


