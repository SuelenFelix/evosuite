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

public class SearchNode_hashCode_170264727310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2923;

    public SearchNode_hashCode_170264727310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2923 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2928 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2933 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2938 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2943 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2923, term2923.getClass(), "component", 493657684);
        setIntField(term2923, term2923.getClass(), "vertex", 1882655922);
        setIntField(term2923, term2923.getClass(), "level", 1314996390);
        setIntField(term2923, term2923.getClass(), "order", 1367703658);
        setIntField(term2928, term2928.getClass(), "component", 1120153100);
        setIntField(term2928, term2928.getClass(), "vertex", 158801111);
        setIntField(term2928, term2928.getClass(), "level", 464966803);
        setIntField(term2928, term2928.getClass(), "order", -246618392);
        setIntField(term2933, term2933.getClass(), "component", 1472246167);
        setIntField(term2933, term2933.getClass(), "vertex", 1008555478);
        setIntField(term2933, term2933.getClass(), "level", 1346386442);
        setIntField(term2933, term2933.getClass(), "order", 1904559758);
        setIntField(term2938, term2938.getClass(), "component", 610850630);
        setIntField(term2938, term2938.getClass(), "vertex", 170509161);
        setIntField(term2938, term2938.getClass(), "level", 491497994);
        setIntField(term2938, term2938.getClass(), "order", 1997288643);
        setIntField(term2943, term2943.getClass(), "component", -378961519);
        setIntField(term2943, term2943.getClass(), "vertex", -400280008);
        setIntField(term2943, term2943.getClass(), "level", -1191957775);
        setIntField(term2943, term2943.getClass(), "order", 14181775);
        setField(term2943, term2943.getClass(), "parent", null);
        setField(term2938, term2938.getClass(), "parent", term2943);
        setField(term2933, term2933.getClass(), "parent", term2938);
        setField(term2928, term2928.getClass(), "parent", term2933);
        setField(term2923, term2923.getClass(), "parent", term2928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2923, args);
    }

};


