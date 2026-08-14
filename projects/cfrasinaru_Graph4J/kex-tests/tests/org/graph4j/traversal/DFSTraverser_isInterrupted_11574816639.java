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
import java.util.ArrayDeque;

public class DFSTraverser_isInterrupted_11574816639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2123;

    public DFSTraverser_isInterrupted_11574816639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2138 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2143 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2138, term2138.getClass(), "component", -1331169079);
        setIntField(term2138, term2138.getClass(), "vertex", 1109050836);
        setIntField(term2138, term2138.getClass(), "level", 1978065000);
        setIntField(term2138, term2138.getClass(), "order", -2121133707);
        setIntField(term2143, term2143.getClass(), "component", -1005498887);
        setIntField(term2143, term2143.getClass(), "vertex", 1329150584);
        setIntField(term2143, term2143.getClass(), "level", -1825382367);
        setIntField(term2143, term2143.getClass(), "order", -1791371074);
        setField(term2143, term2143.getClass(), "parent", null);
        setField(term2138, term2138.getClass(), "parent", term2143);
        Object term2148 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2153 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2148, term2148.getClass(), "component", 1141592999);
        setIntField(term2148, term2148.getClass(), "vertex", 848113442);
        setIntField(term2148, term2148.getClass(), "level", 793974213);
        setIntField(term2148, term2148.getClass(), "order", 722546287);
        setIntField(term2153, term2153.getClass(), "component", -2060284160);
        setIntField(term2153, term2153.getClass(), "vertex", -568450686);
        setIntField(term2153, term2153.getClass(), "level", 1314660281);
        setIntField(term2153, term2153.getClass(), "order", -126399768);
        setField(term2153, term2153.getClass(), "parent", null);
        setField(term2148, term2148.getClass(), "parent", term2153);
        Object term2158 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2163 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2158, term2158.getClass(), "component", -1929689681);
        setIntField(term2158, term2158.getClass(), "vertex", -91240911);
        setIntField(term2158, term2158.getClass(), "level", -321227954);
        setIntField(term2158, term2158.getClass(), "order", 373810833);
        setIntField(term2163, term2163.getClass(), "component", -215979293);
        setIntField(term2163, term2163.getClass(), "vertex", -19567889);
        setIntField(term2163, term2163.getClass(), "level", 693500318);
        setIntField(term2163, term2163.getClass(), "order", 1702404702);
        setField(term2163, term2163.getClass(), "parent", null);
        setField(term2158, term2158.getClass(), "parent", term2163);
        ArrayDeque term2136 = new ArrayDeque();
        ((ArrayDeque) term2136).add(term2138);
        ((ArrayDeque) term2136).add(term2148);
        ((ArrayDeque) term2136).add(term2148);
        ((ArrayDeque) term2136).add(term2138);
        ((ArrayDeque) term2136).add(term2158);
        term2123 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        Object[] term2127 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 0);
        int[] term2128 = (int[]) newIntArray(6);
        boolean[] term2170 = (boolean[]) newBooleanArray(1);
        setField(term2123, term2123.getClass(), "graph", null);
        setBooleanField(term2123, term2123.getClass(), "directed", false);
        setField(term2123, term2123.getClass(), "visitor", null);
        setIntField(term2123, term2123.getClass(), "orderIndex", 140501130);
        setIntField(term2123, term2123.getClass(), "compIndex", -1458890291);
        setField(term2123, term2123.getClass(), "visited", term2127);
        setIntElement(term2128, 0, 1016087323);
        setIntElement(term2128, 1, 1957748979);
        setIntElement(term2128, 2, -1290093259);
        setIntElement(term2128, 3, -1200934890);
        setIntElement(term2128, 4, 1765633108);
        setIntElement(term2128, 5, 1312888741);
        setField(term2123, term2123.getClass(), "nextPos", term2128);
        setIntField(term2123, term2123.getClass(), "restartIndex", -1443680397);
        setField(term2123, term2123.getClass(), "stack", term2136);
        setField(term2123, term2123.getClass(), "instack", term2170);
        setBooleanField(term2123, term2123.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInterrupted", argTypes, term2123, args);
    }

};


