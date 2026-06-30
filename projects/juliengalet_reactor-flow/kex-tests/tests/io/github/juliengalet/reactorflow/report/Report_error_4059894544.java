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

public class Report_error_4059894544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term856;

    public Report_error_4059894544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term856 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term857 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term857, term857.getClass(), "table", null);
        setField(term857, term857.getClass(), "nextTable", null);
        setLongField(term857, term857.getClass(), "baseCount", 0L);
        setIntField(term857, term857.getClass(), "sizeCtl", 0);
        setIntField(term857, term857.getClass(), "transferIndex", 0);
        setIntField(term857, term857.getClass(), "cellsBusy", 0);
        setField(term857, term857.getClass(), "counterCells", null);
        setField(term857, term857.getClass(), "keySet", null);
        setField(term857, term857.getClass(), "values", null);
        setField(term857, term857.getClass(), "entrySet", null);
        setField(term857, term857.getClass(), "keySet", null);
        setField(term857, term857.getClass(), "values", null);
        setField(term856, term856.getClass(), "context", term857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("io.github.juliengalet.reactorflow.exception.FlowException");
        Object[] args = new Object[2];
        args[0] = term856;
        args[1] = null;
        callMethod(klass, "error", argTypes, null, args);
    }

};


