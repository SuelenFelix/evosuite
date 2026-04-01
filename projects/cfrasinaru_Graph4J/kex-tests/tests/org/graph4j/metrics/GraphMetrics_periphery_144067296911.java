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

public class GraphMetrics_periphery_144067296911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5737;

    public GraphMetrics_periphery_144067296911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5761 = new Integer(-1275173084);
        Double term5763 = new Double(0.3587267442738795);
        Double term5765 = new Double(0.07802449704920456);
        Double term5767 = new Double(0.5279279537140873);
        term5737 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term5738 = (Object[]) newArray("[D", 2);
        double[] term5739 = (double[]) newDoubleArray(8);
        double[] term5748 = (double[]) newDoubleArray(5);
        double[] term5754 = (double[]) newDoubleArray(6);
        Object term5769 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5770 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5771 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5775 = (int[]) newIntArray(6);
        Object term5784 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5785 = (long[]) newLongArray(1);
        Object term5789 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5790 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5791 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5795 = (int[]) newIntArray(7);
        Object term5805 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5806 = (long[]) newLongArray(1);
        setField(term5737, term5737.getClass(), "extremaCalculator", null);
        setDoubleElement(term5739, 0, 0.7157998497507287);
        setDoubleElement(term5739, 1, 0.8399796378537906);
        setDoubleElement(term5739, 2, 0.009446329384675933);
        setDoubleElement(term5739, 3, 0.20131600000037786);
        setDoubleElement(term5739, 4, 0.332320568233212);
        setDoubleElement(term5739, 5, 0.18561351983828822);
        setDoubleElement(term5739, 6, 0.9678135126533798);
        setDoubleElement(term5739, 7, 0.3275035827937727);
        setElement(term5738, 0, term5739);
        setDoubleElement(term5748, 0, 0.13747524521333288);
        setDoubleElement(term5748, 1, 0.7149120009558162);
        setDoubleElement(term5748, 2, 0.0013046823258857643);
        setDoubleElement(term5748, 3, 0.5404409545293147);
        setDoubleElement(term5748, 4, 0.9172358414700745);
        setElement(term5738, 1, term5748);
        setField(term5737, term5737.getClass(), "dist", term5738);
        setDoubleElement(term5754, 0, 0.3804251745476508);
        setDoubleElement(term5754, 1, 0.6704848280926606);
        setDoubleElement(term5754, 2, 0.6213122016266206);
        setDoubleElement(term5754, 3, 0.540850203722707);
        setDoubleElement(term5754, 4, 6.134294677928587E-4);
        setDoubleElement(term5754, 5, 0.41934015614685227);
        setField(term5737, term5737.getClass(), "ecc", term5754);
        setField(term5737, term5737.getClass(), "girth", term5761);
        setField(term5737, term5737.getClass(), "diameter", term5763);
        setField(term5737, term5737.getClass(), "pseudoDiameter", term5765);
        setField(term5737, term5737.getClass(), "radius", term5767);
        setField(term5770, term5770.getClass(), "table", term5771);
        setIntField(term5770, term5770.getClass(), "count", -330897705);
        setIntField(term5770, term5770.getClass(), "threshold", 15);
        setFloatField(term5770, term5770.getClass(), "loadFactor", 0.75F);
        setField(term5769, term5769.getClass(), "posMap", term5770);
        setField(term5769, term5769.getClass(), "graph", null);
        setIntElement(term5775, 0, 1065595802);
        setIntElement(term5775, 1, 21031843);
        setIntElement(term5775, 2, -380787857);
        setIntElement(term5775, 3, 319853052);
        setIntElement(term5775, 4, -1097563716);
        setIntElement(term5775, 5, 1572907769);
        setField(term5769, term5769.getClass(), "vertices", term5775);
        setIntField(term5769, term5769.getClass(), "numVertices", 1608016787);
        setIntField(term5769, term5769.getClass(), "first", -516303035);
        setField(term5784, term5784.getClass(), "words", term5785);
        setIntField(term5784, term5784.getClass(), "wordsInUse", -2143043890);
        setBooleanField(term5784, term5784.getClass(), "sizeIsSticky", true);
        setField(term5769, term5769.getClass(), "bitset", term5784);
        setField(term5737, term5737.getClass(), "center", term5769);
        setField(term5790, term5790.getClass(), "table", term5791);
        setIntField(term5790, term5790.getClass(), "count", -2138825831);
        setIntField(term5790, term5790.getClass(), "threshold", 15);
        setFloatField(term5790, term5790.getClass(), "loadFactor", 0.75F);
        setField(term5789, term5789.getClass(), "posMap", term5790);
        setField(term5789, term5789.getClass(), "graph", null);
        setIntElement(term5795, 0, 1454781562);
        setIntElement(term5795, 1, -27944011);
        setIntElement(term5795, 2, -20614472);
        setIntElement(term5795, 3, 1126618861);
        setIntElement(term5795, 4, 947449400);
        setIntElement(term5795, 5, -763799087);
        setIntElement(term5795, 6, 1207142014);
        setField(term5789, term5789.getClass(), "vertices", term5795);
        setIntField(term5789, term5789.getClass(), "numVertices", -876426634);
        setIntField(term5789, term5789.getClass(), "first", 213831054);
        setField(term5805, term5805.getClass(), "words", term5806);
        setIntField(term5805, term5805.getClass(), "wordsInUse", 330043745);
        setBooleanField(term5805, term5805.getClass(), "sizeIsSticky", false);
        setField(term5789, term5789.getClass(), "bitset", term5805);
        setField(term5737, term5737.getClass(), "periphery", term5789);
        setField(term5737, term5737.getClass(), "graph", null);
        setBooleanField(term5737, term5737.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "periphery", argTypes, term5737, args);
    }

};


