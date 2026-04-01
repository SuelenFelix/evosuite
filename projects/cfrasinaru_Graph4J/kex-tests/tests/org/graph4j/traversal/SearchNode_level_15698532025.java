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
     Object term143272;

    public SearchNode_level_15698532025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143272 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143277 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143282 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143287 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143292 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143272, term143272.getClass(), "component", -1274894318);
        setIntField(term143272, term143272.getClass(), "vertex", 187784395);
        setIntField(term143272, term143272.getClass(), "level", -117079751);
        setIntField(term143272, term143272.getClass(), "order", -686894445);
        setIntField(term143277, term143277.getClass(), "component", 1892785074);
        setIntField(term143277, term143277.getClass(), "vertex", 1574277346);
        setIntField(term143277, term143277.getClass(), "level", -803619709);
        setIntField(term143277, term143277.getClass(), "order", 1387125533);
        setIntField(term143282, term143282.getClass(), "component", 1717132325);
        setIntField(term143282, term143282.getClass(), "vertex", -1664418040);
        setIntField(term143282, term143282.getClass(), "level", -1763865422);
        setIntField(term143282, term143282.getClass(), "order", -1598113184);
        setIntField(term143287, term143287.getClass(), "component", -261802681);
        setIntField(term143287, term143287.getClass(), "vertex", 233958480);
        setIntField(term143287, term143287.getClass(), "level", -1601755015);
        setIntField(term143287, term143287.getClass(), "order", 725616272);
        setIntField(term143292, term143292.getClass(), "component", 53350929);
        setIntField(term143292, term143292.getClass(), "vertex", -2043704531);
        setIntField(term143292, term143292.getClass(), "level", -36554639);
        setIntField(term143292, term143292.getClass(), "order", -1678540985);
        setField(term143292, term143292.getClass(), "parent", null);
        setField(term143287, term143287.getClass(), "parent", term143292);
        setField(term143282, term143282.getClass(), "parent", term143287);
        setField(term143277, term143277.getClass(), "parent", term143282);
        setField(term143272, term143272.getClass(), "parent", term143277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "level", argTypes, term143272, args);
    }

};


