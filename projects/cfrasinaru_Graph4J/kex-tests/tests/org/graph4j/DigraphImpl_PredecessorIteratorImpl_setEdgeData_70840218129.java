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

public class DigraphImpl_PredecessorIteratorImpl_setEdgeData_70840218129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182291;
     Object term182295;
     Object term182297;

    public DigraphImpl_PredecessorIteratorImpl_setEdgeData_70840218129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182291 = newInstance(Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl"));
        setIntField(term182291, term182291.getClass(), "v", 0);
        setIntField(term182291, term182291.getClass(), "vi", 0);
        setIntField(term182291, term182291.getClass(), "pos", 0);
        setField(term182291, term182291.getClass(), "this$0", null);
        term182295 = new Integer(0);
        term182297 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term182295;
        args[1] = term182297;
        callMethod(klass, "setEdgeData", argTypes, term182291, args);
    }

};


