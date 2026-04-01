package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class DigraphImpl_SuccessorPredecessorIteratorImpl_setEdgeWeight_7276276738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186092;
     Object term186093;

    public DigraphImpl_SuccessorPredecessorIteratorImpl_setEdgeWeight_7276276738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186092 = newInstance(Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl"));
        setField(term186092, term186092.getClass(), "currentIterator", null);
        setField(term186092, term186092.getClass(), "succIterator", null);
        setField(term186092, term186092.getClass(), "predIterator", null);
        setField(term186092, term186092.getClass(), "this$0", null);
        term186093 = new Double(0.8007873096412907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term186093;
        callMethod(klass, "setEdgeWeight", argTypes, term186092, args);
    }

};


