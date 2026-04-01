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
     Object term99065;

    public BFSTraverser_1_init_4218370980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99070 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term99075 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term99070, term99070.getClass(), "component", 1483366240);
        setIntField(term99070, term99070.getClass(), "vertex", -808802177);
        setIntField(term99070, term99070.getClass(), "level", 201013869);
        setIntField(term99070, term99070.getClass(), "order", -695537447);
        setIntField(term99075, term99075.getClass(), "component", -128642878);
        setIntField(term99075, term99075.getClass(), "vertex", -153976766);
        setIntField(term99075, term99075.getClass(), "level", -822027858);
        setIntField(term99075, term99075.getClass(), "order", 487034633);
        setField(term99075, term99075.getClass(), "parent", null);
        setField(term99070, term99070.getClass(), "parent", term99075);
        Object term99081 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term99081, term99081.getClass(), "component", -2075510342);
        setIntField(term99081, term99081.getClass(), "vertex", 1544698163);
        setIntField(term99081, term99081.getClass(), "level", -1789656093);
        setIntField(term99081, term99081.getClass(), "order", 1550481264);
        setField(term99081, term99081.getClass(), "parent", null);
        LinkedList term99067 = new LinkedList();
        ((LinkedList) term99067).add(term99070);
        ((LinkedList) term99067).add(term99081);
        ((LinkedList) term99067).add(term99081);
        term99065 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term99090 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 6);
        Object term99091 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term99096 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term99101 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term99106 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term99111 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term99116 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term99065, term99065.getClass(), "graph", null);
        setBooleanField(term99065, term99065.getClass(), "directed", false);
        setField(term99065, term99065.getClass(), "visitor", null);
        setField(term99065, term99065.getClass(), "queue", term99067);
        setIntField(term99065, term99065.getClass(), "orderIndex", 363138033);
        setIntField(term99065, term99065.getClass(), "compIndex", -1764874360);
        setElement(term99090, 0, term99070);
        setIntField(term99091, term99091.getClass(), "component", -1612439420);
        setIntField(term99091, term99091.getClass(), "vertex", -914990802);
        setIntField(term99091, term99091.getClass(), "level", 865738050);
        setIntField(term99091, term99091.getClass(), "order", 28910093);
        setIntField(term99096, term99096.getClass(), "component", 157370660);
        setIntField(term99096, term99096.getClass(), "vertex", 2042890534);
        setIntField(term99096, term99096.getClass(), "level", -2049072485);
        setIntField(term99096, term99096.getClass(), "order", 1903704550);
        setIntField(term99101, term99101.getClass(), "component", 0);
        setIntField(term99101, term99101.getClass(), "vertex", 0);
        setIntField(term99101, term99101.getClass(), "level", 0);
        setIntField(term99101, term99101.getClass(), "order", 0);
        setField(term99101, term99101.getClass(), "parent", null);
        setField(term99096, term99096.getClass(), "parent", term99101);
        setField(term99091, term99091.getClass(), "parent", term99096);
        setElement(term99090, 1, term99091);
        setIntField(term99106, term99106.getClass(), "component", -1999959189);
        setIntField(term99106, term99106.getClass(), "vertex", -1872533700);
        setIntField(term99106, term99106.getClass(), "level", 1237512912);
        setIntField(term99106, term99106.getClass(), "order", 1251446163);
        setIntField(term99111, term99111.getClass(), "component", -2057452122);
        setIntField(term99111, term99111.getClass(), "vertex", 1691237773);
        setIntField(term99111, term99111.getClass(), "level", -1663742052);
        setIntField(term99111, term99111.getClass(), "order", 788507527);
        setField(term99111, term99111.getClass(), "parent", term99091);
        setField(term99106, term99106.getClass(), "parent", term99111);
        setElement(term99090, 2, term99106);
        setElement(term99090, 3, term99075);
        setElement(term99090, 4, term99075);
        setIntField(term99116, term99116.getClass(), "component", -1463046270);
        setIntField(term99116, term99116.getClass(), "vertex", -1017027932);
        setIntField(term99116, term99116.getClass(), "level", 1969662928);
        setIntField(term99116, term99116.getClass(), "order", 1703170089);
        setField(term99116, term99116.getClass(), "parent", term99101);
        setElement(term99090, 5, term99116);
        setField(term99065, term99065.getClass(), "visited", term99090);
        setIntField(term99065, term99065.getClass(), "restartIndex", -448351770);
        setIntField(term99065, term99065.getClass(), "maxLevel", 1136014453);
        setBooleanField(term99065, term99065.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.BFSTraverser");
        Object[] args = new Object[1];
        args[0] = term99065;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


