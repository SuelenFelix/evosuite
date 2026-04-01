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

public class GraphImpl_NeighborIteratorImpl_incEdgeData_58586492328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147568;
     Object term147573;
     Object term147575;

    public GraphImpl_NeighborIteratorImpl_incEdgeData_58586492328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147568 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147568, term147568.getClass(), "v", 0);
        setIntField(term147568, term147568.getClass(), "vi", 0);
        setIntField(term147568, term147568.getClass(), "pos", 0);
        setBooleanField(term147568, term147568.getClass(), "forward", false);
        setField(term147568, term147568.getClass(), "this$0", null);
        term147573 = new Integer(0);
        term147575 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term147573;
        args[1] = term147575;
        callMethod(klass, "incEdgeData", argTypes, term147568, args);
    }

};


