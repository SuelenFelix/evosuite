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

public class SearchNode_component_5141356273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2698;

    public SearchNode_component_5141356273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2698 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2703 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2708 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2713 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2718 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2698, term2698.getClass(), "component", 1435572720);
        setIntField(term2698, term2698.getClass(), "vertex", 1437618365);
        setIntField(term2698, term2698.getClass(), "level", 1122535239);
        setIntField(term2698, term2698.getClass(), "order", 1158923260);
        setIntField(term2703, term2703.getClass(), "component", 1633508772);
        setIntField(term2703, term2703.getClass(), "vertex", -545275970);
        setIntField(term2703, term2703.getClass(), "level", 1355471365);
        setIntField(term2703, term2703.getClass(), "order", -1746962742);
        setIntField(term2708, term2708.getClass(), "component", -575810668);
        setIntField(term2708, term2708.getClass(), "vertex", 256028547);
        setIntField(term2708, term2708.getClass(), "level", -750603024);
        setIntField(term2708, term2708.getClass(), "order", 1255234202);
        setIntField(term2713, term2713.getClass(), "component", -223786928);
        setIntField(term2713, term2713.getClass(), "vertex", 1703103733);
        setIntField(term2713, term2713.getClass(), "level", 1057562436);
        setIntField(term2713, term2713.getClass(), "order", 646610000);
        setIntField(term2718, term2718.getClass(), "component", 2003399396);
        setIntField(term2718, term2718.getClass(), "vertex", 1223703911);
        setIntField(term2718, term2718.getClass(), "level", -1824905298);
        setIntField(term2718, term2718.getClass(), "order", -2062724184);
        setField(term2718, term2718.getClass(), "parent", null);
        setField(term2713, term2713.getClass(), "parent", term2718);
        setField(term2708, term2708.getClass(), "parent", term2713);
        setField(term2703, term2703.getClass(), "parent", term2708);
        setField(term2698, term2698.getClass(), "parent", term2703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component", argTypes, term2698, args);
    }

};


