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
import java.lang.Object;

public class GraphTests_1_startVertex_11217900042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79096;
     Object term79097;

    public GraphTests_1_startVertex_11217900042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79096 = newInstance(Class.forName("org.graph4j.GraphTests$1"));
        term79097 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79102 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79107 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79112 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79117 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term79097, term79097.getClass(), "component", -2037783207);
        setIntField(term79097, term79097.getClass(), "vertex", 799731049);
        setIntField(term79097, term79097.getClass(), "level", 1446415915);
        setIntField(term79097, term79097.getClass(), "order", 1616695923);
        setIntField(term79102, term79102.getClass(), "component", -1952633376);
        setIntField(term79102, term79102.getClass(), "vertex", -2077418776);
        setIntField(term79102, term79102.getClass(), "level", 1888684596);
        setIntField(term79102, term79102.getClass(), "order", 1391968678);
        setIntField(term79107, term79107.getClass(), "component", -573573198);
        setIntField(term79107, term79107.getClass(), "vertex", -721584808);
        setIntField(term79107, term79107.getClass(), "level", 2146307582);
        setIntField(term79107, term79107.getClass(), "order", 816418778);
        setIntField(term79112, term79112.getClass(), "component", -1343139679);
        setIntField(term79112, term79112.getClass(), "vertex", -1422276108);
        setIntField(term79112, term79112.getClass(), "level", 629145097);
        setIntField(term79112, term79112.getClass(), "order", -1038526476);
        setIntField(term79117, term79117.getClass(), "component", -1620249948);
        setIntField(term79117, term79117.getClass(), "vertex", 407409382);
        setIntField(term79117, term79117.getClass(), "level", -434813900);
        setIntField(term79117, term79117.getClass(), "order", -1591071874);
        setField(term79117, term79117.getClass(), "parent", null);
        setField(term79112, term79112.getClass(), "parent", term79117);
        setField(term79107, term79107.getClass(), "parent", term79112);
        setField(term79102, term79102.getClass(), "parent", term79107);
        setField(term79097, term79097.getClass(), "parent", term79102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphTests$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term79097;
        callMethod(klass, "startVertex", argTypes, term79096, args);
    }

};


