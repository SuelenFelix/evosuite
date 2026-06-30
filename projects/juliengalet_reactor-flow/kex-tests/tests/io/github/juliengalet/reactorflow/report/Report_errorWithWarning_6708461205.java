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

public class Report_errorWithWarning_6708461205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862;
     Object term868;
     Object term871;

    public Report_errorWithWarning_6708461205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term862 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term863 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term863, term863.getClass(), "table", null);
        setField(term863, term863.getClass(), "nextTable", null);
        setLongField(term863, term863.getClass(), "baseCount", 0L);
        setIntField(term863, term863.getClass(), "sizeCtl", 0);
        setIntField(term863, term863.getClass(), "transferIndex", 0);
        setIntField(term863, term863.getClass(), "cellsBusy", 0);
        setField(term863, term863.getClass(), "counterCells", null);
        setField(term863, term863.getClass(), "keySet", null);
        setField(term863, term863.getClass(), "values", null);
        setField(term863, term863.getClass(), "entrySet", null);
        setField(term863, term863.getClass(), "keySet", null);
        setField(term863, term863.getClass(), "values", null);
        setField(term862, term862.getClass(), "context", term863);
        term868 = new LinkedList();
        term871 = new LinkedList();
        ((LinkedList) term871).add((Object)null);
        ((LinkedList) term871).add((Object)null);
        ((LinkedList) term871).add((Object)null);
        ((LinkedList) term871).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term862;
        args[1] = term868;
        args[2] = term871;
        callMethod(klass, "errorWithWarning", argTypes, null, args);
    }

};


