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

public class BFSIterator_numComponents_453248376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107012;

    public BFSIterator_numComponents_453248376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term107018 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term107023 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term107018, term107018.getClass(), "component", 1067716537);
        setIntField(term107018, term107018.getClass(), "vertex", -163679227);
        setIntField(term107018, term107018.getClass(), "level", 1219736060);
        setIntField(term107018, term107018.getClass(), "order", -974978101);
        setIntField(term107023, term107023.getClass(), "component", -1344240427);
        setIntField(term107023, term107023.getClass(), "vertex", 1407194399);
        setIntField(term107023, term107023.getClass(), "level", 1067987457);
        setIntField(term107023, term107023.getClass(), "order", -1210069630);
        setField(term107023, term107023.getClass(), "parent", null);
        setField(term107018, term107018.getClass(), "parent", term107023);
        Object term107029 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term107029, term107029.getClass(), "component", 109271119);
        setIntField(term107029, term107029.getClass(), "vertex", 825124058);
        setIntField(term107029, term107029.getClass(), "level", 1957851443);
        setIntField(term107029, term107029.getClass(), "order", 1055723029);
        setField(term107029, term107029.getClass(), "parent", null);
        LinkedList term107015 = new LinkedList();
        ((LinkedList) term107015).add(term107018);
        ((LinkedList) term107015).add(term107029);
        ((LinkedList) term107015).add((Object)null);
        ((LinkedList) term107015).add((Object)null);
        term107012 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        boolean[] term107037 = (boolean[]) newBooleanArray(9);
        setField(term107012, term107012.getClass(), "graph", null);
        setIntField(term107012, term107012.getClass(), "startVertex", -896351319);
        setIntField(term107012, term107012.getClass(), "numVertices", -900221037);
        setField(term107012, term107012.getClass(), "queue", term107015);
        setBooleanElement(term107037, 0, true);
        setBooleanElement(term107037, 1, true);
        setBooleanElement(term107037, 2, true);
        setBooleanElement(term107037, 4, true);
        setBooleanElement(term107037, 6, true);
        setField(term107012, term107012.getClass(), "visited", term107037);
        setIntField(term107012, term107012.getClass(), "restartIndex", 2108463040);
        setIntField(term107012, term107012.getClass(), "numIterations", 1485634751);
        setIntField(term107012, term107012.getClass(), "compIndex", 1649606615);
        setIntField(term107012, term107012.getClass(), "orderNumber", 1965144392);
        setIntField(term107012, term107012.getClass(), "maxLevel", -896244794);
        setBooleanField(term107012, term107012.getClass(), "reverse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numComponents", argTypes, term107012, args);
    }

};


