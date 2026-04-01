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
     Object term143247;

    public SearchNode_vertex_4841724944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143247 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143252 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143257 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143262 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143267 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143247, term143247.getClass(), "component", 356931097);
        setIntField(term143247, term143247.getClass(), "vertex", 1331144011);
        setIntField(term143247, term143247.getClass(), "level", -1173519624);
        setIntField(term143247, term143247.getClass(), "order", 1634458419);
        setIntField(term143252, term143252.getClass(), "component", -876704169);
        setIntField(term143252, term143252.getClass(), "vertex", -1318457853);
        setIntField(term143252, term143252.getClass(), "level", -1026416240);
        setIntField(term143252, term143252.getClass(), "order", -2656844);
        setIntField(term143257, term143257.getClass(), "component", -196892642);
        setIntField(term143257, term143257.getClass(), "vertex", -476105346);
        setIntField(term143257, term143257.getClass(), "level", -2116881593);
        setIntField(term143257, term143257.getClass(), "order", 119183163);
        setIntField(term143262, term143262.getClass(), "component", -841939624);
        setIntField(term143262, term143262.getClass(), "vertex", -1533852275);
        setIntField(term143262, term143262.getClass(), "level", 485212506);
        setIntField(term143262, term143262.getClass(), "order", 656196486);
        setIntField(term143267, term143267.getClass(), "component", -875427227);
        setIntField(term143267, term143267.getClass(), "vertex", -1186188835);
        setIntField(term143267, term143267.getClass(), "level", -1386613245);
        setIntField(term143267, term143267.getClass(), "order", 1253590260);
        setField(term143267, term143267.getClass(), "parent", null);
        setField(term143262, term143262.getClass(), "parent", term143267);
        setField(term143257, term143257.getClass(), "parent", term143262);
        setField(term143252, term143252.getClass(), "parent", term143257);
        setField(term143247, term143247.getClass(), "parent", term143252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "vertex", argTypes, term143247, args);
    }

};


