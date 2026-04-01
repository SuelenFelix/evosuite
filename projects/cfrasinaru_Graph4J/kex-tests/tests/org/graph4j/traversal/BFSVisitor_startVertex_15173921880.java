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
     Object term105672;

    public BFSVisitor_startVertex_15173921880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105672 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105677 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105682 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105687 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105692 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term105672, term105672.getClass(), "component", -2047081294);
        setIntField(term105672, term105672.getClass(), "vertex", 889571984);
        setIntField(term105672, term105672.getClass(), "level", -154928117);
        setIntField(term105672, term105672.getClass(), "order", -110710151);
        setIntField(term105677, term105677.getClass(), "component", 578504241);
        setIntField(term105677, term105677.getClass(), "vertex", 1413016419);
        setIntField(term105677, term105677.getClass(), "level", 1824247809);
        setIntField(term105677, term105677.getClass(), "order", 1919683206);
        setIntField(term105682, term105682.getClass(), "component", -1794675312);
        setIntField(term105682, term105682.getClass(), "vertex", 1894030186);
        setIntField(term105682, term105682.getClass(), "level", 771179779);
        setIntField(term105682, term105682.getClass(), "order", 108189623);
        setIntField(term105687, term105687.getClass(), "component", 318207331);
        setIntField(term105687, term105687.getClass(), "vertex", -702662847);
        setIntField(term105687, term105687.getClass(), "level", 188639727);
        setIntField(term105687, term105687.getClass(), "order", 1955577795);
        setIntField(term105692, term105692.getClass(), "component", -111436038);
        setIntField(term105692, term105692.getClass(), "vertex", -478782674);
        setIntField(term105692, term105692.getClass(), "level", 1085451097);
        setIntField(term105692, term105692.getClass(), "order", 714673274);
        setField(term105692, term105692.getClass(), "parent", null);
        setField(term105687, term105687.getClass(), "parent", term105692);
        setField(term105682, term105682.getClass(), "parent", term105687);
        setField(term105677, term105677.getClass(), "parent", term105682);
        setField(term105672, term105672.getClass(), "parent", term105677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term105672;
        callMethod(klass, "startVertex", argTypes, null, args);
    }

};


