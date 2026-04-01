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

public class ParallelFilterKruskal_Partition_getsmallerOrEqualEdges_14499213045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176995;

    public ParallelFilterKruskal_Partition_getsmallerOrEqualEdges_14499213045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176995 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$Partition"));
        setField(term176995, term176995.getClass(), "smallerOrEqualEdges", null);
        setField(term176995, term176995.getClass(), "biggerEdges", null);
        setDoubleField(term176995, term176995.getClass(), "exampleOfSmallerWeight", 0.0);
        setField(term176995, term176995.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal$Partition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getsmallerOrEqualEdges", argTypes, term176995, args);
    }

};


