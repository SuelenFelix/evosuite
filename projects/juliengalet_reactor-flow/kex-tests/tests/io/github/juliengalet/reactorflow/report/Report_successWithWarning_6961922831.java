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

public class Report_successWithWarning_6961922831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832;
     Object term838;

    public Report_successWithWarning_6961922831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term832 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term833 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term833, term833.getClass(), "table", null);
        setField(term833, term833.getClass(), "nextTable", null);
        setLongField(term833, term833.getClass(), "baseCount", 0L);
        setIntField(term833, term833.getClass(), "sizeCtl", 0);
        setIntField(term833, term833.getClass(), "transferIndex", 0);
        setIntField(term833, term833.getClass(), "cellsBusy", 0);
        setField(term833, term833.getClass(), "counterCells", null);
        setField(term833, term833.getClass(), "keySet", null);
        setField(term833, term833.getClass(), "values", null);
        setField(term833, term833.getClass(), "entrySet", null);
        setField(term833, term833.getClass(), "keySet", null);
        setField(term833, term833.getClass(), "values", null);
        setField(term832, term832.getClass(), "context", term833);
        term838 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term832;
        args[1] = term838;
        callMethod(klass, "successWithWarning", argTypes, null, args);
    }

};


