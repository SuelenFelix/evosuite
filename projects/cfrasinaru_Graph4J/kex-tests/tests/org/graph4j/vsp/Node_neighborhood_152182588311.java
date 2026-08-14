package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Node_neighborhood_152182588311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86706;

    public Node_neighborhood_152182588311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86706 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        setField(term86706, term86706.getClass(), "alg", null);
        setIntField(term86706, term86706.getClass(), "vertex", 0);
        setIntField(term86706, term86706.getClass(), "value", 0);
        setField(term86706, term86706.getClass(), "parent", null);
        setField(term86706, term86706.getClass(), "separator", null);
        setField(term86706, term86706.getClass(), "domains", null);
        setField(term86706, term86706.getClass(), "minDomain", null);
        setBooleanField(term86706, term86706.getClass(), "propagator", false);
        setBooleanField(term86706, term86706.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "neighborhood", argTypes, term86706, args);
    }

};


