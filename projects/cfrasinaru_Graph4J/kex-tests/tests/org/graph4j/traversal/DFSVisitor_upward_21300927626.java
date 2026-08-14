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

public class DFSVisitor_upward_21300927626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3311;
     Object term3336;

    public DFSVisitor_upward_21300927626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3311 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3316 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3321 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3326 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3331 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3311, term3311.getClass(), "component", 1892947629);
        setIntField(term3311, term3311.getClass(), "vertex", -1350968212);
        setIntField(term3311, term3311.getClass(), "level", 2027049805);
        setIntField(term3311, term3311.getClass(), "order", 1777210338);
        setIntField(term3316, term3316.getClass(), "component", 1406833110);
        setIntField(term3316, term3316.getClass(), "vertex", 971309393);
        setIntField(term3316, term3316.getClass(), "level", 1506905403);
        setIntField(term3316, term3316.getClass(), "order", 1022586170);
        setIntField(term3321, term3321.getClass(), "component", -175612916);
        setIntField(term3321, term3321.getClass(), "vertex", -1966814722);
        setIntField(term3321, term3321.getClass(), "level", -2040048430);
        setIntField(term3321, term3321.getClass(), "order", 795243460);
        setIntField(term3326, term3326.getClass(), "component", 1116550927);
        setIntField(term3326, term3326.getClass(), "vertex", -1500511650);
        setIntField(term3326, term3326.getClass(), "level", 1722619795);
        setIntField(term3326, term3326.getClass(), "order", 558598813);
        setIntField(term3331, term3331.getClass(), "component", -282356982);
        setIntField(term3331, term3331.getClass(), "vertex", 1060240374);
        setIntField(term3331, term3331.getClass(), "level", 2119043046);
        setIntField(term3331, term3331.getClass(), "order", 375507053);
        setField(term3331, term3331.getClass(), "parent", null);
        setField(term3326, term3326.getClass(), "parent", term3331);
        setField(term3321, term3321.getClass(), "parent", term3326);
        setField(term3316, term3316.getClass(), "parent", term3321);
        setField(term3311, term3311.getClass(), "parent", term3316);
        term3336 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3341 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3346 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3351 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3356 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3336, term3336.getClass(), "component", 1307887729);
        setIntField(term3336, term3336.getClass(), "vertex", 1628336669);
        setIntField(term3336, term3336.getClass(), "level", 466807421);
        setIntField(term3336, term3336.getClass(), "order", -407675703);
        setIntField(term3341, term3341.getClass(), "component", -429960516);
        setIntField(term3341, term3341.getClass(), "vertex", -630727180);
        setIntField(term3341, term3341.getClass(), "level", -1234361060);
        setIntField(term3341, term3341.getClass(), "order", -267520884);
        setIntField(term3346, term3346.getClass(), "component", 1431716083);
        setIntField(term3346, term3346.getClass(), "vertex", 1540004680);
        setIntField(term3346, term3346.getClass(), "level", -594861500);
        setIntField(term3346, term3346.getClass(), "order", 1731562923);
        setIntField(term3351, term3351.getClass(), "component", 33467458);
        setIntField(term3351, term3351.getClass(), "vertex", 1729034001);
        setIntField(term3351, term3351.getClass(), "level", 1094810824);
        setIntField(term3351, term3351.getClass(), "order", -1746471324);
        setIntField(term3356, term3356.getClass(), "component", 844485803);
        setIntField(term3356, term3356.getClass(), "vertex", -1373407191);
        setIntField(term3356, term3356.getClass(), "level", 1013516042);
        setIntField(term3356, term3356.getClass(), "order", 284652039);
        setField(term3356, term3356.getClass(), "parent", null);
        setField(term3351, term3351.getClass(), "parent", term3356);
        setField(term3346, term3346.getClass(), "parent", term3351);
        setField(term3341, term3341.getClass(), "parent", term3346);
        setField(term3336, term3336.getClass(), "parent", term3341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term3311;
        args[1] = term3336;
        callMethod(klass, "upward", argTypes, null, args);
    }

};


