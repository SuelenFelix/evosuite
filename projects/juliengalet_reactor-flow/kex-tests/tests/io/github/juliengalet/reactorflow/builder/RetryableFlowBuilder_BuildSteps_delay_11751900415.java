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

public class RetryableFlowBuilder_BuildSteps_delay_11751900415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2232;
     Object term2262;

    public RetryableFlowBuilder_BuildSteps_delay_11751900415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2275 = Class.forName((String) "io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Field term2274 = ((Class) term2275).getDeclaredField((String) "TECHNICAL");
        ((Field) term2274).setAccessible(true);
        Object enum5 = ((Field) term2274).get((Object) null);
        Integer term2258 = new Integer(1);
        Integer term2260 = new Integer(100);
        term2232 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps"));
        setField(term2232, term2232.getClass(), "name", "uuaPigETmJ");
        setField(term2232, term2232.getClass(), "flow", null);
        setField(term2232, term2232.getClass(), "retryOn", enum5);
        setField(term2232, term2232.getClass(), "retryTimes", term2258);
        setField(term2232, term2232.getClass(), "delay", term2260);
        term2262 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2262;
        callMethod(klass, "delay", argTypes, term2232, args);
    }

};


