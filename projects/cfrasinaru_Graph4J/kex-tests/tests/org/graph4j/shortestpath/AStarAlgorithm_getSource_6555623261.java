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

public class AStarAlgorithm_getSource_6555623261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2697;

    public AStarAlgorithm_getSource_6555623261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2697 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term2700 = (int[]) newIntArray(4);
        double[] term2705 = (double[]) newDoubleArray(0);
        int[] term2706 = (int[]) newIntArray(4);
        int[] term2711 = (int[]) newIntArray(8);
        boolean[] term2720 = (boolean[]) newBooleanArray(8);
        Object term2730 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2731 = (int[]) newIntArray(7);
        int[] term2739 = (int[]) newIntArray(7);
        setIntField(term2697, term2697.getClass(), "source", -1793950607);
        setIntField(term2697, term2697.getClass(), "target", 1091954101);
        setIntElement(term2700, 0, 1895143076);
        setIntElement(term2700, 1, 1981860404);
        setIntElement(term2700, 2, 732174235);
        setIntElement(term2700, 3, 470895808);
        setField(term2697, term2697.getClass(), "vertices", term2700);
        setField(term2697, term2697.getClass(), "cost", term2705);
        setIntElement(term2706, 0, 1787325291);
        setIntElement(term2706, 1, 1470349147);
        setIntElement(term2706, 2, -255317272);
        setIntElement(term2706, 3, -706253892);
        setField(term2697, term2697.getClass(), "before", term2706);
        setIntElement(term2711, 0, -1341439819);
        setIntElement(term2711, 1, -728760750);
        setIntElement(term2711, 2, -1617383807);
        setIntElement(term2711, 3, -1244386281);
        setIntElement(term2711, 4, -885788574);
        setIntElement(term2711, 5, -865722613);
        setIntElement(term2711, 6, -1551355284);
        setIntElement(term2711, 7, -1381970335);
        setField(term2697, term2697.getClass(), "size", term2711);
        setBooleanElement(term2720, 2, true);
        setBooleanElement(term2720, 5, true);
        setField(term2697, term2697.getClass(), "solved", term2720);
        setIntField(term2697, term2697.getClass(), "numSolved", 1213549815);
        setField(term2730, term2730.getClass(), "graph", null);
        setField(term2730, term2730.getClass(), "comparator", null);
        setIntElement(term2731, 0, -1518419301);
        setIntElement(term2731, 1, 674879025);
        setIntElement(term2731, 2, -1538936030);
        setIntElement(term2731, 3, -752870423);
        setIntElement(term2731, 4, -1698809299);
        setIntElement(term2731, 5, 401512128);
        setIntElement(term2731, 6, -2069930777);
        setField(term2730, term2730.getClass(), "keys", term2731);
        setIntElement(term2739, 0, 1543696412);
        setIntElement(term2739, 1, -1385748168);
        setIntElement(term2739, 2, -270592367);
        setIntElement(term2739, 3, 178847646);
        setIntElement(term2739, 4, 273590437);
        setIntElement(term2739, 5, -348612876);
        setIntElement(term2739, 6, 1302807565);
        setField(term2730, term2730.getClass(), "positions", term2739);
        setIntField(term2730, term2730.getClass(), "size", -838848221);
        setField(term2697, term2697.getClass(), "heap", term2730);
        setField(term2697, term2697.getClass(), "heuristic", null);
        setField(term2697, term2697.getClass(), "graph", null);
        setBooleanField(term2697, term2697.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term2697, args);
    }

};


