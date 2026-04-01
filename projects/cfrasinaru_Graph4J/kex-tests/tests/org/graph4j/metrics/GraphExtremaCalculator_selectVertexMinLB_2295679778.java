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

public class GraphExtremaCalculator_selectVertexMinLB_2295679778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9131;

    public GraphExtremaCalculator_selectVertexMinLB_2295679778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9172 = new Integer(-817164822);
        Integer term9174 = new Integer(-1016503459);
        Class<? extends Object> term9268 = Class.forName((String) "org.graph4j.metrics.GraphExtremaCalculator$Type");
        Field term9267 = ((Class) term9268).getDeclaredField((String) "CENTER");
        ((Field) term9267).setAccessible(true);
        Object enum19 = ((Field) term9267).get((Object) null);
        term9131 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        int[] term9136 = (int[]) newIntArray(3);
        int[] term9140 = (int[]) newIntArray(6);
        int[] term9147 = (int[]) newIntArray(6);
        Object term9154 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term9155 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term9156 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term9160 = (int[]) newIntArray(2);
        Object term9165 = newInstance(Class.forName("java.util.BitSet"));
        long[] term9166 = (long[]) newLongArray(1);
        Object term9176 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term9177 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term9178 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term9182 = (int[]) newIntArray(8);
        Object term9193 = newInstance(Class.forName("java.util.BitSet"));
        long[] term9194 = (long[]) newLongArray(1);
        Object term9198 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term9199 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term9200 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term9204 = (int[]) newIntArray(8);
        Object term9215 = newInstance(Class.forName("java.util.BitSet"));
        long[] term9216 = (long[]) newLongArray(1);
        setIntField(term9131, term9131.getClass(), "radiusLB", 1689228897);
        setIntField(term9131, term9131.getClass(), "radiusUB", 892205855);
        setIntField(term9131, term9131.getClass(), "diamLB", 1955560079);
        setIntField(term9131, term9131.getClass(), "diamUB", -1330529019);
        setIntElement(term9136, 0, 237134844);
        setIntElement(term9136, 1, 2076413861);
        setIntElement(term9136, 2, 66817373);
        setField(term9131, term9131.getClass(), "eccLB", term9136);
        setIntElement(term9140, 0, 1459628013);
        setIntElement(term9140, 1, -1641507499);
        setIntElement(term9140, 2, -33436796);
        setIntElement(term9140, 3, -1527326823);
        setIntElement(term9140, 4, 469871899);
        setIntElement(term9140, 5, -1348703436);
        setField(term9131, term9131.getClass(), "eccUB", term9140);
        setIntElement(term9147, 0, -2027012650);
        setIntElement(term9147, 1, 1343432022);
        setIntElement(term9147, 2, -1767079160);
        setIntElement(term9147, 3, -201010601);
        setIntElement(term9147, 4, 2060027076);
        setIntElement(term9147, 5, 2084868811);
        setField(term9131, term9131.getClass(), "dist", term9147);
        setField(term9155, term9155.getClass(), "table", term9156);
        setIntField(term9155, term9155.getClass(), "count", 314478878);
        setIntField(term9155, term9155.getClass(), "threshold", 15);
        setFloatField(term9155, term9155.getClass(), "loadFactor", 0.75F);
        setField(term9154, term9154.getClass(), "posMap", term9155);
        setField(term9154, term9154.getClass(), "graph", null);
        setIntElement(term9160, 0, 1425342686);
        setIntElement(term9160, 1, -1042470635);
        setField(term9154, term9154.getClass(), "vertices", term9160);
        setIntField(term9154, term9154.getClass(), "numVertices", -524352937);
        setIntField(term9154, term9154.getClass(), "first", 1472218987);
        setField(term9165, term9165.getClass(), "words", term9166);
        setIntField(term9165, term9165.getClass(), "wordsInUse", 805176809);
        setBooleanField(term9165, term9165.getClass(), "sizeIsSticky", true);
        setField(term9154, term9154.getClass(), "bitset", term9165);
        setField(term9131, term9131.getClass(), "candidates", term9154);
        setBooleanField(term9131, term9131.getClass(), "selector", true);
        setBooleanField(term9131, term9131.getClass(), "connected", false);
        setField(term9131, term9131.getClass(), "radius", term9172);
        setField(term9131, term9131.getClass(), "diameter", term9174);
        setField(term9177, term9177.getClass(), "table", term9178);
        setIntField(term9177, term9177.getClass(), "count", -82632953);
        setIntField(term9177, term9177.getClass(), "threshold", 15);
        setFloatField(term9177, term9177.getClass(), "loadFactor", 0.75F);
        setField(term9176, term9176.getClass(), "posMap", term9177);
        setField(term9176, term9176.getClass(), "graph", null);
        setIntElement(term9182, 0, -1473876284);
        setIntElement(term9182, 1, -1389314671);
        setIntElement(term9182, 2, -499699841);
        setIntElement(term9182, 3, 360972386);
        setIntElement(term9182, 4, -2063884849);
        setIntElement(term9182, 5, 1054887169);
        setIntElement(term9182, 6, 692873905);
        setIntElement(term9182, 7, 1734759369);
        setField(term9176, term9176.getClass(), "vertices", term9182);
        setIntField(term9176, term9176.getClass(), "numVertices", 1841493736);
        setIntField(term9176, term9176.getClass(), "first", 320739944);
        setField(term9193, term9193.getClass(), "words", term9194);
        setIntField(term9193, term9193.getClass(), "wordsInUse", 760218111);
        setBooleanField(term9193, term9193.getClass(), "sizeIsSticky", false);
        setField(term9176, term9176.getClass(), "bitset", term9193);
        setField(term9131, term9131.getClass(), "center", term9176);
        setField(term9199, term9199.getClass(), "table", term9200);
        setIntField(term9199, term9199.getClass(), "count", -1986366126);
        setIntField(term9199, term9199.getClass(), "threshold", 15);
        setFloatField(term9199, term9199.getClass(), "loadFactor", 0.75F);
        setField(term9198, term9198.getClass(), "posMap", term9199);
        setField(term9198, term9198.getClass(), "graph", null);
        setIntElement(term9204, 0, -1963228619);
        setIntElement(term9204, 1, -709868952);
        setIntElement(term9204, 2, 847207929);
        setIntElement(term9204, 3, -1665928103);
        setIntElement(term9204, 4, 1574458332);
        setIntElement(term9204, 5, -975856245);
        setIntElement(term9204, 6, -1023366103);
        setIntElement(term9204, 7, 81427089);
        setField(term9198, term9198.getClass(), "vertices", term9204);
        setIntField(term9198, term9198.getClass(), "numVertices", 755951489);
        setIntField(term9198, term9198.getClass(), "first", 1175146356);
        setField(term9215, term9215.getClass(), "words", term9216);
        setIntField(term9215, term9215.getClass(), "wordsInUse", -2137419728);
        setBooleanField(term9215, term9215.getClass(), "sizeIsSticky", false);
        setField(term9198, term9198.getClass(), "bitset", term9215);
        setField(term9131, term9131.getClass(), "periphery", term9198);
        setField(term9131, term9131.getClass(), "extremaType", enum19);
        setField(term9131, term9131.getClass(), "graph", null);
        setBooleanField(term9131, term9131.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertexMinLB", argTypes, term9131, args);
    }

};


