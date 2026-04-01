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

public class DFSVisitor_isRoot_7858927928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147926;

    public DFSVisitor_isRoot_7858927928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147926 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147931 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147936 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147941 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147946 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147926, term147926.getClass(), "component", -1003951947);
        setIntField(term147926, term147926.getClass(), "vertex", -942905669);
        setIntField(term147926, term147926.getClass(), "level", 803283224);
        setIntField(term147926, term147926.getClass(), "order", 1103886079);
        setIntField(term147931, term147931.getClass(), "component", 2087517759);
        setIntField(term147931, term147931.getClass(), "vertex", 1870764435);
        setIntField(term147931, term147931.getClass(), "level", 776379157);
        setIntField(term147931, term147931.getClass(), "order", -103855969);
        setIntField(term147936, term147936.getClass(), "component", 1382938356);
        setIntField(term147936, term147936.getClass(), "vertex", 1622030093);
        setIntField(term147936, term147936.getClass(), "level", 447309846);
        setIntField(term147936, term147936.getClass(), "order", 2043594561);
        setIntField(term147941, term147941.getClass(), "component", 1152996595);
        setIntField(term147941, term147941.getClass(), "vertex", -466338824);
        setIntField(term147941, term147941.getClass(), "level", 922263611);
        setIntField(term147941, term147941.getClass(), "order", 699709277);
        setIntField(term147946, term147946.getClass(), "component", -949171074);
        setIntField(term147946, term147946.getClass(), "vertex", 713809100);
        setIntField(term147946, term147946.getClass(), "level", -860538934);
        setIntField(term147946, term147946.getClass(), "order", 2018296809);
        setField(term147946, term147946.getClass(), "parent", null);
        setField(term147941, term147941.getClass(), "parent", term147946);
        setField(term147936, term147936.getClass(), "parent", term147941);
        setField(term147931, term147931.getClass(), "parent", term147936);
        setField(term147926, term147926.getClass(), "parent", term147931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term147926;
        callMethod(klass, "isRoot", argTypes, null, args);
    }

};


