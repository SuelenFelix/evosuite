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

public class ParallelFilterKruskal_filter_20031053785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1941;
     Object term2004;

    public ParallelFilterKruskal_filter_20031053785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1962 = new Double(0.38299462989514377);
        Double term1964 = new Double(0.12164012123809098);
        Double term1966 = new Double(0.019174439062670467);
        Double term1968 = new Double(0.17827385312846922);
        Double term1970 = new Double(0.5284679973716927);
        Double term1972 = new Double(0.5233539642461534);
        Double term1974 = new Double(0.2065669149596887);
        Double term1976 = new Double(0.48600687227277806);
        Double term1978 = new Double(0.7384086133828546);
        Double term1985 = new Double(0.9304178842125251);
        Double term1987 = new Double(0.9233657088240451);
        Double term1989 = new Double(0.04025609521413642);
        Double term1991 = new Double(0.3687319853615557);
        Double term1993 = new Double(0.5816591160182095);
        Double term1995 = new Double(0.264161580698845);
        Double term1997 = new Double(0.3752345600445256);
        term1941 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        Object term1942 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term1945 = (int[]) newIntArray(9);
        Object[] term1956 = (Object[]) newArray("org.graph4j.Edge", 2);
        Object term1957 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1961 = (Object[]) newArray("java.lang.Double", 9);
        Object term1980 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1984 = (Object[]) newArray("java.lang.Double", 7);
        Object term2000 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setField(term1941, term1941.getClass(), "tree", null);
        setIntField(term1942, term1942.getClass(), "numVertices", 765731371);
        setBooleanField(term1942, term1942.getClass(), "pathCompression", false);
        setIntElement(term1945, 0, -1703035419);
        setIntElement(term1945, 1, 765766290);
        setIntElement(term1945, 2, -1284825282);
        setIntElement(term1945, 3, -1941343035);
        setIntElement(term1945, 4, 947897214);
        setIntElement(term1945, 5, 1496340209);
        setIntElement(term1945, 6, -1748391876);
        setIntElement(term1945, 7, 43258317);
        setIntElement(term1945, 8, 1707220033);
        setField(term1942, term1942.getClass(), "parent", term1945);
        setIntField(term1942, term1942.getClass(), "numSets", -1792504217);
        setField(term1941, term1941.getClass(), "unionFind", term1942);
        setBooleanField(term1957, term1957.getClass(), "directed", false);
        setIntField(term1957, term1957.getClass(), "source", 1824538861);
        setIntField(term1957, term1957.getClass(), "target", 499519708);
        setElement(term1961, 0, term1962);
        setElement(term1961, 1, term1964);
        setElement(term1961, 2, term1966);
        setElement(term1961, 3, term1968);
        setElement(term1961, 4, term1970);
        setElement(term1961, 5, term1972);
        setElement(term1961, 6, term1974);
        setElement(term1961, 7, term1976);
        setElement(term1961, 8, term1978);
        setField(term1957, term1957.getClass(), "data", term1961);
        setField(term1957, term1957.getClass(), "label", null);
        setElement(term1956, 0, term1957);
        setBooleanField(term1980, term1980.getClass(), "directed", true);
        setIntField(term1980, term1980.getClass(), "source", 1501165033);
        setIntField(term1980, term1980.getClass(), "target", 510162332);
        setElement(term1984, 0, term1985);
        setElement(term1984, 1, term1987);
        setElement(term1984, 2, term1989);
        setElement(term1984, 3, term1991);
        setElement(term1984, 4, term1993);
        setElement(term1984, 5, term1995);
        setElement(term1984, 6, term1997);
        setField(term1980, term1980.getClass(), "data", term1984);
        setField(term1980, term1980.getClass(), "label", null);
        setElement(term1956, 1, term1980);
        setField(term1941, term1941.getClass(), "edges", term1956);
        setLongField(term1941, term1941.getClass(), "finalNrOfEdges", 6811161968424632369L);
        setDoubleField(term2000, term2000.getClass(), "value", 0.2779719046761513);
        setField(term2000, term2000.getClass(), "this$0", null);
        setField(term1941, term1941.getClass(), "totalWeight", term2000);
        setBooleanField(term1941, term1941.getClass(), "calculated", false);
        setField(term1941, term1941.getClass(), "graph", null);
        setBooleanField(term1941, term1941.getClass(), "directed", true);
        term2004 = (Object[]) newArray("org.graph4j.Edge", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2004;
        callMethod(klass, "filter", argTypes, term1941, args);
    }

};


