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

public class EdgeIteratorImpl_getWeight_21265006435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173020;

    public EdgeIteratorImpl_getWeight_21265006435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173020 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173022 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173026 = (Object[]) newArray("java.lang.Double", 0);
        setField(term173020, term173020.getClass(), "graph", null);
        setField(term173020, term173020.getClass(), "neighbors", null);
        setIntField(term173020, term173020.getClass(), "index", 708629402);
        setBooleanField(term173022, term173022.getClass(), "directed", false);
        setIntField(term173022, term173022.getClass(), "source", -967375689);
        setIntField(term173022, term173022.getClass(), "target", -1461042126);
        setField(term173022, term173022.getClass(), "data", term173026);
        setField(term173022, term173022.getClass(), "label", null);
        setField(term173020, term173020.getClass(), "currentEdge", term173022);
        setBooleanField(term173020, term173020.getClass(), "directed", false);
        setIntField(term173020, term173020.getClass(), "numVertices", -741019965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeight", argTypes, term173020, args);
    }

};


