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

public class EdgeIteratorImpl_checkCurrentEdge_138388801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172949;

    public EdgeIteratorImpl_checkCurrentEdge_138388801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term172956 = new Double(0.6192027412772936);
        term172949 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term172951 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term172955 = (Object[]) newArray("java.lang.Double", 1);
        setField(term172949, term172949.getClass(), "graph", null);
        setField(term172949, term172949.getClass(), "neighbors", null);
        setIntField(term172949, term172949.getClass(), "index", -2086606291);
        setBooleanField(term172951, term172951.getClass(), "directed", true);
        setIntField(term172951, term172951.getClass(), "source", 1594586195);
        setIntField(term172951, term172951.getClass(), "target", -285714672);
        setElement(term172955, 0, term172956);
        setField(term172951, term172951.getClass(), "data", term172955);
        setField(term172951, term172951.getClass(), "label", null);
        setField(term172949, term172949.getClass(), "currentEdge", term172951);
        setBooleanField(term172949, term172949.getClass(), "directed", true);
        setIntField(term172949, term172949.getClass(), "numVertices", 1218017657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkCurrentEdge", argTypes, term172949, args);
    }

};


