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

public class RecoverableFlowBuilder_BuildSteps_build_54258288011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6123;

    public RecoverableFlowBuilder_BuildSteps_build_54258288011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6123 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.RecoverableFlowBuilder$BuildSteps"));
        setField(term6123, term6123.getClass(), "name", null);
        setField(term6123, term6123.getClass(), "flow", null);
        setField(term6123, term6123.getClass(), "recover", null);
        setField(term6123, term6123.getClass(), "recoverOn", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.RecoverableFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term6123, args);
    }

};


