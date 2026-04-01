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

public class DigraphImpl_SuccessorPredecessorIteratorImpl_setEdgeLabel_40358545114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186114;
     Object term186115;

    public DigraphImpl_SuccessorPredecessorIteratorImpl_setEdgeLabel_40358545114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186114 = newInstance(Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl"));
        setField(term186114, term186114.getClass(), "currentIterator", null);
        setField(term186114, term186114.getClass(), "succIterator", null);
        setField(term186114, term186114.getClass(), "predIterator", null);
        setField(term186114, term186114.getClass(), "this$0", null);
        term186115 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term186115;
        callMethod(klass, "setEdgeLabel", argTypes, term186114, args);
    }

};


