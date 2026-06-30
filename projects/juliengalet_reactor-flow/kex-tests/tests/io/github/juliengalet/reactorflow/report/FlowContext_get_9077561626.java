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
import java.lang.Object;

public class FlowContext_get_9077561626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;

    public FlowContext_get_9077561626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term177 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term177, term177.getClass(), "table", null);
        setField(term177, term177.getClass(), "nextTable", null);
        setLongField(term177, term177.getClass(), "baseCount", 0L);
        setIntField(term177, term177.getClass(), "sizeCtl", 0);
        setIntField(term177, term177.getClass(), "transferIndex", 0);
        setIntField(term177, term177.getClass(), "cellsBusy", 0);
        setField(term177, term177.getClass(), "counterCells", null);
        setField(term177, term177.getClass(), "keySet", null);
        setField(term177, term177.getClass(), "values", null);
        setField(term177, term177.getClass(), "entrySet", null);
        setField(term177, term177.getClass(), "keySet", null);
        setField(term177, term177.getClass(), "values", null);
        setField(term176, term176.getClass(), "context", term177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "get", argTypes, term176, args);
    }

};


