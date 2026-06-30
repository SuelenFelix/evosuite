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

public class FlowContext_toPrettyString_21136606739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;

    public FlowContext_toPrettyString_21136606739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term217 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term217, term217.getClass(), "table", null);
        setField(term217, term217.getClass(), "nextTable", null);
        setLongField(term217, term217.getClass(), "baseCount", 0L);
        setIntField(term217, term217.getClass(), "sizeCtl", 0);
        setIntField(term217, term217.getClass(), "transferIndex", 0);
        setIntField(term217, term217.getClass(), "cellsBusy", 0);
        setField(term217, term217.getClass(), "counterCells", null);
        setField(term217, term217.getClass(), "keySet", null);
        setField(term217, term217.getClass(), "values", null);
        setField(term217, term217.getClass(), "entrySet", null);
        setField(term217, term217.getClass(), "keySet", null);
        setField(term217, term217.getClass(), "values", null);
        setField(term216, term216.getClass(), "context", term217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toPrettyString", argTypes, term216, args);
    }

};


