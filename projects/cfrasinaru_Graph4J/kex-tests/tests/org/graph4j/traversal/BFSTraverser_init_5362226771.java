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

public class BFSTraverser_init_5362226771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public BFSTraverser_init_5362226771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term117 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term122 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term117, term117.getClass(), "component", 1585847225);
        setIntField(term117, term117.getClass(), "vertex", 597278769);
        setIntField(term117, term117.getClass(), "level", -1685132342);
        setIntField(term117, term117.getClass(), "order", -1456670397);
        setIntField(term122, term122.getClass(), "component", 1622346318);
        setIntField(term122, term122.getClass(), "vertex", 1048535127);
        setIntField(term122, term122.getClass(), "level", -655067527);
        setIntField(term122, term122.getClass(), "order", -6029667);
        setField(term122, term122.getClass(), "parent", null);
        setField(term117, term117.getClass(), "parent", term122);
        Object term128 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term128, term128.getClass(), "component", -602026508);
        setIntField(term128, term128.getClass(), "vertex", -157887805);
        setIntField(term128, term128.getClass(), "level", 1876565163);
        setIntField(term128, term128.getClass(), "order", -817164822);
        setField(term128, term128.getClass(), "parent", null);
        LinkedList term114 = new LinkedList();
        ((LinkedList) term114).add(term117);
        ((LinkedList) term114).add(term128);
        ((LinkedList) term114).add(term128);
        ((LinkedList) term114).add((Object)null);
        term112 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term138 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 1);
        Object term139 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term144 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term149 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term112, term112.getClass(), "graph", null);
        setBooleanField(term112, term112.getClass(), "directed", true);
        setField(term112, term112.getClass(), "visitor", null);
        setField(term112, term112.getClass(), "queue", term114);
        setIntField(term112, term112.getClass(), "orderIndex", 1632125673);
        setIntField(term112, term112.getClass(), "compIndex", 454281060);
        setIntField(term139, term139.getClass(), "component", 1193880199);
        setIntField(term139, term139.getClass(), "vertex", -1087774327);
        setIntField(term139, term139.getClass(), "level", -1530420153);
        setIntField(term139, term139.getClass(), "order", -469968304);
        setIntField(term144, term144.getClass(), "component", -1145578966);
        setIntField(term144, term144.getClass(), "vertex", 679763016);
        setIntField(term144, term144.getClass(), "level", 1962444399);
        setIntField(term144, term144.getClass(), "order", 767834723);
        setIntField(term149, term149.getClass(), "component", 0);
        setIntField(term149, term149.getClass(), "vertex", 0);
        setIntField(term149, term149.getClass(), "level", 0);
        setIntField(term149, term149.getClass(), "order", 0);
        setField(term149, term149.getClass(), "parent", null);
        setField(term144, term144.getClass(), "parent", term149);
        setField(term139, term139.getClass(), "parent", term144);
        setElement(term138, 0, term139);
        setField(term112, term112.getClass(), "visited", term138);
        setIntField(term112, term112.getClass(), "restartIndex", -1786399638);
        setIntField(term112, term112.getClass(), "maxLevel", 2055867847);
        setBooleanField(term112, term112.getClass(), "interrupted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term112, args);
    }

};


