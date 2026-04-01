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
     Object term147584;
     Object term147589;
     Object term147591;

    public GraphImpl_NeighborIteratorImpl_getEdgeData_180205912030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147584 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147584, term147584.getClass(), "v", 0);
        setIntField(term147584, term147584.getClass(), "vi", 0);
        setIntField(term147584, term147584.getClass(), "pos", 0);
        setBooleanField(term147584, term147584.getClass(), "forward", false);
        setField(term147584, term147584.getClass(), "this$0", null);
        term147589 = new Integer(0);
        term147591 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term147589;
        args[1] = term147591;
        callMethod(klass, "getEdgeData", argTypes, term147584, args);
    }

};


