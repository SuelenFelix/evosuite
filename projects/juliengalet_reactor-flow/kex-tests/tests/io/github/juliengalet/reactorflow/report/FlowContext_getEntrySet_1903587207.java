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

public class FlowContext_getEntrySet_1903587207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;

    public FlowContext_getEntrySet_1903587207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term205 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term205, term205.getClass(), "table", null);
        setField(term205, term205.getClass(), "nextTable", null);
        setLongField(term205, term205.getClass(), "baseCount", 0L);
        setIntField(term205, term205.getClass(), "sizeCtl", 0);
        setIntField(term205, term205.getClass(), "transferIndex", 0);
        setIntField(term205, term205.getClass(), "cellsBusy", 0);
        setField(term205, term205.getClass(), "counterCells", null);
        setField(term205, term205.getClass(), "keySet", null);
        setField(term205, term205.getClass(), "values", null);
        setField(term205, term205.getClass(), "entrySet", null);
        setField(term205, term205.getClass(), "keySet", null);
        setField(term205, term205.getClass(), "values", null);
        setField(term204, term204.getClass(), "context", term205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEntrySet", argTypes, term204, args);
    }

};


