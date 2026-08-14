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

public class SearchNode_parent_7839581217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2798;

    public SearchNode_parent_7839581217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2798 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2803 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2808 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2813 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2818 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2798, term2798.getClass(), "component", 1677171453);
        setIntField(term2798, term2798.getClass(), "vertex", -2108979704);
        setIntField(term2798, term2798.getClass(), "level", 1629835601);
        setIntField(term2798, term2798.getClass(), "order", 1866184476);
        setIntField(term2803, term2803.getClass(), "component", -17998574);
        setIntField(term2803, term2803.getClass(), "vertex", 145080354);
        setIntField(term2803, term2803.getClass(), "level", -2087321012);
        setIntField(term2803, term2803.getClass(), "order", -1613074612);
        setIntField(term2808, term2808.getClass(), "component", 1054908502);
        setIntField(term2808, term2808.getClass(), "vertex", -1226802566);
        setIntField(term2808, term2808.getClass(), "level", 1162813858);
        setIntField(term2808, term2808.getClass(), "order", 494596414);
        setIntField(term2813, term2813.getClass(), "component", 1226377461);
        setIntField(term2813, term2813.getClass(), "vertex", -1540486514);
        setIntField(term2813, term2813.getClass(), "level", 1471031478);
        setIntField(term2813, term2813.getClass(), "order", -334716487);
        setIntField(term2818, term2818.getClass(), "component", -1739012814);
        setIntField(term2818, term2818.getClass(), "vertex", 1989014880);
        setIntField(term2818, term2818.getClass(), "level", -330280702);
        setIntField(term2818, term2818.getClass(), "order", -1858425735);
        setField(term2818, term2818.getClass(), "parent", null);
        setField(term2813, term2813.getClass(), "parent", term2818);
        setField(term2808, term2808.getClass(), "parent", term2813);
        setField(term2803, term2803.getClass(), "parent", term2808);
        setField(term2798, term2798.getClass(), "parent", term2803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parent", argTypes, term2798, args);
    }

};


