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

public class BFSTraverser_maxLevel_18879503757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87198;

    public BFSTraverser_maxLevel_18879503757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87203 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87208 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87203, term87203.getClass(), "component", -1209302829);
        setIntField(term87203, term87203.getClass(), "vertex", 1452201291);
        setIntField(term87203, term87203.getClass(), "level", -238634517);
        setIntField(term87203, term87203.getClass(), "order", -258929351);
        setIntField(term87208, term87208.getClass(), "component", 1333523587);
        setIntField(term87208, term87208.getClass(), "vertex", 873176518);
        setIntField(term87208, term87208.getClass(), "level", -1764702381);
        setIntField(term87208, term87208.getClass(), "order", 1689905396);
        setField(term87208, term87208.getClass(), "parent", null);
        setField(term87203, term87203.getClass(), "parent", term87208);
        LinkedList term87200 = new LinkedList();
        ((LinkedList) term87200).add(term87203);
        term87198 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term87216 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 3);
        Object term87217 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87222 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87227 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term87198, term87198.getClass(), "graph", null);
        setBooleanField(term87198, term87198.getClass(), "directed", false);
        setField(term87198, term87198.getClass(), "visitor", null);
        setField(term87198, term87198.getClass(), "queue", term87200);
        setIntField(term87198, term87198.getClass(), "orderIndex", 2045226655);
        setIntField(term87198, term87198.getClass(), "compIndex", -1704065897);
        setIntField(term87217, term87217.getClass(), "component", 714518855);
        setIntField(term87217, term87217.getClass(), "vertex", 1746565740);
        setIntField(term87217, term87217.getClass(), "level", -1867698927);
        setIntField(term87217, term87217.getClass(), "order", 651844085);
        setIntField(term87222, term87222.getClass(), "component", 1278789451);
        setIntField(term87222, term87222.getClass(), "vertex", -1480106431);
        setIntField(term87222, term87222.getClass(), "level", -64517730);
        setIntField(term87222, term87222.getClass(), "order", 1783779620);
        setIntField(term87227, term87227.getClass(), "component", 0);
        setIntField(term87227, term87227.getClass(), "vertex", 0);
        setIntField(term87227, term87227.getClass(), "level", 0);
        setIntField(term87227, term87227.getClass(), "order", 0);
        setField(term87227, term87227.getClass(), "parent", null);
        setField(term87222, term87222.getClass(), "parent", term87227);
        setField(term87217, term87217.getClass(), "parent", term87222);
        setElement(term87216, 0, term87217);
        setElement(term87216, 1, term87217);
        setElement(term87216, 2, term87203);
        setField(term87198, term87198.getClass(), "visited", term87216);
        setIntField(term87198, term87198.getClass(), "restartIndex", 709868634);
        setIntField(term87198, term87198.getClass(), "maxLevel", 1860316952);
        setBooleanField(term87198, term87198.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maxLevel", argTypes, term87198, args);
    }

};


