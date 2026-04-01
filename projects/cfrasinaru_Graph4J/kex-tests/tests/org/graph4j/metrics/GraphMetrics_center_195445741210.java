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

public class GraphMetrics_center_195445741210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5642;

    public GraphMetrics_center_195445741210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5664 = new Integer(865208305);
        Double term5666 = new Double(0.6300849762307866);
        Double term5668 = new Double(0.9737083944266686);
        Double term5670 = new Double(0.0668892744806211);
        term5642 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term5643 = (Object[]) newArray("[D", 3);
        double[] term5644 = (double[]) newDoubleArray(2);
        double[] term5647 = (double[]) newDoubleArray(5);
        double[] term5653 = (double[]) newDoubleArray(1);
        double[] term5655 = (double[]) newDoubleArray(8);
        Object term5672 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5673 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5674 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5678 = (int[]) newIntArray(7);
        Object term5688 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5689 = (long[]) newLongArray(1);
        Object term5693 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5694 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5695 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5699 = (int[]) newIntArray(2);
        Object term5704 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5705 = (long[]) newLongArray(1);
        setField(term5642, term5642.getClass(), "extremaCalculator", null);
        setDoubleElement(term5644, 0, 0.049786419821445604);
        setDoubleElement(term5644, 1, 0.8814078959581401);
        setElement(term5643, 0, term5644);
        setDoubleElement(term5647, 0, 0.47210750955444725);
        setDoubleElement(term5647, 1, 0.8381176594884352);
        setDoubleElement(term5647, 2, 0.23070800524236523);
        setDoubleElement(term5647, 3, 0.4337266793917268);
        setDoubleElement(term5647, 4, 0.11979392765421404);
        setElement(term5643, 1, term5647);
        setDoubleElement(term5653, 0, 0.4555542221910589);
        setElement(term5643, 2, term5653);
        setField(term5642, term5642.getClass(), "dist", term5643);
        setDoubleElement(term5655, 0, 0.9938727080758785);
        setDoubleElement(term5655, 1, 0.39416780533640805);
        setDoubleElement(term5655, 2, 0.5384156574050297);
        setDoubleElement(term5655, 3, 0.28813953022653416);
        setDoubleElement(term5655, 4, 0.6221715730666386);
        setDoubleElement(term5655, 5, 0.6375926466054153);
        setDoubleElement(term5655, 6, 0.6933516214415875);
        setDoubleElement(term5655, 7, 0.7039847711405768);
        setField(term5642, term5642.getClass(), "ecc", term5655);
        setField(term5642, term5642.getClass(), "girth", term5664);
        setField(term5642, term5642.getClass(), "diameter", term5666);
        setField(term5642, term5642.getClass(), "pseudoDiameter", term5668);
        setField(term5642, term5642.getClass(), "radius", term5670);
        setField(term5673, term5673.getClass(), "table", term5674);
        setIntField(term5673, term5673.getClass(), "count", -763166094);
        setIntField(term5673, term5673.getClass(), "threshold", 15);
        setFloatField(term5673, term5673.getClass(), "loadFactor", 0.75F);
        setField(term5672, term5672.getClass(), "posMap", term5673);
        setField(term5672, term5672.getClass(), "graph", null);
        setIntElement(term5678, 0, -222941705);
        setIntElement(term5678, 1, 291864719);
        setIntElement(term5678, 2, -1549607466);
        setIntElement(term5678, 3, 853609788);
        setIntElement(term5678, 4, -197820800);
        setIntElement(term5678, 5, 723812297);
        setIntElement(term5678, 6, 1639448749);
        setField(term5672, term5672.getClass(), "vertices", term5678);
        setIntField(term5672, term5672.getClass(), "numVertices", 873659088);
        setIntField(term5672, term5672.getClass(), "first", -975748721);
        setField(term5688, term5688.getClass(), "words", term5689);
        setIntField(term5688, term5688.getClass(), "wordsInUse", 433248783);
        setBooleanField(term5688, term5688.getClass(), "sizeIsSticky", false);
        setField(term5672, term5672.getClass(), "bitset", term5688);
        setField(term5642, term5642.getClass(), "center", term5672);
        setField(term5694, term5694.getClass(), "table", term5695);
        setIntField(term5694, term5694.getClass(), "count", -507944154);
        setIntField(term5694, term5694.getClass(), "threshold", 15);
        setFloatField(term5694, term5694.getClass(), "loadFactor", 0.75F);
        setField(term5693, term5693.getClass(), "posMap", term5694);
        setField(term5693, term5693.getClass(), "graph", null);
        setIntElement(term5699, 0, -1736183862);
        setIntElement(term5699, 1, 897010381);
        setField(term5693, term5693.getClass(), "vertices", term5699);
        setIntField(term5693, term5693.getClass(), "numVertices", -15712667);
        setIntField(term5693, term5693.getClass(), "first", 1964967720);
        setField(term5704, term5704.getClass(), "words", term5705);
        setIntField(term5704, term5704.getClass(), "wordsInUse", 1351900243);
        setBooleanField(term5704, term5704.getClass(), "sizeIsSticky", true);
        setField(term5693, term5693.getClass(), "bitset", term5704);
        setField(term5642, term5642.getClass(), "periphery", term5693);
        setField(term5642, term5642.getClass(), "graph", null);
        setBooleanField(term5642, term5642.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "center", argTypes, term5642, args);
    }

};


