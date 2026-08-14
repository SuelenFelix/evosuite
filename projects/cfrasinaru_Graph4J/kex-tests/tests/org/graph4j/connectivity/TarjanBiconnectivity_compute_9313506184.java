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

public class TarjanBiconnectivity_compute_9313506184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2009;
     Object term2109;

    public TarjanBiconnectivity_compute_9313506184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2010 = new Boolean(true);
        Object term2014 = newInstance(Class.forName("org.graph4j.util.Block"));
        Object term2015 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term2019 = (int[]) newIntArray(4);
        Object term2026 = newInstance(Class.forName("java.util.BitSet"));
        setField(term2015, term2015.getClass(), "table", null);
        setIntField(term2015, term2015.getClass(), "count", -1264595049);
        setIntField(term2015, term2015.getClass(), "threshold", 15);
        setFloatField(term2015, term2015.getClass(), "loadFactor", 0.75F);
        setField(term2014, term2014.getClass(), "posMap", term2015);
        setField(term2014, term2014.getClass(), "graph", null);
        setIntElement(term2019, 0, -2058884635);
        setIntElement(term2019, 1, 1064185088);
        setIntElement(term2019, 2, -1249782654);
        setIntElement(term2019, 3, 399302934);
        setField(term2014, term2014.getClass(), "vertices", term2019);
        setIntField(term2014, term2014.getClass(), "numVertices", -1823255084);
        setIntField(term2014, term2014.getClass(), "first", 793345010);
        setField(term2026, term2026.getClass(), "words", null);
        setIntField(term2026, term2026.getClass(), "wordsInUse", -2092117838);
        setBooleanField(term2026, term2026.getClass(), "sizeIsSticky", false);
        setField(term2014, term2014.getClass(), "bitset", term2026);
        Object term2029 = newInstance(Class.forName("org.graph4j.util.Block"));
        Object term2030 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term2034 = (int[]) newIntArray(1);
        Object term2038 = newInstance(Class.forName("java.util.BitSet"));
        setField(term2030, term2030.getClass(), "table", null);
        setIntField(term2030, term2030.getClass(), "count", 1524590776);
        setIntField(term2030, term2030.getClass(), "threshold", 15);
        setFloatField(term2030, term2030.getClass(), "loadFactor", 0.75F);
        setField(term2029, term2029.getClass(), "posMap", term2030);
        setField(term2029, term2029.getClass(), "graph", null);
        setIntElement(term2034, 0, 1523896653);
        setField(term2029, term2029.getClass(), "vertices", term2034);
        setIntField(term2029, term2029.getClass(), "numVertices", -1731921726);
        setIntField(term2029, term2029.getClass(), "first", 919994471);
        setField(term2038, term2038.getClass(), "words", null);
        setIntField(term2038, term2038.getClass(), "wordsInUse", 183531701);
        setBooleanField(term2038, term2038.getClass(), "sizeIsSticky", false);
        setField(term2029, term2029.getClass(), "bitset", term2038);
        Object term2041 = newInstance(Class.forName("org.graph4j.util.Block"));
        Object term2042 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term2046 = (int[]) newIntArray(0);
        Object term2049 = newInstance(Class.forName("java.util.BitSet"));
        setField(term2042, term2042.getClass(), "table", null);
        setIntField(term2042, term2042.getClass(), "count", -974923743);
        setIntField(term2042, term2042.getClass(), "threshold", 15);
        setFloatField(term2042, term2042.getClass(), "loadFactor", 0.75F);
        setField(term2041, term2041.getClass(), "posMap", term2042);
        setField(term2041, term2041.getClass(), "graph", null);
        setField(term2041, term2041.getClass(), "vertices", term2046);
        setIntField(term2041, term2041.getClass(), "numVertices", 1876738932);
        setIntField(term2041, term2041.getClass(), "first", -1870339027);
        setField(term2049, term2049.getClass(), "words", null);
        setIntField(term2049, term2049.getClass(), "wordsInUse", -1549603566);
        setBooleanField(term2049, term2049.getClass(), "sizeIsSticky", false);
        setField(term2041, term2041.getClass(), "bitset", term2049);
        Object term2052 = newInstance(Class.forName("org.graph4j.util.Block"));
        Object term2053 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term2057 = (int[]) newIntArray(6);
        Object term2066 = newInstance(Class.forName("java.util.BitSet"));
        setField(term2053, term2053.getClass(), "table", null);
        setIntField(term2053, term2053.getClass(), "count", 1077223540);
        setIntField(term2053, term2053.getClass(), "threshold", 15);
        setFloatField(term2053, term2053.getClass(), "loadFactor", 0.75F);
        setField(term2052, term2052.getClass(), "posMap", term2053);
        setField(term2052, term2052.getClass(), "graph", null);
        setIntElement(term2057, 0, -1823813592);
        setIntElement(term2057, 1, -1644358555);
        setIntElement(term2057, 2, -388591034);
        setIntElement(term2057, 3, -1270258033);
        setIntElement(term2057, 4, 1677994069);
        setIntElement(term2057, 5, -439999692);
        setField(term2052, term2052.getClass(), "vertices", term2057);
        setIntField(term2052, term2052.getClass(), "numVertices", 924095007);
        setIntField(term2052, term2052.getClass(), "first", 1302110708);
        setField(term2066, term2066.getClass(), "words", null);
        setIntField(term2066, term2066.getClass(), "wordsInUse", 594705497);
        setBooleanField(term2066, term2066.getClass(), "sizeIsSticky", false);
        setField(term2052, term2052.getClass(), "bitset", term2066);
        Object term2069 = newInstance(Class.forName("org.graph4j.util.Block"));
        Object term2070 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term2074 = (int[]) newIntArray(3);
        Object term2080 = newInstance(Class.forName("java.util.BitSet"));
        setField(term2070, term2070.getClass(), "table", null);
        setIntField(term2070, term2070.getClass(), "count", -600102466);
        setIntField(term2070, term2070.getClass(), "threshold", 15);
        setFloatField(term2070, term2070.getClass(), "loadFactor", 0.75F);
        setField(term2069, term2069.getClass(), "posMap", term2070);
        setField(term2069, term2069.getClass(), "graph", null);
        setIntElement(term2074, 0, -899986714);
        setIntElement(term2074, 1, 1307244466);
        setIntElement(term2074, 2, -252262096);
        setField(term2069, term2069.getClass(), "vertices", term2074);
        setIntField(term2069, term2069.getClass(), "numVertices", -37129068);
        setIntField(term2069, term2069.getClass(), "first", -861014847);
        setField(term2080, term2080.getClass(), "words", null);
        setIntField(term2080, term2080.getClass(), "wordsInUse", 2132934139);
        setBooleanField(term2080, term2080.getClass(), "sizeIsSticky", false);
        setField(term2069, term2069.getClass(), "bitset", term2080);
        ArrayList term2012 = new ArrayList();
        ((ArrayList) term2012).add(term2014);
        ((ArrayList) term2012).add(term2029);
        ((ArrayList) term2012).add(term2041);
        ((ArrayList) term2012).add(term2052);
        ((ArrayList) term2012).add(term2069);
        term2009 = newInstance(Class.forName("org.graph4j.connectivity.TarjanBiconnectivity"));
        Object term2085 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2086 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2087 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2091 = (int[]) newIntArray(4);
        Object term2098 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2099 = (long[]) newLongArray(1);
        int[] term2103 = (int[]) newIntArray(5);
        setField(term2009, term2009.getClass(), "biconnected", term2010);
        setField(term2009, term2009.getClass(), "blocks", term2012);
        setField(term2086, term2086.getClass(), "table", term2087);
        setIntField(term2086, term2086.getClass(), "count", -1261824381);
        setIntField(term2086, term2086.getClass(), "threshold", 15);
        setFloatField(term2086, term2086.getClass(), "loadFactor", 0.75F);
        setField(term2085, term2085.getClass(), "posMap", term2086);
        setField(term2085, term2085.getClass(), "graph", null);
        setIntElement(term2091, 0, 1594426218);
        setIntElement(term2091, 1, -2060535464);
        setIntElement(term2091, 2, -1242946317);
        setIntElement(term2091, 3, -1541566235);
        setField(term2085, term2085.getClass(), "vertices", term2091);
        setIntField(term2085, term2085.getClass(), "numVertices", -189738995);
        setIntField(term2085, term2085.getClass(), "first", 1943019963);
        setField(term2098, term2098.getClass(), "words", term2099);
        setIntField(term2098, term2098.getClass(), "wordsInUse", 186472650);
        setBooleanField(term2098, term2098.getClass(), "sizeIsSticky", true);
        setField(term2085, term2085.getClass(), "bitset", term2098);
        setField(term2009, term2009.getClass(), "cutVertices", term2085);
        setIntElement(term2103, 0, 279675992);
        setIntElement(term2103, 1, -1626074989);
        setIntElement(term2103, 2, -552272253);
        setIntElement(term2103, 3, -633523956);
        setIntElement(term2103, 4, 1761540885);
        setField(term2009, term2009.getClass(), "lowpoints", term2103);
        setField(term2009, term2009.getClass(), "graph", null);
        term2109 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanBiconnectivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2109;
        callMethod(klass, "compute", argTypes, term2009, args);
    }

};


