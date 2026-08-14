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
     Object term79099;
     Object term79100;

    public GraphTests_1_startVertex_11217900042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79099 = newInstance(Class.forName("org.graph4j.GraphTests$1"));
        term79100 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79105 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79110 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79115 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79120 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term79100, term79100.getClass(), "component", -2037783207);
        setIntField(term79100, term79100.getClass(), "vertex", 799731049);
        setIntField(term79100, term79100.getClass(), "level", 1446415915);
        setIntField(term79100, term79100.getClass(), "order", 1616695923);
        setIntField(term79105, term79105.getClass(), "component", -1952633376);
        setIntField(term79105, term79105.getClass(), "vertex", -2077418776);
        setIntField(term79105, term79105.getClass(), "level", 1888684596);
        setIntField(term79105, term79105.getClass(), "order", 1391968678);
        setIntField(term79110, term79110.getClass(), "component", -573573198);
        setIntField(term79110, term79110.getClass(), "vertex", -721584808);
        setIntField(term79110, term79110.getClass(), "level", 2146307582);
        setIntField(term79110, term79110.getClass(), "order", 816418778);
        setIntField(term79115, term79115.getClass(), "component", -1343139679);
        setIntField(term79115, term79115.getClass(), "vertex", -1422276108);
        setIntField(term79115, term79115.getClass(), "level", 629145097);
        setIntField(term79115, term79115.getClass(), "order", -1038526476);
        setIntField(term79120, term79120.getClass(), "component", -1620249948);
        setIntField(term79120, term79120.getClass(), "vertex", 407409382);
        setIntField(term79120, term79120.getClass(), "level", -434813900);
        setIntField(term79120, term79120.getClass(), "order", -1591071874);
        setField(term79120, term79120.getClass(), "parent", null);
        setField(term79115, term79115.getClass(), "parent", term79120);
        setField(term79110, term79110.getClass(), "parent", term79115);
        setField(term79105, term79105.getClass(), "parent", term79110);
        setField(term79100, term79100.getClass(), "parent", term79105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphTests$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term79100;
        callMethod(klass, "startVertex", argTypes, term79099, args);
    }

};


