package org.graph4j.clique;

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
import static org.graph4j.clique.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class BFSCliqueIterator_next_12627796123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;

    public BFSCliqueIterator_next_12627796123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term409 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator$Node"));
        Object term410 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term413 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term410, term410.getClass(), "posMap", null);
        setField(term410, term410.getClass(), "graph", null);
        setField(term410, term410.getClass(), "vertices", null);
        setIntField(term410, term410.getClass(), "numVertices", 534834644);
        setIntField(term410, term410.getClass(), "first", 1959097203);
        setField(term410, term410.getClass(), "bitset", null);
        setField(term409, term409.getClass(), "clique", term410);
        setField(term413, term413.getClass(), "posMap", null);
        setField(term413, term413.getClass(), "graph", null);
        setField(term413, term413.getClass(), "vertices", null);
        setIntField(term413, term413.getClass(), "numVertices", -282881827);
        setIntField(term413, term413.getClass(), "first", -1183353915);
        setField(term413, term413.getClass(), "bitset", null);
        setField(term409, term409.getClass(), "cand", term413);
        setField(term409, term409.getClass(), "this$0", null);
        Object term417 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator$Node"));
        setField(term417, term417.getClass(), "clique", null);
        setField(term417, term417.getClass(), "cand", null);
        setField(term417, term417.getClass(), "this$0", null);
        LinkedList term406 = new LinkedList();
        ((LinkedList) term406).add(term409);
        ((LinkedList) term406).add(term417);
        ((LinkedList) term406).add((Object)null);
        ((LinkedList) term406).add((Object)null);
        ((LinkedList) term406).add((Object)null);
        ((LinkedList) term406).add((Object)null);
        term403 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator"));
        Object term431 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term432 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term433 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setIntField(term403, term403.getClass(), "minSize", -1111249833);
        setIntField(term403, term403.getClass(), "maxSize", -1692331299);
        setField(term403, term403.getClass(), "queue", term406);
        setField(term432, term432.getClass(), "table", term433);
        setIntField(term432, term432.getClass(), "count", 0);
        setIntField(term432, term432.getClass(), "threshold", 15);
        setFloatField(term432, term432.getClass(), "loadFactor", 0.75F);
        setField(term431, term431.getClass(), "posMap", term432);
        setField(term431, term431.getClass(), "graph", null);
        setField(term431, term431.getClass(), "vertices", null);
        setIntField(term431, term431.getClass(), "numVertices", 0);
        setIntField(term431, term431.getClass(), "first", 0);
        setField(term431, term431.getClass(), "bitset", null);
        setField(term403, term403.getClass(), "currentClique", term431);
        setField(term403, term403.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BFSCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term403, args);
    }

};


