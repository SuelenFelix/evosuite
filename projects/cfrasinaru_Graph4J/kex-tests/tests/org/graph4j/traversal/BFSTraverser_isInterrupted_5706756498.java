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

public class BFSTraverser_isInterrupted_5706756498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87235;

    public BFSTraverser_isInterrupted_5706756498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87240 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87245 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87240, term87240.getClass(), "component", -1357166161);
        setIntField(term87240, term87240.getClass(), "vertex", -1627604622);
        setIntField(term87240, term87240.getClass(), "level", 713023342);
        setIntField(term87240, term87240.getClass(), "order", 998011339);
        setIntField(term87245, term87245.getClass(), "component", -1950215164);
        setIntField(term87245, term87245.getClass(), "vertex", -708642862);
        setIntField(term87245, term87245.getClass(), "level", 1451070666);
        setIntField(term87245, term87245.getClass(), "order", 1051167456);
        setField(term87245, term87245.getClass(), "parent", null);
        setField(term87240, term87240.getClass(), "parent", term87245);
        Object term87251 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87251, term87251.getClass(), "component", 1670662698);
        setIntField(term87251, term87251.getClass(), "vertex", -1572888982);
        setIntField(term87251, term87251.getClass(), "level", 2135550662);
        setIntField(term87251, term87251.getClass(), "order", -455562432);
        setField(term87251, term87251.getClass(), "parent", null);
        LinkedList term87237 = new LinkedList();
        ((LinkedList) term87237).add(term87240);
        ((LinkedList) term87237).add(term87251);
        ((LinkedList) term87237).add(term87251);
        ((LinkedList) term87237).add((Object)null);
        ((LinkedList) term87237).add((Object)null);
        ((LinkedList) term87237).add((Object)null);
        term87235 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term87278 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 9);
        Object term87279 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87284 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87263 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87269 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term87235, term87235.getClass(), "graph", null);
        setBooleanField(term87235, term87235.getClass(), "directed", true);
        setField(term87235, term87235.getClass(), "visitor", null);
        setField(term87235, term87235.getClass(), "queue", term87237);
        setIntField(term87235, term87235.getClass(), "orderIndex", 1357437054);
        setIntField(term87235, term87235.getClass(), "compIndex", -1042866729);
        setElement(term87278, 0, term87245);
        setElement(term87278, 1, term87245);
        setIntField(term87279, term87279.getClass(), "component", -80827488);
        setIntField(term87279, term87279.getClass(), "vertex", -992927508);
        setIntField(term87279, term87279.getClass(), "level", -2071989918);
        setIntField(term87279, term87279.getClass(), "order", -1383632524);
        setIntField(term87284, term87284.getClass(), "component", 0);
        setIntField(term87284, term87284.getClass(), "vertex", 0);
        setIntField(term87284, term87284.getClass(), "level", 0);
        setIntField(term87284, term87284.getClass(), "order", 0);
        setField(term87284, term87284.getClass(), "parent", null);
        setField(term87279, term87279.getClass(), "parent", term87284);
        setElement(term87278, 2, term87279);
        setElement(term87278, 3, term87284);
        setElement(term87278, 4, term87284);
        setIntField(term87263, term87263.getClass(), "component", -479962825);
        setIntField(term87263, term87263.getClass(), "vertex", 1779819594);
        setIntField(term87263, term87263.getClass(), "level", 1985056540);
        setIntField(term87263, term87263.getClass(), "order", -226386721);
        setField(term87263, term87263.getClass(), "parent", null);
        setElement(term87278, 5, term87263);
        setElement(term87278, 6, term87279);
        setElement(term87278, 7, term87284);
        setIntField(term87269, term87269.getClass(), "component", 1013063751);
        setIntField(term87269, term87269.getClass(), "vertex", -1198391913);
        setIntField(term87269, term87269.getClass(), "level", 68033708);
        setIntField(term87269, term87269.getClass(), "order", 2051874969);
        setField(term87269, term87269.getClass(), "parent", null);
        setElement(term87278, 8, term87269);
        setField(term87235, term87235.getClass(), "visited", term87278);
        setIntField(term87235, term87235.getClass(), "restartIndex", 65417356);
        setIntField(term87235, term87235.getClass(), "maxLevel", 1998186352);
        setBooleanField(term87235, term87235.getClass(), "interrupted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInterrupted", argTypes, term87235, args);
    }

};


