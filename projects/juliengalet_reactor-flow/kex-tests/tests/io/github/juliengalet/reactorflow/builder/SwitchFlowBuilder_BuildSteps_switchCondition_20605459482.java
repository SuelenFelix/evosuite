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
import java.util.HashMap;

public class SwitchFlowBuilder_BuildSteps_switchCondition_20605459482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3557;

    public SwitchFlowBuilder_BuildSteps_switchCondition_20605459482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3570 = new HashMap();
        term3557 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.SwitchFlowBuilder$BuildSteps"));
        setField(term3557, term3557.getClass(), "name", "dWRymuLBtr");
        setField(term3557, term3557.getClass(), "flows", term3570);
        setField(term3557, term3557.getClass(), "defaultFlow", null);
        setField(term3557, term3557.getClass(), "switchCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.SwitchFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Function");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "switchCondition", argTypes, term3557, args);
    }

};


