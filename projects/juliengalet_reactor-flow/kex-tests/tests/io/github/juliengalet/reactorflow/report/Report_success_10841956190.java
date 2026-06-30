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

public class Report_success_10841956190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term826;

    public Report_success_10841956190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term826 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term827 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term827, term827.getClass(), "table", null);
        setField(term827, term827.getClass(), "nextTable", null);
        setLongField(term827, term827.getClass(), "baseCount", 0L);
        setIntField(term827, term827.getClass(), "sizeCtl", 0);
        setIntField(term827, term827.getClass(), "transferIndex", 0);
        setIntField(term827, term827.getClass(), "cellsBusy", 0);
        setField(term827, term827.getClass(), "counterCells", null);
        setField(term827, term827.getClass(), "keySet", null);
        setField(term827, term827.getClass(), "values", null);
        setField(term827, term827.getClass(), "entrySet", null);
        setField(term827, term827.getClass(), "keySet", null);
        setField(term827, term827.getClass(), "values", null);
        setField(term826, term826.getClass(), "context", term827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        Object[] args = new Object[1];
        args[0] = term826;
        callMethod(klass, "success", argTypes, null, args);
    }

};


