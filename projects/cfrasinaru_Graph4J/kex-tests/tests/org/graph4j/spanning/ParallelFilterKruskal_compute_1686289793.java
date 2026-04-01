package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class ParallelFilterKruskal_compute_1686289793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149327;

    public ParallelFilterKruskal_compute_1686289793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term149344 = new Double(0.8420870522576868);
        Double term149346 = new Double(0.19453534556565488);
        Double term149348 = new Double(0.027868395377471655);
        Double term149350 = new Double(0.10480688815873318);
        Double term149352 = new Double(0.23237680988355713);
        Double term149359 = new Double(0.6705953059977126);
        Double term149361 = new Double(0.45520924240346106);
        Double term149363 = new Double(0.5367341473773021);
        Double term149365 = new Double(0.11413948355242964);
        Double term149367 = new Double(0.5595819839299788);
        Double term149369 = new Double(0.4191883014045077);
        term149327 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        Object term149328 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term149331 = (int[]) newIntArray(5);
        Object[] term149338 = (Object[]) newArray("org.graph4j.Edge", 2);
        Object term149339 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term149343 = (Object[]) newArray("java.lang.Double", 5);
        Object term149354 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term149358 = (Object[]) newArray("java.lang.Double", 6);
        Object term149372 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setField(term149327, term149327.getClass(), "tree", null);
        setIntField(term149328, term149328.getClass(), "numVertices", -1326530442);
        setBooleanField(term149328, term149328.getClass(), "pathCompression", false);
        setIntElement(term149331, 0, 429215768);
        setIntElement(term149331, 1, 1624825522);
        setIntElement(term149331, 2, 983790556);
        setIntElement(term149331, 3, -1869207999);
        setIntElement(term149331, 4, 1302417712);
        setField(term149328, term149328.getClass(), "parent", term149331);
        setIntField(term149328, term149328.getClass(), "numSets", 980450401);
        setField(term149327, term149327.getClass(), "unionFind", term149328);
        setBooleanField(term149339, term149339.getClass(), "directed", false);
        setIntField(term149339, term149339.getClass(), "source", -1750367143);
        setIntField(term149339, term149339.getClass(), "target", 1290372973);
        setElement(term149343, 0, term149344);
        setElement(term149343, 1, term149346);
        setElement(term149343, 2, term149348);
        setElement(term149343, 3, term149350);
        setElement(term149343, 4, term149352);
        setField(term149339, term149339.getClass(), "data", term149343);
        setField(term149339, term149339.getClass(), "label", null);
        setElement(term149338, 0, term149339);
        setBooleanField(term149354, term149354.getClass(), "directed", true);
        setIntField(term149354, term149354.getClass(), "source", -265082541);
        setIntField(term149354, term149354.getClass(), "target", -837829543);
        setElement(term149358, 0, term149359);
        setElement(term149358, 1, term149361);
        setElement(term149358, 2, term149363);
        setElement(term149358, 3, term149365);
        setElement(term149358, 4, term149367);
        setElement(term149358, 5, term149369);
        setField(term149354, term149354.getClass(), "data", term149358);
        setField(term149354, term149354.getClass(), "label", null);
        setElement(term149338, 1, term149354);
        setField(term149327, term149327.getClass(), "edges", term149338);
        setLongField(term149327, term149327.getClass(), "finalNrOfEdges", 4012955251407483889L);
        setDoubleField(term149372, term149372.getClass(), "value", 0.08620459702348904);
        setField(term149372, term149372.getClass(), "this$0", null);
        setField(term149327, term149327.getClass(), "totalWeight", term149372);
        setBooleanField(term149327, term149327.getClass(), "calculated", false);
        setField(term149327, term149327.getClass(), "graph", null);
        setBooleanField(term149327, term149327.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term149327, args);
    }

};


