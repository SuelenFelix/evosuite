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

public class DFSVisitor_finishVertex_1567714651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147651;

    public DFSVisitor_finishVertex_1567714651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147651 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147656 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147661 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147666 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147671 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147651, term147651.getClass(), "component", 1180105702);
        setIntField(term147651, term147651.getClass(), "vertex", -1878381412);
        setIntField(term147651, term147651.getClass(), "level", -34121525);
        setIntField(term147651, term147651.getClass(), "order", -1065997660);
        setIntField(term147656, term147656.getClass(), "component", 271210168);
        setIntField(term147656, term147656.getClass(), "vertex", 265269699);
        setIntField(term147656, term147656.getClass(), "level", 1561132977);
        setIntField(term147656, term147656.getClass(), "order", 1473482271);
        setIntField(term147661, term147661.getClass(), "component", 1786791150);
        setIntField(term147661, term147661.getClass(), "vertex", 552395732);
        setIntField(term147661, term147661.getClass(), "level", -1146717028);
        setIntField(term147661, term147661.getClass(), "order", 211945894);
        setIntField(term147666, term147666.getClass(), "component", 1880187411);
        setIntField(term147666, term147666.getClass(), "vertex", 211894515);
        setIntField(term147666, term147666.getClass(), "level", 38698331);
        setIntField(term147666, term147666.getClass(), "order", -815569924);
        setIntField(term147671, term147671.getClass(), "component", -770402311);
        setIntField(term147671, term147671.getClass(), "vertex", -1689228293);
        setIntField(term147671, term147671.getClass(), "level", -1629181877);
        setIntField(term147671, term147671.getClass(), "order", -822914387);
        setField(term147671, term147671.getClass(), "parent", null);
        setField(term147666, term147666.getClass(), "parent", term147671);
        setField(term147661, term147661.getClass(), "parent", term147666);
        setField(term147656, term147656.getClass(), "parent", term147661);
        setField(term147651, term147651.getClass(), "parent", term147656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term147651;
        callMethod(klass, "finishVertex", argTypes, null, args);
    }

};


