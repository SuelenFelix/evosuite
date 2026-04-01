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

public class RetryableFlowBuilder_BuildSteps_build_3948324806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2648;

    public RetryableFlowBuilder_BuildSteps_build_3948324806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2689 = Class.forName((String) "io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Field term2688 = ((Class) term2689).getDeclaredField((String) "TECHNICAL");
        ((Field) term2688).setAccessible(true);
        Object enum6 = ((Field) term2688).get((Object) null);
        Integer term2674 = new Integer(1);
        Integer term2676 = new Integer(100);
        term2648 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps"));
        setField(term2648, term2648.getClass(), "name", "MxlszYVzRf");
        setField(term2648, term2648.getClass(), "flow", null);
        setField(term2648, term2648.getClass(), "retryOn", enum6);
        setField(term2648, term2648.getClass(), "retryTimes", term2674);
        setField(term2648, term2648.getClass(), "delay", term2676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2648, args);
    }

};


