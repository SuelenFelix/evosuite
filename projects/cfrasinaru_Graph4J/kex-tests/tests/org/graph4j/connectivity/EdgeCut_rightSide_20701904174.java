package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.lang.Object;

public class EdgeCut_rightSide_20701904174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6481;

    public EdgeCut_rightSide_20701904174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6498 = new Double(0.7919370314903882);
        term6481 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term6482 = (int[]) newIntArray(5);
        int[] term6488 = (int[]) newIntArray(9);
        Object term6500 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term6481, term6481.getClass(), "graph", null);
        setIntElement(term6482, 0, -1639838200);
        setIntElement(term6482, 1, -60462175);
        setIntElement(term6482, 2, 1315997028);
        setIntElement(term6482, 3, 1268210239);
        setIntElement(term6482, 4, -697986260);
        setField(term6481, term6481.getClass(), "leftSide", term6482);
        setIntElement(term6488, 0, -672315403);
        setIntElement(term6488, 1, 507507290);
        setIntElement(term6488, 2, 9057138);
        setIntElement(term6488, 3, 2130019201);
        setIntElement(term6488, 4, 504634766);
        setIntElement(term6488, 5, 1963462917);
        setIntElement(term6488, 6, 552203554);
        setIntElement(term6488, 7, 1645215896);
        setIntElement(term6488, 8, -914100840);
        setField(term6481, term6481.getClass(), "rightSide", term6488);
        setField(term6481, term6481.getClass(), "weight", term6498);
        setField(term6500, term6500.getClass(), "graph", null);
        setField(term6500, term6500.getClass(), "map", null);
        setField(term6481, term6481.getClass(), "edges", term6500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rightSide", argTypes, term6481, args);
    }

};


