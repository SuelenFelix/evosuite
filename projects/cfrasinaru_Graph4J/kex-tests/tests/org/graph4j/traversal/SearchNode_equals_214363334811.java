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

public class SearchNode_equals_214363334811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143472;
     Object term143497;

    public SearchNode_equals_214363334811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143472 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143477 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143482 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143487 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143492 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143472, term143472.getClass(), "component", 1122725084);
        setIntField(term143472, term143472.getClass(), "vertex", -1210824980);
        setIntField(term143472, term143472.getClass(), "level", 1319146112);
        setIntField(term143472, term143472.getClass(), "order", -879543265);
        setIntField(term143477, term143477.getClass(), "component", -474240071);
        setIntField(term143477, term143477.getClass(), "vertex", -1726798037);
        setIntField(term143477, term143477.getClass(), "level", -656636720);
        setIntField(term143477, term143477.getClass(), "order", -736760160);
        setIntField(term143482, term143482.getClass(), "component", -1917895079);
        setIntField(term143482, term143482.getClass(), "vertex", -1256032847);
        setIntField(term143482, term143482.getClass(), "level", 859230585);
        setIntField(term143482, term143482.getClass(), "order", -78047892);
        setIntField(term143487, term143487.getClass(), "component", 1099196013);
        setIntField(term143487, term143487.getClass(), "vertex", 1302436565);
        setIntField(term143487, term143487.getClass(), "level", 363252512);
        setIntField(term143487, term143487.getClass(), "order", 1839293852);
        setIntField(term143492, term143492.getClass(), "component", -583004668);
        setIntField(term143492, term143492.getClass(), "vertex", -1997710193);
        setIntField(term143492, term143492.getClass(), "level", 621445525);
        setIntField(term143492, term143492.getClass(), "order", 201279470);
        setField(term143492, term143492.getClass(), "parent", null);
        setField(term143487, term143487.getClass(), "parent", term143492);
        setField(term143482, term143482.getClass(), "parent", term143487);
        setField(term143477, term143477.getClass(), "parent", term143482);
        setField(term143472, term143472.getClass(), "parent", term143477);
        term143497 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term143497;
        callMethod(klass, "equals", argTypes, term143472, args);
    }

};


