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
import java.lang.Integer;
import java.lang.Object;

public class SearchNode_init_21465632351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2638;
     Object term2640;

    public SearchNode_init_21465632351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2638 = new Integer(1086383182);
        term2640 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2645 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2650 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2655 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2660 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2640, term2640.getClass(), "component", 1425319286);
        setIntField(term2640, term2640.getClass(), "vertex", 1729919228);
        setIntField(term2640, term2640.getClass(), "level", 872351195);
        setIntField(term2640, term2640.getClass(), "order", -1664328399);
        setIntField(term2645, term2645.getClass(), "component", 1422430512);
        setIntField(term2645, term2645.getClass(), "vertex", 1796581482);
        setIntField(term2645, term2645.getClass(), "level", 1286440081);
        setIntField(term2645, term2645.getClass(), "order", -928538452);
        setIntField(term2650, term2650.getClass(), "component", -1313207353);
        setIntField(term2650, term2650.getClass(), "vertex", 402612318);
        setIntField(term2650, term2650.getClass(), "level", -1628481565);
        setIntField(term2650, term2650.getClass(), "order", -217226756);
        setIntField(term2655, term2655.getClass(), "component", 1608000247);
        setIntField(term2655, term2655.getClass(), "vertex", 1354560887);
        setIntField(term2655, term2655.getClass(), "level", -749474542);
        setIntField(term2655, term2655.getClass(), "order", -47907780);
        setIntField(term2660, term2660.getClass(), "component", 1131462369);
        setIntField(term2660, term2660.getClass(), "vertex", -1161206731);
        setIntField(term2660, term2660.getClass(), "level", -992847709);
        setIntField(term2660, term2660.getClass(), "order", 1125156671);
        setField(term2660, term2660.getClass(), "parent", null);
        setField(term2655, term2655.getClass(), "parent", term2660);
        setField(term2650, term2650.getClass(), "parent", term2655);
        setField(term2645, term2645.getClass(), "parent", term2650);
        setField(term2640, term2640.getClass(), "parent", term2645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term2638;
        args[1] = term2640;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


