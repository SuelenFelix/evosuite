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

public class VertexHeap_size_17203867132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59920;

    public VertexHeap_size_17203867132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59920 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term59921 = (int[]) newIntArray(3);
        int[] term59925 = (int[]) newIntArray(6);
        setField(term59920, term59920.getClass(), "graph", null);
        setField(term59920, term59920.getClass(), "comparator", null);
        setIntElement(term59921, 0, -1608554992);
        setIntElement(term59921, 1, -174955872);
        setIntElement(term59921, 2, 1429537897);
        setField(term59920, term59920.getClass(), "keys", term59921);
        setIntElement(term59925, 0, 216290703);
        setIntElement(term59925, 1, -294229148);
        setIntElement(term59925, 2, -1249763145);
        setIntElement(term59925, 3, -1872599962);
        setIntElement(term59925, 4, 1889574494);
        setIntElement(term59925, 5, -687378216);
        setField(term59920, term59920.getClass(), "positions", term59925);
        setIntField(term59920, term59920.getClass(), "size", -1552077299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term59920, args);
    }

};


