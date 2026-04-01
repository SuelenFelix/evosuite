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

public class DigraphImpl_SuccessorPredecessorIteratorImpl_getEdgeWeight_9372889217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186091;

    public DigraphImpl_SuccessorPredecessorIteratorImpl_getEdgeWeight_9372889217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186091 = newInstance(Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl"));
        setField(term186091, term186091.getClass(), "currentIterator", null);
        setField(term186091, term186091.getClass(), "succIterator", null);
        setField(term186091, term186091.getClass(), "predIterator", null);
        setField(term186091, term186091.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdgeWeight", argTypes, term186091, args);
    }

};


