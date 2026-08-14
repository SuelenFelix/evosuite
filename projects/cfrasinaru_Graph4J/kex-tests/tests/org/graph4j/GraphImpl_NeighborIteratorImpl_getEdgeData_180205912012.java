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

public class GraphImpl_NeighborIteratorImpl_getEdgeData_180205912012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147484;
     Object term147489;
     Object term147491;

    public GraphImpl_NeighborIteratorImpl_getEdgeData_180205912012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147484 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147484, term147484.getClass(), "v", -596836364);
        setIntField(term147484, term147484.getClass(), "vi", 544265360);
        setIntField(term147484, term147484.getClass(), "pos", 1283176961);
        setBooleanField(term147484, term147484.getClass(), "forward", false);
        setField(term147484, term147484.getClass(), "this$0", null);
        term147489 = new Integer(690115754);
        term147491 = new Double(0.6780903756250802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term147489;
        args[1] = term147491;
        callMethod(klass, "getEdgeData", argTypes, term147484, args);
    }

};


