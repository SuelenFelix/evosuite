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

public class GraphMetrics_averagePathLength_76693279913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5964;

    public GraphMetrics_averagePathLength_76693279913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5977 = new Integer(-203030934);
        Double term5979 = new Double(0.6588948704887806);
        Double term5981 = new Double(0.6397214730945112);
        Double term5983 = new Double(0.25937345430928016);
        term5964 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term5965 = (Object[]) newArray("[D", 1);
        double[] term5966 = (double[]) newDoubleArray(2);
        double[] term5969 = (double[]) newDoubleArray(7);
        Object term5985 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5986 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5987 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5991 = (int[]) newIntArray(3);
        Object term5997 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5998 = (long[]) newLongArray(1);
        Object term6002 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6003 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6004 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6008 = (int[]) newIntArray(3);
        Object term6014 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6015 = (long[]) newLongArray(1);
        setField(term5964, term5964.getClass(), "extremaCalculator", null);
        setDoubleElement(term5966, 0, 0.4228841212022646);
        setDoubleElement(term5966, 1, 0.9898207968242465);
        setElement(term5965, 0, term5966);
        setField(term5964, term5964.getClass(), "dist", term5965);
        setDoubleElement(term5969, 0, 0.025396748287270232);
        setDoubleElement(term5969, 1, 0.22437750947699786);
        setDoubleElement(term5969, 2, 0.3142783864669928);
        setDoubleElement(term5969, 3, 0.28838369056651414);
        setDoubleElement(term5969, 4, 0.3505219043338702);
        setDoubleElement(term5969, 5, 0.9926072201505048);
        setDoubleElement(term5969, 6, 0.5862272565267508);
        setField(term5964, term5964.getClass(), "ecc", term5969);
        setField(term5964, term5964.getClass(), "girth", term5977);
        setField(term5964, term5964.getClass(), "diameter", term5979);
        setField(term5964, term5964.getClass(), "pseudoDiameter", term5981);
        setField(term5964, term5964.getClass(), "radius", term5983);
        setField(term5986, term5986.getClass(), "table", term5987);
        setIntField(term5986, term5986.getClass(), "count", 1692937831);
        setIntField(term5986, term5986.getClass(), "threshold", 15);
        setFloatField(term5986, term5986.getClass(), "loadFactor", 0.75F);
        setField(term5985, term5985.getClass(), "posMap", term5986);
        setField(term5985, term5985.getClass(), "graph", null);
        setIntElement(term5991, 0, -1539747985);
        setIntElement(term5991, 1, -1982489643);
        setIntElement(term5991, 2, 550892835);
        setField(term5985, term5985.getClass(), "vertices", term5991);
        setIntField(term5985, term5985.getClass(), "numVertices", 1237549886);
        setIntField(term5985, term5985.getClass(), "first", -1945635750);
        setField(term5997, term5997.getClass(), "words", term5998);
        setIntField(term5997, term5997.getClass(), "wordsInUse", -1622760744);
        setBooleanField(term5997, term5997.getClass(), "sizeIsSticky", true);
        setField(term5985, term5985.getClass(), "bitset", term5997);
        setField(term5964, term5964.getClass(), "center", term5985);
        setField(term6003, term6003.getClass(), "table", term6004);
        setIntField(term6003, term6003.getClass(), "count", 2068435279);
        setIntField(term6003, term6003.getClass(), "threshold", 15);
        setFloatField(term6003, term6003.getClass(), "loadFactor", 0.75F);
        setField(term6002, term6002.getClass(), "posMap", term6003);
        setField(term6002, term6002.getClass(), "graph", null);
        setIntElement(term6008, 0, -1556527718);
        setIntElement(term6008, 1, 895255351);
        setIntElement(term6008, 2, -1317044799);
        setField(term6002, term6002.getClass(), "vertices", term6008);
        setIntField(term6002, term6002.getClass(), "numVertices", -1428063820);
        setIntField(term6002, term6002.getClass(), "first", -1271375703);
        setField(term6014, term6014.getClass(), "words", term6015);
        setIntField(term6014, term6014.getClass(), "wordsInUse", 1136208236);
        setBooleanField(term6014, term6014.getClass(), "sizeIsSticky", true);
        setField(term6002, term6002.getClass(), "bitset", term6014);
        setField(term5964, term5964.getClass(), "periphery", term6002);
        setField(term5964, term5964.getClass(), "graph", null);
        setBooleanField(term5964, term5964.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "averagePathLength", argTypes, term5964, args);
    }

};


