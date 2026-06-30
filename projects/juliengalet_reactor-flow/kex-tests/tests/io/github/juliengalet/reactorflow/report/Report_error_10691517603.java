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
import java.util.LinkedList;

public class Report_error_10691517603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847;
     Object term853;

    public Report_error_10691517603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term848 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term848, term848.getClass(), "table", null);
        setField(term848, term848.getClass(), "nextTable", null);
        setLongField(term848, term848.getClass(), "baseCount", 0L);
        setIntField(term848, term848.getClass(), "sizeCtl", 0);
        setIntField(term848, term848.getClass(), "transferIndex", 0);
        setIntField(term848, term848.getClass(), "cellsBusy", 0);
        setField(term848, term848.getClass(), "counterCells", null);
        setField(term848, term848.getClass(), "keySet", null);
        setField(term848, term848.getClass(), "values", null);
        setField(term848, term848.getClass(), "entrySet", null);
        setField(term848, term848.getClass(), "keySet", null);
        setField(term848, term848.getClass(), "values", null);
        setField(term847, term847.getClass(), "context", term848);
        term853 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term847;
        args[1] = term853;
        callMethod(klass, "error", argTypes, null, args);
    }

};


