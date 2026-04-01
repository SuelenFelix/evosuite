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
import java.lang.String;
import java.lang.Object;

public class RecoverableFlowBuilder_BuildSteps_recoverOn_8938392854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4924;
     Object enum11;

    public RecoverableFlowBuilder_BuildSteps_recoverOn_8938392854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4970 = Class.forName((String) "io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Field term4969 = ((Class) term4970).getDeclaredField((String) "FUNCTIONAL");
        ((Field) term4969).setAccessible(true);
        Object enum10 = ((Field) term4969).get((Object) null);
        term4924 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.RecoverableFlowBuilder$BuildSteps"));
        setField(term4924, term4924.getClass(), "name", "wSQxaModmm");
        setField(term4924, term4924.getClass(), "flow", null);
        setField(term4924, term4924.getClass(), "recover", null);
        setField(term4924, term4924.getClass(), "recoverOn", enum10);
        Class<? extends Object> term5347 = Class.forName((String) "io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Field term5346 = ((Class) term5347).getDeclaredField((String) "NONE");
        ((Field) term5346).setAccessible(true);
        enum11 = ((Field) term5346).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.RecoverableFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Object[] args = new Object[1];
        args[0] = enum11;
        callMethod(klass, "recoverOn", argTypes, term4924, args);
    }

};


