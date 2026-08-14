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
import java.util.LinkedList;
import java.lang.Object;

public class BFSTraverser_traverse_1722648732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;

    public BFSTraverser_traverse_1722648732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term162 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term167 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term162, term162.getClass(), "component", -1048298087);
        setIntField(term162, term162.getClass(), "vertex", 292681826);
        setIntField(term162, term162.getClass(), "level", 458147407);
        setIntField(term162, term162.getClass(), "order", -184153539);
        setIntField(term167, term167.getClass(), "component", 493620644);
        setIntField(term167, term167.getClass(), "vertex", 1328271830);
        setIntField(term167, term167.getClass(), "level", 1596070772);
        setIntField(term167, term167.getClass(), "order", 97029295);
        setField(term167, term167.getClass(), "parent", null);
        setField(term162, term162.getClass(), "parent", term167);
        Object term173 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term173, term173.getClass(), "component", -481533957);
        setIntField(term173, term173.getClass(), "vertex", 1240914516);
        setIntField(term173, term173.getClass(), "level", -1465035361);
        setIntField(term173, term173.getClass(), "order", 1090617576);
        setField(term173, term173.getClass(), "parent", null);
        LinkedList term159 = new LinkedList();
        ((LinkedList) term159).add(term162);
        ((LinkedList) term159).add(term173);
        ((LinkedList) term159).add(term173);
        ((LinkedList) term159).add((Object)null);
        ((LinkedList) term159).add((Object)null);
        ((LinkedList) term159).add((Object)null);
        term157 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term200 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 2);
        setField(term157, term157.getClass(), "graph", null);
        setBooleanField(term157, term157.getClass(), "directed", true);
        setField(term157, term157.getClass(), "visitor", null);
        setField(term157, term157.getClass(), "queue", term159);
        setIntField(term157, term157.getClass(), "orderIndex", -1772434990);
        setIntField(term157, term157.getClass(), "compIndex", -1845499264);
        setElement(term200, 0, term167);
        setElement(term200, 1, term167);
        setField(term157, term157.getClass(), "visited", term200);
        setIntField(term157, term157.getClass(), "restartIndex", -505439934);
        setIntField(term157, term157.getClass(), "maxLevel", -344842608);
        setBooleanField(term157, term157.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.BFSVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "traverse", argTypes, term157, args);
    }

};


