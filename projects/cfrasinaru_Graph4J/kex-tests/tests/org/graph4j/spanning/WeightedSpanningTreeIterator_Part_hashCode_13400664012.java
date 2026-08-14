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

public class WeightedSpanningTreeIterator_Part_hashCode_13400664012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2587;

    public WeightedSpanningTreeIterator_Part_hashCode_13400664012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2589 = new HashMap();
        Set<Object> term2626 =  ((Map) term2589).keySet();
        HashSet term2588 = new HashSet((Collection<? extends Object>) term2626);
        HashMap term2606 = new HashMap();
        Set<Object> term2627 =  ((Map) term2606).keySet();
        HashSet term2605 = new HashSet((Collection<? extends Object>) term2627);
        HashMap term2615 = new HashMap();
        Set<Object> term2628 =  ((Map) term2615).keySet();
        HashSet term2614 = new HashSet((Collection<? extends Object>) term2628);
        term2587 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part"));
        setField(term2587, term2587.getClass(), "included", term2588);
        setField(term2587, term2587.getClass(), "excluded", term2605);
        setField(term2587, term2587.getClass(), "mstEdges", term2614);
        setDoubleField(term2587, term2587.getClass(), "mstWeight", 0.10667076642995188);
        setField(term2587, term2587.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2587, args);
    }

};


