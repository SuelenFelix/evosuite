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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class WeightedSpanningTreeIterator_addEdge_19317338666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63312;
     Object term63334;
     Object term63368;
     Object term63389;

    public WeightedSpanningTreeIterator_addEdge_19317338666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term63320 = new Double(0.010058361776520197);
        Double term63322 = new Double(0.22206025307636057);
        Double term63324 = new Double(0.3762445362551795);
        Double term63326 = new Double(0.6004517527698794);
        Double term63328 = new Double(0.9412219458975137);
        Double term63330 = new Double(0.06469331916225318);
        Double term63332 = new Double(0.9259830415214885);
        term63312 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator"));
        Object[] term63314 = (Object[]) newArray("org.graph4j.Edge", 1);
        Object term63315 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term63319 = (Object[]) newArray("java.lang.Double", 7);
        setField(term63312, term63312.getClass(), "graph", null);
        setIntField(term63312, term63312.getClass(), "numVertices", -1772120343);
        setBooleanField(term63315, term63315.getClass(), "directed", true);
        setIntField(term63315, term63315.getClass(), "source", -1481596613);
        setIntField(term63315, term63315.getClass(), "target", -395114974);
        setElement(term63319, 0, term63320);
        setElement(term63319, 1, term63322);
        setElement(term63319, 2, term63324);
        setElement(term63319, 3, term63326);
        setElement(term63319, 4, term63328);
        setElement(term63319, 5, term63330);
        setElement(term63319, 6, term63332);
        setField(term63315, term63315.getClass(), "data", term63319);
        setField(term63315, term63315.getClass(), "label", null);
        setElement(term63314, 0, term63315);
        setField(term63312, term63312.getClass(), "edges", term63314);
        setField(term63312, term63312.getClass(), "queue", null);
        HashMap term63336 = new HashMap();
        Set<Object> term63396 =  ((Map) term63336).keySet();
        HashSet term63335 = new HashSet((Collection<? extends Object>) term63396);
        HashMap term63342 = new HashMap();
        Set<Object> term63397 =  ((Map) term63342).keySet();
        HashSet term63341 = new HashSet((Collection<? extends Object>) term63397);
        HashMap term63355 = new HashMap();
        Set<Object> term63398 =  ((Map) term63355).keySet();
        HashSet term63354 = new HashSet((Collection<? extends Object>) term63398);
        term63334 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part"));
        setField(term63334, term63334.getClass(), "included", term63335);
        setField(term63334, term63334.getClass(), "excluded", term63341);
        setField(term63334, term63334.getClass(), "mstEdges", term63354);
        setDoubleField(term63334, term63334.getClass(), "mstWeight", 0.7214641871806202);
        setField(term63334, term63334.getClass(), "this$0", null);
        Double term63373 = new Double(0.992214897936456);
        Double term63375 = new Double(0.10940058061451474);
        Double term63377 = new Double(0.5280493395446559);
        Double term63379 = new Double(0.5885698341309811);
        Double term63381 = new Double(0.47963743635149814);
        Double term63383 = new Double(0.07322031754051816);
        Double term63385 = new Double(0.7572808992551947);
        Double term63387 = new Double(0.34277768712445844);
        term63368 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term63372 = (Object[]) newArray("java.lang.Double", 8);
        setBooleanField(term63368, term63368.getClass(), "directed", false);
        setIntField(term63368, term63368.getClass(), "source", 1051940041);
        setIntField(term63368, term63368.getClass(), "target", -1438630933);
        setElement(term63372, 0, term63373);
        setElement(term63372, 1, term63375);
        setElement(term63372, 2, term63377);
        setElement(term63372, 3, term63379);
        setElement(term63372, 4, term63381);
        setElement(term63372, 5, term63383);
        setElement(term63372, 6, term63385);
        setElement(term63372, 7, term63387);
        setField(term63368, term63368.getClass(), "data", term63372);
        setField(term63368, term63368.getClass(), "label", null);
        term63389 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term63392 = (int[]) newIntArray(2);
        setIntField(term63389, term63389.getClass(), "numVertices", 1429450341);
        setBooleanField(term63389, term63389.getClass(), "pathCompression", false);
        setIntElement(term63392, 0, 853910835);
        setIntElement(term63392, 1, 523509597);
        setField(term63389, term63389.getClass(), "parent", term63392);
        setIntField(term63389, term63389.getClass(), "numSets", 2115455955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        argTypes[1] = Class.forName("org.graph4j.Edge");
        argTypes[2] = Class.forName("org.graph4j.util.UnionFind");
        Object[] args = new Object[3];
        args[0] = term63334;
        args[1] = term63368;
        args[2] = term63389;
        callMethod(klass, "addEdge", argTypes, term63312, args);
    }

};


