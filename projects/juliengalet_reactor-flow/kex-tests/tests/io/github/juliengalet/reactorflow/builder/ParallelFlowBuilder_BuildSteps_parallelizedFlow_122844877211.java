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

public class ParallelFlowBuilder_BuildSteps_parallelizedFlow_122844877211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3272;

    public ParallelFlowBuilder_BuildSteps_parallelizedFlow_122844877211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3272 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.ParallelFlowBuilder$BuildSteps"));
        setField(term3272, term3272.getClass(), "flows", null);
        setField(term3272, term3272.getClass(), "parallelizeFromArray", null);
        setField(term3272, term3272.getClass(), "flowToParallelize", null);
        setField(term3272, term3272.getClass(), "mergeStrategy", null);
        setField(term3272, term3272.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.ParallelFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.flow.Flow");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parallelizedFlow", argTypes, term3272, args);
    }

};


