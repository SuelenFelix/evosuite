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

public class GraphImpl_NeighborIteratorImpl_getEdgeData_64788054711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147477;
     Object term147482;

    public GraphImpl_NeighborIteratorImpl_getEdgeData_64788054711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147477 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147477, term147477.getClass(), "v", 370873600);
        setIntField(term147477, term147477.getClass(), "vi", -201242508);
        setIntField(term147477, term147477.getClass(), "pos", -2001201983);
        setBooleanField(term147477, term147477.getClass(), "forward", true);
        setField(term147477, term147477.getClass(), "this$0", null);
        term147482 = new Integer(-1945430238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term147482;
        callMethod(klass, "getEdgeData", argTypes, term147477, args);
    }

};


