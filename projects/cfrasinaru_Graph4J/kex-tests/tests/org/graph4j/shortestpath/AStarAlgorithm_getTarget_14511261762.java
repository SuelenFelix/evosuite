package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AStarAlgorithm_getTarget_14511261762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2787;

    public AStarAlgorithm_getTarget_14511261762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2787 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term2790 = (int[]) newIntArray(7);
        double[] term2798 = (double[]) newDoubleArray(9);
        int[] term2808 = (int[]) newIntArray(2);
        int[] term2811 = (int[]) newIntArray(3);
        boolean[] term2815 = (boolean[]) newBooleanArray(9);
        Object term2826 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2827 = (int[]) newIntArray(5);
        int[] term2833 = (int[]) newIntArray(5);
        setIntField(term2787, term2787.getClass(), "source", 1163761623);
        setIntField(term2787, term2787.getClass(), "target", 718742281);
        setIntElement(term2790, 0, 1532723756);
        setIntElement(term2790, 1, -124088550);
        setIntElement(term2790, 2, 777492093);
        setIntElement(term2790, 3, 1414025609);
        setIntElement(term2790, 4, 255145822);
        setIntElement(term2790, 5, -573608449);
        setIntElement(term2790, 6, -1660057757);
        setField(term2787, term2787.getClass(), "vertices", term2790);
        setDoubleElement(term2798, 0, 0.5029736700336335);
        setDoubleElement(term2798, 1, 0.2617673558897229);
        setDoubleElement(term2798, 2, 0.052590327313127294);
        setDoubleElement(term2798, 3, 0.004207750553928968);
        setDoubleElement(term2798, 4, 0.9107074560109533);
        setDoubleElement(term2798, 5, 0.22308265923522352);
        setDoubleElement(term2798, 6, 0.46226950865842764);
        setDoubleElement(term2798, 7, 0.6482086250011448);
        setDoubleElement(term2798, 8, 0.3154346482211354);
        setField(term2787, term2787.getClass(), "cost", term2798);
        setIntElement(term2808, 0, 1816273440);
        setIntElement(term2808, 1, -96541009);
        setField(term2787, term2787.getClass(), "before", term2808);
        setIntElement(term2811, 0, -43719302);
        setIntElement(term2811, 1, 1024134939);
        setIntElement(term2811, 2, 109078154);
        setField(term2787, term2787.getClass(), "size", term2811);
        setBooleanElement(term2815, 1, true);
        setBooleanElement(term2815, 3, true);
        setBooleanElement(term2815, 6, true);
        setBooleanElement(term2815, 7, true);
        setBooleanElement(term2815, 8, true);
        setField(term2787, term2787.getClass(), "solved", term2815);
        setIntField(term2787, term2787.getClass(), "numSolved", -314165467);
        setField(term2826, term2826.getClass(), "graph", null);
        setField(term2826, term2826.getClass(), "comparator", null);
        setIntElement(term2827, 0, 963694071);
        setIntElement(term2827, 1, -995785731);
        setIntElement(term2827, 2, 1349815364);
        setIntElement(term2827, 3, 2128383340);
        setIntElement(term2827, 4, 1238598518);
        setField(term2826, term2826.getClass(), "keys", term2827);
        setIntElement(term2833, 0, -558146961);
        setIntElement(term2833, 1, 1505480070);
        setIntElement(term2833, 2, -829088844);
        setIntElement(term2833, 3, -31751777);
        setIntElement(term2833, 4, -246967963);
        setField(term2826, term2826.getClass(), "positions", term2833);
        setIntField(term2826, term2826.getClass(), "size", -1777140369);
        setField(term2787, term2787.getClass(), "heap", term2826);
        setField(term2787, term2787.getClass(), "heuristic", null);
        setField(term2787, term2787.getClass(), "graph", null);
        setBooleanField(term2787, term2787.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term2787, args);
    }

};


