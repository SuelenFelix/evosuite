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
import java.lang.Integer;

public class BFSTraverser_traverse_1723244554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87111;
     Object term87139;

    public BFSTraverser_traverse_1723244554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87116 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87121 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87116, term87116.getClass(), "component", 770134239);
        setIntField(term87116, term87116.getClass(), "vertex", -1196107767);
        setIntField(term87116, term87116.getClass(), "level", -1090930776);
        setIntField(term87116, term87116.getClass(), "order", -664970301);
        setIntField(term87121, term87121.getClass(), "component", -430975239);
        setIntField(term87121, term87121.getClass(), "vertex", 1276909937);
        setIntField(term87121, term87121.getClass(), "level", -1172444844);
        setIntField(term87121, term87121.getClass(), "order", 2013784342);
        setField(term87121, term87121.getClass(), "parent", null);
        setField(term87116, term87116.getClass(), "parent", term87121);
        Object term87127 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87127, term87127.getClass(), "component", 1875398911);
        setIntField(term87127, term87127.getClass(), "vertex", 370478918);
        setIntField(term87127, term87127.getClass(), "level", 989896657);
        setIntField(term87127, term87127.getClass(), "order", 1410935694);
        setField(term87127, term87127.getClass(), "parent", null);
        LinkedList term87113 = new LinkedList();
        ((LinkedList) term87113).add(term87116);
        ((LinkedList) term87113).add(term87127);
        term87111 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term87135 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 1);
        setField(term87111, term87111.getClass(), "graph", null);
        setBooleanField(term87111, term87111.getClass(), "directed", true);
        setField(term87111, term87111.getClass(), "visitor", null);
        setField(term87111, term87111.getClass(), "queue", term87113);
        setIntField(term87111, term87111.getClass(), "orderIndex", 1472997822);
        setIntField(term87111, term87111.getClass(), "compIndex", -1252761386);
        setElement(term87135, 0, term87127);
        setField(term87111, term87111.getClass(), "visited", term87135);
        setIntField(term87111, term87111.getClass(), "restartIndex", 2064530069);
        setIntField(term87111, term87111.getClass(), "maxLevel", -1271506389);
        setBooleanField(term87111, term87111.getClass(), "interrupted", true);
        term87139 = new Integer(-1502389213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.traversal.BFSVisitor");
        Object[] args = new Object[2];
        args[0] = term87139;
        args[1] = null;
        callMethod(klass, "traverse", argTypes, term87111, args);
    }

};


