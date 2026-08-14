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
import java.lang.Integer;
import java.lang.Double;

public class DigraphImpl_PredecessorIteratorImpl_getEdgeData_139531258612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182229;
     Object term182233;
     Object term182235;

    public DigraphImpl_PredecessorIteratorImpl_getEdgeData_139531258612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182229 = newInstance(Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl"));
        setIntField(term182229, term182229.getClass(), "v", -455815002);
        setIntField(term182229, term182229.getClass(), "vi", 1065773646);
        setIntField(term182229, term182229.getClass(), "pos", 959075262);
        setField(term182229, term182229.getClass(), "this$0", null);
        term182233 = new Integer(-1573440176);
        term182235 = new Double(0.7012916902054702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term182233;
        args[1] = term182235;
        callMethod(klass, "getEdgeData", argTypes, term182229, args);
    }

};


