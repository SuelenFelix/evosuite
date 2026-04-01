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

public class TarjanBiconnectivity_getCutVertices_18004691912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1876;

    public TarjanBiconnectivity_getCutVertices_18004691912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1877 = new Boolean(false);
        Object term1881 = newInstance(Class.forName("org.graph4j.util.Block"));
        Object term1882 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term1886 = (int[]) newIntArray(5);
        Object term1894 = newInstance(Class.forName("java.util.BitSet"));
        setField(term1882, term1882.getClass(), "table", null);
        setIntField(term1882, term1882.getClass(), "count", 2011764585);
        setIntField(term1882, term1882.getClass(), "threshold", 15);
        setFloatField(term1882, term1882.getClass(), "loadFactor", 0.75F);
        setField(term1881, term1881.getClass(), "posMap", term1882);
        setField(term1881, term1881.getClass(), "graph", null);
        setIntElement(term1886, 0, -860680764);
        setIntElement(term1886, 1, -963198667);
        setIntElement(term1886, 2, -1007935918);
        setIntElement(term1886, 3, 1485731037);
        setIntElement(term1886, 4, 1304396087);
        setField(term1881, term1881.getClass(), "vertices", term1886);
        setIntField(term1881, term1881.getClass(), "numVertices", 1782600602);
        setIntField(term1881, term1881.getClass(), "first", -185892708);
        setField(term1894, term1894.getClass(), "words", null);
        setIntField(term1894, term1894.getClass(), "wordsInUse", -203163250);
        setBooleanField(term1894, term1894.getClass(), "sizeIsSticky", true);
        setField(term1881, term1881.getClass(), "bitset", term1894);
        ArrayList term1879 = new ArrayList();
        ((ArrayList) term1879).add(term1881);
        term1876 = newInstance(Class.forName("org.graph4j.connectivity.TarjanBiconnectivity"));
        Object term1899 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1900 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1901 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1905 = (int[]) newIntArray(3);
        Object term1911 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1912 = (long[]) newLongArray(1);
        int[] term1916 = (int[]) newIntArray(2);
        setField(term1876, term1876.getClass(), "biconnected", term1877);
        setField(term1876, term1876.getClass(), "blocks", term1879);
        setField(term1900, term1900.getClass(), "table", term1901);
        setIntField(term1900, term1900.getClass(), "count", 498473526);
        setIntField(term1900, term1900.getClass(), "threshold", 15);
        setFloatField(term1900, term1900.getClass(), "loadFactor", 0.75F);
        setField(term1899, term1899.getClass(), "posMap", term1900);
        setField(term1899, term1899.getClass(), "graph", null);
        setIntElement(term1905, 0, 1186917020);
        setIntElement(term1905, 1, 1670041824);
        setIntElement(term1905, 2, 2140388634);
        setField(term1899, term1899.getClass(), "vertices", term1905);
        setIntField(term1899, term1899.getClass(), "numVertices", 21095258);
        setIntField(term1899, term1899.getClass(), "first", -1793997256);
        setField(term1911, term1911.getClass(), "words", term1912);
        setIntField(term1911, term1911.getClass(), "wordsInUse", -1271598018);
        setBooleanField(term1911, term1911.getClass(), "sizeIsSticky", true);
        setField(term1899, term1899.getClass(), "bitset", term1911);
        setField(term1876, term1876.getClass(), "cutVertices", term1899);
        setIntElement(term1916, 0, 157967613);
        setIntElement(term1916, 1, 811839399);
        setField(term1876, term1876.getClass(), "lowpoints", term1916);
        setField(term1876, term1876.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanBiconnectivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCutVertices", argTypes, term1876, args);
    }

};


