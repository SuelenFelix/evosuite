package io.github.juliengalet.reactorflow.builder;

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
import static io.github.juliengalet.reactorflow.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class ParallelFlowBuilder_BuildSteps_parallelize_21133979802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3126;
     Object term3143;

    public ParallelFlowBuilder_BuildSteps_parallelize_21133979802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3127 = new ArrayList();
        term3126 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.ParallelFlowBuilder$BuildSteps"));
        setField(term3126, term3126.getClass(), "flows", term3127);
        setField(term3126, term3126.getClass(), "parallelizeFromArray", null);
        setField(term3126, term3126.getClass(), "flowToParallelize", null);
        setField(term3126, term3126.getClass(), "mergeStrategy", null);
        setField(term3126, term3126.getClass(), "name", "aJlieCFVtF");
        term3143 = new LinkedList();
        ((LinkedList) term3143).add((Object)null);
        ((LinkedList) term3143).add((Object)null);
        ((LinkedList) term3143).add((Object)null);
        ((LinkedList) term3143).add((Object)null);
        ((LinkedList) term3143).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.ParallelFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3143;
        callMethod(klass, "parallelize", argTypes, term3126, args);
    }

};


