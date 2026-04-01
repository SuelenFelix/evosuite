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
import java.lang.Integer;
import java.lang.Double;

public class EdgeIteratorImpl_getData_14912620189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173082;
     Object term173091;
     Object term173093;

    public EdgeIteratorImpl_getData_14912620189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173082 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173084 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173088 = (Object[]) newArray("java.lang.Double", 0);
        setField(term173082, term173082.getClass(), "graph", null);
        setField(term173082, term173082.getClass(), "neighbors", null);
        setIntField(term173082, term173082.getClass(), "index", -341855669);
        setBooleanField(term173084, term173084.getClass(), "directed", true);
        setIntField(term173084, term173084.getClass(), "source", 1129373106);
        setIntField(term173084, term173084.getClass(), "target", -1278619677);
        setField(term173084, term173084.getClass(), "data", term173088);
        setField(term173084, term173084.getClass(), "label", null);
        setField(term173082, term173082.getClass(), "currentEdge", term173084);
        setBooleanField(term173082, term173082.getClass(), "directed", true);
        setIntField(term173082, term173082.getClass(), "numVertices", -601828587);
        term173091 = new Integer(868352624);
        term173093 = new Double(0.807360793304961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term173091;
        args[1] = term173093;
        callMethod(klass, "getData", argTypes, term173082, args);
    }

};


