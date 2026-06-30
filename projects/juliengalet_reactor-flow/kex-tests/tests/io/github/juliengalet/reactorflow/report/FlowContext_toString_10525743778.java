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

public class FlowContext_toString_10525743778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;

    public FlowContext_toString_10525743778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term211 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term211, term211.getClass(), "table", null);
        setField(term211, term211.getClass(), "nextTable", null);
        setLongField(term211, term211.getClass(), "baseCount", 0L);
        setIntField(term211, term211.getClass(), "sizeCtl", 0);
        setIntField(term211, term211.getClass(), "transferIndex", 0);
        setIntField(term211, term211.getClass(), "cellsBusy", 0);
        setField(term211, term211.getClass(), "counterCells", null);
        setField(term211, term211.getClass(), "keySet", null);
        setField(term211, term211.getClass(), "values", null);
        setField(term211, term211.getClass(), "entrySet", null);
        setField(term211, term211.getClass(), "keySet", null);
        setField(term211, term211.getClass(), "values", null);
        setField(term210, term210.getClass(), "context", term211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term210, args);
    }

};


