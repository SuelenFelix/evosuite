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

public class BFSIterator_hasNext_17338953704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106939;

    public BFSIterator_hasNext_17338953704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term106945 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term106950 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term106945, term106945.getClass(), "component", 1205905378);
        setIntField(term106945, term106945.getClass(), "vertex", 612842147);
        setIntField(term106945, term106945.getClass(), "level", -206245330);
        setIntField(term106945, term106945.getClass(), "order", -66386110);
        setIntField(term106950, term106950.getClass(), "component", 1046745876);
        setIntField(term106950, term106950.getClass(), "vertex", 1232342064);
        setIntField(term106950, term106950.getClass(), "level", 802799657);
        setIntField(term106950, term106950.getClass(), "order", 1517810658);
        setField(term106950, term106950.getClass(), "parent", null);
        setField(term106945, term106945.getClass(), "parent", term106950);
        Object term106956 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term106956, term106956.getClass(), "component", -1276675091);
        setIntField(term106956, term106956.getClass(), "vertex", -1101035418);
        setIntField(term106956, term106956.getClass(), "level", -452240687);
        setIntField(term106956, term106956.getClass(), "order", 1558172934);
        setField(term106956, term106956.getClass(), "parent", null);
        LinkedList term106942 = new LinkedList();
        ((LinkedList) term106942).add(term106945);
        ((LinkedList) term106942).add(term106956);
        ((LinkedList) term106942).add((Object)null);
        ((LinkedList) term106942).add((Object)null);
        ((LinkedList) term106942).add((Object)null);
        ((LinkedList) term106942).add((Object)null);
        ((LinkedList) term106942).add((Object)null);
        ((LinkedList) term106942).add((Object)null);
        term106939 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        boolean[] term106966 = (boolean[]) newBooleanArray(0);
        setField(term106939, term106939.getClass(), "graph", null);
        setIntField(term106939, term106939.getClass(), "startVertex", 1239736379);
        setIntField(term106939, term106939.getClass(), "numVertices", -476264306);
        setField(term106939, term106939.getClass(), "queue", term106942);
        setField(term106939, term106939.getClass(), "visited", term106966);
        setIntField(term106939, term106939.getClass(), "restartIndex", 1298839615);
        setIntField(term106939, term106939.getClass(), "numIterations", -1918351989);
        setIntField(term106939, term106939.getClass(), "compIndex", 1272701520);
        setIntField(term106939, term106939.getClass(), "orderNumber", -1398992109);
        setIntField(term106939, term106939.getClass(), "maxLevel", -409399250);
        setBooleanField(term106939, term106939.getClass(), "reverse", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term106939, args);
    }

};


