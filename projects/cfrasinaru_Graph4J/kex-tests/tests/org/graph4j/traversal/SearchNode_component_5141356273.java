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
     Object term143222;

    public SearchNode_component_5141356273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143222 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143227 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143232 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143237 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143242 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143222, term143222.getClass(), "component", 1921814860);
        setIntField(term143222, term143222.getClass(), "vertex", 1833890211);
        setIntField(term143222, term143222.getClass(), "level", 1292470529);
        setIntField(term143222, term143222.getClass(), "order", 78041358);
        setIntField(term143227, term143227.getClass(), "component", 869765327);
        setIntField(term143227, term143227.getClass(), "vertex", 448841855);
        setIntField(term143227, term143227.getClass(), "level", -1501190130);
        setIntField(term143227, term143227.getClass(), "order", -1583946267);
        setIntField(term143232, term143232.getClass(), "component", -406949901);
        setIntField(term143232, term143232.getClass(), "vertex", 22406941);
        setIntField(term143232, term143232.getClass(), "level", -1183704260);
        setIntField(term143232, term143232.getClass(), "order", 1877178274);
        setIntField(term143237, term143237.getClass(), "component", 878853055);
        setIntField(term143237, term143237.getClass(), "vertex", 1990357984);
        setIntField(term143237, term143237.getClass(), "level", 1541210593);
        setIntField(term143237, term143237.getClass(), "order", 1522506722);
        setIntField(term143242, term143242.getClass(), "component", 12625927);
        setIntField(term143242, term143242.getClass(), "vertex", -1917982598);
        setIntField(term143242, term143242.getClass(), "level", 791737453);
        setIntField(term143242, term143242.getClass(), "order", -496713452);
        setField(term143242, term143242.getClass(), "parent", null);
        setField(term143237, term143237.getClass(), "parent", term143242);
        setField(term143232, term143232.getClass(), "parent", term143237);
        setField(term143227, term143227.getClass(), "parent", term143232);
        setField(term143222, term143222.getClass(), "parent", term143227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component", argTypes, term143222, args);
    }

};


