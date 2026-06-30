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

public class Metadata_getWarnings_251151378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1337;

    public Metadata_getWarnings_251151378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1338 = new ArrayList();
        ((ArrayList) term1338).add((Object)null);
        ((ArrayList) term1338).add((Object)null);
        ArrayList term1342 = new ArrayList();
        ((ArrayList) term1342).add((Object)null);
        ((ArrayList) term1342).add((Object)null);
        ((ArrayList) term1342).add((Object)null);
        term1337 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.Metadata"));
        setField(term1337, term1337.getClass(), "errors", term1338);
        setField(term1337, term1337.getClass(), "warnings", term1342);
        setField(term1337, term1337.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Metadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWarnings", argTypes, term1337, args);
    }

};


