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
     Object term1134;
     Object term1159;

    public BFSVisitor_finishVertex_11946495571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1134 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1139 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1144 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1149 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1154 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1134, term1134.getClass(), "component", -1793950607);
        setIntField(term1134, term1134.getClass(), "vertex", 1091954101);
        setIntField(term1134, term1134.getClass(), "level", 1895143076);
        setIntField(term1134, term1134.getClass(), "order", 1981860404);
        setIntField(term1139, term1139.getClass(), "component", 732174235);
        setIntField(term1139, term1139.getClass(), "vertex", 470895808);
        setIntField(term1139, term1139.getClass(), "level", 1787325291);
        setIntField(term1139, term1139.getClass(), "order", 1470349147);
        setIntField(term1144, term1144.getClass(), "component", -255317272);
        setIntField(term1144, term1144.getClass(), "vertex", -706253892);
        setIntField(term1144, term1144.getClass(), "level", -1341439819);
        setIntField(term1144, term1144.getClass(), "order", -728760750);
        setIntField(term1149, term1149.getClass(), "component", -1617383807);
        setIntField(term1149, term1149.getClass(), "vertex", -1244386281);
        setIntField(term1149, term1149.getClass(), "level", -885788574);
        setIntField(term1149, term1149.getClass(), "order", -865722613);
        setIntField(term1154, term1154.getClass(), "component", -1551355284);
        setIntField(term1154, term1154.getClass(), "vertex", -1381970335);
        setIntField(term1154, term1154.getClass(), "level", 1213549815);
        setIntField(term1154, term1154.getClass(), "order", -1518419301);
        setField(term1154, term1154.getClass(), "parent", null);
        setField(term1149, term1149.getClass(), "parent", term1154);
        setField(term1144, term1144.getClass(), "parent", term1149);
        setField(term1139, term1139.getClass(), "parent", term1144);
        setField(term1134, term1134.getClass(), "parent", term1139);
        term1159 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1134;
        args[1] = term1159;
        callMethod(klass, "finishVertex", argTypes, null, args);
    }

};


