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

public class EdgeIteratorImpl_setWeight_9594730534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172995;
     Object term173018;

    public EdgeIteratorImpl_setWeight_9594730534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173002 = new Double(0.4938345291413192);
        Double term173004 = new Double(0.3748194010330582);
        Double term173006 = new Double(0.6533220549320676);
        Double term173008 = new Double(0.3839436140913022);
        Double term173010 = new Double(0.3737670661594026);
        Double term173012 = new Double(0.9613898389316284);
        Double term173014 = new Double(0.7983543631318095);
        term172995 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term172997 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173001 = (Object[]) newArray("java.lang.Double", 7);
        setField(term172995, term172995.getClass(), "graph", null);
        setField(term172995, term172995.getClass(), "neighbors", null);
        setIntField(term172995, term172995.getClass(), "index", -813663862);
        setBooleanField(term172997, term172997.getClass(), "directed", false);
        setIntField(term172997, term172997.getClass(), "source", -628628024);
        setIntField(term172997, term172997.getClass(), "target", -2134374103);
        setElement(term173001, 0, term173002);
        setElement(term173001, 1, term173004);
        setElement(term173001, 2, term173006);
        setElement(term173001, 3, term173008);
        setElement(term173001, 4, term173010);
        setElement(term173001, 5, term173012);
        setElement(term173001, 6, term173014);
        setField(term172997, term172997.getClass(), "data", term173001);
        setField(term172997, term172997.getClass(), "label", null);
        setField(term172995, term172995.getClass(), "currentEdge", term172997);
        setBooleanField(term172995, term172995.getClass(), "directed", false);
        setIntField(term172995, term172995.getClass(), "numVertices", 1552429362);
        term173018 = new Double(0.7095348920596442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term173018;
        callMethod(klass, "setWeight", argTypes, term172995, args);
    }

};


