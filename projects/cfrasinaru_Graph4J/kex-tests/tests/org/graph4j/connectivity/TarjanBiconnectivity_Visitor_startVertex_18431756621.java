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

public class TarjanBiconnectivity_Visitor_startVertex_18431756621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2319;
     Object term2341;

    public TarjanBiconnectivity_Visitor_startVertex_18431756621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2319 = newInstance(Class.forName("org.graph4j.connectivity.TarjanBiconnectivity$Visitor"));
        Object term2321 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term2322 = (int[]) newIntArray(1);
        Object term2326 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2327 = (long[]) newLongArray(1);
        boolean[] term2331 = (boolean[]) newBooleanArray(9);
        setBooleanField(term2319, term2319.getClass(), "checkOnly", false);
        setField(term2321, term2321.getClass(), "graph", null);
        setIntElement(term2322, 0, -2018333791);
        setField(term2321, term2321.getClass(), "vertices", term2322);
        setIntField(term2321, term2321.getClass(), "numVertices", -742476678);
        setIntField(term2321, term2321.getClass(), "first", -824369460);
        setField(term2326, term2326.getClass(), "words", term2327);
        setIntField(term2326, term2326.getClass(), "wordsInUse", -1573760035);
        setBooleanField(term2326, term2326.getClass(), "sizeIsSticky", false);
        setField(term2321, term2321.getClass(), "bitset", term2326);
        setField(term2319, term2319.getClass(), "stack", term2321);
        setBooleanElement(term2331, 0, true);
        setBooleanElement(term2331, 1, true);
        setBooleanElement(term2331, 2, true);
        setBooleanElement(term2331, 4, true);
        setBooleanElement(term2331, 7, true);
        setField(term2319, term2319.getClass(), "instack", term2331);
        setField(term2319, term2319.getClass(), "this$0", null);
        term2341 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2346 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2351 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2356 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2361 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2341, term2341.getClass(), "component", -1147965121);
        setIntField(term2341, term2341.getClass(), "vertex", -867099093);
        setIntField(term2341, term2341.getClass(), "level", -1091199008);
        setIntField(term2341, term2341.getClass(), "order", 1837886253);
        setIntField(term2346, term2346.getClass(), "component", -269528550);
        setIntField(term2346, term2346.getClass(), "vertex", 2108571355);
        setIntField(term2346, term2346.getClass(), "level", 1909966089);
        setIntField(term2346, term2346.getClass(), "order", 1827255916);
        setIntField(term2351, term2351.getClass(), "component", 2039815750);
        setIntField(term2351, term2351.getClass(), "vertex", 2079590265);
        setIntField(term2351, term2351.getClass(), "level", -435079567);
        setIntField(term2351, term2351.getClass(), "order", -1017617829);
        setIntField(term2356, term2356.getClass(), "component", 270928865);
        setIntField(term2356, term2356.getClass(), "vertex", -308526089);
        setIntField(term2356, term2356.getClass(), "level", -359675864);
        setIntField(term2356, term2356.getClass(), "order", -1671982964);
        setIntField(term2361, term2361.getClass(), "component", 776218451);
        setIntField(term2361, term2361.getClass(), "vertex", -1362132929);
        setIntField(term2361, term2361.getClass(), "level", 1267740164);
        setIntField(term2361, term2361.getClass(), "order", 1363887997);
        setField(term2361, term2361.getClass(), "parent", null);
        setField(term2356, term2356.getClass(), "parent", term2361);
        setField(term2351, term2351.getClass(), "parent", term2356);
        setField(term2346, term2346.getClass(), "parent", term2351);
        setField(term2341, term2341.getClass(), "parent", term2346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanBiconnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term2341;
        callMethod(klass, "startVertex", argTypes, term2319, args);
    }

};


