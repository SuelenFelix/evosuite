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

public class BFSIterator_maxLevel_611280877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107062;

    public BFSIterator_maxLevel_611280877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term107068 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term107073 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term107068, term107068.getClass(), "component", -1335813580);
        setIntField(term107068, term107068.getClass(), "vertex", -1945458236);
        setIntField(term107068, term107068.getClass(), "level", 620008134);
        setIntField(term107068, term107068.getClass(), "order", -1310086261);
        setIntField(term107073, term107073.getClass(), "component", -1554112233);
        setIntField(term107073, term107073.getClass(), "vertex", 54581392);
        setIntField(term107073, term107073.getClass(), "level", 671071231);
        setIntField(term107073, term107073.getClass(), "order", 1323294572);
        setField(term107073, term107073.getClass(), "parent", null);
        setField(term107068, term107068.getClass(), "parent", term107073);
        Object term107079 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term107079, term107079.getClass(), "component", 1614594325);
        setIntField(term107079, term107079.getClass(), "vertex", -2109591096);
        setIntField(term107079, term107079.getClass(), "level", 1593580658);
        setIntField(term107079, term107079.getClass(), "order", -1309148136);
        setField(term107079, term107079.getClass(), "parent", null);
        LinkedList term107065 = new LinkedList();
        ((LinkedList) term107065).add(term107068);
        ((LinkedList) term107065).add(term107079);
        ((LinkedList) term107065).add((Object)null);
        ((LinkedList) term107065).add((Object)null);
        ((LinkedList) term107065).add((Object)null);
        ((LinkedList) term107065).add((Object)null);
        term107062 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        boolean[] term107104 = (boolean[]) newBooleanArray(0);
        setField(term107062, term107062.getClass(), "graph", null);
        setIntField(term107062, term107062.getClass(), "startVertex", -1329430786);
        setIntField(term107062, term107062.getClass(), "numVertices", 1526430415);
        setField(term107062, term107062.getClass(), "queue", term107065);
        setField(term107062, term107062.getClass(), "visited", term107104);
        setIntField(term107062, term107062.getClass(), "restartIndex", -1127186635);
        setIntField(term107062, term107062.getClass(), "numIterations", 1448224493);
        setIntField(term107062, term107062.getClass(), "compIndex", -1142323876);
        setIntField(term107062, term107062.getClass(), "orderNumber", 10076911);
        setIntField(term107062, term107062.getClass(), "maxLevel", 1698012699);
        setBooleanField(term107062, term107062.getClass(), "reverse", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maxLevel", argTypes, term107062, args);
    }

};


