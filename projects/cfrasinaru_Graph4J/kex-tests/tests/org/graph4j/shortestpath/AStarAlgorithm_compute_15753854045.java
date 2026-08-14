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

public class AStarAlgorithm_compute_15753854045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3047;

    public AStarAlgorithm_compute_15753854045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3047 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term3050 = (int[]) newIntArray(8);
        double[] term3059 = (double[]) newDoubleArray(3);
        int[] term3063 = (int[]) newIntArray(6);
        int[] term3070 = (int[]) newIntArray(8);
        boolean[] term3079 = (boolean[]) newBooleanArray(3);
        Object term3084 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term3085 = (int[]) newIntArray(1);
        int[] term3087 = (int[]) newIntArray(1);
        setIntField(term3047, term3047.getClass(), "source", 868908117);
        setIntField(term3047, term3047.getClass(), "target", 1789351397);
        setIntElement(term3050, 0, 2145528170);
        setIntElement(term3050, 1, -585773976);
        setIntElement(term3050, 2, 852806940);
        setIntElement(term3050, 3, 698551724);
        setIntElement(term3050, 4, -1631048635);
        setIntElement(term3050, 5, 1342808731);
        setIntElement(term3050, 6, -64893740);
        setIntElement(term3050, 7, -222012928);
        setField(term3047, term3047.getClass(), "vertices", term3050);
        setDoubleElement(term3059, 0, 0.20733693951275556);
        setDoubleElement(term3059, 1, 0.6618543228332953);
        setDoubleElement(term3059, 2, 0.8760632597672348);
        setField(term3047, term3047.getClass(), "cost", term3059);
        setIntElement(term3063, 0, -146564963);
        setIntElement(term3063, 1, -83178716);
        setIntElement(term3063, 2, -1292704466);
        setIntElement(term3063, 3, 1991858584);
        setIntElement(term3063, 4, -1300947782);
        setIntElement(term3063, 5, 188512644);
        setField(term3047, term3047.getClass(), "before", term3063);
        setIntElement(term3070, 0, 1851127634);
        setIntElement(term3070, 1, 783730213);
        setIntElement(term3070, 2, 1815951606);
        setIntElement(term3070, 3, 1105016932);
        setIntElement(term3070, 4, -365784998);
        setIntElement(term3070, 5, -1893236300);
        setIntElement(term3070, 6, -1858909368);
        setIntElement(term3070, 7, -280113263);
        setField(term3047, term3047.getClass(), "size", term3070);
        setBooleanElement(term3079, 0, true);
        setField(term3047, term3047.getClass(), "solved", term3079);
        setIntField(term3047, term3047.getClass(), "numSolved", 529625347);
        setField(term3084, term3084.getClass(), "graph", null);
        setField(term3084, term3084.getClass(), "comparator", null);
        setIntElement(term3085, 0, 1409095253);
        setField(term3084, term3084.getClass(), "keys", term3085);
        setIntElement(term3087, 0, 315179039);
        setField(term3084, term3084.getClass(), "positions", term3087);
        setIntField(term3084, term3084.getClass(), "size", -1835923897);
        setField(term3047, term3047.getClass(), "heap", term3084);
        setField(term3047, term3047.getClass(), "heuristic", null);
        setField(term3047, term3047.getClass(), "graph", null);
        setBooleanField(term3047, term3047.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term3047, args);
    }

};


