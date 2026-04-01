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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Metadata_addWarnings_17965128376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1316;
     Object term1325;

    public Metadata_addWarnings_17965128376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1317 = new ArrayList();
        ((ArrayList) term1317).add((Object)null);
        ArrayList term1321 = new ArrayList();
        ((ArrayList) term1321).add((Object)null);
        ((ArrayList) term1321).add((Object)null);
        ((ArrayList) term1321).add((Object)null);
        ((ArrayList) term1321).add((Object)null);
        ((ArrayList) term1321).add((Object)null);
        ((ArrayList) term1321).add((Object)null);
        ((ArrayList) term1321).add((Object)null);
        ((ArrayList) term1321).add((Object)null);
        ((ArrayList) term1321).add((Object)null);
        term1316 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.Metadata"));
        setField(term1316, term1316.getClass(), "errors", term1317);
        setField(term1316, term1316.getClass(), "warnings", term1321);
        setField(term1316, term1316.getClass(), "data", null);
        term1325 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Metadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1325;
        callMethod(klass, "addWarnings", argTypes, term1316, args);
    }

};


