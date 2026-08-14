package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class EdgeIteratorImpl_next_7809329003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172973;

    public EdgeIteratorImpl_next_7809329003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term172980 = new Double(0.1275133937146814);
        Double term172982 = new Double(0.582988337023893);
        Double term172984 = new Double(0.13597502998586053);
        Double term172986 = new Double(0.9744588057109164);
        Double term172988 = new Double(0.5917275344743753);
        Double term172990 = new Double(0.6391951782023467);
        Double term172992 = new Double(0.037251985836196044);
        Double term172994 = new Double(0.851031727210683);
        term172973 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term172975 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term172979 = (Object[]) newArray("java.lang.Double", 8);
        setField(term172973, term172973.getClass(), "graph", null);
        setField(term172973, term172973.getClass(), "neighbors", null);
        setIntField(term172973, term172973.getClass(), "index", -801701322);
        setBooleanField(term172975, term172975.getClass(), "directed", false);
        setIntField(term172975, term172975.getClass(), "source", 2025368113);
        setIntField(term172975, term172975.getClass(), "target", 692326762);
        setElement(term172979, 0, term172980);
        setElement(term172979, 1, term172982);
        setElement(term172979, 2, term172984);
        setElement(term172979, 3, term172986);
        setElement(term172979, 4, term172988);
        setElement(term172979, 5, term172990);
        setElement(term172979, 6, term172992);
        setElement(term172979, 7, term172994);
        setField(term172975, term172975.getClass(), "data", term172979);
        setField(term172975, term172975.getClass(), "label", null);
        setField(term172973, term172973.getClass(), "currentEdge", term172975);
        setBooleanField(term172973, term172973.getClass(), "directed", false);
        setIntField(term172973, term172973.getClass(), "numVertices", -1313753179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term172973, args);
    }

};


