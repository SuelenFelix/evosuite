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
import java.lang.Integer;
import java.lang.Double;

public class DigraphImpl_SuccessorPredecessorIteratorImpl_setEdgeData_10720268259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186107;
     Object term186108;
     Object term186110;

    public DigraphImpl_SuccessorPredecessorIteratorImpl_setEdgeData_10720268259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186107 = newInstance(Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl"));
        setField(term186107, term186107.getClass(), "currentIterator", null);
        setField(term186107, term186107.getClass(), "succIterator", null);
        setField(term186107, term186107.getClass(), "predIterator", null);
        setField(term186107, term186107.getClass(), "this$0", null);
        term186108 = new Integer(261762175);
        term186110 = new Double(0.3251486754529146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term186108;
        args[1] = term186110;
        callMethod(klass, "setEdgeData", argTypes, term186107, args);
    }

};


