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

public class SearchNode_nearestAncestor_1643785129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2873;
     Object term2898;

    public SearchNode_nearestAncestor_1643785129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2873 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2878 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2883 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2888 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2893 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2873, term2873.getClass(), "component", -2105349391);
        setIntField(term2873, term2873.getClass(), "vertex", -1176968921);
        setIntField(term2873, term2873.getClass(), "level", -1986225025);
        setIntField(term2873, term2873.getClass(), "order", -838689952);
        setIntField(term2878, term2878.getClass(), "component", -307464652);
        setIntField(term2878, term2878.getClass(), "vertex", 460605690);
        setIntField(term2878, term2878.getClass(), "level", 2119231643);
        setIntField(term2878, term2878.getClass(), "order", 688546450);
        setIntField(term2883, term2883.getClass(), "component", 115635779);
        setIntField(term2883, term2883.getClass(), "vertex", -1081685171);
        setIntField(term2883, term2883.getClass(), "level", 1511699134);
        setIntField(term2883, term2883.getClass(), "order", 185647247);
        setIntField(term2888, term2888.getClass(), "component", 720814309);
        setIntField(term2888, term2888.getClass(), "vertex", 964137425);
        setIntField(term2888, term2888.getClass(), "level", -1378885614);
        setIntField(term2888, term2888.getClass(), "order", -1408615666);
        setIntField(term2893, term2893.getClass(), "component", -502299598);
        setIntField(term2893, term2893.getClass(), "vertex", -516287593);
        setIntField(term2893, term2893.getClass(), "level", -187311406);
        setIntField(term2893, term2893.getClass(), "order", 1496632406);
        setField(term2893, term2893.getClass(), "parent", null);
        setField(term2888, term2888.getClass(), "parent", term2893);
        setField(term2883, term2883.getClass(), "parent", term2888);
        setField(term2878, term2878.getClass(), "parent", term2883);
        setField(term2873, term2873.getClass(), "parent", term2878);
        term2898 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2903 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2908 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2913 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2918 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2898, term2898.getClass(), "component", 1691654567);
        setIntField(term2898, term2898.getClass(), "vertex", -1604942135);
        setIntField(term2898, term2898.getClass(), "level", 2000275611);
        setIntField(term2898, term2898.getClass(), "order", 2060369122);
        setIntField(term2903, term2903.getClass(), "component", -1275204506);
        setIntField(term2903, term2903.getClass(), "vertex", 507439888);
        setIntField(term2903, term2903.getClass(), "level", 1936798149);
        setIntField(term2903, term2903.getClass(), "order", 188304401);
        setIntField(term2908, term2908.getClass(), "component", -40613160);
        setIntField(term2908, term2908.getClass(), "vertex", 1359973218);
        setIntField(term2908, term2908.getClass(), "level", -218759803);
        setIntField(term2908, term2908.getClass(), "order", 1288936083);
        setIntField(term2913, term2913.getClass(), "component", 4086209);
        setIntField(term2913, term2913.getClass(), "vertex", 300964556);
        setIntField(term2913, term2913.getClass(), "level", -958207893);
        setIntField(term2913, term2913.getClass(), "order", 674390543);
        setIntField(term2918, term2918.getClass(), "component", 1472100258);
        setIntField(term2918, term2918.getClass(), "vertex", 12681987);
        setIntField(term2918, term2918.getClass(), "level", -1987364934);
        setIntField(term2918, term2918.getClass(), "order", 1364414277);
        setField(term2918, term2918.getClass(), "parent", null);
        setField(term2913, term2913.getClass(), "parent", term2918);
        setField(term2908, term2908.getClass(), "parent", term2913);
        setField(term2903, term2903.getClass(), "parent", term2908);
        setField(term2898, term2898.getClass(), "parent", term2903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term2873;
        args[1] = term2898;
        callMethod(klass, "nearestAncestor", argTypes, null, args);
    }

};


