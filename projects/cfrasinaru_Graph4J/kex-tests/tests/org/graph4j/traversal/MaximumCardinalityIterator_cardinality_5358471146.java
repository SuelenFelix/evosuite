package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MaximumCardinalityIterator_cardinality_5358471146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142136;

    public MaximumCardinalityIterator_cardinality_5358471146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142136 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        boolean[] term142138 = (boolean[]) newBooleanArray(4);
        Object term142143 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term142144 = (int[]) newIntArray(5);
        int[] term142150 = (int[]) newIntArray(6);
        int[] term142158 = (int[]) newIntArray(8);
        setField(term142136, term142136.getClass(), "graph", null);
        setIntField(term142136, term142136.getClass(), "startVertex", -834847907);
        setBooleanElement(term142138, 3, true);
        setField(term142136, term142136.getClass(), "visited", term142138);
        setField(term142143, term142143.getClass(), "graph", null);
        setField(term142143, term142143.getClass(), "comparator", null);
        setIntElement(term142144, 0, 936444328);
        setIntElement(term142144, 1, 1456602023);
        setIntElement(term142144, 2, -499798333);
        setIntElement(term142144, 3, 1578833656);
        setIntElement(term142144, 4, -354399266);
        setField(term142143, term142143.getClass(), "keys", term142144);
        setIntElement(term142150, 0, 299801134);
        setIntElement(term142150, 1, -287528111);
        setIntElement(term142150, 2, 1395973014);
        setIntElement(term142150, 3, 1211575855);
        setIntElement(term142150, 4, -1195228796);
        setIntElement(term142150, 5, 1055493234);
        setField(term142143, term142143.getClass(), "positions", term142150);
        setIntField(term142143, term142143.getClass(), "size", 1235709618);
        setField(term142136, term142136.getClass(), "heap", term142143);
        setIntElement(term142158, 0, -644432598);
        setIntElement(term142158, 1, 1033591647);
        setIntElement(term142158, 2, 878370666);
        setIntElement(term142158, 3, 1473691724);
        setIntElement(term142158, 4, 1807164936);
        setIntElement(term142158, 5, -680730364);
        setIntElement(term142158, 6, -1879643284);
        setIntElement(term142158, 7, 110707984);
        setField(term142136, term142136.getClass(), "count", term142158);
        setIntField(term142136, term142136.getClass(), "numIterations", -1716058112);
        setIntField(term142136, term142136.getClass(), "currentVertex", -1673995251);
        setIntField(term142136, term142136.getClass(), "currentVertexId", -1963680505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "cardinality", argTypes, term142136, args);
    }

};


