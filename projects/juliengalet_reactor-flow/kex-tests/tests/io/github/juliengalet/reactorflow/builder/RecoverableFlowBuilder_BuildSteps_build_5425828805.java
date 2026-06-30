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

public class RecoverableFlowBuilder_BuildSteps_build_5425828805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5705;

    public RecoverableFlowBuilder_BuildSteps_build_5425828805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5743 = Class.forName((String) "io.github.juliengalet.reactorflow.exception.RecoverableFlowException");
        Field term5742 = ((Class) term5743).getDeclaredField((String) "FUNCTIONAL");
        ((Field) term5742).setAccessible(true);
        Object enum12 = ((Field) term5742).get((Object) null);
        term5705 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.RecoverableFlowBuilder$BuildSteps"));
        setField(term5705, term5705.getClass(), "name", "UlajhuVLaP");
        setField(term5705, term5705.getClass(), "flow", null);
        setField(term5705, term5705.getClass(), "recover", null);
        setField(term5705, term5705.getClass(), "recoverOn", enum12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.RecoverableFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term5705, args);
    }

};


