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

public class SearchNode_parent_7839581217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143322;

    public SearchNode_parent_7839581217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143322 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143327 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143332 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143337 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143342 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143322, term143322.getClass(), "component", 1234533117);
        setIntField(term143322, term143322.getClass(), "vertex", -92642794);
        setIntField(term143322, term143322.getClass(), "level", -22703725);
        setIntField(term143322, term143322.getClass(), "order", -793446662);
        setIntField(term143327, term143327.getClass(), "component", 1764254206);
        setIntField(term143327, term143327.getClass(), "vertex", 710079737);
        setIntField(term143327, term143327.getClass(), "level", -484292966);
        setIntField(term143327, term143327.getClass(), "order", -2036519048);
        setIntField(term143332, term143332.getClass(), "component", -1798943992);
        setIntField(term143332, term143332.getClass(), "vertex", -742525462);
        setIntField(term143332, term143332.getClass(), "level", -1095204117);
        setIntField(term143332, term143332.getClass(), "order", 369333076);
        setIntField(term143337, term143337.getClass(), "component", -1281180404);
        setIntField(term143337, term143337.getClass(), "vertex", -361910291);
        setIntField(term143337, term143337.getClass(), "level", 277711577);
        setIntField(term143337, term143337.getClass(), "order", 380015263);
        setIntField(term143342, term143342.getClass(), "component", -1804903831);
        setIntField(term143342, term143342.getClass(), "vertex", -891672199);
        setIntField(term143342, term143342.getClass(), "level", -599379607);
        setIntField(term143342, term143342.getClass(), "order", -1104614567);
        setField(term143342, term143342.getClass(), "parent", null);
        setField(term143337, term143337.getClass(), "parent", term143342);
        setField(term143332, term143332.getClass(), "parent", term143337);
        setField(term143327, term143327.getClass(), "parent", term143332);
        setField(term143322, term143322.getClass(), "parent", term143327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parent", argTypes, term143322, args);
    }

};


