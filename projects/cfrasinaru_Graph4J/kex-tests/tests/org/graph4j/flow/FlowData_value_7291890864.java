package org.graph4j.flow;

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
import static org.graph4j.flow.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class FlowData_value_7291890864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1887;

    public FlowData_value_7291890864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1890 = new HashMap();
        term1887 = newInstance(Class.forName("org.graph4j.flow.FlowData"));
        setIntField(term1887, term1887.getClass(), "source", 330043745);
        setIntField(term1887, term1887.getClass(), "sink", -509349195);
        setField(term1887, term1887.getClass(), "graph", null);
        setField(term1887, term1887.getClass(), "map", term1890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.FlowData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "value", argTypes, term1887, args);
    }

};


