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

public class ParallelFilterKruskal_getWeight_18001204876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2014;

    public ParallelFilterKruskal_getWeight_18001204876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2026 = new Double(0.40387522930100916);
        Double term2028 = new Double(0.036624440957556126);
        Double term2030 = new Double(0.648613673417573);
        Double term2037 = new Double(0.1113914162260009);
        Double term2039 = new Double(0.47349918501511923);
        Double term2041 = new Double(0.1241386580280961);
        Double term2043 = new Double(0.6672973479140587);
        Double term2045 = new Double(0.5778160798576412);
        Double term2047 = new Double(0.4973081192159875);
        Double term2054 = new Double(0.8241641351050926);
        Double term2056 = new Double(0.1746425573030902);
        Double term2058 = new Double(0.930397671780162);
        Double term2060 = new Double(0.5174655391348146);
        Double term2062 = new Double(0.09385588267689582);
        Double term2064 = new Double(0.6635389764920203);
        Double term2071 = new Double(0.9118883779077857);
        Double term2073 = new Double(0.2048432493719995);
        Double term2080 = new Double(0.4582776614492583);
        Double term2082 = new Double(0.4610669841191467);
        Double term2084 = new Double(0.9127147042970267);
        Double term2086 = new Double(0.85834735735361);
        Double term2088 = new Double(0.6520642215589585);
        Double term2090 = new Double(0.6959468578206445);
        Double term2092 = new Double(0.6603256350245514);
        Double term2094 = new Double(0.45582395344416426);
        Double term2101 = new Double(0.720385557578407);
        Double term2103 = new Double(0.3056807318906033);
        Double term2105 = new Double(0.6900630482766184);
        Double term2107 = new Double(0.46055414536796613);
        Double term2109 = new Double(0.7658890382866111);
        Double term2111 = new Double(0.5749950495796489);
        Double term2113 = new Double(0.7319834414419222);
        Double term2115 = new Double(0.6391065297971349);
        Double term2122 = new Double(0.9628659979498808);
        Double term2124 = new Double(0.8270741986815247);
        Double term2126 = new Double(0.2857569007031385);
        Double term2128 = new Double(0.10432254828003162);
        Double term2130 = new Double(0.550709113162105);
        term2014 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        Object term2015 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term2018 = (int[]) newIntArray(0);
        Object[] term2020 = (Object[]) newArray("org.graph4j.Edge", 7);
        Object term2021 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2025 = (Object[]) newArray("java.lang.Double", 3);
        Object term2032 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2036 = (Object[]) newArray("java.lang.Double", 6);
        Object term2049 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2053 = (Object[]) newArray("java.lang.Double", 6);
        Object term2066 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2070 = (Object[]) newArray("java.lang.Double", 2);
        Object term2075 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2079 = (Object[]) newArray("java.lang.Double", 8);
        Object term2096 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2100 = (Object[]) newArray("java.lang.Double", 8);
        Object term2117 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2121 = (Object[]) newArray("java.lang.Double", 5);
        Object term2133 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setField(term2014, term2014.getClass(), "tree", null);
        setIntField(term2015, term2015.getClass(), "numVertices", 888506903);
        setBooleanField(term2015, term2015.getClass(), "pathCompression", false);
        setField(term2015, term2015.getClass(), "parent", term2018);
        setIntField(term2015, term2015.getClass(), "numSets", 200252898);
        setField(term2014, term2014.getClass(), "unionFind", term2015);
        setBooleanField(term2021, term2021.getClass(), "directed", true);
        setIntField(term2021, term2021.getClass(), "source", -1831826725);
        setIntField(term2021, term2021.getClass(), "target", 752152965);
        setElement(term2025, 0, term2026);
        setElement(term2025, 1, term2028);
        setElement(term2025, 2, term2030);
        setField(term2021, term2021.getClass(), "data", term2025);
        setField(term2021, term2021.getClass(), "label", null);
        setElement(term2020, 0, term2021);
        setBooleanField(term2032, term2032.getClass(), "directed", true);
        setIntField(term2032, term2032.getClass(), "source", -1577069773);
        setIntField(term2032, term2032.getClass(), "target", -266625190);
        setElement(term2036, 0, term2037);
        setElement(term2036, 1, term2039);
        setElement(term2036, 2, term2041);
        setElement(term2036, 3, term2043);
        setElement(term2036, 4, term2045);
        setElement(term2036, 5, term2047);
        setField(term2032, term2032.getClass(), "data", term2036);
        setField(term2032, term2032.getClass(), "label", null);
        setElement(term2020, 1, term2032);
        setBooleanField(term2049, term2049.getClass(), "directed", true);
        setIntField(term2049, term2049.getClass(), "source", 489201218);
        setIntField(term2049, term2049.getClass(), "target", 464181937);
        setElement(term2053, 0, term2054);
        setElement(term2053, 1, term2056);
        setElement(term2053, 2, term2058);
        setElement(term2053, 3, term2060);
        setElement(term2053, 4, term2062);
        setElement(term2053, 5, term2064);
        setField(term2049, term2049.getClass(), "data", term2053);
        setField(term2049, term2049.getClass(), "label", null);
        setElement(term2020, 2, term2049);
        setBooleanField(term2066, term2066.getClass(), "directed", false);
        setIntField(term2066, term2066.getClass(), "source", -1455526612);
        setIntField(term2066, term2066.getClass(), "target", -941356098);
        setElement(term2070, 0, term2071);
        setElement(term2070, 1, term2073);
        setField(term2066, term2066.getClass(), "data", term2070);
        setField(term2066, term2066.getClass(), "label", null);
        setElement(term2020, 3, term2066);
        setBooleanField(term2075, term2075.getClass(), "directed", true);
        setIntField(term2075, term2075.getClass(), "source", -201517446);
        setIntField(term2075, term2075.getClass(), "target", -97742366);
        setElement(term2079, 0, term2080);
        setElement(term2079, 1, term2082);
        setElement(term2079, 2, term2084);
        setElement(term2079, 3, term2086);
        setElement(term2079, 4, term2088);
        setElement(term2079, 5, term2090);
        setElement(term2079, 6, term2092);
        setElement(term2079, 7, term2094);
        setField(term2075, term2075.getClass(), "data", term2079);
        setField(term2075, term2075.getClass(), "label", null);
        setElement(term2020, 4, term2075);
        setBooleanField(term2096, term2096.getClass(), "directed", false);
        setIntField(term2096, term2096.getClass(), "source", 1638851942);
        setIntField(term2096, term2096.getClass(), "target", 1374790203);
        setElement(term2100, 0, term2101);
        setElement(term2100, 1, term2103);
        setElement(term2100, 2, term2105);
        setElement(term2100, 3, term2107);
        setElement(term2100, 4, term2109);
        setElement(term2100, 5, term2111);
        setElement(term2100, 6, term2113);
        setElement(term2100, 7, term2115);
        setField(term2096, term2096.getClass(), "data", term2100);
        setField(term2096, term2096.getClass(), "label", null);
        setElement(term2020, 5, term2096);
        setBooleanField(term2117, term2117.getClass(), "directed", true);
        setIntField(term2117, term2117.getClass(), "source", 1160010161);
        setIntField(term2117, term2117.getClass(), "target", -423900705);
        setElement(term2121, 0, term2122);
        setElement(term2121, 1, term2124);
        setElement(term2121, 2, term2126);
        setElement(term2121, 3, term2128);
        setElement(term2121, 4, term2130);
        setField(term2117, term2117.getClass(), "data", term2121);
        setField(term2117, term2117.getClass(), "label", null);
        setElement(term2020, 6, term2117);
        setField(term2014, term2014.getClass(), "edges", term2020);
        setLongField(term2014, term2014.getClass(), "finalNrOfEdges", -7237588299778557629L);
        setDoubleField(term2133, term2133.getClass(), "value", 0.6436713023569729);
        setField(term2133, term2133.getClass(), "this$0", null);
        setField(term2014, term2014.getClass(), "totalWeight", term2133);
        setBooleanField(term2014, term2014.getClass(), "calculated", false);
        setField(term2014, term2014.getClass(), "graph", null);
        setBooleanField(term2014, term2014.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeight", argTypes, term2014, args);
    }

};


