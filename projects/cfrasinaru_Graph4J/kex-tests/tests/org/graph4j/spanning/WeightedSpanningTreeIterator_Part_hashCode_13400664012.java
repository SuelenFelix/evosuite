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
     Object term172864;

    public WeightedSpanningTreeIterator_Part_hashCode_13400664012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term172866 = new HashMap();
        Set<Object> term172897 =  ((Map) term172866).keySet();
        HashSet term172865 = new HashSet((Collection<? extends Object>) term172897);
        HashMap term172879 = new HashMap();
        Set<Object> term172898 =  ((Map) term172879).keySet();
        HashSet term172878 = new HashSet((Collection<? extends Object>) term172898);
        HashMap term172888 = new HashMap();
        Set<Object> term172899 =  ((Map) term172888).keySet();
        HashSet term172887 = new HashSet((Collection<? extends Object>) term172899);
        term172864 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part"));
        setField(term172864, term172864.getClass(), "included", term172865);
        setField(term172864, term172864.getClass(), "excluded", term172878);
        setField(term172864, term172864.getClass(), "mstEdges", term172887);
        setDoubleField(term172864, term172864.getClass(), "mstWeight", 0.7190848951167794);
        setField(term172864, term172864.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term172864, args);
    }

};


