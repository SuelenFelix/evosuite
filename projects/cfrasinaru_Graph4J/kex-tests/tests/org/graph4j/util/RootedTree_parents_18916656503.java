package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class RootedTree_parents_18916656503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118855;

    public RootedTree_parents_18916656503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term118867 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term118868 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term118872 = (int[]) newIntArray(4);
        Object term118879 = newInstance(Class.forName("java.util.BitSet"));
        setField(term118868, term118868.getClass(), "table", null);
        setIntField(term118868, term118868.getClass(), "count", -1681460075);
        setIntField(term118868, term118868.getClass(), "threshold", 15);
        setFloatField(term118868, term118868.getClass(), "loadFactor", 0.75F);
        setField(term118867, term118867.getClass(), "posMap", term118868);
        setField(term118867, term118867.getClass(), "graph", null);
        setIntElement(term118872, 0, 1623133519);
        setIntElement(term118872, 1, 1251734144);
        setIntElement(term118872, 2, 1251301670);
        setIntElement(term118872, 3, 1800213126);
        setField(term118867, term118867.getClass(), "vertices", term118872);
        setIntField(term118867, term118867.getClass(), "numVertices", 2049234328);
        setIntField(term118867, term118867.getClass(), "first", 901194728);
        setField(term118879, term118879.getClass(), "words", null);
        setIntField(term118879, term118879.getClass(), "wordsInUse", 1866086190);
        setBooleanField(term118879, term118879.getClass(), "sizeIsSticky", true);
        setField(term118867, term118867.getClass(), "bitset", term118879);
        ArrayList term118865 = new ArrayList();
        ((ArrayList) term118865).add(term118867);
        term118855 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term118857 = (int[]) newIntArray(7);
        setField(term118855, term118855.getClass(), "tree", null);
        setIntField(term118855, term118855.getClass(), "root", -301566658);
        setIntElement(term118857, 0, 1198050750);
        setIntElement(term118857, 1, -1763850463);
        setIntElement(term118857, 2, 1933564179);
        setIntElement(term118857, 3, -1342711508);
        setIntElement(term118857, 4, 156889890);
        setIntElement(term118857, 5, -1894814727);
        setIntElement(term118857, 6, 2117828951);
        setField(term118855, term118855.getClass(), "parents", term118857);
        setField(term118855, term118855.getClass(), "levels", term118865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parents", argTypes, term118855, args);
    }

};


