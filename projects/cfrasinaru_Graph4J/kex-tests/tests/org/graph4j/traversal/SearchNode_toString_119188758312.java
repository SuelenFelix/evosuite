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

public class SearchNode_toString_119188758312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143498;

    public SearchNode_toString_119188758312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143498 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143503 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143508 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143513 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143518 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143498, term143498.getClass(), "component", 124913849);
        setIntField(term143498, term143498.getClass(), "vertex", 547342897);
        setIntField(term143498, term143498.getClass(), "level", -593026116);
        setIntField(term143498, term143498.getClass(), "order", 678975706);
        setIntField(term143503, term143503.getClass(), "component", -967235351);
        setIntField(term143503, term143503.getClass(), "vertex", -152533751);
        setIntField(term143503, term143503.getClass(), "level", -2007780750);
        setIntField(term143503, term143503.getClass(), "order", 1221975918);
        setIntField(term143508, term143508.getClass(), "component", 513493935);
        setIntField(term143508, term143508.getClass(), "vertex", -1767161654);
        setIntField(term143508, term143508.getClass(), "level", 82348663);
        setIntField(term143508, term143508.getClass(), "order", 997084638);
        setIntField(term143513, term143513.getClass(), "component", -291591105);
        setIntField(term143513, term143513.getClass(), "vertex", 998629722);
        setIntField(term143513, term143513.getClass(), "level", -688820743);
        setIntField(term143513, term143513.getClass(), "order", -1763005304);
        setIntField(term143518, term143518.getClass(), "component", 773141457);
        setIntField(term143518, term143518.getClass(), "vertex", -34864949);
        setIntField(term143518, term143518.getClass(), "level", 2133376564);
        setIntField(term143518, term143518.getClass(), "order", 791762740);
        setField(term143518, term143518.getClass(), "parent", null);
        setField(term143513, term143513.getClass(), "parent", term143518);
        setField(term143508, term143508.getClass(), "parent", term143513);
        setField(term143503, term143503.getClass(), "parent", term143508);
        setField(term143498, term143498.getClass(), "parent", term143503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term143498, args);
    }

};


