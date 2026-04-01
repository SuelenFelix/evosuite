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

public class VertexHeap_isEmpty_4186967633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59942;

    public VertexHeap_isEmpty_4186967633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59942 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term59943 = (int[]) newIntArray(0);
        int[] term59944 = (int[]) newIntArray(7);
        setField(term59942, term59942.getClass(), "graph", null);
        setField(term59942, term59942.getClass(), "comparator", null);
        setField(term59942, term59942.getClass(), "keys", term59943);
        setIntElement(term59944, 0, 2020615916);
        setIntElement(term59944, 1, -542896303);
        setIntElement(term59944, 2, 1175522239);
        setIntElement(term59944, 3, -1316810397);
        setIntElement(term59944, 4, -904376067);
        setIntElement(term59944, 5, 1501300402);
        setIntElement(term59944, 6, -1415123866);
        setField(term59942, term59942.getClass(), "positions", term59944);
        setIntField(term59942, term59942.getClass(), "size", -840575313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term59942, args);
    }

};


