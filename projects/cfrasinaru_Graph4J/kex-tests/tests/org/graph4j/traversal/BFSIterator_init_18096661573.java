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
     Object term1427;

    public BFSIterator_init_18096661573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1433 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1438 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1433, term1433.getClass(), "component", -1092883950);
        setIntField(term1433, term1433.getClass(), "vertex", 950385621);
        setIntField(term1433, term1433.getClass(), "level", -232352320);
        setIntField(term1433, term1433.getClass(), "order", -232333014);
        setIntField(term1438, term1438.getClass(), "component", -139694079);
        setIntField(term1438, term1438.getClass(), "vertex", -1602072035);
        setIntField(term1438, term1438.getClass(), "level", 1902624392);
        setIntField(term1438, term1438.getClass(), "order", 904607217);
        setField(term1438, term1438.getClass(), "parent", null);
        setField(term1433, term1433.getClass(), "parent", term1438);
        Object term1444 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1444, term1444.getClass(), "component", -1130401612);
        setIntField(term1444, term1444.getClass(), "vertex", -316771104);
        setIntField(term1444, term1444.getClass(), "level", -1374527319);
        setIntField(term1444, term1444.getClass(), "order", -1735276919);
        setField(term1444, term1444.getClass(), "parent", null);
        LinkedList term1430 = new LinkedList();
        ((LinkedList) term1430).add(term1433);
        ((LinkedList) term1430).add(term1444);
        ((LinkedList) term1430).add((Object)null);
        ((LinkedList) term1430).add((Object)null);
        term1427 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        boolean[] term1452 = (boolean[]) newBooleanArray(8);
        setField(term1427, term1427.getClass(), "graph", null);
        setIntField(term1427, term1427.getClass(), "startVertex", -1747711865);
        setIntField(term1427, term1427.getClass(), "numVertices", 682812715);
        setField(term1427, term1427.getClass(), "queue", term1430);
        setBooleanElement(term1452, 1, true);
        setBooleanElement(term1452, 6, true);
        setBooleanElement(term1452, 7, true);
        setField(term1427, term1427.getClass(), "visited", term1452);
        setIntField(term1427, term1427.getClass(), "restartIndex", -712023865);
        setIntField(term1427, term1427.getClass(), "numIterations", 613256157);
        setIntField(term1427, term1427.getClass(), "compIndex", 454242689);
        setIntField(term1427, term1427.getClass(), "orderNumber", 1798354517);
        setIntField(term1427, term1427.getClass(), "maxLevel", -1495693617);
        setBooleanField(term1427, term1427.getClass(), "reverse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term1427, args);
    }

};


