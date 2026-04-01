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
import java.lang.Integer;

public class RetryableFlowBuilder_BuildSteps_retryOn_13776338473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1039;
     Object enum3;

    public RetryableFlowBuilder_BuildSteps_retryOn_13776338473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1087 = Class.forName((String) "io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Field term1086 = ((Class) term1087).getDeclaredField((String) "TECHNICAL");
        ((Field) term1086).setAccessible(true);
        Object enum2 = ((Field) term1086).get((Object) null);
        Integer term1065 = new Integer(1);
        Integer term1067 = new Integer(100);
        term1039 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps"));
        setField(term1039, term1039.getClass(), "name", "RMFIsYGgne");
        setField(term1039, term1039.getClass(), "flow", null);
        setField(term1039, term1039.getClass(), "retryOn", enum2);
        setField(term1039, term1039.getClass(), "retryTimes", term1065);
        setField(term1039, term1039.getClass(), "delay", term1067);
        Class<? extends Object> term1461 = Class.forName((String) "io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Field term1460 = ((Class) term1461).getDeclaredField((String) "ALL");
        ((Field) term1460).setAccessible(true);
        enum3 = ((Field) term1460).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Object[] args = new Object[1];
        args[0] = enum3;
        callMethod(klass, "retryOn", argTypes, term1039, args);
    }

};


