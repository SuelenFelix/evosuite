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

public class RadiusCalculator_selectVertex_2257865373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6165;

    public RadiusCalculator_selectVertex_2257865373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6165 = newInstance(Class.forName("org.graph4j.metrics.RadiusCalculator"));
        Object term6168 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6169 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6170 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6174 = (int[]) newIntArray(4);
        Object term6181 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6182 = (long[]) newLongArray(1);
        int[] term6186 = (int[]) newIntArray(4);
        int[] term6191 = (int[]) newIntArray(8);
        int[] term6200 = (int[]) newIntArray(7);
        setIntField(term6165, term6165.getClass(), "radiusLB", -1912429941);
        setIntField(term6165, term6165.getClass(), "radiusUB", 1801052257);
        setField(term6169, term6169.getClass(), "table", term6170);
        setIntField(term6169, term6169.getClass(), "count", -2110556060);
        setIntField(term6169, term6169.getClass(), "threshold", 15);
        setFloatField(term6169, term6169.getClass(), "loadFactor", 0.75F);
        setField(term6168, term6168.getClass(), "posMap", term6169);
        setField(term6168, term6168.getClass(), "graph", null);
        setIntElement(term6174, 0, 313459791);
        setIntElement(term6174, 1, 752615112);
        setIntElement(term6174, 2, -1674430871);
        setIntElement(term6174, 3, 794352120);
        setField(term6168, term6168.getClass(), "vertices", term6174);
        setIntField(term6168, term6168.getClass(), "numVertices", 340719678);
        setIntField(term6168, term6168.getClass(), "first", 299791142);
        setField(term6181, term6181.getClass(), "words", term6182);
        setIntField(term6181, term6181.getClass(), "wordsInUse", 1862191391);
        setBooleanField(term6181, term6181.getClass(), "sizeIsSticky", true);
        setField(term6168, term6168.getClass(), "bitset", term6181);
        setField(term6165, term6165.getClass(), "vertexSet", term6168);
        setIntElement(term6186, 0, 1131398807);
        setIntElement(term6186, 1, -344907703);
        setIntElement(term6186, 2, 824341437);
        setIntElement(term6186, 3, -1794965320);
        setField(term6165, term6165.getClass(), "eccLB", term6186);
        setIntElement(term6191, 0, 520504102);
        setIntElement(term6191, 1, -457396133);
        setIntElement(term6191, 2, -1793950607);
        setIntElement(term6191, 3, 1091954101);
        setIntElement(term6191, 4, 1895143076);
        setIntElement(term6191, 5, 1981860404);
        setIntElement(term6191, 6, 732174235);
        setIntElement(term6191, 7, 470895808);
        setField(term6165, term6165.getClass(), "eccUB", term6191);
        setIntElement(term6200, 0, 1787325291);
        setIntElement(term6200, 1, 1470349147);
        setIntElement(term6200, 2, -255317272);
        setIntElement(term6200, 3, -706253892);
        setIntElement(term6200, 4, -1341439819);
        setIntElement(term6200, 5, -728760750);
        setIntElement(term6200, 6, -1617383807);
        setField(term6165, term6165.getClass(), "dist", term6200);
        setBooleanField(term6165, term6165.getClass(), "selector", false);
        setField(term6165, term6165.getClass(), "graph", null);
        setBooleanField(term6165, term6165.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.RadiusCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertex", argTypes, term6165, args);
    }

};


