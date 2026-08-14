package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SearchNode_equals_214363334811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2948;
     Object term2973;

    public SearchNode_equals_214363334811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2948 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2953 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2958 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2963 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2968 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2948, term2948.getClass(), "component", 1393855580);
        setIntField(term2948, term2948.getClass(), "vertex", -849064032);
        setIntField(term2948, term2948.getClass(), "level", -184659375);
        setIntField(term2948, term2948.getClass(), "order", 629005618);
        setIntField(term2953, term2953.getClass(), "component", -2006508013);
        setIntField(term2953, term2953.getClass(), "vertex", 974951631);
        setIntField(term2953, term2953.getClass(), "level", -942202284);
        setIntField(term2953, term2953.getClass(), "order", -2083254556);
        setIntField(term2958, term2958.getClass(), "component", 1452346261);
        setIntField(term2958, term2958.getClass(), "vertex", -548776693);
        setIntField(term2958, term2958.getClass(), "level", 99032275);
        setIntField(term2958, term2958.getClass(), "order", 794098686);
        setIntField(term2963, term2963.getClass(), "component", -1671524013);
        setIntField(term2963, term2963.getClass(), "vertex", -438794741);
        setIntField(term2963, term2963.getClass(), "level", -1400834481);
        setIntField(term2963, term2963.getClass(), "order", 957091706);
        setIntField(term2968, term2968.getClass(), "component", -2011802805);
        setIntField(term2968, term2968.getClass(), "vertex", -1683802689);
        setIntField(term2968, term2968.getClass(), "level", -1949346221);
        setIntField(term2968, term2968.getClass(), "order", 831638391);
        setField(term2968, term2968.getClass(), "parent", null);
        setField(term2963, term2963.getClass(), "parent", term2968);
        setField(term2958, term2958.getClass(), "parent", term2963);
        setField(term2953, term2953.getClass(), "parent", term2958);
        setField(term2948, term2948.getClass(), "parent", term2953);
        term2973 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2973;
        callMethod(klass, "equals", argTypes, term2948, args);
    }

};


