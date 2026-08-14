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
     Object term3086;

    public DFSVisitor_finishVertex_1567714651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3086 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3091 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3096 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3101 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3106 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3086, term3086.getClass(), "component", 2063577636);
        setIntField(term3086, term3086.getClass(), "vertex", 1680632578);
        setIntField(term3086, term3086.getClass(), "level", 511399994);
        setIntField(term3086, term3086.getClass(), "order", 2094923086);
        setIntField(term3091, term3091.getClass(), "component", 1532355365);
        setIntField(term3091, term3091.getClass(), "vertex", -156316508);
        setIntField(term3091, term3091.getClass(), "level", -1304449497);
        setIntField(term3091, term3091.getClass(), "order", -80320412);
        setIntField(term3096, term3096.getClass(), "component", -356797136);
        setIntField(term3096, term3096.getClass(), "vertex", -2035641970);
        setIntField(term3096, term3096.getClass(), "level", 1813581230);
        setIntField(term3096, term3096.getClass(), "order", 844569461);
        setIntField(term3101, term3101.getClass(), "component", -15085966);
        setIntField(term3101, term3101.getClass(), "vertex", -1929631412);
        setIntField(term3101, term3101.getClass(), "level", 1014160441);
        setIntField(term3101, term3101.getClass(), "order", 975753484);
        setIntField(term3106, term3106.getClass(), "component", -1886360357);
        setIntField(term3106, term3106.getClass(), "vertex", -235867268);
        setIntField(term3106, term3106.getClass(), "level", -972330704);
        setIntField(term3106, term3106.getClass(), "order", 134173297);
        setField(term3106, term3106.getClass(), "parent", null);
        setField(term3101, term3101.getClass(), "parent", term3106);
        setField(term3096, term3096.getClass(), "parent", term3101);
        setField(term3091, term3091.getClass(), "parent", term3096);
        setField(term3086, term3086.getClass(), "parent", term3091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term3086;
        callMethod(klass, "finishVertex", argTypes, null, args);
    }

};


