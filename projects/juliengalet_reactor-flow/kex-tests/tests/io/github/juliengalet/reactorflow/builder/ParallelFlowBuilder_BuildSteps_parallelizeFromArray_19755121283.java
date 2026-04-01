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

public class ParallelFlowBuilder_BuildSteps_parallelizeFromArray_19755121283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3161;

    public ParallelFlowBuilder_BuildSteps_parallelizeFromArray_19755121283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3162 = new ArrayList();
        term3161 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.ParallelFlowBuilder$BuildSteps"));
        setField(term3161, term3161.getClass(), "flows", term3162);
        setField(term3161, term3161.getClass(), "parallelizeFromArray", null);
        setField(term3161, term3161.getClass(), "flowToParallelize", null);
        setField(term3161, term3161.getClass(), "mergeStrategy", null);
        setField(term3161, term3161.getClass(), "name", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.ParallelFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Function");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parallelizeFromArray", argTypes, term3161, args);
    }

};


