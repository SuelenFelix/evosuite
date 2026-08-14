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

public class WeightedSpanningTreeIterator_Part_hashCode_13400664016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2673;

    public WeightedSpanningTreeIterator_Part_hashCode_13400664016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2673 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part"));
        setField(term2673, term2673.getClass(), "included", null);
        setField(term2673, term2673.getClass(), "excluded", null);
        setField(term2673, term2673.getClass(), "mstEdges", null);
        setDoubleField(term2673, term2673.getClass(), "mstWeight", 0.0);
        setField(term2673, term2673.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2673, args);
    }

};


