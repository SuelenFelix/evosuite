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

public class AStarAlgorithm_getTarget_14511261763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2791;

    public AStarAlgorithm_getTarget_14511261763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2791 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term2794 = (int[]) newIntArray(7);
        double[] term2802 = (double[]) newDoubleArray(9);
        int[] term2812 = (int[]) newIntArray(2);
        int[] term2815 = (int[]) newIntArray(3);
        boolean[] term2819 = (boolean[]) newBooleanArray(9);
        Object term2830 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2831 = (int[]) newIntArray(5);
        int[] term2837 = (int[]) newIntArray(5);
        setIntField(term2791, term2791.getClass(), "source", 1163761623);
        setIntField(term2791, term2791.getClass(), "target", 718742281);
        setIntElement(term2794, 0, 1532723756);
        setIntElement(term2794, 1, -124088550);
        setIntElement(term2794, 2, 777492093);
        setIntElement(term2794, 3, 1414025609);
        setIntElement(term2794, 4, 255145822);
        setIntElement(term2794, 5, -573608449);
        setIntElement(term2794, 6, -1660057757);
        setField(term2791, term2791.getClass(), "vertices", term2794);
        setDoubleElement(term2802, 0, 0.5029736700336335);
        setDoubleElement(term2802, 1, 0.2617673558897229);
        setDoubleElement(term2802, 2, 0.052590327313127294);
        setDoubleElement(term2802, 3, 0.004207750553928968);
        setDoubleElement(term2802, 4, 0.9107074560109533);
        setDoubleElement(term2802, 5, 0.22308265923522352);
        setDoubleElement(term2802, 6, 0.46226950865842764);
        setDoubleElement(term2802, 7, 0.6482086250011448);
        setDoubleElement(term2802, 8, 0.3154346482211354);
        setField(term2791, term2791.getClass(), "cost", term2802);
        setIntElement(term2812, 0, 1816273440);
        setIntElement(term2812, 1, -96541009);
        setField(term2791, term2791.getClass(), "before", term2812);
        setIntElement(term2815, 0, -43719302);
        setIntElement(term2815, 1, 1024134939);
        setIntElement(term2815, 2, 109078154);
        setField(term2791, term2791.getClass(), "size", term2815);
        setBooleanElement(term2819, 1, true);
        setBooleanElement(term2819, 3, true);
        setBooleanElement(term2819, 6, true);
        setBooleanElement(term2819, 7, true);
        setBooleanElement(term2819, 8, true);
        setField(term2791, term2791.getClass(), "solved", term2819);
        setIntField(term2791, term2791.getClass(), "numSolved", -314165467);
        setField(term2830, term2830.getClass(), "graph", null);
        setField(term2830, term2830.getClass(), "comparator", null);
        setIntElement(term2831, 0, 963694071);
        setIntElement(term2831, 1, -995785731);
        setIntElement(term2831, 2, 1349815364);
        setIntElement(term2831, 3, 2128383340);
        setIntElement(term2831, 4, 1238598518);
        setField(term2830, term2830.getClass(), "keys", term2831);
        setIntElement(term2837, 0, -558146961);
        setIntElement(term2837, 1, 1505480070);
        setIntElement(term2837, 2, -829088844);
        setIntElement(term2837, 3, -31751777);
        setIntElement(term2837, 4, -246967963);
        setField(term2830, term2830.getClass(), "positions", term2837);
        setIntField(term2830, term2830.getClass(), "size", -1777140369);
        setField(term2791, term2791.getClass(), "heap", term2830);
        setField(term2791, term2791.getClass(), "heuristic", null);
        setField(term2791, term2791.getClass(), "graph", null);
        setBooleanField(term2791, term2791.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term2791, args);
    }

};


