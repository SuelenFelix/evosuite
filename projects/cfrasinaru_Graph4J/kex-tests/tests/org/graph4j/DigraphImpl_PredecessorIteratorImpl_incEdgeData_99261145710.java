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

public class DigraphImpl_PredecessorIteratorImpl_incEdgeData_99261145710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182215;
     Object term182219;
     Object term182221;

    public DigraphImpl_PredecessorIteratorImpl_incEdgeData_99261145710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182215 = newInstance(Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl"));
        setIntField(term182215, term182215.getClass(), "v", -495805897);
        setIntField(term182215, term182215.getClass(), "vi", -861200204);
        setIntField(term182215, term182215.getClass(), "pos", 1436058533);
        setField(term182215, term182215.getClass(), "this$0", null);
        term182219 = new Integer(-539597080);
        term182221 = new Double(0.9834148021823882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term182219;
        args[1] = term182221;
        callMethod(klass, "incEdgeData", argTypes, term182215, args);
    }

};


