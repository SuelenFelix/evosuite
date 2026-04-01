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
     Object term122573;

    public AStarAlgorithm_getTarget_14511261762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122573 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term122576 = (int[]) newIntArray(1);
        double[] term122578 = (double[]) newDoubleArray(9);
        int[] term122588 = (int[]) newIntArray(8);
        int[] term122597 = (int[]) newIntArray(6);
        boolean[] term122604 = (boolean[]) newBooleanArray(8);
        Object term122614 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term122615 = (int[]) newIntArray(2);
        int[] term122618 = (int[]) newIntArray(4);
        setIntField(term122573, term122573.getClass(), "source", 625124647);
        setIntField(term122573, term122573.getClass(), "target", -738711443);
        setIntElement(term122576, 0, 720084082);
        setField(term122573, term122573.getClass(), "vertices", term122576);
        setDoubleElement(term122578, 0, 0.42058066693809315);
        setDoubleElement(term122578, 1, 0.8210386452734213);
        setDoubleElement(term122578, 2, 0.40787762903055913);
        setDoubleElement(term122578, 3, 0.1740729348052259);
        setDoubleElement(term122578, 4, 0.22943626820474794);
        setDoubleElement(term122578, 5, 0.8926060069917449);
        setDoubleElement(term122578, 6, 0.005908412608809699);
        setDoubleElement(term122578, 7, 0.6459778296033728);
        setDoubleElement(term122578, 8, 0.9892825655147339);
        setField(term122573, term122573.getClass(), "cost", term122578);
        setIntElement(term122588, 0, -2054783);
        setIntElement(term122588, 1, -861698621);
        setIntElement(term122588, 2, 120558325);
        setIntElement(term122588, 3, 879029480);
        setIntElement(term122588, 4, 1662429974);
        setIntElement(term122588, 5, 164482176);
        setIntElement(term122588, 6, 1229014442);
        setIntElement(term122588, 7, 1721786917);
        setField(term122573, term122573.getClass(), "before", term122588);
        setIntElement(term122597, 0, 173318167);
        setIntElement(term122597, 1, 468687480);
        setIntElement(term122597, 2, -2005220505);
        setIntElement(term122597, 3, 1585188717);
        setIntElement(term122597, 4, -2930454);
        setIntElement(term122597, 5, -1013772215);
        setField(term122573, term122573.getClass(), "size", term122597);
        setBooleanElement(term122604, 0, true);
        setBooleanElement(term122604, 1, true);
        setBooleanElement(term122604, 5, true);
        setBooleanElement(term122604, 7, true);
        setField(term122573, term122573.getClass(), "solved", term122604);
        setIntField(term122573, term122573.getClass(), "numSolved", -885124539);
        setField(term122614, term122614.getClass(), "graph", null);
        setField(term122614, term122614.getClass(), "comparator", null);
        setIntElement(term122615, 0, -494597587);
        setIntElement(term122615, 1, -1897031636);
        setField(term122614, term122614.getClass(), "keys", term122615);
        setIntElement(term122618, 0, 400013611);
        setIntElement(term122618, 1, -1642575075);
        setIntElement(term122618, 2, -852288210);
        setIntElement(term122618, 3, -293817390);
        setField(term122614, term122614.getClass(), "positions", term122618);
        setIntField(term122614, term122614.getClass(), "size", -1318120636);
        setField(term122573, term122573.getClass(), "heap", term122614);
        setField(term122573, term122573.getClass(), "heuristic", null);
        setField(term122573, term122573.getClass(), "graph", null);
        setBooleanField(term122573, term122573.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term122573, args);
    }

};


