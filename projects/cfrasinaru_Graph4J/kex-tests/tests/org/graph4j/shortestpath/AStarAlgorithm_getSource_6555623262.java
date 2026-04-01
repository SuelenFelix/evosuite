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

public class AStarAlgorithm_getSource_6555623262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2701;

    public AStarAlgorithm_getSource_6555623262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2701 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term2704 = (int[]) newIntArray(4);
        double[] term2709 = (double[]) newDoubleArray(0);
        int[] term2710 = (int[]) newIntArray(4);
        int[] term2715 = (int[]) newIntArray(8);
        boolean[] term2724 = (boolean[]) newBooleanArray(8);
        Object term2734 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2735 = (int[]) newIntArray(7);
        int[] term2743 = (int[]) newIntArray(7);
        setIntField(term2701, term2701.getClass(), "source", -1793950607);
        setIntField(term2701, term2701.getClass(), "target", 1091954101);
        setIntElement(term2704, 0, 1895143076);
        setIntElement(term2704, 1, 1981860404);
        setIntElement(term2704, 2, 732174235);
        setIntElement(term2704, 3, 470895808);
        setField(term2701, term2701.getClass(), "vertices", term2704);
        setField(term2701, term2701.getClass(), "cost", term2709);
        setIntElement(term2710, 0, 1787325291);
        setIntElement(term2710, 1, 1470349147);
        setIntElement(term2710, 2, -255317272);
        setIntElement(term2710, 3, -706253892);
        setField(term2701, term2701.getClass(), "before", term2710);
        setIntElement(term2715, 0, -1341439819);
        setIntElement(term2715, 1, -728760750);
        setIntElement(term2715, 2, -1617383807);
        setIntElement(term2715, 3, -1244386281);
        setIntElement(term2715, 4, -885788574);
        setIntElement(term2715, 5, -865722613);
        setIntElement(term2715, 6, -1551355284);
        setIntElement(term2715, 7, -1381970335);
        setField(term2701, term2701.getClass(), "size", term2715);
        setBooleanElement(term2724, 2, true);
        setBooleanElement(term2724, 5, true);
        setField(term2701, term2701.getClass(), "solved", term2724);
        setIntField(term2701, term2701.getClass(), "numSolved", 1213549815);
        setField(term2734, term2734.getClass(), "graph", null);
        setField(term2734, term2734.getClass(), "comparator", null);
        setIntElement(term2735, 0, -1518419301);
        setIntElement(term2735, 1, 674879025);
        setIntElement(term2735, 2, -1538936030);
        setIntElement(term2735, 3, -752870423);
        setIntElement(term2735, 4, -1698809299);
        setIntElement(term2735, 5, 401512128);
        setIntElement(term2735, 6, -2069930777);
        setField(term2734, term2734.getClass(), "keys", term2735);
        setIntElement(term2743, 0, 1543696412);
        setIntElement(term2743, 1, -1385748168);
        setIntElement(term2743, 2, -270592367);
        setIntElement(term2743, 3, 178847646);
        setIntElement(term2743, 4, 273590437);
        setIntElement(term2743, 5, -348612876);
        setIntElement(term2743, 6, 1302807565);
        setField(term2734, term2734.getClass(), "positions", term2743);
        setIntField(term2734, term2734.getClass(), "size", -838848221);
        setField(term2701, term2701.getClass(), "heap", term2734);
        setField(term2701, term2701.getClass(), "heuristic", null);
        setField(term2701, term2701.getClass(), "graph", null);
        setBooleanField(term2701, term2701.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term2701, args);
    }

};


