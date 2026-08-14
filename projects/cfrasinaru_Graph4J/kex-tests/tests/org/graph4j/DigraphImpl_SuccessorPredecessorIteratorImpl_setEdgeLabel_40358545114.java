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
     Object term186126;
     Object term186127;

    public DigraphImpl_SuccessorPredecessorIteratorImpl_setEdgeLabel_40358545114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186126 = newInstance(Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl"));
        setField(term186126, term186126.getClass(), "currentIterator", null);
        setField(term186126, term186126.getClass(), "succIterator", null);
        setField(term186126, term186126.getClass(), "predIterator", null);
        setField(term186126, term186126.getClass(), "this$0", null);
        term186127 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term186127;
        callMethod(klass, "setEdgeLabel", argTypes, term186126, args);
    }

};


