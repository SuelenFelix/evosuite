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

public class AStarAlgorithm_findPath_16865711873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122663;

    public AStarAlgorithm_findPath_16865711873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122663 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term122666 = (int[]) newIntArray(6);
        double[] term122673 = (double[]) newDoubleArray(4);
        int[] term122678 = (int[]) newIntArray(1);
        int[] term122680 = (int[]) newIntArray(9);
        boolean[] term122690 = (boolean[]) newBooleanArray(0);
        Object term122692 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term122693 = (int[]) newIntArray(2);
        int[] term122696 = (int[]) newIntArray(8);
        setIntField(term122663, term122663.getClass(), "source", -919397046);
        setIntField(term122663, term122663.getClass(), "target", -1152386296);
        setIntElement(term122666, 0, 1426892945);
        setIntElement(term122666, 1, -1234646726);
        setIntElement(term122666, 2, 1047808691);
        setIntElement(term122666, 3, -2072337452);
        setIntElement(term122666, 4, 807300991);
        setIntElement(term122666, 5, 496005386);
        setField(term122663, term122663.getClass(), "vertices", term122666);
        setDoubleElement(term122673, 0, 0.6870926327357292);
        setDoubleElement(term122673, 1, 0.7904842321235231);
        setDoubleElement(term122673, 2, 0.32675251455859367);
        setDoubleElement(term122673, 3, 0.0700283198347722);
        setField(term122663, term122663.getClass(), "cost", term122673);
        setIntElement(term122678, 0, -984981496);
        setField(term122663, term122663.getClass(), "before", term122678);
        setIntElement(term122680, 0, 630125092);
        setIntElement(term122680, 1, -2083378694);
        setIntElement(term122680, 2, 1239933976);
        setIntElement(term122680, 3, -1554633398);
        setIntElement(term122680, 4, 1690600247);
        setIntElement(term122680, 5, -1197557816);
        setIntElement(term122680, 6, 870745222);
        setIntElement(term122680, 7, -971717999);
        setIntElement(term122680, 8, 1154969193);
        setField(term122663, term122663.getClass(), "size", term122680);
        setField(term122663, term122663.getClass(), "solved", term122690);
        setIntField(term122663, term122663.getClass(), "numSolved", -278262913);
        setField(term122692, term122692.getClass(), "graph", null);
        setField(term122692, term122692.getClass(), "comparator", null);
        setIntElement(term122693, 0, -1747516472);
        setIntElement(term122693, 1, 698742025);
        setField(term122692, term122692.getClass(), "keys", term122693);
        setIntElement(term122696, 0, 985694184);
        setIntElement(term122696, 1, -1683496665);
        setIntElement(term122696, 2, -1003323784);
        setIntElement(term122696, 3, 268939325);
        setIntElement(term122696, 4, -542512468);
        setIntElement(term122696, 5, -983909603);
        setIntElement(term122696, 6, 1903231334);
        setIntElement(term122696, 7, 1121884055);
        setField(term122692, term122692.getClass(), "positions", term122696);
        setIntField(term122692, term122692.getClass(), "size", -1842829912);
        setField(term122663, term122663.getClass(), "heap", term122692);
        setField(term122663, term122663.getClass(), "heuristic", null);
        setField(term122663, term122663.getClass(), "graph", null);
        setBooleanField(term122663, term122663.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPath", argTypes, term122663, args);
    }

};


