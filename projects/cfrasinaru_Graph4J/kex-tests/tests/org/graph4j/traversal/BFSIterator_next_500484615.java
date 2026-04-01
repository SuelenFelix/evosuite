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

public class BFSIterator_next_500484615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106973;

    public BFSIterator_next_500484615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term106979 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term106984 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term106979, term106979.getClass(), "component", -1427802140);
        setIntField(term106979, term106979.getClass(), "vertex", -1873578907);
        setIntField(term106979, term106979.getClass(), "level", -1113311132);
        setIntField(term106979, term106979.getClass(), "order", -301733567);
        setIntField(term106984, term106984.getClass(), "component", -589850841);
        setIntField(term106984, term106984.getClass(), "vertex", 2108113098);
        setIntField(term106984, term106984.getClass(), "level", 1645826517);
        setIntField(term106984, term106984.getClass(), "order", 463829962);
        setField(term106984, term106984.getClass(), "parent", null);
        setField(term106979, term106979.getClass(), "parent", term106984);
        Object term106990 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term106990, term106990.getClass(), "component", 1911093628);
        setIntField(term106990, term106990.getClass(), "vertex", -1831251547);
        setIntField(term106990, term106990.getClass(), "level", 1390806098);
        setIntField(term106990, term106990.getClass(), "order", 294546226);
        setField(term106990, term106990.getClass(), "parent", null);
        LinkedList term106976 = new LinkedList();
        ((LinkedList) term106976).add(term106979);
        ((LinkedList) term106976).add(term106990);
        ((LinkedList) term106976).add((Object)null);
        ((LinkedList) term106976).add((Object)null);
        ((LinkedList) term106976).add((Object)null);
        ((LinkedList) term106976).add((Object)null);
        ((LinkedList) term106976).add((Object)null);
        term106973 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        boolean[] term107005 = (boolean[]) newBooleanArray(0);
        setField(term106973, term106973.getClass(), "graph", null);
        setIntField(term106973, term106973.getClass(), "startVertex", 1107569375);
        setIntField(term106973, term106973.getClass(), "numVertices", -725804226);
        setField(term106973, term106973.getClass(), "queue", term106976);
        setField(term106973, term106973.getClass(), "visited", term107005);
        setIntField(term106973, term106973.getClass(), "restartIndex", -1074589146);
        setIntField(term106973, term106973.getClass(), "numIterations", -936863059);
        setIntField(term106973, term106973.getClass(), "compIndex", -136501931);
        setIntField(term106973, term106973.getClass(), "orderNumber", 1079782575);
        setIntField(term106973, term106973.getClass(), "maxLevel", -1681082907);
        setBooleanField(term106973, term106973.getClass(), "reverse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term106973, args);
    }

};


