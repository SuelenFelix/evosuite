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

public class BFSTraverser_traverse_1722648732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86997;

    public BFSTraverser_traverse_1722648732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87002 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87007 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87002, term87002.getClass(), "component", -283724340);
        setIntField(term87002, term87002.getClass(), "vertex", 146472146);
        setIntField(term87002, term87002.getClass(), "level", -1390379615);
        setIntField(term87002, term87002.getClass(), "order", 1515664005);
        setIntField(term87007, term87007.getClass(), "component", 249348540);
        setIntField(term87007, term87007.getClass(), "vertex", -955604562);
        setIntField(term87007, term87007.getClass(), "level", -1428865659);
        setIntField(term87007, term87007.getClass(), "order", -1810911724);
        setField(term87007, term87007.getClass(), "parent", null);
        setField(term87002, term87002.getClass(), "parent", term87007);
        Object term87013 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term87013, term87013.getClass(), "component", 1637065629);
        setIntField(term87013, term87013.getClass(), "vertex", 1466957213);
        setIntField(term87013, term87013.getClass(), "level", -2036201838);
        setIntField(term87013, term87013.getClass(), "order", 1407642731);
        setField(term87013, term87013.getClass(), "parent", null);
        LinkedList term86999 = new LinkedList();
        ((LinkedList) term86999).add(term87002);
        ((LinkedList) term86999).add(term87013);
        ((LinkedList) term86999).add(term87013);
        ((LinkedList) term86999).add((Object)null);
        ((LinkedList) term86999).add((Object)null);
        term86997 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term87034 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 7);
        Object term87035 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87040 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87020 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87025 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87045 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term87050 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term86997, term86997.getClass(), "graph", null);
        setBooleanField(term86997, term86997.getClass(), "directed", true);
        setField(term86997, term86997.getClass(), "visitor", null);
        setField(term86997, term86997.getClass(), "queue", term86999);
        setIntField(term86997, term86997.getClass(), "orderIndex", -2087614374);
        setIntField(term86997, term86997.getClass(), "compIndex", -429008252);
        setIntField(term87035, term87035.getClass(), "component", 110078308);
        setIntField(term87035, term87035.getClass(), "vertex", -1029567193);
        setIntField(term87035, term87035.getClass(), "level", 885045600);
        setIntField(term87035, term87035.getClass(), "order", -628958232);
        setIntField(term87040, term87040.getClass(), "component", 261473208);
        setIntField(term87040, term87040.getClass(), "vertex", 148074135);
        setIntField(term87040, term87040.getClass(), "level", -94684581);
        setIntField(term87040, term87040.getClass(), "order", 1046822921);
        setIntField(term87020, term87020.getClass(), "component", 295036576);
        setIntField(term87020, term87020.getClass(), "vertex", 551089243);
        setIntField(term87020, term87020.getClass(), "level", 308804697);
        setIntField(term87020, term87020.getClass(), "order", -1905953902);
        setIntField(term87025, term87025.getClass(), "component", -1303343959);
        setIntField(term87025, term87025.getClass(), "vertex", 1093139582);
        setIntField(term87025, term87025.getClass(), "level", -1533393409);
        setIntField(term87025, term87025.getClass(), "order", 716498836);
        setField(term87025, term87025.getClass(), "parent", null);
        setField(term87020, term87020.getClass(), "parent", term87025);
        setField(term87040, term87040.getClass(), "parent", term87020);
        setField(term87035, term87035.getClass(), "parent", term87040);
        setElement(term87034, 0, term87035);
        setElement(term87034, 1, term87007);
        setElement(term87034, 2, term87007);
        setIntField(term87045, term87045.getClass(), "component", -14910696);
        setIntField(term87045, term87045.getClass(), "vertex", -292154386);
        setIntField(term87045, term87045.getClass(), "level", -1599571798);
        setIntField(term87045, term87045.getClass(), "order", 69185638);
        setIntField(term87050, term87050.getClass(), "component", 0);
        setIntField(term87050, term87050.getClass(), "vertex", 0);
        setIntField(term87050, term87050.getClass(), "level", 0);
        setIntField(term87050, term87050.getClass(), "order", 0);
        setField(term87050, term87050.getClass(), "parent", null);
        setField(term87045, term87045.getClass(), "parent", term87050);
        setElement(term87034, 3, term87045);
        setElement(term87034, 4, term87050);
        setElement(term87034, 5, term87050);
        setElement(term87034, 6, term87040);
        setField(term86997, term86997.getClass(), "visited", term87034);
        setIntField(term86997, term86997.getClass(), "restartIndex", 2095561765);
        setIntField(term86997, term86997.getClass(), "maxLevel", -874380115);
        setBooleanField(term86997, term86997.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.BFSVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "traverse", argTypes, term86997, args);
    }

};


