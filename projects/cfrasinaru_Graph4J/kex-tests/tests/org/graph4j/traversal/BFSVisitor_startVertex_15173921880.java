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

public class BFSVisitor_startVertex_15173921880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1109;

    public BFSVisitor_startVertex_15173921880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1109 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1114 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1119 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1124 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1129 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1109, term1109.getClass(), "component", 1973060703);
        setIntField(term1109, term1109.getClass(), "vertex", -138239905);
        setIntField(term1109, term1109.getClass(), "level", 1709474063);
        setIntField(term1109, term1109.getClass(), "order", 1406617209);
        setIntField(term1114, term1114.getClass(), "component", 1706047059);
        setIntField(term1114, term1114.getClass(), "vertex", 590451710);
        setIntField(term1114, term1114.getClass(), "level", -1999787419);
        setIntField(term1114, term1114.getClass(), "order", -1224443634);
        setIntField(term1119, term1119.getClass(), "component", 1048451946);
        setIntField(term1119, term1119.getClass(), "vertex", 5603560);
        setIntField(term1119, term1119.getClass(), "level", -1079020032);
        setIntField(term1119, term1119.getClass(), "order", -1973791064);
        setIntField(term1124, term1124.getClass(), "component", -2072158633);
        setIntField(term1124, term1124.getClass(), "vertex", -355469363);
        setIntField(term1124, term1124.getClass(), "level", 1465188553);
        setIntField(term1124, term1124.getClass(), "order", 1633913667);
        setIntField(term1129, term1129.getClass(), "component", 1292332296);
        setIntField(term1129, term1129.getClass(), "vertex", -1415256843);
        setIntField(term1129, term1129.getClass(), "level", 612177768);
        setIntField(term1129, term1129.getClass(), "order", -1626451656);
        setField(term1129, term1129.getClass(), "parent", null);
        setField(term1124, term1124.getClass(), "parent", term1129);
        setField(term1119, term1119.getClass(), "parent", term1124);
        setField(term1114, term1114.getClass(), "parent", term1119);
        setField(term1109, term1109.getClass(), "parent", term1114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term1109;
        callMethod(klass, "startVertex", argTypes, null, args);
    }

};


