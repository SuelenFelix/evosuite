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

public class VertexHeap_verify_62792881719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60348;

    public VertexHeap_verify_62792881719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60348 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60349 = (int[]) newIntArray(0);
        int[] term60350 = (int[]) newIntArray(5);
        setField(term60348, term60348.getClass(), "graph", null);
        setField(term60348, term60348.getClass(), "comparator", null);
        setField(term60348, term60348.getClass(), "keys", term60349);
        setIntElement(term60350, 0, -325309589);
        setIntElement(term60350, 1, 1225997367);
        setIntElement(term60350, 2, 1463513606);
        setIntElement(term60350, 3, -2105056168);
        setIntElement(term60350, 4, 275133293);
        setField(term60348, term60348.getClass(), "positions", term60350);
        setIntField(term60348, term60348.getClass(), "size", 915181151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "verify", argTypes, term60348, args);
    }

};


