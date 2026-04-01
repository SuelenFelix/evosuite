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
import java.lang.Object;
import java.util.ArrayDeque;

public class DFSTraverser_init_11230286911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110237;

    public DFSTraverser_init_11230286911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term110300 = new ArrayDeque();
        term110237 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        Object[] term110241 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 8);
        Object term110242 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110247 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110252 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110257 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110262 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110267 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110272 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110277 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110282 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110287 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        int[] term110292 = (int[]) newIntArray(6);
        boolean[] term110304 = (boolean[]) newBooleanArray(4);
        setField(term110237, term110237.getClass(), "graph", null);
        setBooleanField(term110237, term110237.getClass(), "directed", false);
        setField(term110237, term110237.getClass(), "visitor", null);
        setIntField(term110237, term110237.getClass(), "orderIndex", 89211811);
        setIntField(term110237, term110237.getClass(), "compIndex", -1025816435);
        setIntField(term110242, term110242.getClass(), "component", -1792616669);
        setIntField(term110242, term110242.getClass(), "vertex", 912810766);
        setIntField(term110242, term110242.getClass(), "level", 1069241403);
        setIntField(term110242, term110242.getClass(), "order", -1576450967);
        setIntField(term110247, term110247.getClass(), "component", 1181782085);
        setIntField(term110247, term110247.getClass(), "vertex", 771057042);
        setIntField(term110247, term110247.getClass(), "level", -2090879041);
        setIntField(term110247, term110247.getClass(), "order", -1539159480);
        setIntField(term110252, term110252.getClass(), "component", 795327405);
        setIntField(term110252, term110252.getClass(), "vertex", 822701990);
        setIntField(term110252, term110252.getClass(), "level", -1022772429);
        setIntField(term110252, term110252.getClass(), "order", 42246672);
        setField(term110252, term110252.getClass(), "parent", null);
        setField(term110247, term110247.getClass(), "parent", term110252);
        setField(term110242, term110242.getClass(), "parent", term110247);
        setElement(term110241, 0, term110242);
        setIntField(term110257, term110257.getClass(), "component", 1477171041);
        setIntField(term110257, term110257.getClass(), "vertex", 91216248);
        setIntField(term110257, term110257.getClass(), "level", 623165698);
        setIntField(term110257, term110257.getClass(), "order", -501370916);
        setIntField(term110262, term110262.getClass(), "component", 1563227237);
        setIntField(term110262, term110262.getClass(), "vertex", -842127329);
        setIntField(term110262, term110262.getClass(), "level", -764787306);
        setIntField(term110262, term110262.getClass(), "order", -105844576);
        setIntField(term110267, term110267.getClass(), "component", 0);
        setIntField(term110267, term110267.getClass(), "vertex", 0);
        setIntField(term110267, term110267.getClass(), "level", 0);
        setIntField(term110267, term110267.getClass(), "order", 0);
        setField(term110267, term110267.getClass(), "parent", null);
        setField(term110262, term110262.getClass(), "parent", term110267);
        setField(term110257, term110257.getClass(), "parent", term110262);
        setElement(term110241, 1, term110257);
        setElement(term110241, 2, term110257);
        setElement(term110241, 3, term110242);
        setIntField(term110272, term110272.getClass(), "component", 297517056);
        setIntField(term110272, term110272.getClass(), "vertex", -491748640);
        setIntField(term110272, term110272.getClass(), "level", -1904941002);
        setIntField(term110272, term110272.getClass(), "order", 1453887508);
        setIntField(term110277, term110277.getClass(), "component", -1527628075);
        setIntField(term110277, term110277.getClass(), "vertex", -113628762);
        setIntField(term110277, term110277.getClass(), "level", 895565502);
        setIntField(term110277, term110277.getClass(), "order", 175406253);
        setField(term110277, term110277.getClass(), "parent", term110267);
        setField(term110272, term110272.getClass(), "parent", term110277);
        setElement(term110241, 4, term110272);
        setIntField(term110282, term110282.getClass(), "component", -8611964);
        setIntField(term110282, term110282.getClass(), "vertex", 1571062758);
        setIntField(term110282, term110282.getClass(), "level", -1628970138);
        setIntField(term110282, term110282.getClass(), "order", -569577294);
        setIntField(term110287, term110287.getClass(), "component", 959919310);
        setIntField(term110287, term110287.getClass(), "vertex", -1680526175);
        setIntField(term110287, term110287.getClass(), "level", -568142234);
        setIntField(term110287, term110287.getClass(), "order", 1782961805);
        setField(term110287, term110287.getClass(), "parent", term110272);
        setField(term110282, term110282.getClass(), "parent", term110287);
        setElement(term110241, 5, term110282);
        setElement(term110241, 6, term110247);
        setElement(term110241, 7, term110247);
        setField(term110237, term110237.getClass(), "visited", term110241);
        setIntElement(term110292, 0, -542844187);
        setIntElement(term110292, 1, -1177667412);
        setIntElement(term110292, 2, 1248769105);
        setIntElement(term110292, 3, 443403037);
        setIntElement(term110292, 4, 361792760);
        setIntElement(term110292, 5, 944201659);
        setField(term110237, term110237.getClass(), "nextPos", term110292);
        setIntField(term110237, term110237.getClass(), "restartIndex", -354873535);
        setField(term110237, term110237.getClass(), "stack", term110300);
        setBooleanElement(term110304, 0, true);
        setBooleanElement(term110304, 3, true);
        setField(term110237, term110237.getClass(), "instack", term110304);
        setBooleanField(term110237, term110237.getClass(), "interrupted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term110237, args);
    }

};


