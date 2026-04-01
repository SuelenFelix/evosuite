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

public class SwitchFlowBuilder_BuildSteps_switchCondition_20605459488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3692;

    public SwitchFlowBuilder_BuildSteps_switchCondition_20605459488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3692 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.SwitchFlowBuilder$BuildSteps"));
        setField(term3692, term3692.getClass(), "name", null);
        setField(term3692, term3692.getClass(), "flows", null);
        setField(term3692, term3692.getClass(), "defaultFlow", null);
        setField(term3692, term3692.getClass(), "switchCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.SwitchFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Function");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "switchCondition", argTypes, term3692, args);
    }

};


