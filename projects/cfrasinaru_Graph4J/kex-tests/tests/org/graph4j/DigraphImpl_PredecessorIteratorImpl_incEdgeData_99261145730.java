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

public class DigraphImpl_PredecessorIteratorImpl_incEdgeData_99261145730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182299;
     Object term182303;
     Object term182305;

    public DigraphImpl_PredecessorIteratorImpl_incEdgeData_99261145730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182299 = newInstance(Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl"));
        setIntField(term182299, term182299.getClass(), "v", 0);
        setIntField(term182299, term182299.getClass(), "vi", 0);
        setIntField(term182299, term182299.getClass(), "pos", 0);
        setField(term182299, term182299.getClass(), "this$0", null);
        term182303 = new Integer(0);
        term182305 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term182303;
        args[1] = term182305;
        callMethod(klass, "incEdgeData", argTypes, term182299, args);
    }

};


