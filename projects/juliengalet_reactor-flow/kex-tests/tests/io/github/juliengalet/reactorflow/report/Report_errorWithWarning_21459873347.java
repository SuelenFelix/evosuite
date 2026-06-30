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

public class Report_errorWithWarning_21459873347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;
     Object term893;

    public Report_errorWithWarning_21459873347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term887 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term888 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term888, term888.getClass(), "table", null);
        setField(term888, term888.getClass(), "nextTable", null);
        setLongField(term888, term888.getClass(), "baseCount", 0L);
        setIntField(term888, term888.getClass(), "sizeCtl", 0);
        setIntField(term888, term888.getClass(), "transferIndex", 0);
        setIntField(term888, term888.getClass(), "cellsBusy", 0);
        setField(term888, term888.getClass(), "counterCells", null);
        setField(term888, term888.getClass(), "keySet", null);
        setField(term888, term888.getClass(), "values", null);
        setField(term888, term888.getClass(), "entrySet", null);
        setField(term888, term888.getClass(), "keySet", null);
        setField(term888, term888.getClass(), "values", null);
        setField(term887, term887.getClass(), "context", term888);
        term893 = new LinkedList();
        ((LinkedList) term893).add((Object)null);
        ((LinkedList) term893).add((Object)null);
        ((LinkedList) term893).add((Object)null);
        ((LinkedList) term893).add((Object)null);
        ((LinkedList) term893).add((Object)null);
        ((LinkedList) term893).add((Object)null);
        ((LinkedList) term893).add((Object)null);
        ((LinkedList) term893).add((Object)null);
        ((LinkedList) term893).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("io.github.juliengalet.reactorflow.exception.FlowException");
        Object[] args = new Object[3];
        args[0] = term887;
        args[1] = term893;
        args[2] = null;
        callMethod(klass, "errorWithWarning", argTypes, null, args);
    }

};


