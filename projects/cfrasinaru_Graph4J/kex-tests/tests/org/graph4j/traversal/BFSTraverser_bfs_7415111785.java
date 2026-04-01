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
     Object term87141;

    public BFSTraverser_bfs_7415111785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87146 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87151 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87146, term87146.getClass(), "component", -1217431046);
        setIntField(term87146, term87146.getClass(), "vertex", 1472844966);
        setIntField(term87146, term87146.getClass(), "level", -501695251);
        setIntField(term87146, term87146.getClass(), "order", 1764349481);
        setIntField(term87151, term87151.getClass(), "component", -1925408074);
        setIntField(term87151, term87151.getClass(), "vertex", 488945441);
        setIntField(term87151, term87151.getClass(), "level", 1653790882);
        setIntField(term87151, term87151.getClass(), "order", -680166148);
        setField(term87151, term87151.getClass(), "parent", null);
        setField(term87146, term87146.getClass(), "parent", term87151);
        Object term87157 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87157, term87157.getClass(), "component", 643945557);
        setIntField(term87157, term87157.getClass(), "vertex", 276441632);
        setIntField(term87157, term87157.getClass(), "level", -556077472);
        setIntField(term87157, term87157.getClass(), "order", 1592695310);
        setField(term87157, term87157.getClass(), "parent", null);
        LinkedList term87143 = new LinkedList();
        ((LinkedList) term87143).add(term87146);
        ((LinkedList) term87143).add(term87157);
        ((LinkedList) term87143).add(term87157);
        term87141 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term87166 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 0);
        setField(term87141, term87141.getClass(), "graph", null);
        setBooleanField(term87141, term87141.getClass(), "directed", false);
        setField(term87141, term87141.getClass(), "visitor", null);
        setField(term87141, term87141.getClass(), "queue", term87143);
        setIntField(term87141, term87141.getClass(), "orderIndex", -374210090);
        setIntField(term87141, term87141.getClass(), "compIndex", 1118760300);
        setField(term87141, term87141.getClass(), "visited", term87166);
        setIntField(term87141, term87141.getClass(), "restartIndex", 843719523);
        setIntField(term87141, term87141.getClass(), "maxLevel", -815481212);
        setBooleanField(term87141, term87141.getClass(), "interrupted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bfs", argTypes, term87141, args);
    }

};


