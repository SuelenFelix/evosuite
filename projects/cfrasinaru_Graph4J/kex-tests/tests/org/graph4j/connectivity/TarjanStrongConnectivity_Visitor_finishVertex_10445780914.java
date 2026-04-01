package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TarjanStrongConnectivity_Visitor_finishVertex_10445780914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1478;

    public TarjanStrongConnectivity_Visitor_finishVertex_10445780914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1478 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor"));
        setBooleanField(term1478, term1478.getClass(), "checkOnly", false);
        setField(term1478, term1478.getClass(), "low", null);
        setField(term1478, term1478.getClass(), "stack", null);
        setField(term1478, term1478.getClass(), "instack", null);
        setField(term1478, term1478.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "finishVertex", argTypes, term1478, args);
    }

};


