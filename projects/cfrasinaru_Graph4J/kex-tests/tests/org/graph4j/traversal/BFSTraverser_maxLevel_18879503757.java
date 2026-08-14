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

public class BFSTraverser_maxLevel_18879503757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426;

    public BFSTraverser_maxLevel_18879503757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term431 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term436 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term431, term431.getClass(), "component", -420030135);
        setIntField(term431, term431.getClass(), "vertex", 267763294);
        setIntField(term431, term431.getClass(), "level", -1497710478);
        setIntField(term431, term431.getClass(), "order", 49950830);
        setIntField(term436, term436.getClass(), "component", -525257914);
        setIntField(term436, term436.getClass(), "vertex", 147209682);
        setIntField(term436, term436.getClass(), "level", 34470066);
        setIntField(term436, term436.getClass(), "order", 2058711405);
        setField(term436, term436.getClass(), "parent", null);
        setField(term431, term431.getClass(), "parent", term436);
        LinkedList term428 = new LinkedList();
        ((LinkedList) term428).add(term431);
        term426 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term444 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 0);
        setField(term426, term426.getClass(), "graph", null);
        setBooleanField(term426, term426.getClass(), "directed", true);
        setField(term426, term426.getClass(), "visitor", null);
        setField(term426, term426.getClass(), "queue", term428);
        setIntField(term426, term426.getClass(), "orderIndex", -680920524);
        setIntField(term426, term426.getClass(), "compIndex", -916335264);
        setField(term426, term426.getClass(), "visited", term444);
        setIntField(term426, term426.getClass(), "restartIndex", -919416536);
        setIntField(term426, term426.getClass(), "maxLevel", -43417861);
        setBooleanField(term426, term426.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maxLevel", argTypes, term426, args);
    }

};


