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

public class FlowContext_put_11163922694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;
     Object term137;

    public FlowContext_put_11163922694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term120 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term120, term120.getClass(), "table", null);
        setField(term120, term120.getClass(), "nextTable", null);
        setLongField(term120, term120.getClass(), "baseCount", 0L);
        setIntField(term120, term120.getClass(), "sizeCtl", 0);
        setIntField(term120, term120.getClass(), "transferIndex", 0);
        setIntField(term120, term120.getClass(), "cellsBusy", 0);
        setField(term120, term120.getClass(), "counterCells", null);
        setField(term120, term120.getClass(), "keySet", null);
        setField(term120, term120.getClass(), "values", null);
        setField(term120, term120.getClass(), "entrySet", null);
        setField(term120, term120.getClass(), "keySet", null);
        setField(term120, term120.getClass(), "values", null);
        setField(term119, term119.getClass(), "context", term120);
        term137 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "uuaPigETmJ";
        args[1] = term137;
        callMethod(klass, "put", argTypes, term119, args);
    }

};


