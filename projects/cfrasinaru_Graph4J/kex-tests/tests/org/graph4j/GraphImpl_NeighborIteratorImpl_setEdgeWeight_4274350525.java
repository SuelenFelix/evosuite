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
import java.lang.Double;

public class GraphImpl_NeighborIteratorImpl_setEdgeWeight_4274350525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147550;
     Object term147555;

    public GraphImpl_NeighborIteratorImpl_setEdgeWeight_4274350525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147550 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147550, term147550.getClass(), "v", 0);
        setIntField(term147550, term147550.getClass(), "vi", 0);
        setIntField(term147550, term147550.getClass(), "pos", 0);
        setBooleanField(term147550, term147550.getClass(), "forward", false);
        setField(term147550, term147550.getClass(), "this$0", null);
        term147555 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term147555;
        callMethod(klass, "setEdgeWeight", argTypes, term147550, args);
    }

};


