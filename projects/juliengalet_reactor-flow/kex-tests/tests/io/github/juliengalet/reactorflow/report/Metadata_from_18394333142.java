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
import java.util.LinkedList;
import java.lang.Object;

public class Metadata_from_18394333142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1283;

    public Metadata_from_18394333142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1284 = new LinkedList();
        LinkedList term1287 = new LinkedList();
        term1283 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.Metadata"));
        Object term1290 = newInstance(Class.forName("java.lang.Object"));
        setField(term1283, term1283.getClass(), "errors", term1284);
        setField(term1283, term1283.getClass(), "warnings", term1287);
        setField(term1283, term1283.getClass(), "data", term1290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Metadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.Metadata");
        Object[] args = new Object[1];
        args[0] = term1283;
        callMethod(klass, "from", argTypes, null, args);
    }

};


