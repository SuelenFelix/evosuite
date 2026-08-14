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

public class GraphImpl_NeighborIteratorImpl_getEdgeData_180205912030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147587;
     Object term147592;
     Object term147594;

    public GraphImpl_NeighborIteratorImpl_getEdgeData_180205912030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147587 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147587, term147587.getClass(), "v", 0);
        setIntField(term147587, term147587.getClass(), "vi", 0);
        setIntField(term147587, term147587.getClass(), "pos", 0);
        setBooleanField(term147587, term147587.getClass(), "forward", false);
        setField(term147587, term147587.getClass(), "this$0", null);
        term147592 = new Integer(0);
        term147594 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term147592;
        args[1] = term147594;
        callMethod(klass, "getEdgeData", argTypes, term147587, args);
    }

};


