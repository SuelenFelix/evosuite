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
     Object term263;
     Object term320;

    public BFSTraverser_traverse_1723244554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term268 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term273 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term268, term268.getClass(), "component", -1963464809);
        setIntField(term268, term268.getClass(), "vertex", 71190297);
        setIntField(term268, term268.getClass(), "level", 1202361360);
        setIntField(term268, term268.getClass(), "order", -2015048153);
        setIntField(term273, term273.getClass(), "component", -2063457669);
        setIntField(term273, term273.getClass(), "vertex", -1222006000);
        setIntField(term273, term273.getClass(), "level", 2095798786);
        setIntField(term273, term273.getClass(), "order", -1565502840);
        setField(term273, term273.getClass(), "parent", null);
        setField(term268, term268.getClass(), "parent", term273);
        LinkedList term265 = new LinkedList();
        ((LinkedList) term265).add(term268);
        term263 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term281 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 6);
        Object term282 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term287 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term292 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term297 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term302 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term307 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term312 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term263, term263.getClass(), "graph", null);
        setBooleanField(term263, term263.getClass(), "directed", true);
        setField(term263, term263.getClass(), "visitor", null);
        setField(term263, term263.getClass(), "queue", term265);
        setIntField(term263, term263.getClass(), "orderIndex", 229204365);
        setIntField(term263, term263.getClass(), "compIndex", -461771056);
        setIntField(term282, term282.getClass(), "component", -243422082);
        setIntField(term282, term282.getClass(), "vertex", 1384592638);
        setIntField(term282, term282.getClass(), "level", -1002370457);
        setIntField(term282, term282.getClass(), "order", -2014576105);
        setIntField(term287, term287.getClass(), "component", 1296895584);
        setIntField(term287, term287.getClass(), "vertex", 628918458);
        setIntField(term287, term287.getClass(), "level", -1274456137);
        setIntField(term287, term287.getClass(), "order", 1041916673);
        setIntField(term292, term292.getClass(), "component", 0);
        setIntField(term292, term292.getClass(), "vertex", 0);
        setIntField(term292, term292.getClass(), "level", 0);
        setIntField(term292, term292.getClass(), "order", 0);
        setField(term292, term292.getClass(), "parent", null);
        setField(term287, term287.getClass(), "parent", term292);
        setField(term282, term282.getClass(), "parent", term287);
        setElement(term281, 0, term282);
        setElement(term281, 1, term282);
        setElement(term281, 2, term268);
        setIntField(term297, term297.getClass(), "component", 1598895173);
        setIntField(term297, term297.getClass(), "vertex", 1830648570);
        setIntField(term297, term297.getClass(), "level", -227365013);
        setIntField(term297, term297.getClass(), "order", 11724947);
        setIntField(term302, term302.getClass(), "component", 1953277050);
        setIntField(term302, term302.getClass(), "vertex", 1283079251);
        setIntField(term302, term302.getClass(), "level", -523949691);
        setIntField(term302, term302.getClass(), "order", 1398204340);
        setField(term302, term302.getClass(), "parent", term292);
        setField(term297, term297.getClass(), "parent", term302);
        setElement(term281, 3, term297);
        setIntField(term307, term307.getClass(), "component", 202001407);
        setIntField(term307, term307.getClass(), "vertex", 158873461);
        setIntField(term307, term307.getClass(), "level", -430151637);
        setIntField(term307, term307.getClass(), "order", -1697741339);
        setIntField(term312, term312.getClass(), "component", 98922530);
        setIntField(term312, term312.getClass(), "vertex", -1388471422);
        setIntField(term312, term312.getClass(), "level", -1498296052);
        setIntField(term312, term312.getClass(), "order", 2098647989);
        setField(term312, term312.getClass(), "parent", term297);
        setField(term307, term307.getClass(), "parent", term312);
        setElement(term281, 4, term307);
        setElement(term281, 5, term273);
        setField(term263, term263.getClass(), "visited", term281);
        setIntField(term263, term263.getClass(), "restartIndex", -601863069);
        setIntField(term263, term263.getClass(), "maxLevel", 663292551);
        setBooleanField(term263, term263.getClass(), "interrupted", false);
        term320 = new Integer(-1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.traversal.BFSVisitor");
        Object[] args = new Object[2];
        args[0] = term320;
        args[1] = null;
        callMethod(klass, "traverse", argTypes, term263, args);
    }

};


