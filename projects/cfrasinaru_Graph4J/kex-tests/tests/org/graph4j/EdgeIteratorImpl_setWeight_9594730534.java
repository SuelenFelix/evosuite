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
     Object term172998;
     Object term173021;

    public EdgeIteratorImpl_setWeight_9594730534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173005 = new Double(0.4938345291413192);
        Double term173007 = new Double(0.3748194010330582);
        Double term173009 = new Double(0.6533220549320676);
        Double term173011 = new Double(0.3839436140913022);
        Double term173013 = new Double(0.3737670661594026);
        Double term173015 = new Double(0.9613898389316284);
        Double term173017 = new Double(0.7983543631318095);
        term172998 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173000 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173004 = (Object[]) newArray("java.lang.Double", 7);
        setField(term172998, term172998.getClass(), "graph", null);
        setField(term172998, term172998.getClass(), "neighbors", null);
        setIntField(term172998, term172998.getClass(), "index", -813663862);
        setBooleanField(term173000, term173000.getClass(), "directed", false);
        setIntField(term173000, term173000.getClass(), "source", -628628024);
        setIntField(term173000, term173000.getClass(), "target", -2134374103);
        setElement(term173004, 0, term173005);
        setElement(term173004, 1, term173007);
        setElement(term173004, 2, term173009);
        setElement(term173004, 3, term173011);
        setElement(term173004, 4, term173013);
        setElement(term173004, 5, term173015);
        setElement(term173004, 6, term173017);
        setField(term173000, term173000.getClass(), "data", term173004);
        setField(term173000, term173000.getClass(), "label", null);
        setField(term172998, term172998.getClass(), "currentEdge", term173000);
        setBooleanField(term172998, term172998.getClass(), "directed", false);
        setIntField(term172998, term172998.getClass(), "numVertices", 1552429362);
        term173021 = new Double(0.7095348920596442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term173021;
        callMethod(klass, "setWeight", argTypes, term172998, args);
    }

};


