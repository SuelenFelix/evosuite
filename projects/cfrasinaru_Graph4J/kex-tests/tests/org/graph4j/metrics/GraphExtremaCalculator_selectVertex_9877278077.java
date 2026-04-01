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

public class GraphExtremaCalculator_selectVertex_9877278077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8751;

    public GraphExtremaCalculator_selectVertex_9877278077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8793 = new Integer(-157887805);
        Integer term8795 = new Integer(1876565163);
        Class<? extends Object> term8872 = Class.forName((String) "org.graph4j.metrics.GraphExtremaCalculator$Type");
        Field term8871 = ((Class) term8872).getDeclaredField((String) "CENTER");
        ((Field) term8871).setAccessible(true);
        Object enum18 = ((Field) term8871).get((Object) null);
        term8751 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        int[] term8756 = (int[]) newIntArray(2);
        int[] term8759 = (int[]) newIntArray(9);
        int[] term8769 = (int[]) newIntArray(7);
        Object term8777 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8778 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8779 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8783 = (int[]) newIntArray(0);
        Object term8786 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8787 = (long[]) newLongArray(1);
        Object term8797 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8798 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8799 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8803 = (int[]) newIntArray(0);
        Object term8806 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8807 = (long[]) newLongArray(1);
        Object term8811 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8812 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8813 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8817 = (int[]) newIntArray(7);
        Object term8827 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8828 = (long[]) newLongArray(1);
        setIntField(term8751, term8751.getClass(), "radiusLB", 86344574);
        setIntField(term8751, term8751.getClass(), "radiusUB", -829441157);
        setIntField(term8751, term8751.getClass(), "diamLB", -1489991025);
        setIntField(term8751, term8751.getClass(), "diamUB", -1542979444);
        setIntElement(term8756, 0, -1130401612);
        setIntElement(term8756, 1, -316771104);
        setField(term8751, term8751.getClass(), "eccLB", term8756);
        setIntElement(term8759, 0, -1374527319);
        setIntElement(term8759, 1, -1735276919);
        setIntElement(term8759, 2, -712023865);
        setIntElement(term8759, 3, 613256157);
        setIntElement(term8759, 4, 454242689);
        setIntElement(term8759, 5, 1798354517);
        setIntElement(term8759, 6, -1495693617);
        setIntElement(term8759, 7, -890538258);
        setIntElement(term8759, 8, -1085899912);
        setField(term8751, term8751.getClass(), "eccUB", term8759);
        setIntElement(term8769, 0, -1458980236);
        setIntElement(term8769, 1, 890505372);
        setIntElement(term8769, 2, 2044137055);
        setIntElement(term8769, 3, -1452324619);
        setIntElement(term8769, 4, -1121709274);
        setIntElement(term8769, 5, -532304223);
        setIntElement(term8769, 6, 666218293);
        setField(term8751, term8751.getClass(), "dist", term8769);
        setField(term8778, term8778.getClass(), "table", term8779);
        setIntField(term8778, term8778.getClass(), "count", 1737876343);
        setIntField(term8778, term8778.getClass(), "threshold", 15);
        setFloatField(term8778, term8778.getClass(), "loadFactor", 0.75F);
        setField(term8777, term8777.getClass(), "posMap", term8778);
        setField(term8777, term8777.getClass(), "graph", null);
        setField(term8777, term8777.getClass(), "vertices", term8783);
        setIntField(term8777, term8777.getClass(), "numVertices", -897937940);
        setIntField(term8777, term8777.getClass(), "first", 1523261232);
        setField(term8786, term8786.getClass(), "words", term8787);
        setIntField(term8786, term8786.getClass(), "wordsInUse", -428988337);
        setBooleanField(term8786, term8786.getClass(), "sizeIsSticky", false);
        setField(term8777, term8777.getClass(), "bitset", term8786);
        setField(term8751, term8751.getClass(), "candidates", term8777);
        setBooleanField(term8751, term8751.getClass(), "selector", false);
        setBooleanField(term8751, term8751.getClass(), "connected", false);
        setField(term8751, term8751.getClass(), "radius", term8793);
        setField(term8751, term8751.getClass(), "diameter", term8795);
        setField(term8798, term8798.getClass(), "table", term8799);
        setIntField(term8798, term8798.getClass(), "count", 48047085);
        setIntField(term8798, term8798.getClass(), "threshold", 15);
        setFloatField(term8798, term8798.getClass(), "loadFactor", 0.75F);
        setField(term8797, term8797.getClass(), "posMap", term8798);
        setField(term8797, term8797.getClass(), "graph", null);
        setField(term8797, term8797.getClass(), "vertices", term8803);
        setIntField(term8797, term8797.getClass(), "numVertices", 1902784843);
        setIntField(term8797, term8797.getClass(), "first", 2021136615);
        setField(term8806, term8806.getClass(), "words", term8807);
        setIntField(term8806, term8806.getClass(), "wordsInUse", 1778570695);
        setBooleanField(term8806, term8806.getClass(), "sizeIsSticky", true);
        setField(term8797, term8797.getClass(), "bitset", term8806);
        setField(term8751, term8751.getClass(), "center", term8797);
        setField(term8812, term8812.getClass(), "table", term8813);
        setIntField(term8812, term8812.getClass(), "count", -1142164411);
        setIntField(term8812, term8812.getClass(), "threshold", 15);
        setFloatField(term8812, term8812.getClass(), "loadFactor", 0.75F);
        setField(term8811, term8811.getClass(), "posMap", term8812);
        setField(term8811, term8811.getClass(), "graph", null);
        setIntElement(term8817, 0, -1619435313);
        setIntElement(term8817, 1, 1013801066);
        setIntElement(term8817, 2, 1512541853);
        setIntElement(term8817, 3, -965421502);
        setIntElement(term8817, 4, 1319026002);
        setIntElement(term8817, 5, -1368173231);
        setIntElement(term8817, 6, 1956006038);
        setField(term8811, term8811.getClass(), "vertices", term8817);
        setIntField(term8811, term8811.getClass(), "numVertices", -1062304878);
        setIntField(term8811, term8811.getClass(), "first", -1377876610);
        setField(term8827, term8827.getClass(), "words", term8828);
        setIntField(term8827, term8827.getClass(), "wordsInUse", -1456184732);
        setBooleanField(term8827, term8827.getClass(), "sizeIsSticky", true);
        setField(term8811, term8811.getClass(), "bitset", term8827);
        setField(term8751, term8751.getClass(), "periphery", term8811);
        setField(term8751, term8751.getClass(), "extremaType", enum18);
        setField(term8751, term8751.getClass(), "graph", null);
        setBooleanField(term8751, term8751.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertex", argTypes, term8751, args);
    }

};


