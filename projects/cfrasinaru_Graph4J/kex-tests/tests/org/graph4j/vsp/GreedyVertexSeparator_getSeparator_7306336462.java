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

public class GreedyVertexSeparator_getSeparator_7306336462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5513;

    public GreedyVertexSeparator_getSeparator_7306336462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5513 = newInstance(Class.forName("org.graph4j.vsp.GreedyVertexSeparator"));
        Object term5515 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term5516 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5517 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5518 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5522 = (int[]) newIntArray(0);
        Object term5525 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5526 = (long[]) newLongArray(1);
        Object term5530 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5531 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5532 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5536 = (int[]) newIntArray(5);
        Object term5544 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5545 = (long[]) newLongArray(1);
        Object term5549 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5550 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5551 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5555 = (int[]) newIntArray(4);
        Object term5562 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5563 = (long[]) newLongArray(1);
        setIntField(term5513, term5513.getClass(), "maxShoreSize", -1207878110);
        setField(term5515, term5515.getClass(), "graph", null);
        setField(term5517, term5517.getClass(), "table", term5518);
        setIntField(term5517, term5517.getClass(), "count", -284421477);
        setIntField(term5517, term5517.getClass(), "threshold", 15);
        setFloatField(term5517, term5517.getClass(), "loadFactor", 0.75F);
        setField(term5516, term5516.getClass(), "posMap", term5517);
        setField(term5516, term5516.getClass(), "graph", null);
        setField(term5516, term5516.getClass(), "vertices", term5522);
        setIntField(term5516, term5516.getClass(), "numVertices", 55419591);
        setIntField(term5516, term5516.getClass(), "first", 1020931980);
        setField(term5525, term5525.getClass(), "words", term5526);
        setIntField(term5525, term5525.getClass(), "wordsInUse", -1435032444);
        setBooleanField(term5525, term5525.getClass(), "sizeIsSticky", false);
        setField(term5516, term5516.getClass(), "bitset", term5525);
        setField(term5515, term5515.getClass(), "separator", term5516);
        setField(term5531, term5531.getClass(), "table", term5532);
        setIntField(term5531, term5531.getClass(), "count", -420769218);
        setIntField(term5531, term5531.getClass(), "threshold", 15);
        setFloatField(term5531, term5531.getClass(), "loadFactor", 0.75F);
        setField(term5530, term5530.getClass(), "posMap", term5531);
        setField(term5530, term5530.getClass(), "graph", null);
        setIntElement(term5536, 0, -1047476590);
        setIntElement(term5536, 1, -804745833);
        setIntElement(term5536, 2, 1080834214);
        setIntElement(term5536, 3, 323842695);
        setIntElement(term5536, 4, 331897564);
        setField(term5530, term5530.getClass(), "vertices", term5536);
        setIntField(term5530, term5530.getClass(), "numVertices", -968105925);
        setIntField(term5530, term5530.getClass(), "first", -206020926);
        setField(term5544, term5544.getClass(), "words", term5545);
        setIntField(term5544, term5544.getClass(), "wordsInUse", -2054014210);
        setBooleanField(term5544, term5544.getClass(), "sizeIsSticky", true);
        setField(term5530, term5530.getClass(), "bitset", term5544);
        setField(term5515, term5515.getClass(), "leftShore", term5530);
        setField(term5550, term5550.getClass(), "table", term5551);
        setIntField(term5550, term5550.getClass(), "count", 1179045520);
        setIntField(term5550, term5550.getClass(), "threshold", 15);
        setFloatField(term5550, term5550.getClass(), "loadFactor", 0.75F);
        setField(term5549, term5549.getClass(), "posMap", term5550);
        setField(term5549, term5549.getClass(), "graph", null);
        setIntElement(term5555, 0, 1056739921);
        setIntElement(term5555, 1, 1384627927);
        setIntElement(term5555, 2, -1252280115);
        setIntElement(term5555, 3, -120849363);
        setField(term5549, term5549.getClass(), "vertices", term5555);
        setIntField(term5549, term5549.getClass(), "numVertices", 147387583);
        setIntField(term5549, term5549.getClass(), "first", -1307347557);
        setField(term5562, term5562.getClass(), "words", term5563);
        setIntField(term5562, term5562.getClass(), "wordsInUse", 1092325030);
        setBooleanField(term5562, term5562.getClass(), "sizeIsSticky", false);
        setField(term5549, term5549.getClass(), "bitset", term5562);
        setField(term5515, term5515.getClass(), "rightShore", term5549);
        setIntField(term5515, term5515.getClass(), "maxShoreSize", -1901115940);
        setField(term5513, term5513.getClass(), "solution", term5515);
        setField(term5513, term5513.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.GreedyVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeparator", argTypes, term5513, args);
    }

};


