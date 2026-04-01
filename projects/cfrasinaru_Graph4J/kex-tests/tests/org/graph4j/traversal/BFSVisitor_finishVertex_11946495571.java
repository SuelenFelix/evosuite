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
import java.lang.Boolean;

public class BFSVisitor_finishVertex_11946495571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105697;
     Object term105722;

    public BFSVisitor_finishVertex_11946495571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105697 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105702 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105707 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105712 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105717 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term105697, term105697.getClass(), "component", -1694934458);
        setIntField(term105697, term105697.getClass(), "vertex", 92989858);
        setIntField(term105697, term105697.getClass(), "level", -2117162462);
        setIntField(term105697, term105697.getClass(), "order", -2124947990);
        setIntField(term105702, term105702.getClass(), "component", 614149136);
        setIntField(term105702, term105702.getClass(), "vertex", 1955650621);
        setIntField(term105702, term105702.getClass(), "level", -1524889218);
        setIntField(term105702, term105702.getClass(), "order", 527941185);
        setIntField(term105707, term105707.getClass(), "component", 63598329);
        setIntField(term105707, term105707.getClass(), "vertex", 176783226);
        setIntField(term105707, term105707.getClass(), "level", 834511096);
        setIntField(term105707, term105707.getClass(), "order", 1767514928);
        setIntField(term105712, term105712.getClass(), "component", -103728860);
        setIntField(term105712, term105712.getClass(), "vertex", -1909656924);
        setIntField(term105712, term105712.getClass(), "level", 1706384864);
        setIntField(term105712, term105712.getClass(), "order", 2048935983);
        setIntField(term105717, term105717.getClass(), "component", 1612480984);
        setIntField(term105717, term105717.getClass(), "vertex", 540984053);
        setIntField(term105717, term105717.getClass(), "level", 750186468);
        setIntField(term105717, term105717.getClass(), "order", 1084151894);
        setField(term105717, term105717.getClass(), "parent", null);
        setField(term105712, term105712.getClass(), "parent", term105717);
        setField(term105707, term105707.getClass(), "parent", term105712);
        setField(term105702, term105702.getClass(), "parent", term105707);
        setField(term105697, term105697.getClass(), "parent", term105702);
        term105722 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term105697;
        args[1] = term105722;
        callMethod(klass, "finishVertex", argTypes, null, args);
    }

};


