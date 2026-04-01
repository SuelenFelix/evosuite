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

public class ConditionalFlowBuilder_BuildSteps_caseTrue_4988677499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;

    public ConditionalFlowBuilder_BuildSteps_caseTrue_4988677499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.ConditionalFlowBuilder$BuildSteps"));
        setField(term140, term140.getClass(), "name", null);
        setField(term140, term140.getClass(), "flowCaseTrue", null);
        setField(term140, term140.getClass(), "flowCaseFalse", null);
        setField(term140, term140.getClass(), "condition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.ConditionalFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.flow.Flow");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "caseTrue", argTypes, term140, args);
    }

};


