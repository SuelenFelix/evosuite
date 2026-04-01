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

public class Cycle_toString_107376140921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57142;

    public Cycle_toString_107376140921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57142 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        setIntField(term57142, term57142.getClass(), "numEdges", 0);
        setField(term57142, term57142.getClass(), "graph", null);
        setField(term57142, term57142.getClass(), "vertices", null);
        setIntField(term57142, term57142.getClass(), "numVertices", 0);
        setIntField(term57142, term57142.getClass(), "first", 0);
        setField(term57142, term57142.getClass(), "bitset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term57142, args);
    }

};


