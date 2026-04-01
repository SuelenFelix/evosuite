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

public class BFSAllPairsShortestPath_computeAll_5869384174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182;

    public BFSAllPairsShortestPath_computeAll_5869384174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182 = newInstance(Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath"));
        Object[] term183 = (Object[]) newArray("[D", 3);
        double[] term184 = (double[]) newDoubleArray(5);
        double[] term190 = (double[]) newDoubleArray(6);
        double[] term197 = (double[]) newDoubleArray(5);
        Object[] term203 = (Object[]) newArray("[I", 3);
        int[] term204 = (int[]) newIntArray(7);
        int[] term212 = (int[]) newIntArray(2);
        int[] term215 = (int[]) newIntArray(6);
        setDoubleElement(term184, 0, 0.5279279537140873);
        setDoubleElement(term184, 1, 0.3202192021706908);
        setDoubleElement(term184, 2, 0.22651340641904605);
        setDoubleElement(term184, 3, 0.8878841294187743);
        setDoubleElement(term184, 4, 0.6588948704887806);
        setElement(term183, 0, term184);
        setDoubleElement(term190, 0, 0.6397214730945112);
        setDoubleElement(term190, 1, 0.25937345430928016);
        setDoubleElement(term190, 2, 0.5873228247510078);
        setDoubleElement(term190, 3, 0.8823181080774973);
        setDoubleElement(term190, 4, 0.2192450926212024);
        setDoubleElement(term190, 5, 0.7591353014991907);
        setElement(term183, 1, term190);
        setDoubleElement(term197, 0, 0.791695029600875);
        setDoubleElement(term197, 1, 0.6862221294683138);
        setDoubleElement(term197, 2, 0.15917839663695388);
        setDoubleElement(term197, 3, 0.9374115574082594);
        setDoubleElement(term197, 4, 0.8454723071922143);
        setElement(term183, 2, term197);
        setField(term182, term182.getClass(), "dist", term183);
        setIntElement(term204, 0, -1145578966);
        setIntElement(term204, 1, 679763016);
        setIntElement(term204, 2, 1962444399);
        setIntElement(term204, 3, 767834723);
        setIntElement(term204, 4, -602026508);
        setIntElement(term204, 5, -157887805);
        setIntElement(term204, 6, 1876565163);
        setElement(term203, 0, term204);
        setIntElement(term212, 0, -817164822);
        setIntElement(term212, 1, -1016503459);
        setElement(term203, 1, term212);
        setIntElement(term215, 0, -1968847291);
        setIntElement(term215, 1, 579005622);
        setIntElement(term215, 2, -14890619);
        setIntElement(term215, 3, 1632125673);
        setIntElement(term215, 4, 454281060);
        setIntElement(term215, 5, -1786399638);
        setElement(term203, 2, term215);
        setField(term182, term182.getClass(), "before", term203);
        setField(term182, term182.getClass(), "graph", null);
        setBooleanField(term182, term182.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeAll", argTypes, term182, args);
    }

};


