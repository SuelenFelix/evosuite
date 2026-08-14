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
     Object term2629;
     Object term2669;

    public WeightedSpanningTreeIterator_Part_equals_8913797263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2631 = new HashMap();
        Set<Object> term2670 =  ((Map) term2631).keySet();
        HashSet term2630 = new HashSet((Collection<? extends Object>) term2670);
        HashMap term2637 = new HashMap();
        Set<Object> term2671 =  ((Map) term2637).keySet();
        HashSet term2636 = new HashSet((Collection<? extends Object>) term2671);
        HashMap term2652 = new HashMap();
        Set<Object> term2672 =  ((Map) term2652).keySet();
        HashSet term2651 = new HashSet((Collection<? extends Object>) term2672);
        term2629 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part"));
        setField(term2629, term2629.getClass(), "included", term2630);
        setField(term2629, term2629.getClass(), "excluded", term2636);
        setField(term2629, term2629.getClass(), "mstEdges", term2651);
        setDoubleField(term2629, term2629.getClass(), "mstWeight", 0.11493000848982304);
        setField(term2629, term2629.getClass(), "this$0", null);
        term2669 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2669;
        callMethod(klass, "equals", argTypes, term2629, args);
    }

};


