package org.graph4j.matching;

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
import static org.graph4j.matching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class MaximalCardinalityMatching_edgesSortedByDegree_5224670926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1293;

    public MaximalCardinalityMatching_edgesSortedByDegree_5224670926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1294 = new Boolean(false);
        HashMap term1303 = new HashMap();
        Set<Object> term1313 =  ((Map) term1303).keySet();
        HashSet term1302 = new HashSet((Collection<? extends Object>) term1313);
        term1293 = newInstance(Class.forName("org.graph4j.matching.MaximalCardinalityMatching"));
        Object term1296 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term1297 = (int[]) newIntArray(3);
        setField(term1293, term1293.getClass(), "random", term1294);
        setField(term1293, term1293.getClass(), "comparator", null);
        setField(term1296, term1296.getClass(), "graph", null);
        setIntElement(term1297, 0, 1716165145);
        setIntElement(term1297, 1, 1692937831);
        setIntElement(term1297, 2, -1539747985);
        setField(term1296, term1296.getClass(), "mates", term1297);
        setIntField(term1296, term1296.getClass(), "size", -1982489643);
        setField(term1296, term1296.getClass(), "edges", term1302);
        setField(term1293, term1293.getClass(), "matching", term1296);
        setField(term1293, term1293.getClass(), "graph", null);
        setBooleanField(term1293, term1293.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.matching.MaximalCardinalityMatching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "edgesSortedByDegree", argTypes, term1293, args);
    }

};


