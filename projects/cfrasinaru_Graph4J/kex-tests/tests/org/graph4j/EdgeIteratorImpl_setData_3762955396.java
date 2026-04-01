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
import java.lang.Integer;

public class EdgeIteratorImpl_setData_3762955396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173029;
     Object term173046;
     Object term173048;

    public EdgeIteratorImpl_setData_3762955396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173036 = new Double(0.865216545696929);
        Double term173038 = new Double(0.08898715850737937);
        Double term173040 = new Double(0.0809894151322792);
        Double term173042 = new Double(0.8800967400145071);
        term173029 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173031 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173035 = (Object[]) newArray("java.lang.Double", 4);
        setField(term173029, term173029.getClass(), "graph", null);
        setField(term173029, term173029.getClass(), "neighbors", null);
        setIntField(term173029, term173029.getClass(), "index", -1468769491);
        setBooleanField(term173031, term173031.getClass(), "directed", false);
        setIntField(term173031, term173031.getClass(), "source", -1608613028);
        setIntField(term173031, term173031.getClass(), "target", -1824209776);
        setElement(term173035, 0, term173036);
        setElement(term173035, 1, term173038);
        setElement(term173035, 2, term173040);
        setElement(term173035, 3, term173042);
        setField(term173031, term173031.getClass(), "data", term173035);
        setField(term173031, term173031.getClass(), "label", null);
        setField(term173029, term173029.getClass(), "currentEdge", term173031);
        setBooleanField(term173029, term173029.getClass(), "directed", false);
        setIntField(term173029, term173029.getClass(), "numVertices", -1076876936);
        term173046 = new Integer(-1715870079);
        term173048 = new Double(0.12548090306430515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term173046;
        args[1] = term173048;
        callMethod(klass, "setData", argTypes, term173029, args);
    }

};


