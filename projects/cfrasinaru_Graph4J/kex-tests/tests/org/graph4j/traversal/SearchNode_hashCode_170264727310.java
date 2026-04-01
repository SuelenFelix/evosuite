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
     Object term143447;

    public SearchNode_hashCode_170264727310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143447 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143452 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143457 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143462 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143467 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143447, term143447.getClass(), "component", -1082649620);
        setIntField(term143447, term143447.getClass(), "vertex", 1284880964);
        setIntField(term143447, term143447.getClass(), "level", 641603537);
        setIntField(term143447, term143447.getClass(), "order", 1999259729);
        setIntField(term143452, term143452.getClass(), "component", 2136230790);
        setIntField(term143452, term143452.getClass(), "vertex", -1272468082);
        setIntField(term143452, term143452.getClass(), "level", -998274725);
        setIntField(term143452, term143452.getClass(), "order", -303692529);
        setIntField(term143457, term143457.getClass(), "component", -1835737581);
        setIntField(term143457, term143457.getClass(), "vertex", -407445270);
        setIntField(term143457, term143457.getClass(), "level", 2031359663);
        setIntField(term143457, term143457.getClass(), "order", -1952238276);
        setIntField(term143462, term143462.getClass(), "component", 1318179535);
        setIntField(term143462, term143462.getClass(), "vertex", -1454703889);
        setIntField(term143462, term143462.getClass(), "level", 1137483902);
        setIntField(term143462, term143462.getClass(), "order", 933662973);
        setIntField(term143467, term143467.getClass(), "component", 2057811119);
        setIntField(term143467, term143467.getClass(), "vertex", 212890700);
        setIntField(term143467, term143467.getClass(), "level", -1630458952);
        setIntField(term143467, term143467.getClass(), "order", -1650722477);
        setField(term143467, term143467.getClass(), "parent", null);
        setField(term143462, term143462.getClass(), "parent", term143467);
        setField(term143457, term143457.getClass(), "parent", term143462);
        setField(term143452, term143452.getClass(), "parent", term143457);
        setField(term143447, term143447.getClass(), "parent", term143452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term143447, args);
    }

};


