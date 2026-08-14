package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GreedyColoring_nextUncoloredVertex_20920775045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4368;

    public GreedyColoring_nextUncoloredVertex_20920775045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4368 = newInstance(Class.forName("org.graph4j.coloring.GreedyColoring"));
        int[] term4370 = (int[]) newIntArray(2);
        int[] term4373 = (int[]) newIntArray(9);
        Object term4383 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4384 = (long[]) newLongArray(1);
        setIntField(term4368, term4368.getClass(), "pos", -755209283);
        setIntElement(term4370, 0, -616562794);
        setIntElement(term4370, 1, 750084083);
        setField(term4368, term4368.getClass(), "vertexOrdering", term4370);
        setIntElement(term4373, 0, -1603460382);
        setIntElement(term4373, 1, -298939768);
        setIntElement(term4373, 2, -767031634);
        setIntElement(term4373, 3, -2072469750);
        setIntElement(term4373, 4, 2106616847);
        setIntElement(term4373, 5, 403107947);
        setIntElement(term4373, 6, -1433815725);
        setIntElement(term4373, 7, -1445089135);
        setIntElement(term4373, 8, -291618851);
        setField(term4368, term4368.getClass(), "colors", term4373);
        setField(term4383, term4383.getClass(), "words", term4384);
        setIntField(term4383, term4383.getClass(), "wordsInUse", -378436487);
        setBooleanField(term4383, term4383.getClass(), "sizeIsSticky", true);
        setField(term4368, term4368.getClass(), "used", term4383);
        setIntField(term4368, term4368.getClass(), "numColors", 584949609);
        setIntField(term4368, term4368.getClass(), "maxColor", 879795058);
        setField(term4368, term4368.getClass(), "recolor", null);
        setField(term4368, term4368.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.GreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextUncoloredVertex", argTypes, term4368, args);
    }

};


