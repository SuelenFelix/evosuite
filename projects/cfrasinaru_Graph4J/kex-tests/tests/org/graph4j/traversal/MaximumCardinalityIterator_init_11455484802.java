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

public class MaximumCardinalityIterator_init_11455484802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141960;

    public MaximumCardinalityIterator_init_11455484802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141960 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        boolean[] term141962 = (boolean[]) newBooleanArray(4);
        Object term141967 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term141968 = (int[]) newIntArray(3);
        int[] term141972 = (int[]) newIntArray(4);
        int[] term141978 = (int[]) newIntArray(2);
        setField(term141960, term141960.getClass(), "graph", null);
        setIntField(term141960, term141960.getClass(), "startVertex", -1546659110);
        setBooleanElement(term141962, 0, true);
        setBooleanElement(term141962, 2, true);
        setField(term141960, term141960.getClass(), "visited", term141962);
        setField(term141967, term141967.getClass(), "graph", null);
        setField(term141967, term141967.getClass(), "comparator", null);
        setIntElement(term141968, 0, -1476543965);
        setIntElement(term141968, 1, -71727372);
        setIntElement(term141968, 2, 747994133);
        setField(term141967, term141967.getClass(), "keys", term141968);
        setIntElement(term141972, 0, 1847207096);
        setIntElement(term141972, 1, -1911892286);
        setIntElement(term141972, 2, 763022141);
        setIntElement(term141972, 3, -1569221794);
        setField(term141967, term141967.getClass(), "positions", term141972);
        setIntField(term141967, term141967.getClass(), "size", 2113009425);
        setField(term141960, term141960.getClass(), "heap", term141967);
        setIntElement(term141978, 0, -1009736585);
        setIntElement(term141978, 1, 67570822);
        setField(term141960, term141960.getClass(), "count", term141978);
        setIntField(term141960, term141960.getClass(), "numIterations", 891421952);
        setIntField(term141960, term141960.getClass(), "currentVertex", -532312548);
        setIntField(term141960, term141960.getClass(), "currentVertexId", -1299216105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term141960, args);
    }

};


