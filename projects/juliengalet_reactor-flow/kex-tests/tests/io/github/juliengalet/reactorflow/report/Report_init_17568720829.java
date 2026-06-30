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

public class Report_init_17568720829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910;
     Object term916;
     Object term919;

    public Report_init_17568720829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term910 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.FlowContext"));
        Object term911 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term911, term911.getClass(), "table", null);
        setField(term911, term911.getClass(), "nextTable", null);
        setLongField(term911, term911.getClass(), "baseCount", 0L);
        setIntField(term911, term911.getClass(), "sizeCtl", 0);
        setIntField(term911, term911.getClass(), "transferIndex", 0);
        setIntField(term911, term911.getClass(), "cellsBusy", 0);
        setField(term911, term911.getClass(), "counterCells", null);
        setField(term911, term911.getClass(), "keySet", null);
        setField(term911, term911.getClass(), "values", null);
        setField(term911, term911.getClass(), "entrySet", null);
        setField(term911, term911.getClass(), "keySet", null);
        setField(term911, term911.getClass(), "values", null);
        setField(term910, term910.getClass(), "context", term911);
        term916 = new LinkedList();
        term919 = new LinkedList();
        ((LinkedList) term919).add((Object)null);
        ((LinkedList) term919).add((Object)null);
        ((LinkedList) term919).add((Object)null);
        ((LinkedList) term919).add((Object)null);
        ((LinkedList) term919).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.FlowContext");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term910;
        args[1] = term916;
        args[2] = term919;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


