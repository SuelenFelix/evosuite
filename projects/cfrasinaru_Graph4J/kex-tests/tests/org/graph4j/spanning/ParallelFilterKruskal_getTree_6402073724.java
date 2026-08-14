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

public class ParallelFilterKruskal_getTree_6402073724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1890;

    public ParallelFilterKruskal_getTree_6402073724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1903 = new Double(0.3389647053819348);
        Double term1905 = new Double(0.2151134774049427);
        Double term1912 = new Double(0.14703921400520792);
        Double term1914 = new Double(0.9343367310647196);
        Double term1916 = new Double(0.5569644096083258);
        Double term1923 = new Double(0.7527275444646349);
        term1890 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        Object term1891 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term1894 = (int[]) newIntArray(1);
        Object[] term1897 = (Object[]) newArray("org.graph4j.Edge", 5);
        Object term1898 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1902 = (Object[]) newArray("java.lang.Double", 2);
        Object term1907 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1911 = (Object[]) newArray("java.lang.Double", 3);
        Object term1918 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1922 = (Object[]) newArray("java.lang.Double", 1);
        Object term1925 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1929 = (Object[]) newArray("java.lang.Double", 0);
        Object term1930 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1934 = (Object[]) newArray("java.lang.Double", 0);
        Object term1936 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setField(term1890, term1890.getClass(), "tree", null);
        setIntField(term1891, term1891.getClass(), "numVertices", -1830198043);
        setBooleanField(term1891, term1891.getClass(), "pathCompression", true);
        setIntElement(term1894, 0, -439048495);
        setField(term1891, term1891.getClass(), "parent", term1894);
        setIntField(term1891, term1891.getClass(), "numSets", -1849105286);
        setField(term1890, term1890.getClass(), "unionFind", term1891);
        setBooleanField(term1898, term1898.getClass(), "directed", false);
        setIntField(term1898, term1898.getClass(), "source", 1334483645);
        setIntField(term1898, term1898.getClass(), "target", 917513193);
        setElement(term1902, 0, term1903);
        setElement(term1902, 1, term1905);
        setField(term1898, term1898.getClass(), "data", term1902);
        setField(term1898, term1898.getClass(), "label", null);
        setElement(term1897, 0, term1898);
        setBooleanField(term1907, term1907.getClass(), "directed", false);
        setIntField(term1907, term1907.getClass(), "source", 787278105);
        setIntField(term1907, term1907.getClass(), "target", -2063843486);
        setElement(term1911, 0, term1912);
        setElement(term1911, 1, term1914);
        setElement(term1911, 2, term1916);
        setField(term1907, term1907.getClass(), "data", term1911);
        setField(term1907, term1907.getClass(), "label", null);
        setElement(term1897, 1, term1907);
        setBooleanField(term1918, term1918.getClass(), "directed", true);
        setIntField(term1918, term1918.getClass(), "source", 833762980);
        setIntField(term1918, term1918.getClass(), "target", 320711637);
        setElement(term1922, 0, term1923);
        setField(term1918, term1918.getClass(), "data", term1922);
        setField(term1918, term1918.getClass(), "label", null);
        setElement(term1897, 2, term1918);
        setBooleanField(term1925, term1925.getClass(), "directed", true);
        setIntField(term1925, term1925.getClass(), "source", 1241164745);
        setIntField(term1925, term1925.getClass(), "target", 1723148410);
        setField(term1925, term1925.getClass(), "data", term1929);
        setField(term1925, term1925.getClass(), "label", null);
        setElement(term1897, 3, term1925);
        setBooleanField(term1930, term1930.getClass(), "directed", false);
        setIntField(term1930, term1930.getClass(), "source", -920797484);
        setIntField(term1930, term1930.getClass(), "target", -1631697577);
        setField(term1930, term1930.getClass(), "data", term1934);
        setField(term1930, term1930.getClass(), "label", null);
        setElement(term1897, 4, term1930);
        setField(term1890, term1890.getClass(), "edges", term1897);
        setLongField(term1890, term1890.getClass(), "finalNrOfEdges", 4872422362414183754L);
        setDoubleField(term1936, term1936.getClass(), "value", 0.9828442029246764);
        setField(term1936, term1936.getClass(), "this$0", null);
        setField(term1890, term1890.getClass(), "totalWeight", term1936);
        setBooleanField(term1890, term1890.getClass(), "calculated", true);
        setField(term1890, term1890.getClass(), "graph", null);
        setBooleanField(term1890, term1890.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTree", argTypes, term1890, args);
    }

};


