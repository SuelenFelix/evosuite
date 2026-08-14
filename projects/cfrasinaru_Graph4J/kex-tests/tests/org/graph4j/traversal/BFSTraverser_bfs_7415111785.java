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

public class BFSTraverser_bfs_7415111785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322;

    public BFSTraverser_bfs_7415111785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term327 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term332 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term327, term327.getClass(), "component", -2066804303);
        setIntField(term327, term327.getClass(), "vertex", -1731761810);
        setIntField(term327, term327.getClass(), "level", 197109649);
        setIntField(term327, term327.getClass(), "order", -1239406390);
        setIntField(term332, term332.getClass(), "component", 1557431527);
        setIntField(term332, term332.getClass(), "vertex", -1504890659);
        setIntField(term332, term332.getClass(), "level", 1358829571);
        setIntField(term332, term332.getClass(), "order", 991356662);
        setField(term332, term332.getClass(), "parent", null);
        setField(term327, term327.getClass(), "parent", term332);
        Object term338 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term338, term338.getClass(), "component", -1870495012);
        setIntField(term338, term338.getClass(), "vertex", -1310015129);
        setIntField(term338, term338.getClass(), "level", -2104981311);
        setIntField(term338, term338.getClass(), "order", -571169753);
        setField(term338, term338.getClass(), "parent", null);
        LinkedList term324 = new LinkedList();
        ((LinkedList) term324).add(term327);
        ((LinkedList) term324).add(term338);
        ((LinkedList) term324).add(term338);
        ((LinkedList) term324).add((Object)null);
        ((LinkedList) term324).add((Object)null);
        term322 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term359 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 5);
        Object term360 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term365 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term345 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term350 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term370 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term375 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term322, term322.getClass(), "graph", null);
        setBooleanField(term322, term322.getClass(), "directed", true);
        setField(term322, term322.getClass(), "visitor", null);
        setField(term322, term322.getClass(), "queue", term324);
        setIntField(term322, term322.getClass(), "orderIndex", 548228925);
        setIntField(term322, term322.getClass(), "compIndex", -749861210);
        setIntField(term360, term360.getClass(), "component", 729658803);
        setIntField(term360, term360.getClass(), "vertex", 114754804);
        setIntField(term360, term360.getClass(), "level", 1687361082);
        setIntField(term360, term360.getClass(), "order", 584893196);
        setIntField(term365, term365.getClass(), "component", 497269071);
        setIntField(term365, term365.getClass(), "vertex", -1899301124);
        setIntField(term365, term365.getClass(), "level", -1882480155);
        setIntField(term365, term365.getClass(), "order", -1410220680);
        setIntField(term345, term345.getClass(), "component", 389427431);
        setIntField(term345, term345.getClass(), "vertex", -1945706126);
        setIntField(term345, term345.getClass(), "level", 1152356969);
        setIntField(term345, term345.getClass(), "order", -1667990367);
        setIntField(term350, term350.getClass(), "component", -1214628358);
        setIntField(term350, term350.getClass(), "vertex", 1102721075);
        setIntField(term350, term350.getClass(), "level", -426764678);
        setIntField(term350, term350.getClass(), "order", -1222614956);
        setField(term350, term350.getClass(), "parent", null);
        setField(term345, term345.getClass(), "parent", term350);
        setField(term365, term365.getClass(), "parent", term345);
        setField(term360, term360.getClass(), "parent", term365);
        setElement(term359, 0, term360);
        setElement(term359, 1, term332);
        setElement(term359, 2, term332);
        setIntField(term370, term370.getClass(), "component", 318591690);
        setIntField(term370, term370.getClass(), "vertex", -165587447);
        setIntField(term370, term370.getClass(), "level", -1347358701);
        setIntField(term370, term370.getClass(), "order", 806595993);
        setIntField(term375, term375.getClass(), "component", 0);
        setIntField(term375, term375.getClass(), "vertex", 0);
        setIntField(term375, term375.getClass(), "level", 0);
        setIntField(term375, term375.getClass(), "order", 0);
        setField(term375, term375.getClass(), "parent", null);
        setField(term370, term370.getClass(), "parent", term375);
        setElement(term359, 3, term370);
        setElement(term359, 4, term375);
        setField(term322, term322.getClass(), "visited", term359);
        setIntField(term322, term322.getClass(), "restartIndex", 1694224101);
        setIntField(term322, term322.getClass(), "maxLevel", 937859191);
        setBooleanField(term322, term322.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bfs", argTypes, term322, args);
    }

};


