package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class GraphExtremaCalculator_compute_13463443405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7989;

    public GraphExtremaCalculator_compute_13463443405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8036 = new Integer(679763016);
        Integer term8038 = new Integer(1962444399);
        Class<? extends Object> term8118 = Class.forName((String) "org.graph4j.metrics.GraphExtremaCalculator$Type");
        Field term8117 = ((Class) term8118).getDeclaredField((String) "CENTER");
        ((Field) term8117).setAccessible(true);
        Object enum16 = ((Field) term8117).get((Object) null);
        term7989 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        int[] term7994 = (int[]) newIntArray(0);
        int[] term7995 = (int[]) newIntArray(7);
        int[] term8003 = (int[]) newIntArray(9);
        Object term8013 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8014 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8015 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8019 = (int[]) newIntArray(7);
        Object term8029 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8030 = (long[]) newLongArray(1);
        Object term8040 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8041 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8042 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8046 = (int[]) newIntArray(1);
        Object term8050 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8051 = (long[]) newLongArray(1);
        Object term8055 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8056 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8057 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8061 = (int[]) newIntArray(5);
        Object term8069 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8070 = (long[]) newLongArray(1);
        setIntField(term7989, term7989.getClass(), "radiusLB", 1850364894);
        setIntField(term7989, term7989.getClass(), "radiusUB", 915367534);
        setIntField(term7989, term7989.getClass(), "diamLB", 1949983666);
        setIntField(term7989, term7989.getClass(), "diamUB", 154111854);
        setField(term7989, term7989.getClass(), "eccLB", term7994);
        setIntElement(term7995, 0, 710986341);
        setIntElement(term7995, 1, -873958002);
        setIntElement(term7995, 2, -1780848958);
        setIntElement(term7995, 3, 1235045850);
        setIntElement(term7995, 4, -75143033);
        setIntElement(term7995, 5, 797015478);
        setIntElement(term7995, 6, 717574276);
        setField(term7989, term7989.getClass(), "eccUB", term7995);
        setIntElement(term8003, 0, 1795369860);
        setIntElement(term8003, 1, -570164389);
        setIntElement(term8003, 2, 43200329);
        setIntElement(term8003, 3, 998679955);
        setIntElement(term8003, 4, 953741504);
        setIntElement(term8003, 5, 1389452261);
        setIntElement(term8003, 6, 1615957955);
        setIntElement(term8003, 7, 1779370220);
        setIntElement(term8003, 8, -1716046610);
        setField(term7989, term7989.getClass(), "dist", term8003);
        setField(term8014, term8014.getClass(), "table", term8015);
        setIntField(term8014, term8014.getClass(), "count", 65264024);
        setIntField(term8014, term8014.getClass(), "threshold", 15);
        setFloatField(term8014, term8014.getClass(), "loadFactor", 0.75F);
        setField(term8013, term8013.getClass(), "posMap", term8014);
        setField(term8013, term8013.getClass(), "graph", null);
        setIntElement(term8019, 0, -252449812);
        setIntElement(term8019, 1, -1885268968);
        setIntElement(term8019, 2, 277855691);
        setIntElement(term8019, 3, 675891483);
        setIntElement(term8019, 4, -317900470);
        setIntElement(term8019, 5, -979568);
        setIntElement(term8019, 6, -1422131197);
        setField(term8013, term8013.getClass(), "vertices", term8019);
        setIntField(term8013, term8013.getClass(), "numVertices", -20399281);
        setIntField(term8013, term8013.getClass(), "first", -830170410);
        setField(term8029, term8029.getClass(), "words", term8030);
        setIntField(term8029, term8029.getClass(), "wordsInUse", -1742790308);
        setBooleanField(term8029, term8029.getClass(), "sizeIsSticky", false);
        setField(term8013, term8013.getClass(), "bitset", term8029);
        setField(term7989, term7989.getClass(), "candidates", term8013);
        setBooleanField(term7989, term7989.getClass(), "selector", true);
        setBooleanField(term7989, term7989.getClass(), "connected", false);
        setField(term7989, term7989.getClass(), "radius", term8036);
        setField(term7989, term7989.getClass(), "diameter", term8038);
        setField(term8041, term8041.getClass(), "table", term8042);
        setIntField(term8041, term8041.getClass(), "count", -1592093430);
        setIntField(term8041, term8041.getClass(), "threshold", 15);
        setFloatField(term8041, term8041.getClass(), "loadFactor", 0.75F);
        setField(term8040, term8040.getClass(), "posMap", term8041);
        setField(term8040, term8040.getClass(), "graph", null);
        setIntElement(term8046, 0, 1178214545);
        setField(term8040, term8040.getClass(), "vertices", term8046);
        setIntField(term8040, term8040.getClass(), "numVertices", -985334541);
        setIntField(term8040, term8040.getClass(), "first", -1870004228);
        setField(term8050, term8050.getClass(), "words", term8051);
        setIntField(term8050, term8050.getClass(), "wordsInUse", 380484139);
        setBooleanField(term8050, term8050.getClass(), "sizeIsSticky", false);
        setField(term8040, term8040.getClass(), "bitset", term8050);
        setField(term7989, term7989.getClass(), "center", term8040);
        setField(term8056, term8056.getClass(), "table", term8057);
        setIntField(term8056, term8056.getClass(), "count", 1822317628);
        setIntField(term8056, term8056.getClass(), "threshold", 15);
        setFloatField(term8056, term8056.getClass(), "loadFactor", 0.75F);
        setField(term8055, term8055.getClass(), "posMap", term8056);
        setField(term8055, term8055.getClass(), "graph", null);
        setIntElement(term8061, 0, -608830309);
        setIntElement(term8061, 1, -537786484);
        setIntElement(term8061, 2, 263859424);
        setIntElement(term8061, 3, 1436978289);
        setIntElement(term8061, 4, 696225243);
        setField(term8055, term8055.getClass(), "vertices", term8061);
        setIntField(term8055, term8055.getClass(), "numVertices", -1421649118);
        setIntField(term8055, term8055.getClass(), "first", -511248284);
        setField(term8069, term8069.getClass(), "words", term8070);
        setIntField(term8069, term8069.getClass(), "wordsInUse", 788630042);
        setBooleanField(term8069, term8069.getClass(), "sizeIsSticky", true);
        setField(term8055, term8055.getClass(), "bitset", term8069);
        setField(term7989, term7989.getClass(), "periphery", term8055);
        setField(term7989, term7989.getClass(), "extremaType", enum16);
        setField(term7989, term7989.getClass(), "graph", null);
        setBooleanField(term7989, term7989.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term7989, args);
    }

};


