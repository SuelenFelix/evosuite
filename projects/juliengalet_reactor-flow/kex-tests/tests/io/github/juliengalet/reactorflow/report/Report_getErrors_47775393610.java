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

public class Report_getErrors_47775393610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927;

    public Report_getErrors_47775393610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term928 = new ArrayList();
        ArrayList term932 = new ArrayList();
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        term927 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.Report"));
        setField(term927, term927.getClass(), "errors", term928);
        setField(term927, term927.getClass(), "warnings", term932);
        setField(term927, term927.getClass(), "context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrors", argTypes, term927, args);
    }

};


