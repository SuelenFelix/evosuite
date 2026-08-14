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

public class GraphExtremaCalculator_getCenter_5867792454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7583;

    public GraphExtremaCalculator_getCenter_5867792454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7628 = new Integer(-469968304);
        Integer term7630 = new Integer(-1145578966);
        Class<? extends Object> term7730 = Class.forName((String) "org.graph4j.metrics.GraphExtremaCalculator$Type");
        Field term7729 = ((Class) term7730).getDeclaredField((String) "RADIUS");
        ((Field) term7729).setAccessible(true);
        Object enum15 = ((Field) term7729).get((Object) null);
        term7583 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        int[] term7588 = (int[]) newIntArray(9);
        int[] term7598 = (int[]) newIntArray(5);
        int[] term7604 = (int[]) newIntArray(5);
        Object term7610 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7611 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7612 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7616 = (int[]) newIntArray(2);
        Object term7621 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7622 = (long[]) newLongArray(1);
        Object term7632 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7633 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7634 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7638 = (int[]) newIntArray(9);
        Object term7650 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7651 = (long[]) newLongArray(1);
        Object term7655 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7656 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7657 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7661 = (int[]) newIntArray(8);
        Object term7672 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7673 = (long[]) newLongArray(1);
        setIntField(term7583, term7583.getClass(), "radiusLB", -2009613557);
        setIntField(term7583, term7583.getClass(), "radiusUB", 654195547);
        setIntField(term7583, term7583.getClass(), "diamLB", 1622857008);
        setIntField(term7583, term7583.getClass(), "diamUB", 934338954);
        setIntElement(term7588, 0, 598635505);
        setIntElement(term7588, 1, -944986533);
        setIntElement(term7588, 2, 1894454926);
        setIntElement(term7588, 3, 1415142780);
        setIntElement(term7588, 4, -574105759);
        setIntElement(term7588, 5, -1165271567);
        setIntElement(term7588, 6, 376834234);
        setIntElement(term7588, 7, -1911972560);
        setIntElement(term7588, 8, -642716895);
        setField(term7583, term7583.getClass(), "eccLB", term7588);
        setIntElement(term7598, 0, 1743398246);
        setIntElement(term7598, 1, -934658823);
        setIntElement(term7598, 2, 1632177303);
        setIntElement(term7598, 3, -802592348);
        setIntElement(term7598, 4, -1576584269);
        setField(term7583, term7583.getClass(), "eccUB", term7598);
        setIntElement(term7604, 0, 1474899591);
        setIntElement(term7604, 1, 297582552);
        setIntElement(term7604, 2, -1485916498);
        setIntElement(term7604, 3, 722787672);
        setIntElement(term7604, 4, 2077491675);
        setField(term7583, term7583.getClass(), "dist", term7604);
        setField(term7611, term7611.getClass(), "table", term7612);
        setIntField(term7611, term7611.getClass(), "count", -1728316609);
        setIntField(term7611, term7611.getClass(), "threshold", 15);
        setFloatField(term7611, term7611.getClass(), "loadFactor", 0.75F);
        setField(term7610, term7610.getClass(), "posMap", term7611);
        setField(term7610, term7610.getClass(), "graph", null);
        setIntElement(term7616, 0, 47118909);
        setIntElement(term7616, 1, -2093707412);
        setField(term7610, term7610.getClass(), "vertices", term7616);
        setIntField(term7610, term7610.getClass(), "numVertices", -680627153);
        setIntField(term7610, term7610.getClass(), "first", 722519669);
        setField(term7621, term7621.getClass(), "words", term7622);
        setIntField(term7621, term7621.getClass(), "wordsInUse", -40335961);
        setBooleanField(term7621, term7621.getClass(), "sizeIsSticky", false);
        setField(term7610, term7610.getClass(), "bitset", term7621);
        setField(term7583, term7583.getClass(), "candidates", term7610);
        setBooleanField(term7583, term7583.getClass(), "selector", true);
        setBooleanField(term7583, term7583.getClass(), "connected", true);
        setField(term7583, term7583.getClass(), "radius", term7628);
        setField(term7583, term7583.getClass(), "diameter", term7630);
        setField(term7633, term7633.getClass(), "table", term7634);
        setIntField(term7633, term7633.getClass(), "count", 175343605);
        setIntField(term7633, term7633.getClass(), "threshold", 15);
        setFloatField(term7633, term7633.getClass(), "loadFactor", 0.75F);
        setField(term7632, term7632.getClass(), "posMap", term7633);
        setField(term7632, term7632.getClass(), "graph", null);
        setIntElement(term7638, 0, 1050853183);
        setIntElement(term7638, 1, 848428785);
        setIntElement(term7638, 2, -1984436481);
        setIntElement(term7638, 3, -407582855);
        setIntElement(term7638, 4, 1190753616);
        setIntElement(term7638, 5, -752378450);
        setIntElement(term7638, 6, 848907965);
        setIntElement(term7638, 7, 1865070548);
        setIntElement(term7638, 8, 1904515443);
        setField(term7632, term7632.getClass(), "vertices", term7638);
        setIntField(term7632, term7632.getClass(), "numVertices", 1361126430);
        setIntField(term7632, term7632.getClass(), "first", 1728588701);
        setField(term7650, term7650.getClass(), "words", term7651);
        setIntField(term7650, term7650.getClass(), "wordsInUse", -355769268);
        setBooleanField(term7650, term7650.getClass(), "sizeIsSticky", false);
        setField(term7632, term7632.getClass(), "bitset", term7650);
        setField(term7583, term7583.getClass(), "center", term7632);
        setField(term7656, term7656.getClass(), "table", term7657);
        setIntField(term7656, term7656.getClass(), "count", -114460662);
        setIntField(term7656, term7656.getClass(), "threshold", 15);
        setFloatField(term7656, term7656.getClass(), "loadFactor", 0.75F);
        setField(term7655, term7655.getClass(), "posMap", term7656);
        setField(term7655, term7655.getClass(), "graph", null);
        setIntElement(term7661, 0, -355376034);
        setIntElement(term7661, 1, 588390599);
        setIntElement(term7661, 2, -95969566);
        setIntElement(term7661, 3, -68615285);
        setIntElement(term7661, 4, -337504086);
        setIntElement(term7661, 5, 2074130991);
        setIntElement(term7661, 6, 532588266);
        setIntElement(term7661, 7, -1286686332);
        setField(term7655, term7655.getClass(), "vertices", term7661);
        setIntField(term7655, term7655.getClass(), "numVertices", -284885486);
        setIntField(term7655, term7655.getClass(), "first", 1791984446);
        setField(term7672, term7672.getClass(), "words", term7673);
        setIntField(term7672, term7672.getClass(), "wordsInUse", 804070622);
        setBooleanField(term7672, term7672.getClass(), "sizeIsSticky", false);
        setField(term7655, term7655.getClass(), "bitset", term7672);
        setField(term7583, term7583.getClass(), "periphery", term7655);
        setField(term7583, term7583.getClass(), "extremaType", enum15);
        setField(term7583, term7583.getClass(), "graph", null);
        setBooleanField(term7583, term7583.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenter", argTypes, term7583, args);
    }

};


