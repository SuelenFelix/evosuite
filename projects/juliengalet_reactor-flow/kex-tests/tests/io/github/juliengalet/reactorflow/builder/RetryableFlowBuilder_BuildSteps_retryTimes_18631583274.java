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

public class RetryableFlowBuilder_BuildSteps_retryTimes_18631583274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1816;
     Object term1846;

    public RetryableFlowBuilder_BuildSteps_retryTimes_18631583274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1859 = Class.forName((String) "io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Field term1858 = ((Class) term1859).getDeclaredField((String) "TECHNICAL");
        ((Field) term1858).setAccessible(true);
        Object enum4 = ((Field) term1858).get((Object) null);
        Integer term1842 = new Integer(1);
        Integer term1844 = new Integer(100);
        term1816 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps"));
        setField(term1816, term1816.getClass(), "name", "NRdvgJlhkX");
        setField(term1816, term1816.getClass(), "flow", null);
        setField(term1816, term1816.getClass(), "retryOn", enum4);
        setField(term1816, term1816.getClass(), "retryTimes", term1842);
        setField(term1816, term1816.getClass(), "delay", term1844);
        term1846 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.RetryableFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1846;
        callMethod(klass, "retryTimes", argTypes, term1816, args);
    }

};


