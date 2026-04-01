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

public class BFSTraverser_traverse_13362287513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87058;
     Object term87109;

    public BFSTraverser_traverse_13362287513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87063 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87068 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87063, term87063.getClass(), "component", 489952093);
        setIntField(term87063, term87063.getClass(), "vertex", 860886224);
        setIntField(term87063, term87063.getClass(), "level", -187851938);
        setIntField(term87063, term87063.getClass(), "order", -1426453409);
        setIntField(term87068, term87068.getClass(), "component", 307700009);
        setIntField(term87068, term87068.getClass(), "vertex", -21762966);
        setIntField(term87068, term87068.getClass(), "level", -1469517921);
        setIntField(term87068, term87068.getClass(), "order", 1698773498);
        setField(term87068, term87068.getClass(), "parent", null);
        setField(term87063, term87063.getClass(), "parent", term87068);
        Object term87074 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87074, term87074.getClass(), "component", -658757442);
        setIntField(term87074, term87074.getClass(), "vertex", -975652694);
        setIntField(term87074, term87074.getClass(), "level", 342903868);
        setIntField(term87074, term87074.getClass(), "order", 1553091005);
        setField(term87074, term87074.getClass(), "parent", null);
        LinkedList term87060 = new LinkedList();
        ((LinkedList) term87060).add(term87063);
        ((LinkedList) term87060).add(term87074);
        ((LinkedList) term87060).add(term87074);
        ((LinkedList) term87060).add((Object)null);
        ((LinkedList) term87060).add((Object)null);
        term87058 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term87095 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 3);
        Object term87096 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87101 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87081 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87086 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term87058, term87058.getClass(), "graph", null);
        setBooleanField(term87058, term87058.getClass(), "directed", false);
        setField(term87058, term87058.getClass(), "visitor", null);
        setField(term87058, term87058.getClass(), "queue", term87060);
        setIntField(term87058, term87058.getClass(), "orderIndex", 1693148976);
        setIntField(term87058, term87058.getClass(), "compIndex", -638507792);
        setIntField(term87096, term87096.getClass(), "component", 708547892);
        setIntField(term87096, term87096.getClass(), "vertex", -1814890256);
        setIntField(term87096, term87096.getClass(), "level", -1681376129);
        setIntField(term87096, term87096.getClass(), "order", -1404448298);
        setIntField(term87101, term87101.getClass(), "component", -1560306376);
        setIntField(term87101, term87101.getClass(), "vertex", -994453726);
        setIntField(term87101, term87101.getClass(), "level", 1508458483);
        setIntField(term87101, term87101.getClass(), "order", 2109435374);
        setIntField(term87081, term87081.getClass(), "component", -655971082);
        setIntField(term87081, term87081.getClass(), "vertex", 1527901816);
        setIntField(term87081, term87081.getClass(), "level", -1719160388);
        setIntField(term87081, term87081.getClass(), "order", -670076376);
        setIntField(term87086, term87086.getClass(), "component", 1113460068);
        setIntField(term87086, term87086.getClass(), "vertex", 262955641);
        setIntField(term87086, term87086.getClass(), "level", -1166567844);
        setIntField(term87086, term87086.getClass(), "order", 708985205);
        setField(term87086, term87086.getClass(), "parent", null);
        setField(term87081, term87081.getClass(), "parent", term87086);
        setField(term87101, term87101.getClass(), "parent", term87081);
        setField(term87096, term87096.getClass(), "parent", term87101);
        setElement(term87095, 0, term87096);
        setElement(term87095, 1, term87068);
        setElement(term87095, 2, term87068);
        setField(term87058, term87058.getClass(), "visited", term87095);
        setIntField(term87058, term87058.getClass(), "restartIndex", -1233239714);
        setIntField(term87058, term87058.getClass(), "maxLevel", -699807547);
        setBooleanField(term87058, term87058.getClass(), "interrupted", true);
        term87109 = new Integer(-367006964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term87109;
        callMethod(klass, "traverse", argTypes, term87058, args);
    }

};


