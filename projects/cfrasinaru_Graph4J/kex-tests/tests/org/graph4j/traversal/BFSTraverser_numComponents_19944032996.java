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

public class BFSTraverser_numComponents_19944032996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87170;

    public BFSTraverser_numComponents_19944032996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87175 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87180 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87175, term87175.getClass(), "component", -1439310082);
        setIntField(term87175, term87175.getClass(), "vertex", 312293379);
        setIntField(term87175, term87175.getClass(), "level", 241022625);
        setIntField(term87175, term87175.getClass(), "order", 25543628);
        setIntField(term87180, term87180.getClass(), "component", 88927707);
        setIntField(term87180, term87180.getClass(), "vertex", 573060356);
        setIntField(term87180, term87180.getClass(), "level", 1701020279);
        setIntField(term87180, term87180.getClass(), "order", 1578074399);
        setField(term87180, term87180.getClass(), "parent", null);
        setField(term87175, term87175.getClass(), "parent", term87180);
        Object term87186 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87186, term87186.getClass(), "component", -729574845);
        setIntField(term87186, term87186.getClass(), "vertex", -1849590708);
        setIntField(term87186, term87186.getClass(), "level", 2121883333);
        setIntField(term87186, term87186.getClass(), "order", -794025316);
        setField(term87186, term87186.getClass(), "parent", null);
        LinkedList term87172 = new LinkedList();
        ((LinkedList) term87172).add(term87175);
        ((LinkedList) term87172).add(term87186);
        term87170 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term87194 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 2);
        setField(term87170, term87170.getClass(), "graph", null);
        setBooleanField(term87170, term87170.getClass(), "directed", true);
        setField(term87170, term87170.getClass(), "visitor", null);
        setField(term87170, term87170.getClass(), "queue", term87172);
        setIntField(term87170, term87170.getClass(), "orderIndex", -585428898);
        setIntField(term87170, term87170.getClass(), "compIndex", -832361153);
        setElement(term87194, 0, term87186);
        setElement(term87194, 1, term87175);
        setField(term87170, term87170.getClass(), "visited", term87194);
        setIntField(term87170, term87170.getClass(), "restartIndex", 544931629);
        setIntField(term87170, term87170.getClass(), "maxLevel", -1187175631);
        setBooleanField(term87170, term87170.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numComponents", argTypes, term87170, args);
    }

};


