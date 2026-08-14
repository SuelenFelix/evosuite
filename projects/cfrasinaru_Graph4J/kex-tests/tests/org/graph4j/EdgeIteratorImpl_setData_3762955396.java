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
     Object term173032;
     Object term173049;
     Object term173051;

    public EdgeIteratorImpl_setData_3762955396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173039 = new Double(0.865216545696929);
        Double term173041 = new Double(0.08898715850737937);
        Double term173043 = new Double(0.0809894151322792);
        Double term173045 = new Double(0.8800967400145071);
        term173032 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173034 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173038 = (Object[]) newArray("java.lang.Double", 4);
        setField(term173032, term173032.getClass(), "graph", null);
        setField(term173032, term173032.getClass(), "neighbors", null);
        setIntField(term173032, term173032.getClass(), "index", -1468769491);
        setBooleanField(term173034, term173034.getClass(), "directed", false);
        setIntField(term173034, term173034.getClass(), "source", -1608613028);
        setIntField(term173034, term173034.getClass(), "target", -1824209776);
        setElement(term173038, 0, term173039);
        setElement(term173038, 1, term173041);
        setElement(term173038, 2, term173043);
        setElement(term173038, 3, term173045);
        setField(term173034, term173034.getClass(), "data", term173038);
        setField(term173034, term173034.getClass(), "label", null);
        setField(term173032, term173032.getClass(), "currentEdge", term173034);
        setBooleanField(term173032, term173032.getClass(), "directed", false);
        setIntField(term173032, term173032.getClass(), "numVertices", -1076876936);
        term173049 = new Integer(-1715870079);
        term173051 = new Double(0.12548090306430515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term173049;
        args[1] = term173051;
        callMethod(klass, "setData", argTypes, term173032, args);
    }

};


