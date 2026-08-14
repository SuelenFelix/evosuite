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
import java.lang.Object;

public class EdgeArray_weight_185895529318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1956;

    public EdgeArray_weight_185895529318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1956 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1957 = (Object[]) newArray("[I", 3);
        int[] term1958 = (int[]) newIntArray(4);
        int[] term1963 = (int[]) newIntArray(7);
        int[] term1971 = (int[]) newIntArray(4);
        setField(term1956, term1956.getClass(), "graph", null);
        setIntElement(term1958, 0, -1397251956);
        setIntElement(term1958, 1, -796934571);
        setIntElement(term1958, 2, 405295896);
        setIntElement(term1958, 3, -814977075);
        setElement(term1957, 0, term1958);
        setIntElement(term1963, 0, 808614267);
        setIntElement(term1963, 1, 1611734632);
        setIntElement(term1963, 2, 868908117);
        setIntElement(term1963, 3, 1789351397);
        setIntElement(term1963, 4, 2145528170);
        setIntElement(term1963, 5, -585773976);
        setIntElement(term1963, 6, 852806940);
        setElement(term1957, 1, term1963);
        setIntElement(term1971, 0, 698551724);
        setIntElement(term1971, 1, -1631048635);
        setIntElement(term1971, 2, 1342808731);
        setIntElement(term1971, 3, -64893740);
        setElement(term1957, 2, term1971);
        setField(term1956, term1956.getClass(), "edges", term1957);
        setIntField(term1956, term1956.getClass(), "numEdges", -222012928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "weight", argTypes, term1956, args);
    }

};


