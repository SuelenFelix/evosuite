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

public class GraphImpl_NeighborIteratorImpl_incEdgeData_58586492310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147468;
     Object term147473;
     Object term147475;

    public GraphImpl_NeighborIteratorImpl_incEdgeData_58586492310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147468 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147468, term147468.getClass(), "v", 185083501);
        setIntField(term147468, term147468.getClass(), "vi", 742711465);
        setIntField(term147468, term147468.getClass(), "pos", -1794207616);
        setBooleanField(term147468, term147468.getClass(), "forward", false);
        setField(term147468, term147468.getClass(), "this$0", null);
        term147473 = new Integer(-1014179276);
        term147475 = new Double(0.672715190083854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term147473;
        args[1] = term147475;
        callMethod(klass, "incEdgeData", argTypes, term147468, args);
    }

};


