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

public class BidirectionalDijkstra_compute_6765302135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2394;

    public BidirectionalDijkstra_compute_6765302135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2394 = newInstance(Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra"));
        int[] term2397 = (int[]) newIntArray(5);
        Object term2403 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2405 = (int[]) newIntArray(8);
        Object term2416 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2417 = (long[]) newLongArray(1);
        setIntField(term2394, term2394.getClass(), "source", -15712667);
        setIntField(term2394, term2394.getClass(), "target", 1964967720);
        setIntElement(term2397, 0, 1351900243);
        setIntElement(term2397, 1, -330897705);
        setIntElement(term2397, 2, 1065595802);
        setIntElement(term2397, 3, 21031843);
        setIntElement(term2397, 4, -380787857);
        setField(term2394, term2394.getClass(), "vertices", term2397);
        setIntField(term2403, term2403.getClass(), "numEdges", 319853052);
        setField(term2403, term2403.getClass(), "graph", null);
        setIntElement(term2405, 0, -1097563716);
        setIntElement(term2405, 1, 1572907769);
        setIntElement(term2405, 2, 1608016787);
        setIntElement(term2405, 3, -516303035);
        setIntElement(term2405, 4, -2143043890);
        setIntElement(term2405, 5, -2138825831);
        setIntElement(term2405, 6, 1454781562);
        setIntElement(term2405, 7, -27944011);
        setField(term2403, term2403.getClass(), "vertices", term2405);
        setIntField(term2403, term2403.getClass(), "numVertices", -20614472);
        setIntField(term2403, term2403.getClass(), "first", 1126618861);
        setField(term2416, term2416.getClass(), "words", term2417);
        setIntField(term2416, term2416.getClass(), "wordsInUse", 947449400);
        setBooleanField(term2416, term2416.getClass(), "sizeIsSticky", true);
        setField(term2403, term2403.getClass(), "bitset", term2416);
        setField(term2394, term2394.getClass(), "bestPath", term2403);
        setDoubleField(term2394, term2394.getClass(), "bestWeight", 0.593079122289713);
        setField(term2394, term2394.getClass(), "graph", null);
        setBooleanField(term2394, term2394.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term2394, args);
    }

};


