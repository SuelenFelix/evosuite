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

public class SwitchFlowBuilder_BuildSteps_switchCase_14471961879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3693;

    public SwitchFlowBuilder_BuildSteps_switchCase_14471961879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3693 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.SwitchFlowBuilder$BuildSteps"));
        setField(term3693, term3693.getClass(), "name", null);
        setField(term3693, term3693.getClass(), "flows", null);
        setField(term3693, term3693.getClass(), "defaultFlow", null);
        setField(term3693, term3693.getClass(), "switchCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.SwitchFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("io.github.juliengalet.reactorflow.flow.Flow");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "switchCase", argTypes, term3693, args);
    }

};


