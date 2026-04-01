package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DijkstraShortestPathHeap_postUpdate_6478156136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1967;
     Object term1971;

    public DijkstraShortestPathHeap_postUpdate_6478156136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1967 = newInstance(Class.forName("org.graph4j.shortestpath.DijkstraShortestPathHeap"));
        setField(term1967, term1967.getClass(), "heap", null);
        setIntField(term1967, term1967.getClass(), "source", 0);
        setField(term1967, term1967.getClass(), "vertices", null);
        setField(term1967, term1967.getClass(), "cost", null);
        setField(term1967, term1967.getClass(), "before", null);
        setField(term1967, term1967.getClass(), "size", null);
        setField(term1967, term1967.getClass(), "solved", null);
        setIntField(term1967, term1967.getClass(), "numSolved", 0);
        setField(term1967, term1967.getClass(), "graph", null);
        setBooleanField(term1967, term1967.getClass(), "directed", false);
        term1971 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.DijkstraShortestPathHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1971;
        callMethod(klass, "postUpdate", argTypes, term1967, args);
    }

};


