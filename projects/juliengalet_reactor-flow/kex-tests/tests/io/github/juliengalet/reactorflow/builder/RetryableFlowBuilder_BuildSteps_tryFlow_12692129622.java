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

public class RetryableFlowBuilder_BuildSteps_tryFlow_12692129622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;

    public RetryableFlowBuilder_BuildSteps_tryFlow_12692129622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term666 = Class.forName((String) "io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Field term665 = ((Class) term666).getDeclaredField((String) "TECHNICAL");
        ((Field) term665).setAccessible(true);
        Object enum1 = ((Field) term665).get((Object) null);
        Integer term651 = new Integer(1);
        Integer term653 = new Integer(100);
        term625 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps"));
        setField(term625, term625.getClass(), "name", "hRNSzYYIrc");
        setField(term625, term625.getClass(), "flow", null);
        setField(term625, term625.getClass(), "retryOn", enum1);
        setField(term625, term625.getClass(), "retryTimes", term651);
        setField(term625, term625.getClass(), "delay", term653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.flow.Flow");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "tryFlow", argTypes, term625, args);
    }

};


