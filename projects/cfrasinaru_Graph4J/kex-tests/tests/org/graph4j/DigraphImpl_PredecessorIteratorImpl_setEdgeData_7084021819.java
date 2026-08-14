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

public class DigraphImpl_PredecessorIteratorImpl_setEdgeData_7084021819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182207;
     Object term182211;
     Object term182213;

    public DigraphImpl_PredecessorIteratorImpl_setEdgeData_7084021819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182207 = newInstance(Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl"));
        setIntField(term182207, term182207.getClass(), "v", 1291652760);
        setIntField(term182207, term182207.getClass(), "vi", 1045216567);
        setIntField(term182207, term182207.getClass(), "pos", -569055517);
        setField(term182207, term182207.getClass(), "this$0", null);
        term182211 = new Integer(679299510);
        term182213 = new Double(0.40095655949876907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term182211;
        args[1] = term182213;
        callMethod(klass, "setEdgeData", argTypes, term182207, args);
    }

};


