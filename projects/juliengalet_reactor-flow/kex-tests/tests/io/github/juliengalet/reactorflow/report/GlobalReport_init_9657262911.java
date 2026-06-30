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

public class GlobalReport_init_9657262911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term972;

    public GlobalReport_init_9657262911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term972 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term973 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term973, term973.getClass(), "table", null);
        setField(term973, term973.getClass(), "nextTable", null);
        setLongField(term973, term973.getClass(), "baseCount", 0L);
        setIntField(term973, term973.getClass(), "sizeCtl", 0);
        setIntField(term973, term973.getClass(), "transferIndex", 0);
        setIntField(term973, term973.getClass(), "cellsBusy", 0);
        setField(term973, term973.getClass(), "counterCells", null);
        setField(term973, term973.getClass(), "keySet", null);
        setField(term973, term973.getClass(), "values", null);
        setField(term973, term973.getClass(), "entrySet", null);
        setField(term973, term973.getClass(), "keySet", null);
        setField(term973, term973.getClass(), "values", null);
        setField(term972, term972.getClass(), "context", term973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.GlobalReport");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("io.github.juliengalet.reactorflow.flow.Flow");
        Object[] args = new Object[2];
        args[0] = term972;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


