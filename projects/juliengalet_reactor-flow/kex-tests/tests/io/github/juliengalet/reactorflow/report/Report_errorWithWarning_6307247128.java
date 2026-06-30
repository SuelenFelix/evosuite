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

public class Report_errorWithWarning_6307247128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term904;

    public Report_errorWithWarning_6307247128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term904 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term905 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term905, term905.getClass(), "table", null);
        setField(term905, term905.getClass(), "nextTable", null);
        setLongField(term905, term905.getClass(), "baseCount", 0L);
        setIntField(term905, term905.getClass(), "sizeCtl", 0);
        setIntField(term905, term905.getClass(), "transferIndex", 0);
        setIntField(term905, term905.getClass(), "cellsBusy", 0);
        setField(term905, term905.getClass(), "counterCells", null);
        setField(term905, term905.getClass(), "keySet", null);
        setField(term905, term905.getClass(), "values", null);
        setField(term905, term905.getClass(), "entrySet", null);
        setField(term905, term905.getClass(), "keySet", null);
        setField(term905, term905.getClass(), "values", null);
        setField(term904, term904.getClass(), "context", term905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("io.github.juliengalet.reactorflow.exception.FlowException");
        argTypes[2] = Class.forName("io.github.juliengalet.reactorflow.exception.FlowException");
        Object[] args = new Object[3];
        args[0] = term904;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "errorWithWarning", argTypes, null, args);
    }

};


