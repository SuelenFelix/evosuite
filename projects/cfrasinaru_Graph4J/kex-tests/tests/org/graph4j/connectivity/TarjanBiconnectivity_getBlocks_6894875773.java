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
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class TarjanBiconnectivity_getBlocks_6894875773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1930;

    public TarjanBiconnectivity_getBlocks_6894875773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1931 = new Boolean(true);
        Object term1935 = newInstance(Class.forName("org.graph4j.util.Block"));
        Object term1936 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term1940 = (int[]) newIntArray(5);
        Object term1948 = newInstance(Class.forName("java.util.BitSet"));
        setField(term1936, term1936.getClass(), "table", null);
        setIntField(term1936, term1936.getClass(), "count", 593962063);
        setIntField(term1936, term1936.getClass(), "threshold", 15);
        setFloatField(term1936, term1936.getClass(), "loadFactor", 0.75F);
        setField(term1935, term1935.getClass(), "posMap", term1936);
        setField(term1935, term1935.getClass(), "graph", null);
        setIntElement(term1940, 0, -1485826786);
        setIntElement(term1940, 1, -1549952664);
        setIntElement(term1940, 2, 148394188);
        setIntElement(term1940, 3, 504525721);
        setIntElement(term1940, 4, 1835568392);
        setField(term1935, term1935.getClass(), "vertices", term1940);
        setIntField(term1935, term1935.getClass(), "numVertices", 457470807);
        setIntField(term1935, term1935.getClass(), "first", -994742871);
        setField(term1948, term1948.getClass(), "words", null);
        setIntField(term1948, term1948.getClass(), "wordsInUse", -222412326);
        setBooleanField(term1948, term1948.getClass(), "sizeIsSticky", false);
        setField(term1935, term1935.getClass(), "bitset", term1948);
        Object term1951 = newInstance(Class.forName("org.graph4j.util.Block"));
        Object term1952 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term1956 = (int[]) newIntArray(4);
        Object term1963 = newInstance(Class.forName("java.util.BitSet"));
        setField(term1952, term1952.getClass(), "table", null);
        setIntField(term1952, term1952.getClass(), "count", -299497261);
        setIntField(term1952, term1952.getClass(), "threshold", 15);
        setFloatField(term1952, term1952.getClass(), "loadFactor", 0.75F);
        setField(term1951, term1951.getClass(), "posMap", term1952);
        setField(term1951, term1951.getClass(), "graph", null);
        setIntElement(term1956, 0, -23054366);
        setIntElement(term1956, 1, 153009426);
        setIntElement(term1956, 2, 185751892);
        setIntElement(term1956, 3, 1068256001);
        setField(term1951, term1951.getClass(), "vertices", term1956);
        setIntField(term1951, term1951.getClass(), "numVertices", 1139078354);
        setIntField(term1951, term1951.getClass(), "first", -691164974);
        setField(term1963, term1963.getClass(), "words", null);
        setIntField(term1963, term1963.getClass(), "wordsInUse", -761675396);
        setBooleanField(term1963, term1963.getClass(), "sizeIsSticky", false);
        setField(term1951, term1951.getClass(), "bitset", term1963);
        ArrayList term1933 = new ArrayList();
        ((ArrayList) term1933).add(term1935);
        ((ArrayList) term1933).add(term1951);
        term1930 = newInstance(Class.forName("org.graph4j.connectivity.TarjanBiconnectivity"));
        Object term1968 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1969 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1970 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1974 = (int[]) newIntArray(8);
        Object term1985 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1986 = (long[]) newLongArray(1);
        int[] term1990 = (int[]) newIntArray(0);
        setField(term1930, term1930.getClass(), "biconnected", term1931);
        setField(term1930, term1930.getClass(), "blocks", term1933);
        setField(term1969, term1969.getClass(), "table", term1970);
        setIntField(term1969, term1969.getClass(), "count", -1954860951);
        setIntField(term1969, term1969.getClass(), "threshold", 15);
        setFloatField(term1969, term1969.getClass(), "loadFactor", 0.75F);
        setField(term1968, term1968.getClass(), "posMap", term1969);
        setField(term1968, term1968.getClass(), "graph", null);
        setIntElement(term1974, 0, -2078879114);
        setIntElement(term1974, 1, -1186882318);
        setIntElement(term1974, 2, 1077647088);
        setIntElement(term1974, 3, -705176810);
        setIntElement(term1974, 4, -1584779593);
        setIntElement(term1974, 5, 303007547);
        setIntElement(term1974, 6, 1498738343);
        setIntElement(term1974, 7, -1635571857);
        setField(term1968, term1968.getClass(), "vertices", term1974);
        setIntField(term1968, term1968.getClass(), "numVertices", 1407309162);
        setIntField(term1968, term1968.getClass(), "first", -534033672);
        setField(term1985, term1985.getClass(), "words", term1986);
        setIntField(term1985, term1985.getClass(), "wordsInUse", -1162790806);
        setBooleanField(term1985, term1985.getClass(), "sizeIsSticky", false);
        setField(term1968, term1968.getClass(), "bitset", term1985);
        setField(term1930, term1930.getClass(), "cutVertices", term1968);
        setField(term1930, term1930.getClass(), "lowpoints", term1990);
        setField(term1930, term1930.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanBiconnectivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlocks", argTypes, term1930, args);
    }

};


