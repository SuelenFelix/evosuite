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

public class BFSIterator_init_18096661573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106891;

    public BFSIterator_init_18096661573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term106897 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term106902 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term106897, term106897.getClass(), "component", -834678189);
        setIntField(term106897, term106897.getClass(), "vertex", 689447382);
        setIntField(term106897, term106897.getClass(), "level", 1745666381);
        setIntField(term106897, term106897.getClass(), "order", 304073833);
        setIntField(term106902, term106902.getClass(), "component", -1851662861);
        setIntField(term106902, term106902.getClass(), "vertex", 623750096);
        setIntField(term106902, term106902.getClass(), "level", -1486229880);
        setIntField(term106902, term106902.getClass(), "order", -602437515);
        setField(term106902, term106902.getClass(), "parent", null);
        setField(term106897, term106897.getClass(), "parent", term106902);
        Object term106908 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term106908, term106908.getClass(), "component", -2116018442);
        setIntField(term106908, term106908.getClass(), "vertex", -257544793);
        setIntField(term106908, term106908.getClass(), "level", -1653237082);
        setIntField(term106908, term106908.getClass(), "order", -562763207);
        setField(term106908, term106908.getClass(), "parent", null);
        LinkedList term106894 = new LinkedList();
        ((LinkedList) term106894).add(term106897);
        ((LinkedList) term106894).add(term106908);
        ((LinkedList) term106894).add((Object)null);
        ((LinkedList) term106894).add((Object)null);
        ((LinkedList) term106894).add((Object)null);
        ((LinkedList) term106894).add((Object)null);
        ((LinkedList) term106894).add((Object)null);
        ((LinkedList) term106894).add((Object)null);
        ((LinkedList) term106894).add((Object)null);
        term106891 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        boolean[] term106918 = (boolean[]) newBooleanArray(7);
        setField(term106891, term106891.getClass(), "graph", null);
        setIntField(term106891, term106891.getClass(), "startVertex", 1859715105);
        setIntField(term106891, term106891.getClass(), "numVertices", 1029473371);
        setField(term106891, term106891.getClass(), "queue", term106894);
        setBooleanElement(term106918, 3, true);
        setBooleanElement(term106918, 4, true);
        setField(term106891, term106891.getClass(), "visited", term106918);
        setIntField(term106891, term106891.getClass(), "restartIndex", 1405119430);
        setIntField(term106891, term106891.getClass(), "numIterations", -161447198);
        setIntField(term106891, term106891.getClass(), "compIndex", -1588843736);
        setIntField(term106891, term106891.getClass(), "orderNumber", 890916272);
        setIntField(term106891, term106891.getClass(), "maxLevel", -1193989827);
        setBooleanField(term106891, term106891.getClass(), "reverse", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term106891, args);
    }

};


