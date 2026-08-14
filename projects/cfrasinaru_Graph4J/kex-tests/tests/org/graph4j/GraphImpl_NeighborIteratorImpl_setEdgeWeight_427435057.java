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

public class GraphImpl_NeighborIteratorImpl_setEdgeWeight_427435057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147447;
     Object term147452;

    public GraphImpl_NeighborIteratorImpl_setEdgeWeight_427435057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147447 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147447, term147447.getClass(), "v", 1523681622);
        setIntField(term147447, term147447.getClass(), "vi", -1280085068);
        setIntField(term147447, term147447.getClass(), "pos", 1770498049);
        setBooleanField(term147447, term147447.getClass(), "forward", false);
        setField(term147447, term147447.getClass(), "this$0", null);
        term147452 = new Double(0.9012408025256534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term147452;
        callMethod(klass, "setEdgeWeight", argTypes, term147447, args);
    }

};


