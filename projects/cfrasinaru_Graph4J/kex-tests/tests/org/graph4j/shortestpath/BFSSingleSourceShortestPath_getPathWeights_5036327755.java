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

public class BFSSingleSourceShortestPath_getPathWeights_5036327755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;

    public BFSSingleSourceShortestPath_getPathWeights_5036327755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        double[] term545 = (double[]) newDoubleArray(2);
        int[] term548 = (int[]) newIntArray(5);
        setIntField(term543, term543.getClass(), "source", 890669485);
        setDoubleElement(term545, 0, 0.686293604788188);
        setDoubleElement(term545, 1, 0.12764449157430724);
        setField(term543, term543.getClass(), "dist", term545);
        setIntElement(term548, 0, 691577392);
        setIntElement(term548, 1, -893623680);
        setIntElement(term548, 2, -1963434938);
        setIntElement(term548, 3, 906181092);
        setIntElement(term548, 4, 1045657203);
        setField(term543, term543.getClass(), "before", term548);
        setField(term543, term543.getClass(), "graph", null);
        setBooleanField(term543, term543.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeights", argTypes, term543, args);
    }

};


