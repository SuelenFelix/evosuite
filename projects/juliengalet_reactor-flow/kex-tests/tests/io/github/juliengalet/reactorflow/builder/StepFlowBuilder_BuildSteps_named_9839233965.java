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

public class StepFlowBuilder_BuildSteps_named_9839233965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3368;

    public StepFlowBuilder_BuildSteps_named_9839233965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3368 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.StepFlowBuilder$BuildSteps"));
        setField(term3368, term3368.getClass(), "execution", null);
        setField(term3368, term3368.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.StepFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "named", argTypes, term3368, args);
    }

};


