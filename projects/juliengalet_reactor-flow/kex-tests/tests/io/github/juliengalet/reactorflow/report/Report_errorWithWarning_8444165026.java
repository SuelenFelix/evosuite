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

public class Report_errorWithWarning_8444165026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term878;
     Object term884;

    public Report_errorWithWarning_8444165026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term878 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term879 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term879, term879.getClass(), "table", null);
        setField(term879, term879.getClass(), "nextTable", null);
        setLongField(term879, term879.getClass(), "baseCount", 0L);
        setIntField(term879, term879.getClass(), "sizeCtl", 0);
        setIntField(term879, term879.getClass(), "transferIndex", 0);
        setIntField(term879, term879.getClass(), "cellsBusy", 0);
        setField(term879, term879.getClass(), "counterCells", null);
        setField(term879, term879.getClass(), "keySet", null);
        setField(term879, term879.getClass(), "values", null);
        setField(term879, term879.getClass(), "entrySet", null);
        setField(term879, term879.getClass(), "keySet", null);
        setField(term879, term879.getClass(), "values", null);
        setField(term878, term878.getClass(), "context", term879);
        term884 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("io.github.juliengalet.reactorflow.exception.FlowException");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term878;
        args[1] = null;
        args[2] = term884;
        callMethod(klass, "errorWithWarning", argTypes, null, args);
    }

};


