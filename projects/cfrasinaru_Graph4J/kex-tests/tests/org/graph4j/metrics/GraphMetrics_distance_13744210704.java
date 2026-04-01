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

public class GraphMetrics_distance_13744210704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4968;
     Object term5062;
     Object term5064;

    public GraphMetrics_distance_13744210704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5017 = new Integer(-6029667);
        Double term5019 = new Double(0.9527281779865117);
        Double term5021 = new Double(0.9828442029246764);
        Double term5023 = new Double(0.2779719046761513);
        term4968 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term4969 = (Object[]) newArray("[D", 6);
        double[] term4970 = (double[]) newDoubleArray(4);
        double[] term4975 = (double[]) newDoubleArray(6);
        double[] term4982 = (double[]) newDoubleArray(7);
        double[] term4990 = (double[]) newDoubleArray(0);
        double[] term4991 = (double[]) newDoubleArray(9);
        double[] term5001 = (double[]) newDoubleArray(6);
        double[] term5008 = (double[]) newDoubleArray(8);
        Object term5025 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5026 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5027 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5031 = (int[]) newIntArray(6);
        Object term5040 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5041 = (long[]) newLongArray(1);
        Object term5045 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5046 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5047 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5051 = (int[]) newIntArray(2);
        Object term5056 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5057 = (long[]) newLongArray(1);
        setField(term4968, term4968.getClass(), "extremaCalculator", null);
        setDoubleElement(term4970, 0, 0.7080134263823477);
        setDoubleElement(term4970, 1, 0.6059734092898602);
        setDoubleElement(term4970, 2, 0.3074693824288357);
        setDoubleElement(term4970, 3, 0.1245258965512791);
        setElement(term4969, 0, term4970);
        setDoubleElement(term4975, 0, 0.9511861072660375);
        setDoubleElement(term4975, 1, 0.05880719443135807);
        setDoubleElement(term4975, 2, 0.34010089048558567);
        setDoubleElement(term4975, 3, 0.19625398866403143);
        setDoubleElement(term4975, 4, 0.45069204793711093);
        setDoubleElement(term4975, 5, 0.9341364461850963);
        setElement(term4969, 1, term4975);
        setDoubleElement(term4982, 0, 0.9022041121474429);
        setDoubleElement(term4982, 1, 0.6512870939318848);
        setDoubleElement(term4982, 2, 0.8777038609128434);
        setDoubleElement(term4982, 3, 0.008025683154629148);
        setDoubleElement(term4982, 4, 0.40598298281353484);
        setDoubleElement(term4982, 5, 0.3710067290060264);
        setDoubleElement(term4982, 6, 0.7818620200430967);
        setElement(term4969, 2, term4982);
        setElement(term4969, 3, term4990);
        setDoubleElement(term4991, 0, 0.04640022995603543);
        setDoubleElement(term4991, 1, 0.9123572866833729);
        setDoubleElement(term4991, 2, 0.40635376375558196);
        setDoubleElement(term4991, 3, 0.4772043271031934);
        setDoubleElement(term4991, 4, 0.2446504549754045);
        setDoubleElement(term4991, 5, 0.6142723998707854);
        setDoubleElement(term4991, 6, 0.4355627280318103);
        setDoubleElement(term4991, 7, 0.841460835734741);
        setDoubleElement(term4991, 8, 0.7859316615744082);
        setElement(term4969, 4, term4991);
        setDoubleElement(term5001, 0, 0.6428742553484879);
        setDoubleElement(term5001, 1, 0.6584165706677267);
        setDoubleElement(term5001, 2, 0.44268490778872205);
        setDoubleElement(term5001, 3, 0.7507333108648018);
        setDoubleElement(term5001, 4, 0.007493740494434409);
        setDoubleElement(term5001, 5, 0.29172553321356776);
        setElement(term4969, 5, term5001);
        setField(term4968, term4968.getClass(), "dist", term4969);
        setDoubleElement(term5008, 0, 0.9276995636844321);
        setDoubleElement(term5008, 1, 0.7636130748477434);
        setDoubleElement(term5008, 2, 0.07901636960861558);
        setDoubleElement(term5008, 3, 0.18717846301066243);
        setDoubleElement(term5008, 4, 0.5335953039331021);
        setDoubleElement(term5008, 5, 0.5725602309856443);
        setDoubleElement(term5008, 6, 0.5310967137636303);
        setDoubleElement(term5008, 7, 0.6054109236809134);
        setField(term4968, term4968.getClass(), "ecc", term5008);
        setField(term4968, term4968.getClass(), "girth", term5017);
        setField(term4968, term4968.getClass(), "diameter", term5019);
        setField(term4968, term4968.getClass(), "pseudoDiameter", term5021);
        setField(term4968, term4968.getClass(), "radius", term5023);
        setField(term5026, term5026.getClass(), "table", term5027);
        setIntField(term5026, term5026.getClass(), "count", -1938881385);
        setIntField(term5026, term5026.getClass(), "threshold", 15);
        setFloatField(term5026, term5026.getClass(), "loadFactor", 0.75F);
        setField(term5025, term5025.getClass(), "posMap", term5026);
        setField(term5025, term5025.getClass(), "graph", null);
        setIntElement(term5031, 0, -1629418973);
        setIntElement(term5031, 1, -100825168);
        setIntElement(term5031, 2, 768407648);
        setIntElement(term5031, 3, -350454594);
        setIntElement(term5031, 4, -1148142995);
        setIntElement(term5031, 5, -233024044);
        setField(term5025, term5025.getClass(), "vertices", term5031);
        setIntField(term5025, term5025.getClass(), "numVertices", 1820784228);
        setIntField(term5025, term5025.getClass(), "first", 1390820006);
        setField(term5040, term5040.getClass(), "words", term5041);
        setIntField(term5040, term5040.getClass(), "wordsInUse", -828982065);
        setBooleanField(term5040, term5040.getClass(), "sizeIsSticky", false);
        setField(term5025, term5025.getClass(), "bitset", term5040);
        setField(term4968, term4968.getClass(), "center", term5025);
        setField(term5046, term5046.getClass(), "table", term5047);
        setIntField(term5046, term5046.getClass(), "count", 1221443226);
        setIntField(term5046, term5046.getClass(), "threshold", 15);
        setFloatField(term5046, term5046.getClass(), "loadFactor", 0.75F);
        setField(term5045, term5045.getClass(), "posMap", term5046);
        setField(term5045, term5045.getClass(), "graph", null);
        setIntElement(term5051, 0, 908108726);
        setIntElement(term5051, 1, 1023209512);
        setField(term5045, term5045.getClass(), "vertices", term5051);
        setIntField(term5045, term5045.getClass(), "numVertices", 1084849225);
        setIntField(term5045, term5045.getClass(), "first", -1702055571);
        setField(term5056, term5056.getClass(), "words", term5057);
        setIntField(term5056, term5056.getClass(), "wordsInUse", -944542900);
        setBooleanField(term5056, term5056.getClass(), "sizeIsSticky", true);
        setField(term5045, term5045.getClass(), "bitset", term5056);
        setField(term4968, term4968.getClass(), "periphery", term5045);
        setField(term4968, term4968.getClass(), "graph", null);
        setBooleanField(term4968, term4968.getClass(), "directed", true);
        term5062 = new Integer(2063762142);
        term5064 = new Integer(1658391716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5062;
        args[1] = term5064;
        callMethod(klass, "distance", argTypes, term4968, args);
    }

};


