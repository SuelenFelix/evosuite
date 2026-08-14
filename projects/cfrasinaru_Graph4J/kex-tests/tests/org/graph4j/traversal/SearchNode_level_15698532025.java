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

public class SearchNode_level_15698532025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2748;

    public SearchNode_level_15698532025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2748 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2753 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2758 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2763 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2768 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2748, term2748.getClass(), "component", -1640361091);
        setIntField(term2748, term2748.getClass(), "vertex", -1908164516);
        setIntField(term2748, term2748.getClass(), "level", -1343269854);
        setIntField(term2748, term2748.getClass(), "order", -731459309);
        setIntField(term2753, term2753.getClass(), "component", -913468095);
        setIntField(term2753, term2753.getClass(), "vertex", 38489871);
        setIntField(term2753, term2753.getClass(), "level", -1667787735);
        setIntField(term2753, term2753.getClass(), "order", 1841765799);
        setIntField(term2758, term2758.getClass(), "component", 72160200);
        setIntField(term2758, term2758.getClass(), "vertex", -1870567623);
        setIntField(term2758, term2758.getClass(), "level", -1442923471);
        setIntField(term2758, term2758.getClass(), "order", -434247549);
        setIntField(term2763, term2763.getClass(), "component", 1246505552);
        setIntField(term2763, term2763.getClass(), "vertex", -1456497810);
        setIntField(term2763, term2763.getClass(), "level", 61954667);
        setIntField(term2763, term2763.getClass(), "order", -919022885);
        setIntField(term2768, term2768.getClass(), "component", -1836286878);
        setIntField(term2768, term2768.getClass(), "vertex", 276336694);
        setIntField(term2768, term2768.getClass(), "level", 1627938506);
        setIntField(term2768, term2768.getClass(), "order", 386284750);
        setField(term2768, term2768.getClass(), "parent", null);
        setField(term2763, term2763.getClass(), "parent", term2768);
        setField(term2758, term2758.getClass(), "parent", term2763);
        setField(term2753, term2753.getClass(), "parent", term2758);
        setField(term2748, term2748.getClass(), "parent", term2753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "level", argTypes, term2748, args);
    }

};


