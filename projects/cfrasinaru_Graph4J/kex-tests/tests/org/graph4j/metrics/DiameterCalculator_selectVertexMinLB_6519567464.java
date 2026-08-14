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

public class DiameterCalculator_selectVertexMinLB_6519567464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10229;

    public DiameterCalculator_selectVertexMinLB_6519567464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10229 = newInstance(Class.forName("org.graph4j.metrics.DiameterCalculator"));
        int[] term10232 = (int[]) newIntArray(9);
        int[] term10242 = (int[]) newIntArray(2);
        int[] term10245 = (int[]) newIntArray(3);
        Object term10249 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term10250 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term10251 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term10255 = (int[]) newIntArray(9);
        Object term10267 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10268 = (long[]) newLongArray(1);
        setIntField(term10229, term10229.getClass(), "diamUB", 1717232691);
        setIntField(term10229, term10229.getClass(), "diamLB", -938127737);
        setIntElement(term10232, 0, -1408678076);
        setIntElement(term10232, 1, 1201413899);
        setIntElement(term10232, 2, -376722373);
        setIntElement(term10232, 3, 1180687854);
        setIntElement(term10232, 4, 328631288);
        setIntElement(term10232, 5, -1631415805);
        setIntElement(term10232, 6, 1073400519);
        setIntElement(term10232, 7, -2025555268);
        setIntElement(term10232, 8, -746950289);
        setField(term10229, term10229.getClass(), "eccLB", term10232);
        setIntElement(term10242, 0, -137577510);
        setIntElement(term10242, 1, 719185716);
        setField(term10229, term10229.getClass(), "eccUB", term10242);
        setIntElement(term10245, 0, 1624820010);
        setIntElement(term10245, 1, -831921156);
        setIntElement(term10245, 2, -2085566906);
        setField(term10229, term10229.getClass(), "dist", term10245);
        setField(term10250, term10250.getClass(), "table", term10251);
        setIntField(term10250, term10250.getClass(), "count", 1773193728);
        setIntField(term10250, term10250.getClass(), "threshold", 15);
        setFloatField(term10250, term10250.getClass(), "loadFactor", 0.75F);
        setField(term10249, term10249.getClass(), "posMap", term10250);
        setField(term10249, term10249.getClass(), "graph", null);
        setIntElement(term10255, 0, -1341357647);
        setIntElement(term10255, 1, 138447019);
        setIntElement(term10255, 2, 114915275);
        setIntElement(term10255, 3, 338519695);
        setIntElement(term10255, 4, 2025566580);
        setIntElement(term10255, 5, -1231122778);
        setIntElement(term10255, 6, 1923558221);
        setIntElement(term10255, 7, 1762934060);
        setIntElement(term10255, 8, -859828739);
        setField(term10249, term10249.getClass(), "vertices", term10255);
        setIntField(term10249, term10249.getClass(), "numVertices", 1986855642);
        setIntField(term10249, term10249.getClass(), "first", 1280322790);
        setField(term10267, term10267.getClass(), "words", term10268);
        setIntField(term10267, term10267.getClass(), "wordsInUse", -1702209203);
        setBooleanField(term10267, term10267.getClass(), "sizeIsSticky", false);
        setField(term10249, term10249.getClass(), "bitset", term10267);
        setField(term10229, term10229.getClass(), "candidates", term10249);
        setBooleanField(term10229, term10229.getClass(), "selector", true);
        setField(term10229, term10229.getClass(), "graph", null);
        setBooleanField(term10229, term10229.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.DiameterCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertexMinLB", argTypes, term10229, args);
    }

};


