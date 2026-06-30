package io.github.juliengalet.reactorflow.report;

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
import static io.github.juliengalet.reactorflow.report.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GlobalReport_create_23295246017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1266;

    public GlobalReport_create_23295246017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1266 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.GlobalReport"));
        setField(term1266, term1266.getClass(), "context", null);
        setField(term1266, term1266.getClass(), "rootFlow", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.GlobalReport");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("io.github.juliengalet.reactorflow.flow.Flow");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "create", argTypes, term1266, args);
    }

};


