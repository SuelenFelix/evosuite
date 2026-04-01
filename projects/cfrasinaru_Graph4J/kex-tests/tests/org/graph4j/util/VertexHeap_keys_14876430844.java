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

public class VertexHeap_keys_14876430844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59960;

    public VertexHeap_keys_14876430844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59960 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term59961 = (int[]) newIntArray(5);
        int[] term59967 = (int[]) newIntArray(2);
        setField(term59960, term59960.getClass(), "graph", null);
        setField(term59960, term59960.getClass(), "comparator", null);
        setIntElement(term59961, 0, 1369614831);
        setIntElement(term59961, 1, -1862630065);
        setIntElement(term59961, 2, 376483156);
        setIntElement(term59961, 3, -1083218160);
        setIntElement(term59961, 4, -524261809);
        setField(term59960, term59960.getClass(), "keys", term59961);
        setIntElement(term59967, 0, 947308944);
        setIntElement(term59967, 1, 82825939);
        setField(term59960, term59960.getClass(), "positions", term59967);
        setIntField(term59960, term59960.getClass(), "size", 695200763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keys", argTypes, term59960, args);
    }

};


