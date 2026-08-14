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

public class ParallelExtremaCalculator_selectVertex_12008760946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2579;

    public ParallelExtremaCalculator_selectVertex_12008760946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2614 = new Integer(1725571209);
        Integer term2616 = new Integer(-522618178);
        Class<? extends Object> term2700 = Class.forName((String) "org.graph4j.metrics.ParallelExtremaCalculator$Type");
        Field term2699 = ((Class) term2700).getDeclaredField((String) "PERIPHERY");
        ((Field) term2699).setAccessible(true);
        Object enum7 = ((Field) term2699).get((Object) null);
        term2579 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        int[] term2584 = (int[]) newIntArray(3);
        int[] term2588 = (int[]) newIntArray(7);
        Object term2596 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2597 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2598 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2602 = (int[]) newIntArray(2);
        Object term2607 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2608 = (long[]) newLongArray(1);
        Object term2618 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2619 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2620 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2624 = (int[]) newIntArray(6);
        Object term2633 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2634 = (long[]) newLongArray(1);
        Object term2638 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2639 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2640 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2644 = (int[]) newIntArray(6);
        Object term2653 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2654 = (long[]) newLongArray(1);
        setIntField(term2579, term2579.getClass(), "radiusLB", -506958186);
        setIntField(term2579, term2579.getClass(), "radiusUB", -507387516);
        setIntField(term2579, term2579.getClass(), "diamLB", -1970452551);
        setIntField(term2579, term2579.getClass(), "diamUB", -1896376975);
        setIntElement(term2584, 0, 729658803);
        setIntElement(term2584, 1, 114754804);
        setIntElement(term2584, 2, 1687361082);
        setField(term2579, term2579.getClass(), "eccLB", term2584);
        setIntElement(term2588, 0, 584893196);
        setIntElement(term2588, 1, 497269071);
        setIntElement(term2588, 2, -1899301124);
        setIntElement(term2588, 3, -1882480155);
        setIntElement(term2588, 4, -1410220680);
        setIntElement(term2588, 5, 389427431);
        setIntElement(term2588, 6, -1945706126);
        setField(term2579, term2579.getClass(), "eccUB", term2588);
        setField(term2597, term2597.getClass(), "table", term2598);
        setIntField(term2597, term2597.getClass(), "count", 1152356969);
        setIntField(term2597, term2597.getClass(), "threshold", 15);
        setFloatField(term2597, term2597.getClass(), "loadFactor", 0.75F);
        setField(term2596, term2596.getClass(), "posMap", term2597);
        setField(term2596, term2596.getClass(), "graph", null);
        setIntElement(term2602, 0, -1667990367);
        setIntElement(term2602, 1, -1214628358);
        setField(term2596, term2596.getClass(), "vertices", term2602);
        setIntField(term2596, term2596.getClass(), "numVertices", 1102721075);
        setIntField(term2596, term2596.getClass(), "first", -426764678);
        setField(term2607, term2607.getClass(), "words", term2608);
        setIntField(term2607, term2607.getClass(), "wordsInUse", -1222614956);
        setBooleanField(term2607, term2607.getClass(), "sizeIsSticky", true);
        setField(term2596, term2596.getClass(), "bitset", term2607);
        setField(term2579, term2579.getClass(), "candidates", term2596);
        setBooleanField(term2579, term2579.getClass(), "selector", true);
        setBooleanField(term2579, term2579.getClass(), "connected", true);
        setField(term2579, term2579.getClass(), "radius", term2614);
        setField(term2579, term2579.getClass(), "diameter", term2616);
        setField(term2619, term2619.getClass(), "table", term2620);
        setIntField(term2619, term2619.getClass(), "count", -1870495012);
        setIntField(term2619, term2619.getClass(), "threshold", 15);
        setFloatField(term2619, term2619.getClass(), "loadFactor", 0.75F);
        setField(term2618, term2618.getClass(), "posMap", term2619);
        setField(term2618, term2618.getClass(), "graph", null);
        setIntElement(term2624, 0, -1310015129);
        setIntElement(term2624, 1, -2104981311);
        setIntElement(term2624, 2, -571169753);
        setIntElement(term2624, 3, 318591690);
        setIntElement(term2624, 4, -165587447);
        setIntElement(term2624, 5, -1347358701);
        setField(term2618, term2618.getClass(), "vertices", term2624);
        setIntField(term2618, term2618.getClass(), "numVertices", 806595993);
        setIntField(term2618, term2618.getClass(), "first", 548228925);
        setField(term2633, term2633.getClass(), "words", term2634);
        setIntField(term2633, term2633.getClass(), "wordsInUse", -749861210);
        setBooleanField(term2633, term2633.getClass(), "sizeIsSticky", false);
        setField(term2618, term2618.getClass(), "bitset", term2633);
        setField(term2579, term2579.getClass(), "center", term2618);
        setField(term2639, term2639.getClass(), "table", term2640);
        setIntField(term2639, term2639.getClass(), "count", 1694224101);
        setIntField(term2639, term2639.getClass(), "threshold", 15);
        setFloatField(term2639, term2639.getClass(), "loadFactor", 0.75F);
        setField(term2638, term2638.getClass(), "posMap", term2639);
        setField(term2638, term2638.getClass(), "graph", null);
        setIntElement(term2644, 0, 937859191);
        setIntElement(term2644, 1, -916584829);
        setIntElement(term2644, 2, -2131181468);
        setIntElement(term2644, 3, 282916351);
        setIntElement(term2644, 4, 880977281);
        setIntElement(term2644, 5, 371943306);
        setField(term2638, term2638.getClass(), "vertices", term2644);
        setIntField(term2638, term2638.getClass(), "numVertices", 982388293);
        setIntField(term2638, term2638.getClass(), "first", -159494544);
        setField(term2653, term2653.getClass(), "words", term2654);
        setIntField(term2653, term2653.getClass(), "wordsInUse", -75206835);
        setBooleanField(term2653, term2653.getClass(), "sizeIsSticky", true);
        setField(term2638, term2638.getClass(), "bitset", term2653);
        setField(term2579, term2579.getClass(), "periphery", term2638);
        setField(term2579, term2579.getClass(), "extremaType", enum7);
        setField(term2579, term2579.getClass(), "graph", null);
        setBooleanField(term2579, term2579.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertex", argTypes, term2579, args);
    }

};


