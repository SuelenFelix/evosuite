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

public class MaximalCardinalityMatching_createUnsorted_6029023554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1203;
     Object term1221;

    public MaximalCardinalityMatching_createUnsorted_6029023554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1204 = new Boolean(false);
        HashMap term1214 = new HashMap();
        Set<Object> term1227 =  ((Map) term1214).keySet();
        HashSet term1213 = new HashSet((Collection<? extends Object>) term1227);
        term1203 = newInstance(Class.forName("org.graph4j.matching.MaximalCardinalityMatching"));
        Object term1206 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term1207 = (int[]) newIntArray(4);
        setField(term1203, term1203.getClass(), "random", term1204);
        setField(term1203, term1203.getClass(), "comparator", null);
        setField(term1206, term1206.getClass(), "graph", null);
        setIntElement(term1207, 0, 853609788);
        setIntElement(term1207, 1, -197820800);
        setIntElement(term1207, 2, 723812297);
        setIntElement(term1207, 3, 1639448749);
        setField(term1206, term1206.getClass(), "mates", term1207);
        setIntField(term1206, term1206.getClass(), "size", 873659088);
        setField(term1206, term1206.getClass(), "edges", term1213);
        setField(term1203, term1203.getClass(), "matching", term1206);
        setField(term1203, term1203.getClass(), "graph", null);
        setBooleanField(term1203, term1203.getClass(), "directed", true);
        term1221 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.matching.MaximalCardinalityMatching");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1221;
        callMethod(klass, "createUnsorted", argTypes, term1203, args);
    }

};


