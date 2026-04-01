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

public class Metadata_from_7127872953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1291;
     Object term1299;

    public Metadata_from_7127872953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1292 = new LinkedList();
        LinkedList term1295 = new LinkedList();
        term1291 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.Metadata"));
        Object term1298 = newInstance(Class.forName("java.lang.Object"));
        setField(term1291, term1291.getClass(), "errors", term1292);
        setField(term1291, term1291.getClass(), "warnings", term1295);
        setField(term1291, term1291.getClass(), "data", term1298);
        term1299 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Metadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.Metadata");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term1291;
        args[1] = term1299;
        callMethod(klass, "from", argTypes, null, args);
    }

};


