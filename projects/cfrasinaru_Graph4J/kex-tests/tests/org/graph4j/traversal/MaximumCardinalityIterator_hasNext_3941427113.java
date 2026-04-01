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

public class MaximumCardinalityIterator_hasNext_3941427113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141997;

    public MaximumCardinalityIterator_hasNext_3941427113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141997 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        boolean[] term141999 = (boolean[]) newBooleanArray(4);
        Object term142004 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term142005 = (int[]) newIntArray(7);
        int[] term142013 = (int[]) newIntArray(3);
        int[] term142018 = (int[]) newIntArray(5);
        setField(term141997, term141997.getClass(), "graph", null);
        setIntField(term141997, term141997.getClass(), "startVertex", 768256023);
        setBooleanElement(term141999, 0, true);
        setBooleanElement(term141999, 1, true);
        setBooleanElement(term141999, 2, true);
        setBooleanElement(term141999, 3, true);
        setField(term141997, term141997.getClass(), "visited", term141999);
        setField(term142004, term142004.getClass(), "graph", null);
        setField(term142004, term142004.getClass(), "comparator", null);
        setIntElement(term142005, 0, -1712430850);
        setIntElement(term142005, 1, 1974693268);
        setIntElement(term142005, 2, 1146439897);
        setIntElement(term142005, 3, 696414347);
        setIntElement(term142005, 4, -637942741);
        setIntElement(term142005, 5, -1519940182);
        setIntElement(term142005, 6, -881040839);
        setField(term142004, term142004.getClass(), "keys", term142005);
        setIntElement(term142013, 0, -1305172504);
        setIntElement(term142013, 1, 75002024);
        setIntElement(term142013, 2, 2003428157);
        setField(term142004, term142004.getClass(), "positions", term142013);
        setIntField(term142004, term142004.getClass(), "size", 1818936350);
        setField(term141997, term141997.getClass(), "heap", term142004);
        setIntElement(term142018, 0, 1043913455);
        setIntElement(term142018, 1, -1634997589);
        setIntElement(term142018, 2, 223393607);
        setIntElement(term142018, 3, -217890242);
        setIntElement(term142018, 4, -750232652);
        setField(term141997, term141997.getClass(), "count", term142018);
        setIntField(term141997, term141997.getClass(), "numIterations", -1831363199);
        setIntField(term141997, term141997.getClass(), "currentVertex", -931364454);
        setIntField(term141997, term141997.getClass(), "currentVertexId", -1768985663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term141997, args);
    }

};


