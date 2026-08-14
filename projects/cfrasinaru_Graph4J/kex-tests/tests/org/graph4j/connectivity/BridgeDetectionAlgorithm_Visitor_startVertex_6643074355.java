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

public class BridgeDetectionAlgorithm_Visitor_startVertex_6643074355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1708;

    public BridgeDetectionAlgorithm_Visitor_startVertex_6643074355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1708 = newInstance(Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm$Visitor"));
        setBooleanField(term1708, term1708.getClass(), "checkOnly", false);
        setField(term1708, term1708.getClass(), "low", null);
        setField(term1708, term1708.getClass(), "stack", null);
        setField(term1708, term1708.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.BridgeDetectionAlgorithm$Visitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "startVertex", argTypes, term1708, args);
    }

};


