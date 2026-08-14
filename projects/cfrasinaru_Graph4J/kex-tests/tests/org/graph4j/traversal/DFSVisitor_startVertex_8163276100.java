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

public class DFSVisitor_startVertex_8163276100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3061;

    public DFSVisitor_startVertex_8163276100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3061 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3066 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3071 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3076 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3081 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3061, term3061.getClass(), "component", 2087429143);
        setIntField(term3061, term3061.getClass(), "vertex", -1892890104);
        setIntField(term3061, term3061.getClass(), "level", 2003356558);
        setIntField(term3061, term3061.getClass(), "order", -638126185);
        setIntField(term3066, term3066.getClass(), "component", 28070985);
        setIntField(term3066, term3066.getClass(), "vertex", 334110739);
        setIntField(term3066, term3066.getClass(), "level", -1724529322);
        setIntField(term3066, term3066.getClass(), "order", 1843465187);
        setIntField(term3071, term3071.getClass(), "component", 529595969);
        setIntField(term3071, term3071.getClass(), "vertex", -1548733886);
        setIntField(term3071, term3071.getClass(), "level", 1543539715);
        setIntField(term3071, term3071.getClass(), "order", 1744599521);
        setIntField(term3076, term3076.getClass(), "component", -985141153);
        setIntField(term3076, term3076.getClass(), "vertex", -1983740361);
        setIntField(term3076, term3076.getClass(), "level", -1494716341);
        setIntField(term3076, term3076.getClass(), "order", 816237851);
        setIntField(term3081, term3081.getClass(), "component", -604114341);
        setIntField(term3081, term3081.getClass(), "vertex", 1146236760);
        setIntField(term3081, term3081.getClass(), "level", 985801789);
        setIntField(term3081, term3081.getClass(), "order", -1628536749);
        setField(term3081, term3081.getClass(), "parent", null);
        setField(term3076, term3076.getClass(), "parent", term3081);
        setField(term3071, term3071.getClass(), "parent", term3076);
        setField(term3066, term3066.getClass(), "parent", term3071);
        setField(term3061, term3061.getClass(), "parent", term3066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term3061;
        callMethod(klass, "startVertex", argTypes, null, args);
    }

};


