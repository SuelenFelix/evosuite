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
import java.lang.Double;

public class TreeMetrics_pseudoDiameter_10069905522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3967;

    public TreeMetrics_pseudoDiameter_10069905522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3979 = new Integer(-1456670397);
        Double term3981 = new Double(0.544608645520025);
        Double term3983 = new Double(0.28570734989730284);
        Double term3985 = new Double(0.40176586625454525);
        term3967 = newInstance(Class.forName("org.graph4j.metrics.TreeMetrics"));
        Object[] term3968 = (Object[]) newArray("[D", 2);
        double[] term3969 = (double[]) newDoubleArray(5);
        double[] term3975 = (double[]) newDoubleArray(0);
        double[] term3976 = (double[]) newDoubleArray(2);
        Object term3987 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3988 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3989 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3993 = (int[]) newIntArray(7);
        Object term4003 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4004 = (long[]) newLongArray(1);
        Object term4008 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term4009 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4010 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term4014 = (int[]) newIntArray(2);
        Object term4019 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4020 = (long[]) newLongArray(1);
        setField(term3967, term3967.getClass(), "extremaCalculator", null);
        setDoubleElement(term3969, 0, 0.6397214730945112);
        setDoubleElement(term3969, 1, 0.25937345430928016);
        setDoubleElement(term3969, 2, 0.5873228247510078);
        setDoubleElement(term3969, 3, 0.8823181080774973);
        setDoubleElement(term3969, 4, 0.2192450926212024);
        setElement(term3968, 0, term3969);
        setElement(term3968, 1, term3975);
        setField(term3967, term3967.getClass(), "dist", term3968);
        setDoubleElement(term3976, 0, 0.7591353014991907);
        setDoubleElement(term3976, 1, 0.791695029600875);
        setField(term3967, term3967.getClass(), "ecc", term3976);
        setField(term3967, term3967.getClass(), "girth", term3979);
        setField(term3967, term3967.getClass(), "diameter", term3981);
        setField(term3967, term3967.getClass(), "pseudoDiameter", term3983);
        setField(term3967, term3967.getClass(), "radius", term3985);
        setField(term3988, term3988.getClass(), "table", term3989);
        setIntField(term3988, term3988.getClass(), "count", 579006268);
        setIntField(term3988, term3988.getClass(), "threshold", 15);
        setFloatField(term3988, term3988.getClass(), "loadFactor", 0.75F);
        setField(term3987, term3987.getClass(), "posMap", term3988);
        setField(term3987, term3987.getClass(), "graph", null);
        setIntElement(term3993, 0, -1694747156);
        setIntElement(term3993, 1, 1466373988);
        setIntElement(term3993, 2, -358526505);
        setIntElement(term3993, 3, 1843268026);
        setIntElement(term3993, 4, 954660603);
        setIntElement(term3993, 5, -1351605385);
        setIntElement(term3993, 6, 278355793);
        setField(term3987, term3987.getClass(), "vertices", term3993);
        setIntField(term3987, term3987.getClass(), "numVertices", -310648604);
        setIntField(term3987, term3987.getClass(), "first", -648200466);
        setField(term4003, term4003.getClass(), "words", term4004);
        setIntField(term4003, term4003.getClass(), "wordsInUse", 2007134147);
        setBooleanField(term4003, term4003.getClass(), "sizeIsSticky", true);
        setField(term3987, term3987.getClass(), "bitset", term4003);
        setField(term3967, term3967.getClass(), "center", term3987);
        setField(term4009, term4009.getClass(), "table", term4010);
        setIntField(term4009, term4009.getClass(), "count", 993388358);
        setIntField(term4009, term4009.getClass(), "threshold", 15);
        setFloatField(term4009, term4009.getClass(), "loadFactor", 0.75F);
        setField(term4008, term4008.getClass(), "posMap", term4009);
        setField(term4008, term4008.getClass(), "graph", null);
        setIntElement(term4014, 0, -765191335);
        setIntElement(term4014, 1, -1697741155);
        setField(term4008, term4008.getClass(), "vertices", term4014);
        setIntField(term4008, term4008.getClass(), "numVertices", 1295839803);
        setIntField(term4008, term4008.getClass(), "first", -1891015523);
        setField(term4019, term4019.getClass(), "words", term4020);
        setIntField(term4019, term4019.getClass(), "wordsInUse", -1560631747);
        setBooleanField(term4019, term4019.getClass(), "sizeIsSticky", false);
        setField(term4008, term4008.getClass(), "bitset", term4019);
        setField(term3967, term3967.getClass(), "periphery", term4008);
        setField(term3967, term3967.getClass(), "graph", null);
        setBooleanField(term3967, term3967.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pseudoDiameter", argTypes, term3967, args);
    }

};


