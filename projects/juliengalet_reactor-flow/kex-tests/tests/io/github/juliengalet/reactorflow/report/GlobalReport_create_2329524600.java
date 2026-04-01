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

public class GlobalReport_create_2329524600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term966;

    public GlobalReport_create_2329524600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term966 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term967 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term967, term967.getClass(), "table", null);
        setField(term967, term967.getClass(), "nextTable", null);
        setLongField(term967, term967.getClass(), "baseCount", 0L);
        setIntField(term967, term967.getClass(), "sizeCtl", 0);
        setIntField(term967, term967.getClass(), "transferIndex", 0);
        setIntField(term967, term967.getClass(), "cellsBusy", 0);
        setField(term967, term967.getClass(), "counterCells", null);
        setField(term967, term967.getClass(), "keySet", null);
        setField(term967, term967.getClass(), "values", null);
        setField(term967, term967.getClass(), "entrySet", null);
        setField(term967, term967.getClass(), "keySet", null);
        setField(term967, term967.getClass(), "values", null);
        setField(term966, term966.getClass(), "context", term967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.GlobalReport");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("io.github.juliengalet.reactorflow.flow.Flow");
        Object[] args = new Object[2];
        args[0] = term966;
        args[1] = null;
        callMethod(klass, "create", argTypes, null, args);
    }

};


