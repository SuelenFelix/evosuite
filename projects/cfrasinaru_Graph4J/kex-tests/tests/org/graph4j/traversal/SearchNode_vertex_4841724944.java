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

public class SearchNode_vertex_4841724944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2723;

    public SearchNode_vertex_4841724944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2723 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2728 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2733 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2738 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2743 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2723, term2723.getClass(), "component", -2004794532);
        setIntField(term2723, term2723.getClass(), "vertex", 1232958763);
        setIntField(term2723, term2723.getClass(), "level", -1702132549);
        setIntField(term2723, term2723.getClass(), "order", -1786136772);
        setIntField(term2728, term2728.getClass(), "component", -1510967747);
        setIntField(term2728, term2728.getClass(), "vertex", -2014792457);
        setIntField(term2728, term2728.getClass(), "level", 1957633116);
        setIntField(term2728, term2728.getClass(), "order", 1428598210);
        setIntField(term2733, term2733.getClass(), "component", 1071776561);
        setIntField(term2733, term2733.getClass(), "vertex", 1846399918);
        setIntField(term2733, term2733.getClass(), "level", 35388821);
        setIntField(term2733, term2733.getClass(), "order", -598803400);
        setIntField(term2738, term2738.getClass(), "component", 25560022);
        setIntField(term2738, term2738.getClass(), "vertex", -1090136985);
        setIntField(term2738, term2738.getClass(), "level", -355574894);
        setIntField(term2738, term2738.getClass(), "order", 1866941633);
        setIntField(term2743, term2743.getClass(), "component", 1697296048);
        setIntField(term2743, term2743.getClass(), "vertex", 1302075623);
        setIntField(term2743, term2743.getClass(), "level", 1238707613);
        setIntField(term2743, term2743.getClass(), "order", 1961351136);
        setField(term2743, term2743.getClass(), "parent", null);
        setField(term2738, term2738.getClass(), "parent", term2743);
        setField(term2733, term2733.getClass(), "parent", term2738);
        setField(term2728, term2728.getClass(), "parent", term2733);
        setField(term2723, term2723.getClass(), "parent", term2728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "vertex", argTypes, term2723, args);
    }

};


