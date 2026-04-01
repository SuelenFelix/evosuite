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

public class SwitchFlowBuilder_BuildSteps_named_17905199011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3507;

    public SwitchFlowBuilder_BuildSteps_named_17905199011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3520 = new HashMap();
        term3507 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.SwitchFlowBuilder$BuildSteps"));
        setField(term3507, term3507.getClass(), "name", "TEParAifyi");
        setField(term3507, term3507.getClass(), "flows", term3520);
        setField(term3507, term3507.getClass(), "defaultFlow", null);
        setField(term3507, term3507.getClass(), "switchCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.SwitchFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWDIEULEFu";
        callMethod(klass, "named", argTypes, term3507, args);
    }

};


