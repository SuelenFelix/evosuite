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

public class GraphMetrics_radius_9886603739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5512;

    public GraphMetrics_radius_9886603739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5552 = new Integer(590364439);
        Double term5554 = new Double(0.37161417339133307);
        Double term5556 = new Double(0.6805867182029153);
        Double term5558 = new Double(0.2852810965221698);
        term5512 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term5513 = (Object[]) newArray("[D", 8);
        double[] term5514 = (double[]) newDoubleArray(5);
        double[] term5520 = (double[]) newDoubleArray(6);
        double[] term5527 = (double[]) newDoubleArray(3);
        double[] term5531 = (double[]) newDoubleArray(0);
        double[] term5532 = (double[]) newDoubleArray(5);
        double[] term5538 = (double[]) newDoubleArray(6);
        double[] term5545 = (double[]) newDoubleArray(0);
        double[] term5546 = (double[]) newDoubleArray(3);
        double[] term5550 = (double[]) newDoubleArray(1);
        Object term5560 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5561 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5562 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5566 = (int[]) newIntArray(9);
        Object term5578 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5579 = (long[]) newLongArray(1);
        Object term5583 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5584 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5585 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5589 = (int[]) newIntArray(2);
        Object term5594 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5595 = (long[]) newLongArray(1);
        setField(term5512, term5512.getClass(), "extremaCalculator", null);
        setDoubleElement(term5514, 0, 0.01784667720947175);
        setDoubleElement(term5514, 1, 0.4395312828193261);
        setDoubleElement(term5514, 2, 0.5715204226647931);
        setDoubleElement(term5514, 3, 0.6420798930164424);
        setDoubleElement(term5514, 4, 0.0011409626665044303);
        setElement(term5513, 0, term5514);
        setDoubleElement(term5520, 0, 0.5195852993308188);
        setDoubleElement(term5520, 1, 0.6533293939565151);
        setDoubleElement(term5520, 2, 0.7361083671494018);
        setDoubleElement(term5520, 3, 0.056643259984349825);
        setDoubleElement(term5520, 4, 0.5984863932443171);
        setDoubleElement(term5520, 5, 0.04708163975594959);
        setElement(term5513, 1, term5520);
        setDoubleElement(term5527, 0, 0.8223115496053149);
        setDoubleElement(term5527, 1, 0.06795505641704636);
        setDoubleElement(term5527, 2, 0.198746516614277);
        setElement(term5513, 2, term5527);
        setElement(term5513, 3, term5531);
        setDoubleElement(term5532, 0, 0.16852568658760048);
        setDoubleElement(term5532, 1, 0.20341461558365515);
        setDoubleElement(term5532, 2, 0.10087360265456191);
        setDoubleElement(term5532, 3, 0.5957631946929023);
        setDoubleElement(term5532, 4, 0.9963416078314885);
        setElement(term5513, 4, term5532);
        setDoubleElement(term5538, 0, 0.3147638130628596);
        setDoubleElement(term5538, 1, 0.24810335047389354);
        setDoubleElement(term5538, 2, 0.9113409083257852);
        setDoubleElement(term5538, 3, 0.7444535250398684);
        setDoubleElement(term5538, 4, 0.37439559220953034);
        setDoubleElement(term5538, 5, 0.5010337159337968);
        setElement(term5513, 5, term5538);
        setElement(term5513, 6, term5545);
        setDoubleElement(term5546, 0, 0.33871772875627537);
        setDoubleElement(term5546, 1, 0.9952003100858836);
        setDoubleElement(term5546, 2, 0.22059525284415726);
        setElement(term5513, 7, term5546);
        setField(term5512, term5512.getClass(), "dist", term5513);
        setDoubleElement(term5550, 0, 0.281059649526194);
        setField(term5512, term5512.getClass(), "ecc", term5550);
        setField(term5512, term5512.getClass(), "girth", term5552);
        setField(term5512, term5512.getClass(), "diameter", term5554);
        setField(term5512, term5512.getClass(), "pseudoDiameter", term5556);
        setField(term5512, term5512.getClass(), "radius", term5558);
        setField(term5561, term5561.getClass(), "table", term5562);
        setIntField(term5561, term5561.getClass(), "count", 354196060);
        setIntField(term5561, term5561.getClass(), "threshold", 15);
        setFloatField(term5561, term5561.getClass(), "loadFactor", 0.75F);
        setField(term5560, term5560.getClass(), "posMap", term5561);
        setField(term5560, term5560.getClass(), "graph", null);
        setIntElement(term5566, 0, -1840305774);
        setIntElement(term5566, 1, 1365087144);
        setIntElement(term5566, 2, -1537255112);
        setIntElement(term5566, 3, 934477462);
        setIntElement(term5566, 4, 4900410);
        setIntElement(term5566, 5, -1252345779);
        setIntElement(term5566, 6, -2063365430);
        setIntElement(term5566, 7, 812570053);
        setIntElement(term5566, 8, -1488938905);
        setField(term5560, term5560.getClass(), "vertices", term5566);
        setIntField(term5560, term5560.getClass(), "numVertices", 1916544127);
        setIntField(term5560, term5560.getClass(), "first", -1133405894);
        setField(term5578, term5578.getClass(), "words", term5579);
        setIntField(term5578, term5578.getClass(), "wordsInUse", 1289741214);
        setBooleanField(term5578, term5578.getClass(), "sizeIsSticky", false);
        setField(term5560, term5560.getClass(), "bitset", term5578);
        setField(term5512, term5512.getClass(), "center", term5560);
        setField(term5584, term5584.getClass(), "table", term5585);
        setIntField(term5584, term5584.getClass(), "count", 243280944);
        setIntField(term5584, term5584.getClass(), "threshold", 15);
        setFloatField(term5584, term5584.getClass(), "loadFactor", 0.75F);
        setField(term5583, term5583.getClass(), "posMap", term5584);
        setField(term5583, term5583.getClass(), "graph", null);
        setIntElement(term5589, 0, -726681073);
        setIntElement(term5589, 1, -1724487863);
        setField(term5583, term5583.getClass(), "vertices", term5589);
        setIntField(term5583, term5583.getClass(), "numVertices", -128490829);
        setIntField(term5583, term5583.getClass(), "first", 202214133);
        setField(term5594, term5594.getClass(), "words", term5595);
        setIntField(term5594, term5594.getClass(), "wordsInUse", 1543091617);
        setBooleanField(term5594, term5594.getClass(), "sizeIsSticky", false);
        setField(term5583, term5583.getClass(), "bitset", term5594);
        setField(term5512, term5512.getClass(), "periphery", term5583);
        setField(term5512, term5512.getClass(), "graph", null);
        setBooleanField(term5512, term5512.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "radius", argTypes, term5512, args);
    }

};


