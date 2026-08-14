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

public class MaximumCardinalityIterator_next_10138928814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2476;

    public MaximumCardinalityIterator_next_10138928814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2476 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        boolean[] term2478 = (boolean[]) newBooleanArray(3);
        Object term2482 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2483 = (int[]) newIntArray(9);
        int[] term2493 = (int[]) newIntArray(7);
        int[] term2502 = (int[]) newIntArray(6);
        setField(term2476, term2476.getClass(), "graph", null);
        setIntField(term2476, term2476.getClass(), "startVertex", 1143522832);
        setBooleanElement(term2478, 1, true);
        setBooleanElement(term2478, 2, true);
        setField(term2476, term2476.getClass(), "visited", term2478);
        setField(term2482, term2482.getClass(), "graph", null);
        setField(term2482, term2482.getClass(), "comparator", null);
        setIntElement(term2483, 0, 40965975);
        setIntElement(term2483, 1, -194718582);
        setIntElement(term2483, 2, 42982854);
        setIntElement(term2483, 3, -1129506480);
        setIntElement(term2483, 4, 301438568);
        setIntElement(term2483, 5, -1667908453);
        setIntElement(term2483, 6, 315910438);
        setIntElement(term2483, 7, -1673157821);
        setIntElement(term2483, 8, 1217804703);
        setField(term2482, term2482.getClass(), "keys", term2483);
        setIntElement(term2493, 0, -1981494102);
        setIntElement(term2493, 1, -2064148945);
        setIntElement(term2493, 2, 494400151);
        setIntElement(term2493, 3, 1588058685);
        setIntElement(term2493, 4, 1677707412);
        setIntElement(term2493, 5, -297367861);
        setIntElement(term2493, 6, -1133541490);
        setField(term2482, term2482.getClass(), "positions", term2493);
        setIntField(term2482, term2482.getClass(), "size", 942412391);
        setField(term2476, term2476.getClass(), "heap", term2482);
        setIntElement(term2502, 0, 751596480);
        setIntElement(term2502, 1, 1971485144);
        setIntElement(term2502, 2, 2059603512);
        setIntElement(term2502, 3, -1308902065);
        setIntElement(term2502, 4, 605255795);
        setIntElement(term2502, 5, 1743438307);
        setField(term2476, term2476.getClass(), "count", term2502);
        setIntField(term2476, term2476.getClass(), "numIterations", -1122596893);
        setIntField(term2476, term2476.getClass(), "currentVertex", -2147297900);
        setIntField(term2476, term2476.getClass(), "currentVertexId", 539095138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term2476, args);
    }

};


