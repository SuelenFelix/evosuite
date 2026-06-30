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

public class Metadata_getData_9660167139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1346;

    public Metadata_getData_9660167139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1347 = new ArrayList();
        ((ArrayList) term1347).add((Object)null);
        ((ArrayList) term1347).add((Object)null);
        ((ArrayList) term1347).add((Object)null);
        ((ArrayList) term1347).add((Object)null);
        ArrayList term1351 = new ArrayList();
        ((ArrayList) term1351).add((Object)null);
        ((ArrayList) term1351).add((Object)null);
        ((ArrayList) term1351).add((Object)null);
        ((ArrayList) term1351).add((Object)null);
        ((ArrayList) term1351).add((Object)null);
        ((ArrayList) term1351).add((Object)null);
        ((ArrayList) term1351).add((Object)null);
        ((ArrayList) term1351).add((Object)null);
        ((ArrayList) term1351).add((Object)null);
        term1346 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.Metadata"));
        setField(term1346, term1346.getClass(), "errors", term1347);
        setField(term1346, term1346.getClass(), "warnings", term1351);
        setField(term1346, term1346.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Metadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term1346, args);
    }

};


