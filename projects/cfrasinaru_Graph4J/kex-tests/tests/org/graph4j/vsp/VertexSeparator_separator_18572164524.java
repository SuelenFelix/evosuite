package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VertexSeparator_separator_18572164524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3144;

    public VertexSeparator_separator_18572164524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3144 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term3145 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3146 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3147 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3151 = (int[]) newIntArray(9);
        Object term3163 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3164 = (long[]) newLongArray(1);
        Object term3168 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3169 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3170 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3174 = (int[]) newIntArray(6);
        Object term3183 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3184 = (long[]) newLongArray(1);
        Object term3188 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3189 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3190 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3194 = (int[]) newIntArray(3);
        Object term3200 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3201 = (long[]) newLongArray(1);
        setField(term3144, term3144.getClass(), "graph", null);
        setField(term3146, term3146.getClass(), "table", term3147);
        setIntField(term3146, term3146.getClass(), "count", -1255535445);
        setIntField(term3146, term3146.getClass(), "threshold", 15);
        setFloatField(term3146, term3146.getClass(), "loadFactor", 0.75F);
        setField(term3145, term3145.getClass(), "posMap", term3146);
        setField(term3145, term3145.getClass(), "graph", null);
        setIntElement(term3151, 0, -2033952124);
        setIntElement(term3151, 1, 560401653);
        setIntElement(term3151, 2, 1633691536);
        setIntElement(term3151, 3, 898165245);
        setIntElement(term3151, 4, 1810754549);
        setIntElement(term3151, 5, 338342107);
        setIntElement(term3151, 6, -650288950);
        setIntElement(term3151, 7, 433039357);
        setIntElement(term3151, 8, 1469939797);
        setField(term3145, term3145.getClass(), "vertices", term3151);
        setIntField(term3145, term3145.getClass(), "numVertices", 252799294);
        setIntField(term3145, term3145.getClass(), "first", -2072618022);
        setField(term3163, term3163.getClass(), "words", term3164);
        setIntField(term3163, term3163.getClass(), "wordsInUse", -269909549);
        setBooleanField(term3163, term3163.getClass(), "sizeIsSticky", true);
        setField(term3145, term3145.getClass(), "bitset", term3163);
        setField(term3144, term3144.getClass(), "separator", term3145);
        setField(term3169, term3169.getClass(), "table", term3170);
        setIntField(term3169, term3169.getClass(), "count", 686286032);
        setIntField(term3169, term3169.getClass(), "threshold", 15);
        setFloatField(term3169, term3169.getClass(), "loadFactor", 0.75F);
        setField(term3168, term3168.getClass(), "posMap", term3169);
        setField(term3168, term3168.getClass(), "graph", null);
        setIntElement(term3174, 0, -1277201854);
        setIntElement(term3174, 1, 1691516034);
        setIntElement(term3174, 2, 335681723);
        setIntElement(term3174, 3, -773707674);
        setIntElement(term3174, 4, 383244929);
        setIntElement(term3174, 5, -2114034003);
        setField(term3168, term3168.getClass(), "vertices", term3174);
        setIntField(term3168, term3168.getClass(), "numVertices", 207213904);
        setIntField(term3168, term3168.getClass(), "first", -484303394);
        setField(term3183, term3183.getClass(), "words", term3184);
        setIntField(term3183, term3183.getClass(), "wordsInUse", -31125530);
        setBooleanField(term3183, term3183.getClass(), "sizeIsSticky", false);
        setField(term3168, term3168.getClass(), "bitset", term3183);
        setField(term3144, term3144.getClass(), "leftShore", term3168);
        setField(term3189, term3189.getClass(), "table", term3190);
        setIntField(term3189, term3189.getClass(), "count", 1909773180);
        setIntField(term3189, term3189.getClass(), "threshold", 15);
        setFloatField(term3189, term3189.getClass(), "loadFactor", 0.75F);
        setField(term3188, term3188.getClass(), "posMap", term3189);
        setField(term3188, term3188.getClass(), "graph", null);
        setIntElement(term3194, 0, -970417907);
        setIntElement(term3194, 1, 1097894139);
        setIntElement(term3194, 2, 390256347);
        setField(term3188, term3188.getClass(), "vertices", term3194);
        setIntField(term3188, term3188.getClass(), "numVertices", 1471619998);
        setIntField(term3188, term3188.getClass(), "first", -1623489521);
        setField(term3200, term3200.getClass(), "words", term3201);
        setIntField(term3200, term3200.getClass(), "wordsInUse", 1179937517);
        setBooleanField(term3200, term3200.getClass(), "sizeIsSticky", false);
        setField(term3188, term3188.getClass(), "bitset", term3200);
        setField(term3144, term3144.getClass(), "rightShore", term3188);
        setIntField(term3144, term3144.getClass(), "maxShoreSize", 200150950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "separator", argTypes, term3144, args);
    }

};


