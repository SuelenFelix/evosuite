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

public class GraphImpl_NeighborIteratorImpl_setEdgeLabel_117395662913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147493;
     Object term147498;

    public GraphImpl_NeighborIteratorImpl_setEdgeLabel_117395662913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147493 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147493, term147493.getClass(), "v", 456197023);
        setIntField(term147493, term147493.getClass(), "vi", 707290013);
        setIntField(term147493, term147493.getClass(), "pos", 1478557592);
        setBooleanField(term147493, term147493.getClass(), "forward", true);
        setField(term147493, term147493.getClass(), "this$0", null);
        term147498 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term147498;
        callMethod(klass, "setEdgeLabel", argTypes, term147493, args);
    }

};


