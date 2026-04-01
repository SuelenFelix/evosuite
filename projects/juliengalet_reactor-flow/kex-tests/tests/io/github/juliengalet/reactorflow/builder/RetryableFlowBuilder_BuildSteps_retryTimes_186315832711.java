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

public class RetryableFlowBuilder_BuildSteps_retryTimes_186315832711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3065;

    public RetryableFlowBuilder_BuildSteps_retryTimes_186315832711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3065 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps"));
        setField(term3065, term3065.getClass(), "name", null);
        setField(term3065, term3065.getClass(), "flow", null);
        setField(term3065, term3065.getClass(), "retryOn", null);
        setField(term3065, term3065.getClass(), "retryTimes", null);
        setField(term3065, term3065.getClass(), "delay", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "retryTimes", argTypes, term3065, args);
    }

};


