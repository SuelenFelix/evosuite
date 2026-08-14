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

public class DigraphImpl_SuccessorPredecessorIteratorImpl_incEdgeData_135623610110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186112;
     Object term186113;
     Object term186115;

    public DigraphImpl_SuccessorPredecessorIteratorImpl_incEdgeData_135623610110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186112 = newInstance(Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl"));
        setField(term186112, term186112.getClass(), "currentIterator", null);
        setField(term186112, term186112.getClass(), "succIterator", null);
        setField(term186112, term186112.getClass(), "predIterator", null);
        setField(term186112, term186112.getClass(), "this$0", null);
        term186113 = new Integer(739203659);
        term186115 = new Double(0.397354307211896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$SuccessorPredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term186113;
        args[1] = term186115;
        callMethod(klass, "incEdgeData", argTypes, term186112, args);
    }

};


