package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class WeightedSpanningTreeIterator_Part_equals_8913797263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172900;
     Object term172938;

    public WeightedSpanningTreeIterator_Part_equals_8913797263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term172902 = new HashMap();
        Set<Object> term172939 =  ((Map) term172902).keySet();
        HashSet term172901 = new HashSet((Collection<? extends Object>) term172939);
        HashMap term172915 = new HashMap();
        Set<Object> term172940 =  ((Map) term172915).keySet();
        HashSet term172914 = new HashSet((Collection<? extends Object>) term172940);
        HashMap term172932 = new HashMap();
        Set<Object> term172941 =  ((Map) term172932).keySet();
        HashSet term172931 = new HashSet((Collection<? extends Object>) term172941);
        term172900 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part"));
        setField(term172900, term172900.getClass(), "included", term172901);
        setField(term172900, term172900.getClass(), "excluded", term172914);
        setField(term172900, term172900.getClass(), "mstEdges", term172931);
        setDoubleField(term172900, term172900.getClass(), "mstWeight", 0.4795757299329053);
        setField(term172900, term172900.getClass(), "this$0", null);
        term172938 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term172938;
        callMethod(klass, "equals", argTypes, term172900, args);
    }

};


