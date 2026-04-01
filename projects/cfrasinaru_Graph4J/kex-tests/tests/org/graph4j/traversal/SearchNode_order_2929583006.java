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

public class SearchNode_order_2929583006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143297;

    public SearchNode_order_2929583006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143297 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143302 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143307 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143312 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143317 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143297, term143297.getClass(), "component", 1201183052);
        setIntField(term143297, term143297.getClass(), "vertex", -1652298689);
        setIntField(term143297, term143297.getClass(), "level", 347648530);
        setIntField(term143297, term143297.getClass(), "order", 828032399);
        setIntField(term143302, term143302.getClass(), "component", -1815235441);
        setIntField(term143302, term143302.getClass(), "vertex", -1620551735);
        setIntField(term143302, term143302.getClass(), "level", -481264802);
        setIntField(term143302, term143302.getClass(), "order", 72431201);
        setIntField(term143307, term143307.getClass(), "component", -1289146129);
        setIntField(term143307, term143307.getClass(), "vertex", 2080642075);
        setIntField(term143307, term143307.getClass(), "level", 1517524669);
        setIntField(term143307, term143307.getClass(), "order", 1739525973);
        setIntField(term143312, term143312.getClass(), "component", -1153158325);
        setIntField(term143312, term143312.getClass(), "vertex", 1076038489);
        setIntField(term143312, term143312.getClass(), "level", 808474089);
        setIntField(term143312, term143312.getClass(), "order", 280772453);
        setIntField(term143317, term143317.getClass(), "component", 1350106440);
        setIntField(term143317, term143317.getClass(), "vertex", -219708017);
        setIntField(term143317, term143317.getClass(), "level", 1648465515);
        setIntField(term143317, term143317.getClass(), "order", -95398220);
        setField(term143317, term143317.getClass(), "parent", null);
        setField(term143312, term143312.getClass(), "parent", term143317);
        setField(term143307, term143307.getClass(), "parent", term143312);
        setField(term143302, term143302.getClass(), "parent", term143307);
        setField(term143297, term143297.getClass(), "parent", term143302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "order", argTypes, term143297, args);
    }

};


