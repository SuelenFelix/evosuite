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

public class ParallelFilterKruskal_Partition_getBiggerEdges_14111219856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3314;

    public ParallelFilterKruskal_Partition_getBiggerEdges_14111219856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3314 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$Partition"));
        setField(term3314, term3314.getClass(), "smallerOrEqualEdges", null);
        setField(term3314, term3314.getClass(), "biggerEdges", null);
        setDoubleField(term3314, term3314.getClass(), "exampleOfSmallerWeight", 0.0);
        setField(term3314, term3314.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal$Partition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBiggerEdges", argTypes, term3314, args);
    }

};


