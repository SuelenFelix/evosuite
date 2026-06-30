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

public class RecoverableFlowBuilder_BuildSteps_recoverOn_89383928510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6122;

    public RecoverableFlowBuilder_BuildSteps_recoverOn_89383928510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6122 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.RecoverableFlowBuilder$BuildSteps"));
        setField(term6122, term6122.getClass(), "name", null);
        setField(term6122, term6122.getClass(), "flow", null);
        setField(term6122, term6122.getClass(), "recover", null);
        setField(term6122, term6122.getClass(), "recoverOn", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.RecoverableFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "recoverOn", argTypes, term6122, args);
    }

};


