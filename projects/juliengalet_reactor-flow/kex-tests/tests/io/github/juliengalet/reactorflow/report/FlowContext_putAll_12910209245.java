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
import java.util.LinkedHashMap;

public class FlowContext_putAll_12910209245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term154;

    public FlowContext_putAll_12910209245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term149 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term149, term149.getClass(), "table", null);
        setField(term149, term149.getClass(), "nextTable", null);
        setLongField(term149, term149.getClass(), "baseCount", 0L);
        setIntField(term149, term149.getClass(), "sizeCtl", 0);
        setIntField(term149, term149.getClass(), "transferIndex", 0);
        setIntField(term149, term149.getClass(), "cellsBusy", 0);
        setField(term149, term149.getClass(), "counterCells", null);
        setField(term149, term149.getClass(), "keySet", null);
        setField(term149, term149.getClass(), "values", null);
        setField(term149, term149.getClass(), "entrySet", null);
        setField(term149, term149.getClass(), "keySet", null);
        setField(term149, term149.getClass(), "values", null);
        setField(term148, term148.getClass(), "context", term149);
        term154 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term154;
        callMethod(klass, "putAll", argTypes, term148, args);
    }

};


