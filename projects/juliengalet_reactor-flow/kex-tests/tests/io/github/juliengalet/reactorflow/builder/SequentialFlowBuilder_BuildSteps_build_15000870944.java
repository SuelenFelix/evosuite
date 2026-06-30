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
import java.util.ArrayList;

public class SequentialFlowBuilder_BuildSteps_build_15000870944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3474;

    public SequentialFlowBuilder_BuildSteps_build_15000870944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3475 = new ArrayList();
        term3474 = newInstance(Class.forName("io.github.juliengalet.reactorflow.builder.SequentialFlowBuilder$BuildSteps"));
        setField(term3474, term3474.getClass(), "flows", term3475);
        setField(term3474, term3474.getClass(), "finalFlow", null);
        setField(term3474, term3474.getClass(), "name", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.builder.SequentialFlowBuilder$BuildSteps");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3474, args);
    }

};


