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

public class BFSTraverser_1_init_4218370980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term833;

    public BFSTraverser_1_init_4218370980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term838 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term843 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term838, term838.getClass(), "component", 1820784228);
        setIntField(term838, term838.getClass(), "vertex", 1390820006);
        setIntField(term838, term838.getClass(), "level", -828982065);
        setIntField(term838, term838.getClass(), "order", 1221443226);
        setIntField(term843, term843.getClass(), "component", 908108726);
        setIntField(term843, term843.getClass(), "vertex", 1023209512);
        setIntField(term843, term843.getClass(), "level", 1084849225);
        setIntField(term843, term843.getClass(), "order", -1702055571);
        setField(term843, term843.getClass(), "parent", null);
        setField(term838, term838.getClass(), "parent", term843);
        Object term849 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term849, term849.getClass(), "component", 1723148410);
        setIntField(term849, term849.getClass(), "vertex", -920797484);
        setIntField(term849, term849.getClass(), "level", -1631697577);
        setIntField(term849, term849.getClass(), "order", 765731371);
        setField(term849, term849.getClass(), "parent", null);
        LinkedList term835 = new LinkedList();
        ((LinkedList) term835).add(term838);
        ((LinkedList) term835).add(term849);
        ((LinkedList) term835).add(term849);
        ((LinkedList) term835).add((Object)null);
        ((LinkedList) term835).add((Object)null);
        ((LinkedList) term835).add((Object)null);
        term833 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term876 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 5);
        Object term877 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term882 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term833, term833.getClass(), "graph", null);
        setBooleanField(term833, term833.getClass(), "directed", true);
        setField(term833, term833.getClass(), "visitor", null);
        setField(term833, term833.getClass(), "queue", term835);
        setIntField(term833, term833.getClass(), "orderIndex", 947897214);
        setIntField(term833, term833.getClass(), "compIndex", 1496340209);
        setElement(term876, 0, term843);
        setElement(term876, 1, term843);
        setIntField(term877, term877.getClass(), "component", -1703035419);
        setIntField(term877, term877.getClass(), "vertex", 765766290);
        setIntField(term877, term877.getClass(), "level", -1284825282);
        setIntField(term877, term877.getClass(), "order", -1941343035);
        setIntField(term882, term882.getClass(), "component", 0);
        setIntField(term882, term882.getClass(), "vertex", 0);
        setIntField(term882, term882.getClass(), "level", 0);
        setIntField(term882, term882.getClass(), "order", 0);
        setField(term882, term882.getClass(), "parent", null);
        setField(term877, term877.getClass(), "parent", term882);
        setElement(term876, 2, term877);
        setElement(term876, 3, term882);
        setElement(term876, 4, term882);
        setField(term833, term833.getClass(), "visited", term876);
        setIntField(term833, term833.getClass(), "restartIndex", -1748391876);
        setIntField(term833, term833.getClass(), "maxLevel", 43258317);
        setBooleanField(term833, term833.getClass(), "interrupted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.BFSTraverser");
        Object[] args = new Object[1];
        args[0] = term833;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


